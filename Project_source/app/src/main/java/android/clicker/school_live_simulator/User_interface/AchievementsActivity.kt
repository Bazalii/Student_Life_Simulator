package android.clicker.school_live_simulator.User_interface

import android.clicker.school_live_simulator.Classes.Achievements_classes.Interfaces.Achievements
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
        binding.AchievementTitle.text = Game.player.achieved_achievements[position].achievement_name
        binding.AchievementDescription.text = Game.player.achieved_achievements[position].achievement_message
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

        val achievements = arrayListOf<Achievements>()


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
            fun bind(achievement: Achievements) = with(binding){
                //achievIV.setImageResource(image)
                achievName.text = achievement.achievement_name
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
        fun addAll(achievements: List<Achievements>){
            this.achievements.clear()
            this.achievements.addAll(achievements)
            notifyDataSetChanged()
        }
    }

