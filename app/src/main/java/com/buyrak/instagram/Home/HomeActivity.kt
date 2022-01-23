package com.buyrak.instagram.Home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.buyrak.instagram.R
import com.buyrak.instagram.utils.BottomNavigationHelper
import com.buyrak.instagram.utils.HomePagerAdapter
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {
    private val ACTIVITY_NO = 0
    private val ACTIVITY_TAG = "HomeActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        BottomNavigationHelper.setUpNavigationView(this, bottomNavigationView,  bottomNavigationView.menu, ACTIVITY_NO)
        setupHomeViewPager()
    }

    private fun setupHomeViewPager(){
        var homePagerAdapter = HomePagerAdapter(supportFragmentManager)
        homePagerAdapter.addFragment(CameraFragment())
        homePagerAdapter.addFragment(HomeFragment())
        homePagerAdapter.addFragment(MessagesFragment())
        homeViewPager.adapter = homePagerAdapter
        homeViewPager.currentItem = 1
    }
}