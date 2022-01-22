package com.buyrak.instagram.utils

import android.content.Context
import android.content.Intent
import android.view.Menu
import android.view.MenuItem
import com.buyrak.instagram.Home.HomeActivity
import com.buyrak.instagram.Profile.ProfileActivity
import com.buyrak.instagram.R
import com.buyrak.instagram.Reels.ReelsActivity
import com.buyrak.instagram.Search.SearchActivity
import com.buyrak.instagram.Store.StoreActivity
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_home.*

class BottomNavigationHelper {

    companion object{
        fun setUpNavigation(context: Context, bottomNavigationView: BottomNavigationView){
            bottomNavigationView.setOnItemSelectedListener(object : BottomNavigationView.OnNavigationItemSelectedListener{
                override fun onNavigationItemSelected(item: MenuItem): Boolean {
                    when(item.itemId){

                        R.id.ic_home -> {
                            val intent = Intent(context, HomeActivity::class.java).addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
                            context.startActivity(intent)
                            return true
                        }

                        R.id.ic_search -> {
                            val intent = Intent(context, SearchActivity::class.java).addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
                            context.startActivity(intent)
                            return true
                        }

                        R.id.ic_reels -> {
                            val intent = Intent(context, ReelsActivity::class.java).addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
                            context.startActivity(intent)
                            return true
                        }

                        R.id.ic_store -> {
                            val intent = Intent(context, StoreActivity::class.java).addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
                            context.startActivity(intent)
                            return true
                        }

                        R.id.ic_profile -> {
                            val intent = Intent(context, ProfileActivity::class.java).addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
                            context.startActivity(intent)
                            return true
                        }
                    }
                    return false
                }


            })

        }

        fun setUpNavigationView(context: Context, bottomNavigationView: BottomNavigationView, menu : Menu, activity_no:Int){
            setUpNavigation(context,bottomNavigationView)
            var menu = menu
            var menuItem = menu.getItem(activity_no)
            menuItem.setChecked(true)
        }
    }
}

