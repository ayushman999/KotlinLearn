package com.ayushman999.kotlinlearn

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.ayushman999.kotlinlearn.databinding.TransactionElementBinding

class TransactionAdapter(
    var transactions: List<Transactions>
) : RecyclerView.Adapter<TransactionAdapter.TransactionViewHolder>() {

    inner class TransactionViewHolder(var binding: TransactionElementBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TransactionViewHolder {
        var binding = TransactionElementBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return TransactionViewHolder(binding)
    }

    override fun onBindViewHolder(holder: TransactionViewHolder, position: Int) {
        with(holder){
            with(transactions[position]){
                binding.tvTransactionTitle.text = this.title
                binding.tvTransactionDate.text = this.date
                binding.tvTransactionTime.text = this.time
                binding.tvTransactionAmount.text = "₹${this.amt}"
                binding.tvTransactionBorrowed.text = "you borrowed ₹${this.borrowed}"
                if(this.borrowed != null){ binding.tvTransactionBorrowed.visibility = View.VISIBLE}
                binding.tvTransactionPaid.text = "${this.paid} paid"
                if(this.paid != null){ binding.tvTransactionPaid.visibility = View.VISIBLE }
                binding.tvTransactionCategory.text = this.bucket
            }
        }
    }

    override fun getItemCount(): Int = transactions.size

}