package android.clicker.school_live_simulator.User_interface

import android.animation.ArgbEvaluator
import android.clicker.school_live_simulator.Game
import android.clicker.school_live_simulator.R
import android.clicker.school_live_simulator.User_interface.ScrollingFragments.*
import android.clicker.school_live_simulator.databinding.ActivityGameBinding
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper


import android.animation.ObjectAnimator
import android.clicker.school_live_simulator.Classes.Achievements_classes.Interfaces.Achievements
import android.clicker.school_live_simulator.Classes.Achievements_classes.Interfaces.RandomAchievements
import android.clicker.school_live_simulator.databinding.AchievementDialogBinding
import android.content.Intent
import android.content.res.ColorStateList
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.util.Log
import android.view.View
import androidx.appcompat.app.AlertDialog
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.graphics.ColorUtils.HSLToColor
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import java.util.*


class GameActivity : AppCompatActivity() {
    lateinit var binding: ActivityGameBinding
    private var current_vp_page = 0 //save current ViewPager position
    /**
     * Values for timer(function that is called every x seconds)
     * Need to write more documentation about them
     */
    private lateinit var runnable: Runnable
    private var handler = Handler(Looper.getMainLooper())
    private val delay: Long = 500

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Game.setLocale(resources, this@GameActivity)

        binding = ActivityGameBinding.inflate(layoutInflater)
        setContentView(binding.root)
        /**
         * Set initial player characteristics
         */
        updateStats()
        /**
         * Set adapter for viewPager
         */
        binding.viewPager.adapter = PagerAdapter(this)
        /**
         * Phone keeps in memory all pages for better swipe performance
         */
        binding.viewPager.offscreenPageLimit = 5
        /**
         * BottomNavigation listener
         */
        binding.bottomNavigation.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.school -> binding.viewPager.currentItem = 0
                R.id.food -> binding.viewPager.currentItem = 1
                R.id.work -> binding.viewPager.currentItem = 2
                R.id.entertainment -> binding.viewPager.currentItem = 3
                else -> binding.viewPager.currentItem = 4
            }
            true
        }
        /**
         * Matching BottomNavigation and ViewPager
         */
        binding.viewPager.apply {
            adapter = PagerAdapter(this@GameActivity)
            registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
                override fun onPageSelected(position: Int) {
                    super.onPageSelected(position)
                    binding.bottomNavigation.selectedItemId = when (position) {
                        0 -> R.id.school
                        1 -> R.id.food
                        2 -> R.id.work
                        3 -> R.id.entertainment
                        else -> R.id.shop
                    }
                }
            })
        }
    }

    /**
     * Achievements button listener that opens Achievements activity
     */
    fun openAchievementActivity(view: View){
        val intent = Intent(this, AchievementsActivity::class.java)
        startActivity(intent)
    }

    override fun onDestroy() {
        super.onDestroy()
    }
    inner class PagerAdapter(activity: FragmentActivity) : FragmentStateAdapter(activity){
        override fun getItemCount(): Int {
            return 5
        }
        override fun createFragment(position: Int): Fragment {
            return when(position){
                0 -> SchoolScrollingFragment()
                1 -> FoodScrollingFragment()
                2 -> WorkScrollingFragment()
                3 ->  FunScrollingFragment()
                else ->  ShopScrollingFragment()

            }
        }
    }

    override fun onResume() {
        super.onResume()
        startTick()
        binding.viewPager.currentItem = current_vp_page
    }
    private fun startTick(){
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
    override fun onPause() {
        super.onPause()
        handler.removeCallbacks(runnable)
        current_vp_page = binding.viewPager.currentItem
    }


    /**
     * Updates UI: progress bars, money and date
     */
    fun updateStats(){
        ObjectAnimator.ofInt(binding.satietyProgressBar, "progress", Game.player.satiety).setDuration(300).start();
        ObjectAnimator.ofInt(binding.happinessProgressBar, "progress", Game.player.happiness).setDuration(300).start();
        ObjectAnimator.ofInt(binding.schoolPerformanceProgressBar, "progress", Game.player.school_performance).setDuration(300).start();
        /**
         * these assignments don't influence on animation
         */
        binding.satietyProgressBar.progress = Game.player.satiety
        binding.happinessProgressBar.progress = Game.player.happiness
        binding.schoolPerformanceProgressBar.progress = Game.player.school_performance
        /**
         * Change color of progressbars
         */
        var colorHappiness  = ((1000 - binding.happinessProgressBar.progress) * 0.12).toFloat()
        var colorSatiety  = ((1000 - binding.satietyProgressBar.progress) * 0.12).toFloat()
        var colorSchoolPerformance  = ((1000 - binding.schoolPerformanceProgressBar.progress) * 0.12).toFloat()
        binding.happinessProgressBar.progressTintList = ColorStateList.valueOf(HSLToColor(floatArrayOf(120-colorHappiness, 1f , 0.5f)))
        binding.satietyProgressBar.progressTintList = ColorStateList.valueOf(HSLToColor(floatArrayOf(120-colorSatiety, 1f , 0.5f)))
        binding.schoolPerformanceProgressBar.progressTintList = ColorStateList.valueOf(HSLToColor(floatArrayOf(120-colorSchoolPerformance, 1f , 0.5f)))

        binding.moneyTextView.text = Game.player.money.toString()
        binding.dateTextView.text = Game.game_date.toString()
    }

    fun achieve(achievement: Achievements) {
        if (Game.player.achieved(achievement)) {
            handler.removeCallbacks(runnable) // stop ticks
            /**
             *  Achievement alert dialog
             */
            val mBuilder = AlertDialog.Builder(this)
            val mView = layoutInflater.inflate(R.layout.achievement_dialog, null)
            val binding = AchievementDialogBinding.bind(mView)
            binding.AchievementNotification.visibility = View.VISIBLE
            binding.AchievementTitle.text = achievement.achievement_name
            binding.AchievementDescription.text =  achievement.achievement_message
            if(achievement is RandomAchievements){
                binding.AchievementChance.text = "${achievement.achievement_chance.toString()}%"
                binding.AchievementChance.visibility = View.VISIBLE
                binding.AchievementChanceText.visibility = View.VISIBLE
            }
            mBuilder.setView(mView)
            val dialog: AlertDialog = mBuilder.create()
            dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            dialog.show()
            dialog.setCanceledOnTouchOutside(false) // don't close dialog on outside tap
            binding.AchievementOK.setOnClickListener {
                dialog.dismiss()
            }
            dialog.setOnDismissListener {
              startTick()
            }
        }
    }
    fun notEnoughMoneyAnim(){
        val anim = ObjectAnimator.ofInt(binding.moneyTextView, "backgroundColor", android.R.color.transparent, Color.RED,  android.R.color.transparent)
        anim.duration = 300
        anim.setEvaluator(ArgbEvaluator())
        anim.repeatCount = 3
        anim.start()
    }
}
