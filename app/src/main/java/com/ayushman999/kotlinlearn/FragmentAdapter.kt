package com.ayushman999.kotlinlearn

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

class FragmentAdapter(manager: FragmentManager, lifecycle: Lifecycle ) :  FragmentStateAdapter(manager,lifecycle){
    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment {
        when (position){
            0 -> return OverviewFragment()
            1 -> return TransactionFragment()
            else -> print("Fragment position out of bounds")
        }
        return OverviewFragment()
    }


}