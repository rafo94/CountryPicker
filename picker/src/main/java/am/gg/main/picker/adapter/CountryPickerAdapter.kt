package am.gg.main.picker.adapter

import am.gg.main.picker.databinding.ItemCountryBinding
import am.gg.main.picker.model.CountryItem
import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView

/**
 * Created by Rafik Gasparyan on 08.05.24
 * ggTeam
 */
class CountryPickerAdapter(
    private val selectedId: String,
    private val itemClick: (CountryItem) -> Unit,
    private val itemBgColor: Int,
    private val itemTextColor: Int
) : RecyclerView.Adapter<CountryPickerAdapter.ViewHolder>() {

    private var countryList: List<CountryItem> = listOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemCountryBinding.inflate(inflater, parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(countryList[position])
    }

    override fun getItemCount(): Int = countryList.size

    @SuppressLint("NotifyDataSetChanged")
    fun submitList(list: List<CountryItem>) {
        countryList = list
        notifyDataSetChanged()
    }

    inner class ViewHolder(private val binding: ItemCountryBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(item: CountryItem) {

            val countryInfo = "${item.countryName} ${item.phoneCode}"
            val selectedItem = selectedId.contains(item.codeName.toString())
            with(binding) {
                tvCountryName.text = countryInfo
                item.flagImage?.let { ivFlag.setImageResource(it) }
                countrySelected.isVisible = selectedItem
                root.background.setTint(ContextCompat.getColor(root.context ?: return, itemBgColor))
                tvCountryName.setTextColor(ContextCompat.getColor(root.context ?: return, itemTextColor))
                root.isSelected = selectedItem
                root.setOnClickListener {
                    itemClick(item)
                }
            }
        }
    }
}