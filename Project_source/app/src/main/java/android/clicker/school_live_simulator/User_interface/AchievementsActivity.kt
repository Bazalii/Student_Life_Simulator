package android.clicker.school_live_simulator.User_interface

import android.clicker.school_live_simulator.Classes.Achievements_classes.Interfaces.Achievements
import android.clicker.school_live_simulator.Classes.Achievements_classes.Interfaces.RandomAchievements
import android.clicker.school_live_simulator.Game
import android.clicker.school_live_simulator.R
import android.clicker.school_live_simulator.databinding.AchievementItemBinding
import android.clicker.school_live_simulator.databinding.AchievementDialogBinding
import android.clicker.school_live_simulator.databinding.ActivityAchievementsBinding
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Settings.Global.getString
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.appcompat.app.AlertDialog


class AchievementsActivity : AppCompatActivity() {

    lateinit var binding: ActivityAchievementsBinding
    private val adapter = AchievementsAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAchievementsBinding.inflate(layoutInflater)
        Game.setLocale(resources, this@AchievementsActivity)
        setContentView(binding.root)
        /**
         * add Toolbar with back button
         */
        setSupportActionBar(binding.toolbar)
        binding.toolbar.setNavigationOnClickListener {
            onBackPressed()
        }
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.adapter = adapter
        /**
         * Send achieved_achievements array to RecyclerView
         */
        adapter.addAll(Game.player.achieved_achievements)
        /**
         * RecyclerView onClick listener
         */
        adapter.setOnItemClickListieer(object: AchievementsAdapter.onItemClickListener{
            override fun onItemClick(position: Int) {
                alertDialog(this@AchievementsActivity, position, layoutInflater)
            }
        })
    }
    private fun alertDialog(context: Context, position: Int, inflater: LayoutInflater){
        val mBuilder = AlertDialog.Builder(context)
        val mView = inflater.inflate(R.layout.achievement_dialog, null)
        val binding = AchievementDialogBinding.bind(mView)
        val achievement = Game.player.achieved_achievements[position]
        binding.AchievementTitle.text = achievement.substring(0, achievement.indexOf('$'))
        binding.AchievementDescription.text = achievement.substring(achievement.indexOf('$') + 1, achievement.length)
//        if(achievement is RandomAchievements){
//            binding.AchievementChance.text = "${achievement.achievement_chance.toString()}%"
//            binding.AchievementChance.visibility = View.VISIBLE
//            binding.AchievementChanceText.visibility = View.VISIBLE
//            binding.AchievementRarityType.visibility= View.VISIBLE
//            when(achievement.achievement_chance.toString().toFloat()){
//                in 0.0..1.0 -> {
//                    binding.AchievementRarityType.text = getText(R.string.achievement_super_rare)
//                    binding.AchievementRarityType.setTextColor(resources.getColor(R.color.super_rare))
//                    binding.AchievementRarityType.setShadowLayer(4f, 0f, 0f, resources.getColor(R.color.super_rare))
//                }
//                in 1.0..5.0 -> {
//                    binding.AchievementRarityType.text = getText(R.string.achievement_rare)
//                    binding.AchievementRarityType.setTextColor(resources.getColor(R.color.rare))
//                    binding.AchievementRarityType.setShadowLayer(8f, 0f, 0f, resources.getColor(R.color.rare_glow))
//                }
//                in 5.0..15.0 ->{
//                    binding.AchievementRarityType.text = getText(R.string.achievement_uncommon)
//                    binding.AchievementRarityType.setTextColor(resources.getColor(R.color.uncommon))
//                }
//                else ->{
//                    binding.AchievementRarityType.text = getText(R.string.achievement_common)
//                    binding.AchievementRarityType.setTextColor(resources.getColor(R.color.common))
//                }
//            }
//        }
        mBuilder.setView(mView)
        val dialog: AlertDialog = mBuilder.create()
        dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        dialog.show()
        binding.AchievementOK.setOnClickListener {
            dialog.dismiss()
        }
    }
}


    class AchievementsAdapter: RecyclerView.Adapter<AchievementsAdapter.AchievementsHolder>() {

        private lateinit var mListener: onItemClickListener

        interface onItemClickListener{
            fun  onItemClick(position : Int)
        }

        fun setOnItemClickListieer(listener: onItemClickListener){
            mListener = listener
        }

        val achievements: ArrayList<String> = arrayListOf()

        inner class AchievementsHolder(item: View, listener: onItemClickListener): RecyclerView.ViewHolder(item) {
            val binding = AchievementItemBinding.bind(item)

            init{
                item.setOnClickListener {
                    listener.onItemClick(adapterPosition)
                }
            }

            /**
             * Fill template of achievement with certain values
             */
            fun bind(achievement: String) = with(binding){
                achievName.text = achievement.substring(0, achievement.indexOf('$'))
//                if(achievement is RandomAchievements){
//                    when(achievement.achievement_chance.toString().toFloat()){
//                        in 0.0..1.0 -> {
//                            achievName.setTextColor(Game.context_bundle.context.resources.getColor(R.color.super_rare))
//                        }
//                        in 1.0..5.0 -> {
//                            achievName.setTextColor(Game.context_bundle.context.resources.getColor(R.color.rare))
//                        }
//                        in 5.0..15.0 ->{
//                            achievName.setTextColor(Game.context_bundle.context.resources.getColor(R.color.uncommon))
//                        }
//                        else ->{
//                            achievName.setTextColor(Game.context_bundle.context.resources.getColor(R.color.common))
//                        }
//                    }
//                }
            }
        }



        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AchievementsHolder {
            val view = LayoutInflater.from(parent.context).inflate(R.layout.achievement_item, parent, false)
            return AchievementsHolder(view, mListener)
        }

        override fun onBindViewHolder(holder: AchievementsHolder, position: Int) {
            holder.bind(achievements[position])
            // holder.bind(Game.player.achieved_achievements[position])
        }

        /**
         * Number of elements = array size
         */
        override fun getItemCount(): Int {
            return achievements.size
            // return Game.player.achieved_achievements.size
        }
        fun addAll(achievements: List<String>){
            this.achievements.clear()
            this.achievements.addAll(achievements)
            notifyDataSetChanged()
        }
    }

