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
import android.clicker.school_live_simulator.Classes.AchievementsClasses.Interfaces.Achievements
import android.clicker.school_live_simulator.Classes.AchievementsClasses.Interfaces.RandomAchievements
import android.clicker.school_live_simulator.databinding.AchievementDialogBinding
import android.content.Intent
import android.content.res.ColorStateList
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.view.View
import androidx.appcompat.app.AlertDialog
import androidx.core.graphics.ColorUtils.HSLToColor
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import java.util.*
import android.animation.ValueAnimator
import android.clicker.school_live_simulator.databinding.EndGameDialogBinding
import android.os.HandlerThread
import android.view.KeyEvent


class GameActivity : AppCompatActivity() {
    lateinit var binding: ActivityGameBinding
    private var current_vp_page = 0 //save current ViewPager position

    /**
     * Values for timer(function that is called every x seconds)
     * Need to write more documentation about them
     */
    private lateinit var runnable: Runnable
    private var handler = Handler(Looper.getMainLooper())
    private lateinit var tick_handler: Handler
    private lateinit var  tick_thread: HandlerThread
    private val delay: Long = 500
    private var game_time: Long = 0

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

    inner class PagerAdapter(activity: FragmentActivity) : FragmentStateAdapter(activity){
        override fun getItemCount(): Int {
            return 5
        }
        override fun createFragment(position: Int): Fragment {
            return when(position){
                0 -> SchoolScrollingFragment()
                1 -> FoodScrollingFragment()
                2 -> WorkScrollingFragment()
                3 -> FunScrollingFragment()
                else -> ShopScrollingFragment()
            }
        }
    }

    override fun onResume() {
        super.onResume()
        startTick()
        binding.viewPager.currentItem = current_vp_page
    }
    private fun startTick(){
        tick_thread = HandlerThread("Tick thread")
        tick_thread.start()
        tick_handler = Handler(tick_thread.looper)
            runnable = Runnable {

                /**
                 * Calls itself with the delay
                 */
                tick_handler.postDelayed(runnable, delay)
                game_time += delay
                Game.tick()
                handler.post{updateStats()}
            }
        tick_handler.postDelayed(runnable, delay)
    }

    private fun stopTick(){
        handler.removeCallbacks(runnable)
        tick_handler.removeCallbacks(runnable)
        tick_thread.quitSafely()
    }

    override fun onPause() {
        super.onPause()
        stopTick()
        current_vp_page = binding.viewPager.currentItem
    }
    override fun onStop() {
        Game.save(this.applicationContext.filesDir)
        stopTick()
        super.onStop()
    }
    override fun onDestroy() {
        Game.save(this.applicationContext.filesDir)
        stopTick()
        super.onDestroy()
    }
    /**
     * Updates UI: progress bars, money and date
     */
    fun updateStats(){
        if (Game.player.dead()) death()

        binding.currentSchoolClass.text = "${Game.player.school_class} ${getString(R.string.current_school_class)}"

        /**
         * Animation for progressbars changes
         */
        ObjectAnimator.ofInt(binding.satietyProgressBar, "progress", Game.player.satiety).setDuration(200).start();
        ObjectAnimator.ofInt(binding.happinessProgressBar, "progress", Game.player.happiness).setDuration(200).start();
        ObjectAnimator.ofInt(binding.schoolPerformanceProgressBar, "progress", Game.player.school_performance).setDuration(200).start();

        /**
         * Set current stats values
         */
        binding.satietyStat.text = Game.player.satiety.toString()
        binding.happinessStat.text = Game.player.happiness.toString()
        binding.schoolPerformanceStat.text = Game.player.school_performance.toString()

        /**
         * Set progressbars values
         */
        binding.satietyProgressBar.progress = Game.player.satiety
        binding.happinessProgressBar.progress = Game.player.happiness
        binding.schoolPerformanceProgressBar.progress = Game.player.school_performance

        /**
         * Change color of progressbars
         */
        var colorHappiness = ((1000 - binding.happinessProgressBar.progress) * 0.12).toFloat()
        var colorSatiety = ((1000 - binding.satietyProgressBar.progress) * 0.12).toFloat()
        var colorSchoolPerformance = ((1000 - binding.schoolPerformanceProgressBar.progress) * 0.12).toFloat()
        binding.happinessProgressBar.progressTintList = ColorStateList.valueOf(HSLToColor(floatArrayOf(120-colorHappiness, 1f , 0.5f)))
        binding.satietyProgressBar.progressTintList = ColorStateList.valueOf(HSLToColor(floatArrayOf(120-colorSatiety, 1f , 0.5f)))
        binding.schoolPerformanceProgressBar.progressTintList = ColorStateList.valueOf(HSLToColor(floatArrayOf(120-colorSchoolPerformance, 1f , 0.5f)))

        changeMoneyAnimation(binding.moneyTextView.text.toString().toInt(), Game.player.money)
        binding.dateTextView.text = Game.game_date.toString()
    }

