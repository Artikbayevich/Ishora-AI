package com.example.ishoraai

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.ishoraai.databinding.ActivityMainBinding
import com.example.ishoraai.fragments.CourseFragment
import com.example.ishoraai.fragments.HomeFragment
import com.example.ishoraai.fragments.ProfileFragment
import com.example.ishoraai.fragments.SavedFragment

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        replaceFragment(HomeFragment())

        binding.bottomNavigation.setOnItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.bottom_home -> replaceFragment(HomeFragment())

                R.id.bottom_course -> replaceFragment(CourseFragment())

                R.id.bottom_saved -> replaceFragment(SavedFragment())

                R.id.bottom_profile -> replaceFragment(ProfileFragment())

                else -> replaceFragment(HomeFragment())
            }
            true
        }
    }

    private fun replaceFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().replace(R.id.frame_container, fragment).commit()
    }

    fun hideBottomNavigation() {
        binding.bottomNavigation.visibility = View.GONE
    }

    fun showBottomNavigation() {
        binding.bottomNavigation.visibility = View.VISIBLE
    }

}