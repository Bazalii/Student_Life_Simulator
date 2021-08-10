package android.clicker.school_live_simulator.User_interface

import android.clicker.school_live_simulator.R
import android.clicker.school_live_simulator.User_interface.ScrollingFragments.*
import android.clicker.school_live_simulator.databinding.ActivityGameBinding
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class GameActivity : AppCompatActivity() {
    lateinit var binding: ActivityGameBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGameBinding.inflate(layoutInflater)
        setContentView(binding.root)
        /**
         * Initially opens school fragment
         */
        supportFragmentManager.beginTransaction().replace(R.id.fragment, SchoolScrollingFragment()).commit()
        bottomNavigationClick()
    }
    fun bottomNavigationClick() {
        /**
         * Check deprecated option setOnNavigationItemSelectedListener
         */
        binding.bottomNavigation.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.school -> supportFragmentManager.beginTransaction().replace(R.id.fragment, SchoolScrollingFragment()).commit()
                R.id.food -> supportFragmentManager.beginTransaction().replace(R.id.fragment, FoodScrollingFragment()).commit()
                R.id.work -> supportFragmentManager.beginTransaction().replace(R.id.fragment, WorkScrollingFragment()).commit()
                R.id.entertainment -> supportFragmentManager.beginTransaction().replace(R.id.fragment, FunScrollingFragment()).commit()
                R.id.shop -> supportFragmentManager.beginTransaction().replace(R.id.fragment, ShopScrollingFragment()).commit()
            }
            true
        }
    }
}

