package com.ayushman999.kotlinlearn

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ayushman999.kotlinlearn.databinding.GdOvTopcategoryItemBinding


class TopCategoriesAdapter(
    val topcategories : List<TopCategoriesItem>
) : RecyclerView.Adapter<TopCategoriesAdapter.TopCategoriesViewHolder>() {

    inner class TopCategoriesViewHolder( var binding: GdOvTopcategoryItemBinding) : RecyclerView.ViewHolder (binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TopCategoriesViewHolder {
        var binding = GdOvTopcategoryItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return TopCategoriesViewHolder(binding)
    }

    override fun onBindViewHolder(holder: TopCategoriesViewHolder, position: Int) {
        with( holder )
        {
            with (topcategories[position]){
                binding.ivTopCategory.setImageResource(this.img)
                binding.tvTopCategoryTitle.text = this.title
                binding.tvTopCategoryAmt.text = "₹${this.amt}"
            }
        }
    }

    override fun getItemCount(): Int = topcategories.size

}