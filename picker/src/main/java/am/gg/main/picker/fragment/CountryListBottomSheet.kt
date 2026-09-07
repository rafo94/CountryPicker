package am.gg.main.picker.fragment

import am.gg.main.picker.R
import am.gg.main.picker.adapter.CountryPickerAdapter
import am.gg.main.picker.databinding.FragmentCountryPickerBinding
import am.gg.main.picker.model.CountryItem
import am.gg.main.picker.utils.getDisplayHeightByPercent
import am.gg.main.picker.utils.showKeyboard
import android.app.Dialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager
import androidx.annotation.ColorRes
import androidx.core.content.ContextCompat
import androidx.core.view.isVisible
import androidx.core.widget.addTextChangedListener
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.bottomsheet.BottomSheetDialogFragment


/**
 * Created by Rafik Gasparyan on 08.05.24
 * ggTeam
 */
class CountryListBottomSheet : BottomSheetDialogFragment() {

    private var binding: FragmentCountryPickerBinding? = null
    private var adapter: CountryPickerAdapter? = null
    private var selectedId: String? = null


    private var itemClick: (CountryItem) -> Unit = {}
    private var countryList = mutableListOf<CountryItem>()
    private val countrySortList = ArrayList<CountryItem>()

    @ColorRes
    private var backgroundColor: Int = R.color.white

    @ColorRes
    private var textColor: Int = R.color.primaryColor

    @ColorRes
    private var searchIconColor: Int = R.color.primaryColor

    @ColorRes
    private var searchColor: Int = R.color.gray_1


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val viewBinding = FragmentCountryPickerBinding.inflate(inflater, container, false)
        binding = viewBinding
        return viewBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if (savedInstanceState != null || countryList.isEmpty()) {
            view.isVisible = false
            view.post { dismissAllowingStateLoss() }
            return
        }
        init()
    }

    private fun init() {
        adapter = CountryPickerAdapter(
            selectedId = selectedId ?: "AM",
            itemBgColor = backgroundColor,
            itemTextColor = textColor,
            itemClick = { item ->
                itemClick(item)
            })
        updateViewColors()
        binding?.apply {
            rvCountryList.adapter = adapter
            adapter?.submitList(countryList)
            etSearch.showKeyboard()
            etSearch.addTextChangedListener { text ->
                if (countrySortList.isNotEmpty()) countrySortList.clear()
                val countryText = text.toString().trim()
                if (countryText.isNotEmpty() && countryText.isNotBlank()) {
                    countryList.forEach { country ->
                        if (country.countryName!!.lowercase().contains(countryText.lowercase())
                            || country.phoneCode!!.lowercase().contains(countryText.lowercase())
                        ) {
                            countrySortList.add(country)
                        }
                    }
                    adapter?.submitList(countrySortList)
                } else {
                    adapter?.submitList(countryList)
                }
            }
        }
    }

    private fun updateViewColors() {
        val ctx = context ?: return
        binding?.apply {
            root.background?.setTint(ContextCompat.getColor(ctx, backgroundColor))
            etSearch.setTextColor(ContextCompat.getColor(ctx, textColor))
            searchIconImageView.setColorFilter(ContextCompat.getColor(ctx, searchIconColor))
            titleTextView.setTextColor(ContextCompat.getColor(ctx, textColor))
            searchParent.background?.setTint(ContextCompat.getColor(ctx, searchColor))
        }
    }

    fun setViewsColors(
        @ColorRes backGroundColor: Int,
        @ColorRes textColor: Int,
        @ColorRes searchIconColor: Int,
        @ColorRes searchColor: Int
    ) {
        if (backGroundColor != 0) this.backgroundColor = backGroundColor
        if (textColor != 0) this.textColor = textColor
        if (searchIconColor != 0) this.searchIconColor = searchIconColor
        if (searchColor != 0) this.searchColor = searchColor
    }

    fun setClickListener(
        list: MutableList<CountryItem>,
        selectedId: String,
        itemClick: (CountryItem) -> Unit
    ) {
        this.itemClick = itemClick
        this.countryList = list
        this.selectedId = selectedId
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return object : BottomSheetDialog(requireContext(), R.style.RoundedCornerTransparentBottomSheetDialogTheme) {
            override fun onAttachedToWindow() {
                super.onAttachedToWindow()
                window?.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_VISIBLE)
            }
        }
    }

    override fun onStart() {
        super.onStart()
        val bottomSheetDialog = dialog as? BottomSheetDialog ?: return
        bottomSheetDialog.findViewById<View>(com.google.android.material.R.id.design_bottom_sheet)
            ?.layoutParams?.height = ViewGroup.LayoutParams.MATCH_PARENT
        val ctx = context ?: return
        bottomSheetDialog.behavior.peekHeight = ctx.getDisplayHeightByPercent(95)
    }

    override fun onDestroyView() {
        binding = null
        adapter = null
        super.onDestroyView()
    }
}
