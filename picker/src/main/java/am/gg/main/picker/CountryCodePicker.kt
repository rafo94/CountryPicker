package am.gg.main.picker

import am.gg.main.picker.databinding.LayoutCodePickerBinding
import am.gg.main.picker.fragment.CountryListBottomSheet
import am.gg.main.picker.model.CountryItem
import am.gg.main.picker.utils.CountryListManager.countryList
import am.gg.main.picker.utils.hideKeyboard
import am.gg.main.picker.utils.setCountryList
import am.gg.main.picker.utils.unwrap
import android.content.Context
import android.util.AttributeSet
import android.util.TypedValue
import android.view.LayoutInflater
import android.widget.LinearLayout
import androidx.annotation.FontRes
import androidx.core.content.ContextCompat
import androidx.core.content.res.ResourcesCompat
import androidx.core.view.isGone
import java.util.Locale


/**
 * Created by Rafik Gasparyan on 08.05.24
 * ggTeam
 */
class CountryCodePicker(context: Context, attributeSet: AttributeSet) :
    LinearLayout(context, attributeSet) {
    private var binding: LayoutCodePickerBinding? = null
    private var fragment: CountryListBottomSheet? = null
    private var color: Int = 0
    private var fontFamilyId = 0
    private var showFlag: Boolean = true
    private var showCodeName: Boolean = true
    private var showPhoneCode: Boolean = true
    private var showDropDownArrow: Boolean = true
    private var defaultCountry: String = ""
    private var excludedCountries: String = ""
    private var textSize = 0
    private var arrowSize = 0
    private var arrowIvColor: Int = 0
    private var backGroundColor: Int = 0
    private var textColor: Int = 0
    private var searchIconColor: Int = 0
    private var searchColor:Int=0

    private var itemClick: (CountryItem) -> Unit = { }

    init {
        binding = LayoutCodePickerBinding.inflate(LayoutInflater.from(context), this, true)

        context.theme.obtainStyledAttributes(
            attributeSet,
            R.styleable.CountryCodePicker,
            0, 0
        ).apply {
            try {
                showFlag = getBoolean(R.styleable.CountryCodePicker_showFlag, true)
                defaultCountry = getString(R.styleable.CountryCodePicker_defaultNameCode).toString()
                excludedCountries =
                    getString(R.styleable.CountryCodePicker_excludedCountries).toString()
                showCodeName = getBoolean(R.styleable.CountryCodePicker_showNameCode, true)
                showPhoneCode = getBoolean(R.styleable.CountryCodePicker_showPhoneCode, true)
                showDropDownArrow = getBoolean(R.styleable.CountryCodePicker_showArrowDown, true)
                color = getResourceId(R.styleable.CountryCodePicker_contentColor, 0)
                fontFamilyId = getResourceId(R.styleable.CountryCodePicker_android_fontFamily, 0)
                textSize = getDimensionPixelSize(R.styleable.CountryCodePicker_textSize, 0)
                arrowSize = getDimensionPixelSize(R.styleable.CountryCodePicker_arrowSize, 0)
                arrowIvColor = getResourceId(R.styleable.CountryCodePicker_arrowColor, 0)
                backGroundColor = getResourceId(R.styleable.CountryCodePicker_backGroundColor, R.color.white)
                textColor = getResourceId(R.styleable.CountryCodePicker_textColor, R.color.primaryColor)
                searchIconColor = getResourceId(R.styleable.CountryCodePicker_searchIconColor, R.color.primaryColor)
                searchColor = getResourceId(R.styleable.CountryCodePicker_searchColor, R.color.primaryColor)
            } finally {
                recycle()
            }

        }

        setCountryList()

        if (textSize > 0) {
            binding?.phoneCodeTv?.setTextSize(TypedValue.COMPLEX_UNIT_PX, textSize.toFloat())
            binding?.codeNameTv?.setTextSize(TypedValue.COMPLEX_UNIT_PX, textSize.toFloat())
        }

        setContentColor(if (color > 0) color else R.color.white)
        setArrowColor(if (color > 0) arrowIvColor else R.color.white)
        if (arrowSize > 0) {
            setArrowSize(arrowSize)
        }
        if (fontFamilyId > 0) {
            setTypeFace(fontFamilyId)
        }
        if (!showFlag) {
            hideFlag()
        }
        if (!showCodeName) {
            hideCodeName()
        }
        if (!showPhoneCode) {
            hidePhoneCode()
        }
        if (!showDropDownArrow) {
            hideDropDownArrow()
        }

        if (defaultCountry.isNotEmpty()) {
            setDefaultCountry(defaultCountry)
        }

        if (excludedCountries.isNotEmpty()) {
            setExcludedCountries(excludedCountries)
        }
        binding?.apply {
            root.setOnClickListener {
                hideKeyboard()
                if (countryList.isNotEmpty()) {
                    val countryList = countryList.sortedBy { it.countryName }.toMutableList()
                    fragment = CountryListBottomSheet().apply {
                        setClickListener(
                            list = countryList,
                            selectedId = codeNameTv.text.toString()
                        ) {
                            onCountryItemClick(it)
                        }
                        setViewsColors(backGroundColor,textColor,searchIconColor,searchColor)
                    }.also {
                        unwrap(root.context)?.let { activity ->
                            it.show(activity.supportFragmentManager, it::class.java.simpleName)
                        }
                    }
                }
            }
        }
    }

    private fun onCountryItemClick(item: CountryItem) {
        itemClick(item)
        binding?.apply {
            item.flagImage?.let { flagIv.setImageResource(it) }
            item.phoneCode?.let { phoneCodeTv.text = it }
            item.codeName?.let { codeNameTv.text = "($it)" }
        }
        fragment?.dismiss()
    }

    private fun setContentColor(color: Int) = binding?.apply {
        phoneCodeTv.setTextColor(ContextCompat.getColor(context, color))
        codeNameTv.setTextColor(ContextCompat.getColor(context, color))
    }

    private fun setArrowColor(color: Int) = binding?.apply {
        arrowIv.setColorFilter(ContextCompat.getColor(context, color))
    }

    private fun setTypeFace(@FontRes font: Int) = binding?.apply {
        phoneCodeTv.typeface = ResourcesCompat.getFont(context, font)
        codeNameTv.typeface = ResourcesCompat.getFont(context, font)
    }

    private fun hideFlag() {
        binding?.flagIv?.isGone = true
    }

    private fun hideCodeName() {
        binding?.codeNameTv?.isGone = true
    }

    private fun hidePhoneCode() {
        binding?.phoneCodeTv?.isGone = true
    }

    private fun hideDropDownArrow() {
        binding?.arrowIv?.isGone = true
    }

    private fun setDefaultCountry(codeName: String) = binding?.apply {
        for (item in countryList) {
            if (item.codeName?.equals(codeName) == true) {
                item.flagImage?.let { flagIv.setImageResource(it) }
                item.phoneCode?.let { phoneCodeTv.text = it }
                item.codeName.let { codeNameTv.text = "($it)" }
            }
        }
    }

    fun setPhoneCode(countryCode: String) = binding?.apply {
        for (item in countryList) {
            if (item.phoneCode?.equals(countryCode) == true) {
                item.flagImage?.let { flagIv.setImageResource(it) }
                item.phoneCode.let { phoneCodeTv.text = it }
                item.codeName.let { codeNameTv.text = "($it)" }
            }
        }
    }

    private fun setExcludedCountries(excludedCountries: String) {
        this.excludedCountries = excludedCountries.lowercase(Locale.getDefault())

        if (excludedCountries.contains(",")) {
            val codeNameArray = excludedCountries.split(",").toTypedArray()
            codeNameArray.let {
                for (i in it.indices) {
                    for (item in countryList) {
                        if (item.codeName?.equals(it[i]) == true) {
                            countryList.remove(item)
                            break
                        }
                    }
                }
            }

        } else {
            for (item in countryList) {
                if (item.codeName == excludedCountries) {
                    countryList.remove(item)
                }
            }

        }
    }

    private fun setArrowSize(arrowSize: Int) {
        if (arrowSize > 0) {
            val params = binding?.arrowIv?.layoutParams as LayoutParams
            params.width = arrowSize
            params.height = arrowSize
            binding?.arrowIv?.layoutParams = params
        }
    }

    fun selectedCountryCode(): String {
        return binding?.phoneCodeTv?.text.toString()
    }

    fun setOnItemClick(itemClick: (CountryItem) -> Unit) {
        this.itemClick = itemClick
    }

    fun selectedCountryName(): String {
        return binding?.codeNameTv?.text.toString()
    }
}