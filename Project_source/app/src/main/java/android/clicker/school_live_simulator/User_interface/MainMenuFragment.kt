package android.clicker.school_live_simulator.User_interface

import android.clicker.school_live_simulator.Classes.EnumClasses.Months
import android.clicker.school_live_simulator.Classes.GameDate.GameDate
import android.clicker.school_live_simulator.Game
import android.clicker.school_live_simulator.NormalMode
import android.clicker.school_live_simulator.Player
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.clicker.school_live_simulator.R
import android.clicker.school_live_simulator.databinding.FragmentMainMenuBinding
import android.content.Intent
import androidx.core.content.ContextCompat
import androidx.navigation.Navigation

class MainMenuFragment : Fragment() {
    lateinit var binding: FragmentMainMenuBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentMainMenuBinding.inflate(inflater)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(binding) {
            when (Game.locale) {
                "ru" -> RussianButton.setBackgroundColor(ContextCompat.getColor(activity as MainMenuActivity, android.R.color.holo_green_dark))
                else -> EnglishButton.setBackgroundColor(ContextCompat.getColor(activity as MainMenuActivity, android.R.color.holo_green_dark)
                )
            }

            ContinueGame.setOnClickListener {
                val intent = Intent(activity as MainMenuActivity, GameActivity::class.java)
                startActivity(intent)
                (activity as MainMenuActivity).overridePendingTransition(R.anim.start_activity_1, R.anim.start_activity_2)
                Game.load((activity as MainMenuActivity).applicationContext.filesDir)
            }

            NewGame.setOnClickListener {
                /**
                 * Assign defaults to all properties of Game
                 */
                Game.difficulty_state = NormalMode
                Game.counters = mutableMapOf()
                Game.player = Player()
                Game.game_date = GameDate(1, Months.September, 2009)

                /**
                 * start GameActivity
                 */
                val intent = Intent(activity as MainMenuActivity, GameActivity::class.java)
                startActivity(intent)
                (activity as MainMenuActivity).overridePendingTransition(R.anim.start_activity_1, R.anim.start_activity_2)
            }

            RussianButton.setOnClickListener {
                Game.locale = "ru"
                Game.isDefaultLanguage = false
                (activity as MainMenuActivity).recreate()
            }

            EnglishButton.setOnClickListener {
                Game.locale = "en"
                Game.isDefaultLanguage = false
                (activity as MainMenuActivity).recreate()
            }
            AboutGame.setOnClickListener {
                Navigation.findNavController(view).navigate(R.id.action_mainMenuFragment2_to_aboutGameFragment)
            }
        }
    }
}
