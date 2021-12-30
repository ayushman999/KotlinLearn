package com.ayushman999.kotlinlearn

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.ayushman999.kotlinlearn.databinding.FragmentAccountGroupDetailsBinding
import com.ayushman999.kotlinlearn.databinding.FragmentAccountgroupdetailsTransactionBinding

class TransactionFragment : Fragment() {
    private lateinit var binding: FragmentAccountgroupdetailsTransactionBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding =  FragmentAccountgroupdetailsTransactionBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var transactions = mutableListOf(
            Transactions("iphone savings", "aug 13,2021", "7:08pm", 20000.49, null, null, "bucket"  ),
            Transactions("movie - dune", "aug 13,2021", "7:08pm", 20000.49, "kartik", 20000.49, "shared"  ),
            Transactions("savings", "aug 13,2021", "7:08pm", 20000.49, null, null, "save"  ),
            Transactions("wedding savings", "aug 11,2021", "7:08pm", 20000.49, null, null, "bucket"  ),
            Transactions("flights - maldives", "aug 11,2021", "7:08pm", 1050.49, null, null, "normal"  ),
            Transactions("iphone savings", "aug 13,2021", "7:08pm", 20000.49, null, null, "bucket"  ),
            Transactions("movie - dune", "aug 13,2021", "7:08pm", 20000.49, "kartik", 20000.49, "shared"  ),
            Transactions("savings", "aug 13,2021", "7:08pm", 20000.49, null, null, "save"  ),
            Transactions("wedding savings", "aug 11,2021", "7:08pm", 20000.49, null, null, "bucket"  ),
            Transactions("flights - maldives", "aug 11,2021", "7:08pm", 1050.49, null, null, "normal"  )
        )

        val adapter = TransactionAdapter(transactions)
        binding.transactionRV.adapter = adapter
        binding.transactionRV.layoutManager = LinearLayoutManager(context)

    }
}