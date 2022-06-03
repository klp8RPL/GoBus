package com.example.gobus

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.gobus.Fragments.BarangFragment
import com.example.gobus.Fragments.RiwayatFragment

class ViewPagerAdapter(fragment: Fragment)
    : FragmentStateAdapter(fragment) {
    override fun getItemCount(): Int = 2

    override fun createFragment(position: Int): Fragment {
        var fragment = Fragment()
        when(position){
            0 -> fragment = RiwayatFragment()
            1 -> fragment = BarangFragment()
        }
        return fragment
    }
}