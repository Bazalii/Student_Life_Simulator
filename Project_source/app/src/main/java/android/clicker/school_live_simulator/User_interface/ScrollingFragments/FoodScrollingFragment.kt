package android.clicker.school_live_simulator.User_interface.ScrollingFragments

import android.clicker.school_live_simulator.Classes.Achievements_classes.Random_achievements.FoodEventsRandomAchievements
import android.clicker.school_live_simulator.Classes.NotEnoughMoneyException
import android.clicker.school_live_simulator.Game
import android.clicker.school_live_simulator.Food
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
                binding.layoutFoodEatCrackers.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.click))
                Game.counters[Game.context_bundle.getTitle("food_eat_crackers")] =
                    Game.counters[Game.context_bundle.getTitle("food_eat_crackers")] ?: 0 + 1
                (activity as GameActivity).updateStats()

            } catch (exception: NotEnoughMoneyException){
                binding.layoutFoodEatCrackers.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
                (activity as GameActivity).notEnoughMoneyAnim()
            }
        }

        binding.foodEatDoshirack.setOnClickListener{
            try {
                Game.player.eat(Food.DOSHIRAK)
                binding.layoutFoodEatDoshirack.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.click))
                Game.counters[Game.context_bundle.getTitle("food_eat_doshirack")] =
                    Game.counters[Game.context_bundle.getTitle("food_eat_doshirack")] ?: 0 + 1
                (activity as GameActivity).updateStats()
                (activity as GameActivity).achieve(FoodEventsRandomAchievements.TWO_SPICES)
            } catch (exception: NotEnoughMoneyException){
                binding.layoutFoodEatDoshirack.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
                (activity as GameActivity).notEnoughMoneyAnim()
            }

        }

        binding.foodEatAtTheCanteen.setOnClickListener{
            try {
                Game.player.eat(Food.EATERY_FOOD)
                binding.layoutFoodEatAtTheCanteen.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.click))
                Game.counters[Game.context_bundle.getTitle("food_eat_at_the_canteen")] =
                    Game.counters[Game.context_bundle.getTitle("food_eat_at_the_canteen")] ?: 0 + 1
                (activity as GameActivity).updateStats()
                (activity as GameActivity).achieve(FoodEventsRandomAchievements.POISONING_OF_EATERY_FOOD)
            } catch (exception: NotEnoughMoneyException){
                binding.layoutFoodEatAtTheCanteen.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
                (activity as GameActivity).notEnoughMoneyAnim()
            }
        }

        binding.foodEatAtMcdonalds.setOnClickListener{
            try {
                Game.player.eat(Food.MCDONALDS)
                binding.layoutFoodEatAtMcdonalds.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.click))
                Game.counters[Game.context_bundle.getTitle("food_eat_at_Mcdonalds")] =
                    Game.counters[Game.context_bundle.getTitle("food_eat_at_Mcdonalds")] ?: 0 + 1
                (activity as GameActivity).updateStats()
            } catch (exception: NotEnoughMoneyException){
                binding.layoutFoodEatAtMcdonalds.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
                (activity as GameActivity).notEnoughMoneyAnim()
            }
        }

        binding.foodOrderDelivery.setOnClickListener{
            try {
                Game.player.eat(Food.PIZZA_AT_HOME)
                binding.layoutFoodOrderDelivery.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.click))
                Game.counters[Game.context_bundle.getTitle("food_order_delivery")] =
                    Game.counters[Game.context_bundle.getTitle("food_order_delivery")] ?: 0 + 1
                (activity as GameActivity).updateStats()
            } catch (exception: NotEnoughMoneyException){
                binding.layoutFoodOrderDelivery.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
                (activity as GameActivity).notEnoughMoneyAnim()
            }
        }

        binding.foodGoToTheRestaurant.setOnClickListener{
            try {
                Game.player.eat(Food.RESTAURANT_FOOD)
                binding.layoutFoodGoToTheRestaurant.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.click))
                Game.counters[Game.context_bundle.getTitle("food_go_to_the_restaurant")] =
                    Game.counters[Game.context_bundle.getTitle("food_go_to_the_restaurant")] ?: 0 + 1
                (activity as GameActivity).updateStats()
            } catch (exception: NotEnoughMoneyException){
                binding.layoutFoodGoToTheRestaurant.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
                (activity as GameActivity).notEnoughMoneyAnim()
            }
        }

    }
}
