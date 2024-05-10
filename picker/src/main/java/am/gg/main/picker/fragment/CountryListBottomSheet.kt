package am.gg.main.picker.fragment

import am.gg.main.picker.adapter.CountryPickerAdapter
import am.gg.main.picker.databinding.FragmentCountryPickerBinding
import am.gg.main.picker.model.CountryItem
import am.gg.main.picker.utils.getDisplayHeightByPercent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
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
        init()
    }

    private fun init() {
        adapter = CountryPickerAdapter(selectedId = selectedId ?: "AM") { item ->
            itemClick(item)
        }

        binding?.apply {
            rvCountryList.adapter = adapter
            adapter?.submitList(countryList)
            etSearch.addTextChangedListener { text ->
                countrySortList.clear()
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

    fun setClickListener(list: MutableList<CountryItem>, selectedId: String, itemClick: (CountryItem) -> Unit) {
        this.itemClick = itemClick
        this.countryList = list
        this.selectedId = selectedId
    }

    override fun onStart() {
        super.onStart()
        dialog?.let {
            val bottomSheet = it.findViewById<View>(com.google.android.material.R.id.design_bottom_sheet)
            bottomSheet.layoutParams.height = ViewGroup.LayoutParams.MATCH_PARENT
        }
        (dialog as BottomSheetDialog).behavior.peekHeight = requireContext().getDisplayHeightByPercent(85)
    }
}