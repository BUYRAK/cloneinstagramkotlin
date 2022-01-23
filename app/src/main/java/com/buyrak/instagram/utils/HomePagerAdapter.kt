package com.buyrak.instagram.utils

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class HomePagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    private var myFragmentList : ArrayList<Fragment> = ArrayList()

    override fun getCount(): Int {
        return myFragmentList.size
    }

    override fun getItem(position: Int): Fragment {
       return myFragmentList.get(position)
    }

    fun addFragment(fragment: Fragment){
        myFragmentList.add(fragment)
    }
}