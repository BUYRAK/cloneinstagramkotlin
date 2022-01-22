package com.buyrak.instagram.Reels

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.buyrak.instagram.R
import com.buyrak.instagram.utils.BottomNavigationHelper
import kotlinx.android.synthetic.main.activity_home.*

class ReelsActivity : AppCompatActivity() {
    private val ACTIVITY_NO = 2
    private val ACTIVITY_TAG = "ReelsActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        BottomNavigationHelper.setUpNavigationView(this, bottomNavigationView,  bottomNavigationView.menu, ACTIVITY_NO)
    }
}