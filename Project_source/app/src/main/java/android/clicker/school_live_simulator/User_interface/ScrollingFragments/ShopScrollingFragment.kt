package android.clicker.school_live_simulator.User_interface.ScrollingFragments

import android.app.Dialog
import android.clicker.school_live_simulator.*
import android.clicker.school_live_simulator.Classes.IncorrectValueException
import android.clicker.school_live_simulator.User_interface.GameActivity
import android.clicker.school_live_simulator.databinding.FragmentShopScrollingBinding
import android.graphics.Color
import android.graphics.Color.*
import android.graphics.drawable.Drawable
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.MotionEvent
import android.view.View
import android.view.View.GONE
import android.view.View.VISIBLE
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton
import androidx.fragment.app.Fragment

class ShopScrollingFragment : Fragment() {
    lateinit var binding: FragmentShopScrollingBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentShopScrollingBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        /**
         * Buttons for categories
         */
        binding.shopGuitarCourses.setOnClickListener {
            if(binding.shopGuitarCourseV1.visibility == GONE){
                binding.shopGuitarCourseV1.visibility = VISIBLE
                binding.shopGuitarCourseV2.visibility = VISIBLE
                binding.shopGuitarCourseV3.visibility = VISIBLE
                binding.shopGuitarCourseV4.visibility = VISIBLE
                binding.shopGuitarCourseV5.visibility = VISIBLE
            }
            else{
                binding.shopGuitarCourseV1.visibility = GONE
                binding.shopGuitarCourseV2.visibility = GONE
                binding.shopGuitarCourseV3.visibility = GONE
                binding.shopGuitarCourseV4.visibility = GONE
                binding.shopGuitarCourseV5.visibility = GONE
            }
        }

        binding.shopComputerCourses.setOnClickListener {
            if(binding.shopComputerCourseV1.visibility == GONE){
                binding.shopComputerCourseV1.visibility = VISIBLE
                binding.shopComputerCourseV2.visibility = VISIBLE
                binding.shopComputerCourseV3.visibility = VISIBLE
                binding.shopComputerCourseV4.visibility = VISIBLE
                binding.shopComputerCourseV5.visibility = VISIBLE
            }
            else{
                binding.shopComputerCourseV1.visibility = GONE
                binding.shopComputerCourseV2.visibility = GONE
                binding.shopComputerCourseV3.visibility = GONE
                binding.shopComputerCourseV4.visibility = GONE
                binding.shopComputerCourseV5.visibility = GONE
            }
        }

        binding.shopBicycles.setOnClickListener {
            if(binding.shopUssrBicycle.visibility == GONE){
                binding.shopUssrBicycle.visibility = VISIBLE
                binding.shopUsualBicycle.visibility = VISIBLE
                binding.shopMountainBicycle.visibility = VISIBLE
            }
            else{
                binding.shopUssrBicycle.visibility = GONE
                binding.shopUsualBicycle.visibility = GONE
                binding.shopMountainBicycle.visibility = GONE
            }
        }

        binding.shopGuitars.setOnClickListener {
            if(binding.shopUssrGuitar.visibility == GONE){
                binding.shopUssrGuitar.visibility = VISIBLE
                binding.shopUralGuitar.visibility = VISIBLE
                binding.shopYamahaGuitar.visibility = VISIBLE
                binding.shopFenderGuitar.visibility = VISIBLE
                binding.shopDoubleNeckGuitar.visibility = VISIBLE
            }
            else{
                binding.shopUssrGuitar.visibility = GONE
                binding.shopUralGuitar.visibility = GONE
                binding.shopYamahaGuitar.visibility = GONE
                binding.shopFenderGuitar.visibility = GONE
                binding.shopDoubleNeckGuitar.visibility = GONE
            }
        }

        binding.shopComputers.setOnClickListener {
            if(binding.shopPreviouslyUsedComputer.visibility == GONE){
                binding.shopPreviouslyUsedComputer.visibility = VISIBLE
                binding.shopOldComputer.visibility = VISIBLE
                binding.shopUsualComputer.visibility = VISIBLE
                binding.shopXiaomiComputer.visibility = VISIBLE
                binding.shopMacbookComputer.visibility = VISIBLE
            }
            else{
                binding.shopPreviouslyUsedComputer.visibility = GONE
                binding.shopOldComputer.visibility = GONE
                binding.shopUsualComputer.visibility = GONE
                binding.shopXiaomiComputer.visibility = GONE
                binding.shopMacbookComputer.visibility = GONE
                binding.shopBicycles
            }
        }

        /**
         * Buttons for items
         */
        binding.shopUssrBicycle.setOnClickListener {
                try {
                    Game.player.buyNewBicycle()
                    updateUI()
                } catch(exception: IncorrectValueException){
                    binding.shopUssrBicycle.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
                }
        }

        binding.shopUsualBicycle.setOnClickListener {
            if(Game.player.items.bicycle is UssrBicycleState){
                try {
                    Game.player.buyNewBicycle()
                    updateUI()
                } catch(exception: IncorrectValueException){
                    binding.shopUsualBicycle.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
                }
            }
            else{
                Toast.makeText(activity, "buy previous", Toast.LENGTH_SHORT).show()
                binding.shopUsualBicycle.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
            }
        }


    }

    override fun onResume() {
        super.onResume()
        updateUI()
    }

    fun updateUI(){
        when(Game.player.items.bicycle){
            is NullBicycleState->{
                canBuy(binding.shopUssrBicycle)
            }
            is UssrBicycleState->{
                isBought(binding.shopUssrBicycle)
                canBuy(binding.shopUsualBicycle)
            }
            is UsualBicycleState->{
                isBought(binding.shopUssrBicycle)
                isBought(binding.shopUsualBicycle)
                canBuy(binding.shopMountainBicycle)
            }
        }
        (activity as GameActivity).updateStats()
    }
    fun isBought(button: Button){
        button.setBackgroundColor(GREEN)
        button.isClickable = false
    }
    fun canBuy(button: Button){

    }
/*    fun isLocked(button: Button){
        button.setBackgroundColor(RED)
    }*/
}
