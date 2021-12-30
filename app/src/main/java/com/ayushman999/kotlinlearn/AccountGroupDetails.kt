package com.ayushman999.kotlinlearn

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import com.ayushman999.kotlinlearn.databinding.FragmentAccountGroupDetailsBinding
import com.google.android.material.tabs.TabLayout

class AccountGroupDetails : Fragment() {
    private lateinit var binding: FragmentAccountGroupDetailsBinding
    private lateinit var adapter: FragmentAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding =  FragmentAccountGroupDetailsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        adapter = fragmentManager?.let { FragmentAdapter(it, lifecycle) }!!
        binding.viewPager.adapter = adapter

        binding.tabLayout2.addOnTabSelectedListener( object : TabLayout.OnTabSelectedListener{
            override fun onTabSelected(tab: TabLayout.Tab?) {
                if (tab != null) {
                    binding.viewPager.setCurrentItem(tab.position)
                }
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {

            }

            override fun onTabReselected(tab: TabLayout.Tab?) {

            }

        })

        binding.viewPager.registerOnPageChangeCallback( object : ViewPager2.OnPageChangeCallback(){
            override fun onPageSelected(position: Int) {
                binding.tabLayout2.selectTab(binding.tabLayout2.getTabAt(position))
            }
        })

    }

}