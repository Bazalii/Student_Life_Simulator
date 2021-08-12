package android.clicker.school_live_simulator.User_interface.ScrollingFragments

import android.clicker.school_live_simulator.Game
import android.clicker.school_live_simulator.User_interface.GameActivity
import android.clicker.school_live_simulator.databinding.FragmentFoodScrollingBinding
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class FoodScrollingFragment : Fragment() {
    lateinit var binding: FragmentFoodScrollingBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFoodScrollingBinding.inflate(inflater)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        binding.foodEatCrackers.setOnClickListener{
            Game.player.addPercentSatiety(5)
            Game.player.addPercentHappiness(3)
            Game.player.reduceMoney(10)

            (activity as GameActivity).updateStats()
        }

    }
}
