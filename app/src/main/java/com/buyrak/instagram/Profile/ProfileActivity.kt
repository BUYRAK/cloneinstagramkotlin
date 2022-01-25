package com.buyrak.instagram.Profile

import android.content.Context
import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import com.buyrak.instagram.Home.HomeActivity
import com.buyrak.instagram.R
import com.buyrak.instagram.Reels.ReelsActivity
import com.buyrak.instagram.Search.SearchActivity
import com.buyrak.instagram.Store.StoreActivity
import com.buyrak.instagram.utils.BottomNavigationHelper
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.activity_profile.*

class ProfileActivity : AppCompatActivity() {
    private val ACTIVITY_NO = 4
    private val ACTIVITY_TAG = "ProfileActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        BottomNavigationHelper.setUpNavigationView(this, bottomNavigationView,  bottomNavigationView.menu, ACTIVITY_NO)

        imgProfileMore.setOnClickListener {
            if(profile_more_menu.visibility == View.VISIBLE){
                profile_more_menu.visibility = View.INVISIBLE
            }else{
                profile_more_menu.visibility = View.VISIBLE
            }
        }

        profile_more_menu.setNavigationItemSelectedListener(object : NavigationView.OnNavigationItemSelectedListener{
            override fun onNavigationItemSelected(item: MenuItem): Boolean {
                when(item.itemId){
                    R.id.profile_user_settings -> {
                        val intent = Intent(this@ProfileActivity, ProfileSettingsActivity::class.java).addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
                        this@ProfileActivity.startActivity(intent)
                        return true
                    }
                    R.id.profile_user_archive -> {
                        val intent = Intent(this@ProfileActivity, HomeActivity::class.java).addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
                        this@ProfileActivity.startActivity(intent)
                        return true
                    }
                    R.id.profile_user_saved -> {
                        val intent = Intent(this@ProfileActivity, HomeActivity::class.java).addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
                        this@ProfileActivity.startActivity(intent)
                        return true
                    }
                }
                return false
            }

        })

    }
}