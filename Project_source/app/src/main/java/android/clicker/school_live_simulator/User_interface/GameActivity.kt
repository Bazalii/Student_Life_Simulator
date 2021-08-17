package android.clicker.school_live_simulator.User_interface

import android.clicker.school_live_simulator.Game
import android.clicker.school_live_simulator.R
import android.clicker.school_live_simulator.User_interface.ScrollingFragments.*
import android.clicker.school_live_simulator.databinding.ActivityGameBinding
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class GameActivity : AppCompatActivity() {
    lateinit var binding: ActivityGameBinding

    /**
     * Values for timer(function that is called every x seconds)
     * Need to write more documentation about them
     */
    private lateinit var runnable: Runnable
    private var handler = Handler(Looper.getMainLooper())
    private val delay: Long = 3000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGameBinding.inflate(layoutInflater)
        setContentView(binding.root)
        /**
         * Set initial player characteristics
         */
        updateStats()
        /**
         * Initially opens school fragment
         */
        supportFragmentManager.beginTransaction().replace(R.id.fragment, SchoolScrollingFragment())
            .commit()
        bottomNavigationClick()
    }

    override fun onResume() {
        super.onResume()
        Game.context_bundle.context = this.applicationContext
        runnable = Runnable {
            /**
             * Code which is constantly called with delay
             */
            Game.tick()
            updateStats()
            handler.postDelayed(runnable, delay)
        }
        handler.postDelayed(runnable, delay)
    }

    /**
     * Andrey:
     * I think, this function is useful, but you can suggest another implementation
     */
    fun updateStats(){
         //Make fields open
        binding.satietyProgressBar.progress = Game.player.satiety
        binding.happinessProgressBar.progress = Game.player.happiness
        binding.schoolPerformanceProgressBar.progress = Game.player.school_performance
        /**
         * Think, how to write these in TextView
         */
        binding.moneyTextView.text = Game.player.money.toString()
        //binding.dateTextView
    }

    fun bottomNavigationClick() {
        /**
         * Check deprecated option setOnNavigationItemSelectedListener
         */
        binding.bottomNavigation.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.school -> supportFragmentManager.beginTransaction()
                    .replace(R.id.fragment, SchoolScrollingFragment()).commit()
                R.id.food -> supportFragmentManager.beginTransaction()
                    .replace(R.id.fragment, FoodScrollingFragment()).commit()
                R.id.work -> supportFragmentManager.beginTransaction()
                    .replace(R.id.fragment, WorkScrollingFragment()).commit()
                R.id.entertainment -> supportFragmentManager.beginTransaction()
                    .replace(R.id.fragment, FunScrollingFragment()).commit()
                R.id.shop -> supportFragmentManager.beginTransaction()
                    .replace(R.id.fragment, ShopScrollingFragment()).commit()
            }
            true
        }
    }
}

