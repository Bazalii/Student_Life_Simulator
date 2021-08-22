package android.clicker.school_live_simulator.User_interface

import android.clicker.school_live_simulator.R
import android.clicker.school_live_simulator.databinding.AchievementItemBinding
import android.clicker.school_live_simulator.databinding.ActivityAchievementsBinding
import android.clicker.school_live_simulator.databinding.ActivityMainMenuBinding
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class AchievementsActivity : AppCompatActivity() {
    lateinit var binding: ActivityAchievementsBinding
    private  val adapter = AchievementsAdapter()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAchievementsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        /**
         * add Toolbar with back button
         */
        setSupportActionBar(binding.toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.adapter = adapter

    }

    inner class AchievementsAdapter: RecyclerView.Adapter<AchievementsAdapter.AchievementsHolder>() {
        /**
         * Test arrays
         */
        val icons_list = listOf(
            R.drawable.ic_lock,
            R.drawable.ic_lock,
            R.drawable.ic_lock,
            R.drawable.ic_lock,
            R.drawable.ic_lock,
            R.drawable.ic_lock,
            R.drawable.ic_lock,
            R.drawable.ic_lock,
            R.drawable.ic_lock,
            R.drawable.ic_lock,
            R.drawable.ic_lock,
            R.drawable.ic_lock,
            R.drawable.ic_lock,
            R.drawable.ic_lock,
            R.drawable.ic_lock,
            R.drawable.ic_lock,
            R.drawable.ic_lock,
            R.drawable.ic_lock,
            R.drawable.ic_lock,
            R.drawable.ic_lock,
        )
        val text_list = listOf(
            R.string.app_name,
            R.string.app_name,
            R.string.app_name,
            R.string.app_name,
            R.string.app_name,
            R.string.app_name,
            R.string.app_name,
            R.string.app_name,
            R.string.app_name,
            R.string.app_name,
            R.string.app_name,
            R.string.app_name,
            R.string.app_name,
            R.string.app_name,
            R.string.app_name,
            R.string.app_name,
            R.string.app_name,
            R.string.app_name,
            R.string.app_name,
            R.string.app_name,
        )
        inner class AchievementsHolder(item: View): RecyclerView.ViewHolder(item) {
            val binding = AchievementItemBinding.bind(item)

            /**
             * Fill template of achievement with certain values
             */
            fun bind(text: Int, image: Int) = with(binding){
                achievIV.setImageResource(image)
                achievName.text = getString(text)
            }
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AchievementsHolder {
            val view = LayoutInflater.from(parent.context).inflate(R.layout.achievement_item, parent, false)
            return AchievementsHolder(view)
        }

        override fun onBindViewHolder(holder: AchievementsHolder, position: Int) {
            holder.bind(text_list[position], icons_list[position])
            // holder.bind(Game.player.achieved_achievements[position])
        }

        /**
         * Number of elements = array size
         */
        override fun getItemCount(): Int {
            return icons_list.size
            // return Game.player.achieved_achievements.size
        }
    }
}
