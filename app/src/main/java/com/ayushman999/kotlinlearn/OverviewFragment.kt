package com.ayushman999.kotlinlearn

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.ayushman999.kotlinlearn.databinding.FragmentAccountgroupdetailsOverviewBinding

class OverviewFragment : Fragment() {

    private lateinit var binding : FragmentAccountgroupdetailsOverviewBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentAccountgroupdetailsOverviewBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val accounts = mutableListOf(
            AccountsItem(true, R.drawable.ic_launcher_foreground, "axis bank", 20000.49),
            AccountsItem(false, R.drawable.ic_launcher_foreground, "hdfc bank", 2000.49),
            AccountsItem(true, R.drawable.ic_launcher_foreground, "icici bank", 543890.49),
            AccountsItem(false, R.drawable.ic_launcher_foreground, "canera bank", 20000.49)
        )

        val topcategories = mutableListOf(
            TopCategoriesItem(R.drawable.belu_mom, "taxi", 2000.00),
            TopCategoriesItem(R.drawable.ic_launcher_foreground, "dining out", 2000.00),
            TopCategoriesItem(R.drawable.belu_mom, "drinks", 2000.00)
        )

        var adapter = AccountsAdapter(accounts)

        binding.rvOverviewAccounts.layoutManager = LinearLayoutManager(context)
        binding.rvOverviewAccounts.adapter = adapter

        var hadapter = TopCategoriesAdapter(topcategories)

        binding.rvOverviewTopCategories.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        binding.rvOverviewTopCategories.adapter = hadapter
    }
}