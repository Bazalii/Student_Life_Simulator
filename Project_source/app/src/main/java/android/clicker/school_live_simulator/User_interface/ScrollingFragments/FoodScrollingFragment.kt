package android.clicker.school_live_simulator.User_interface.ScrollingFragments

import android.clicker.school_live_simulator.Classes.NotEnoughMoneyException
import android.clicker.school_live_simulator.Food
import android.clicker.school_live_simulator.Game
import android.clicker.school_live_simulator.R
import android.clicker.school_live_simulator.User_interface.GameActivity
import android.clicker.school_live_simulator.databinding.FragmentFoodScrollingBinding
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
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
            try {
                Game.player.eat(Food.CRACKERS)
                (activity as GameActivity).updateStats()
            } catch (exception: NotEnoughMoneyException){
                binding.layoutFoodEatCrackers.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
            }
        }

        binding.foodEatDoshirack.setOnClickListener{
            try {
                Game.player.eat(Food.DOSHIRAK)
                (activity as GameActivity).updateStats()
            } catch (exception: NotEnoughMoneyException){
                binding.layoutFoodEatDoshirack.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
            }

        }

        binding.foodEatAtTheCanteen.setOnClickListener{
            try {
                Game.player.eat(Food.EATERY_FOOD)
                (activity as GameActivity).updateStats()
            } catch (exception: NotEnoughMoneyException){
                binding.layoutFoodEatAtTheCanteen.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
            }
        }

        binding.foodEatAtMcdonalds.setOnClickListener{
            try {
                Game.player.eat(Food.MCDONALDS)
                (activity as GameActivity).updateStats()
            } catch (exception: NotEnoughMoneyException){
                binding.layoutFoodEatAtMcdonalds.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
            }
        }

        binding.foodOrderDelivery.setOnClickListener{
            try {
                Game.player.eat(Food.PIZZA_AT_HOME)
                (activity as GameActivity).updateStats()
            } catch (exception: NotEnoughMoneyException){
                binding.layoutFoodOrderDelivery.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
            }
        }

        binding.foodGoToTheRestaurant.setOnClickListener{
            try {
                Game.player.eat(Food.RESTORANT_FOOD)
                (activity as GameActivity).updateStats()
            } catch (exception: NotEnoughMoneyException){
                binding.layoutFoodGoToTheRestaurant.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
            }
        }

    }
}