    /**
     * Animation for Money field on the screen
     */
    private fun changeMoneyAnimation(from: Int, to: Int){
        val animator = ValueAnimator.ofInt(from, to)
        when(to - from){
            in 0..20 -> animator.duration = 200
            in 21..10000 -> animator.duration = 300
            else -> animator.duration = 400
        }
        animator.addUpdateListener {
                animation -> binding.moneyTextView.text = animation.animatedValue.toString()
        }
        animator.start()
    }

    fun achieve(achievement: Achievements) {
        if (Game.player.achieved(achievement)) {

            stopTick()

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
                binding.AchievementRarityType.visibility= View.VISIBLE
                when(achievement.achievement_chance.toString().toFloat()){
                    in 0.0..1.0 -> {
                        binding.AchievementRarityType.text = getText(R.string.achievement_super_rare)
                        binding.AchievementRarityType.setTextColor(resources.getColor(R.color.super_rare))
                        binding.AchievementRarityType.setShadowLayer(4f, 0f, 0f, resources.getColor(R.color.super_rare))
                    }
                    in 1.0..5.0 -> {
                        binding.AchievementRarityType.text = getText(R.string.achievement_rare)
                        binding.AchievementRarityType.setTextColor(resources.getColor(R.color.rare))
                        binding.AchievementRarityType.setShadowLayer(8f, 0f, 0f, resources.getColor(R.color.rare_glow))
                    }
                    in 5.0..15.0 ->{
                        binding.AchievementRarityType.text = getText(R.string.achievement_uncommon)
                        binding.AchievementRarityType.setTextColor(resources.getColor(R.color.uncommon))
                    }
                    else ->{
                        binding.AchievementRarityType.text = getText(R.string.achievement_common)
                        binding.AchievementRarityType.setTextColor(resources.getColor(R.color.common))
                    }
                }
            }
            mBuilder.setView(mView)
            val dialog: AlertDialog = mBuilder.create()
            dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT)) // transparent background of dialog
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

    fun death() {
        /**
         * Pair (favourite action, how many times it was clicked)
         */
        var biggest_counter: Pair<String, Int> = Pair("", 0)

        /**
         * Number of clicks that player did before death or victory
         */
        var number_of_clicks: Int = 0

        /**
         * Number of achievements that player earned before death or victory
         */
        val number_of_achievements: Int = Game.player.achieved_achievements.size

        /**
         * Number of doshiraks that player could buy if he spent all his money
         * on them
         */
        val earned_money_in_doshiraks: Double =  Game.player.earned_money.toDouble() / -Game.context_bundle.getNumber("doshirack_money")

        for (i in Game.counters.keys) {
            biggest_counter = if (Game.counters[i]!! > biggest_counter.second) Pair(i, Game.counters[i]!!) else biggest_counter
            number_of_clicks += Game.counters[i]!!
        }

        stopTick()

        /**
         * Next block of code is for AlertDialog settings
         * that appears at the end of the game
         */
        val mBuilder = AlertDialog.Builder(this)
        val mView = layoutInflater.inflate(R.layout.end_game_dialog, null)
        val binding = EndGameDialogBinding.bind(mView)
        with(binding){
            playedTime.text = "${game_time/1000} ${getString(R.string.end_game_seconds)}"
            clickNumber.text = number_of_clicks.toString()
            favouriteAction.text = biggest_counter.first + " - ${biggest_counter.second} ${getString(R.string.end_game_times_number)}"
            totalEarnings.text = Game.player.earned_money.toString()
            earningsInDoshirak.text = earned_money_in_doshiraks.toString()
            totalAchievements.text = "$number_of_achievements/50"
        }
        mBuilder.setView(mView)
        val dialog: AlertDialog = mBuilder.create()
        dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        dialog.show()
        dialog.setCanceledOnTouchOutside(false) // don't close dialog on outside tap
        /**
         * Finish activity if goToMainMenu button pressed
         */
        binding.goToMainMenu.setOnClickListener {
            dialog.dismiss()
            finish()
        }
        /**
         * Finish activity if back button pressed
         */
        dialog.setOnKeyListener { _, keyCode, _ ->
            if(keyCode == KeyEvent.KEYCODE_BACK) {
                if(dialog.isShowing) {
                    dialog.dismiss()
                    finish()
                }
            }
            true
        }
    }

    fun onSettingsClick(view: View){
        finish()
    }
}
