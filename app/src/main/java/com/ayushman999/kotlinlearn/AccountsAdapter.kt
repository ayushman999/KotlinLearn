package com.ayushman999.kotlinlearn

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ayushman999.kotlinlearn.databinding.GdOvAccountsItemBinding
import com.ayushman999.kotlinlearn.databinding.TransactionElementBinding

class AccountsAdapter (
    val accounts : List<AccountsItem>
        ) : RecyclerView.Adapter<AccountsAdapter.AccountsViewHolder>() {

            inner class AccountsViewHolder ( var binding: GdOvAccountsItemBinding ) : RecyclerView.ViewHolder( binding.root )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AccountsViewHolder {
        var binding = GdOvAccountsItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return AccountsViewHolder(binding)
    }

    override fun onBindViewHolder(holder: AccountsViewHolder, position: Int) {
        with(holder){
            with(accounts[position]){
                binding.tvAccountsBank.text = this.bankName
                binding.tvAccountsBalance.text = "₹${this.bankBalance}"
                if(this.top) binding.tvAccountsCategory.visibility = View.VISIBLE
                binding.tvAccounts.setImageResource(this.bankImg)
            }
        }
    }

    override fun getItemCount(): Int = accounts.size

}