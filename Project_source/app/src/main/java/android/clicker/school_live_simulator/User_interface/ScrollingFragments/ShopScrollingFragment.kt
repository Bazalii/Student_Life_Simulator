package android.clicker.school_live_simulator.User_interface.ScrollingFragments

import android.clicker.school_live_simulator.*
import android.clicker.school_live_simulator.Classes.IsNotAvailableException
import android.clicker.school_live_simulator.Classes.NotEnoughMoneyException
import android.clicker.school_live_simulator.R.attr.selectableItemBackground
import android.clicker.school_live_simulator.User_interface.GameActivity
import android.clicker.school_live_simulator.databinding.FragmentShopScrollingBinding
import android.graphics.Color.*
import android.graphics.drawable.Drawable
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.View.GONE
import android.view.View.VISIBLE
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
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
            if(binding.layoutShopGuitarCourseV1.visibility == GONE){
                binding.layoutShopGuitarCourseV1.visibility = VISIBLE
                binding.layoutShopGuitarCourseV2.visibility = VISIBLE
                binding.layoutShopGuitarCourseV3.visibility = VISIBLE
                binding.layoutShopGuitarCourseV4.visibility = VISIBLE
                binding.layoutShopGuitarCourseV5.visibility = VISIBLE
            }
            else{
                binding.layoutShopGuitarCourseV1.visibility = GONE
                binding.layoutShopGuitarCourseV2.visibility = GONE
                binding.layoutShopGuitarCourseV3.visibility = GONE
                binding.layoutShopGuitarCourseV4.visibility = GONE
                binding.layoutShopGuitarCourseV5.visibility = GONE
            }
        }

        binding.shopComputerCourses.setOnClickListener {
            if(binding.layoutShopComputerCourseV1.visibility == GONE){
                binding.layoutShopComputerCourseV1.visibility = VISIBLE
                binding.layoutShopComputerCourseV2.visibility = VISIBLE
                binding.layoutShopComputerCourseV3.visibility = VISIBLE
                binding.layoutShopComputerCourseV4.visibility = VISIBLE
                binding.layoutShopComputerCourseV5.visibility = VISIBLE
            }
            else{
                binding.layoutShopComputerCourseV1.visibility = GONE
                binding.layoutShopComputerCourseV2.visibility = GONE
                binding.layoutShopComputerCourseV3.visibility = GONE
                binding.layoutShopComputerCourseV4.visibility = GONE
                binding.layoutShopComputerCourseV5.visibility = GONE
            }
        }

        binding.shopBicycles.setOnClickListener {
            if(binding.layoutShopUssrBicycle.visibility == GONE){
                binding.layoutShopUssrBicycle.visibility = VISIBLE
                binding.layoutShopUsualBicycle.visibility = VISIBLE
                binding.layoutShopMountainBicycle.visibility = VISIBLE
            }
            else{
                binding.layoutShopUssrBicycle.visibility = GONE
                binding.layoutShopUsualBicycle.visibility = GONE
                binding.layoutShopMountainBicycle.visibility = GONE
            }
        }

        binding.shopGuitars.setOnClickListener {
            if(binding.layoutShopUssrGuitar.visibility == GONE){
                binding.layoutShopUssrGuitar.visibility = VISIBLE
                binding.layoutShopUralGuitar.visibility = VISIBLE
                binding.layoutShopYamahaGuitar.visibility = VISIBLE
                binding.layoutShopFenderGuitar.visibility = VISIBLE
                binding.layoutShopDoubleNeckGuitar.visibility = VISIBLE
            }
            else{
                binding.layoutShopUssrGuitar.visibility = GONE
                binding.layoutShopUralGuitar.visibility = GONE
                binding.layoutShopYamahaGuitar.visibility = GONE
                binding.layoutShopFenderGuitar.visibility = GONE
                binding.layoutShopDoubleNeckGuitar.visibility = GONE
            }
        }

        binding.shopComputers.setOnClickListener {
            if(binding.layoutShopPreviouslyUsedComputer.visibility == GONE){
                binding.layoutShopPreviouslyUsedComputer.visibility = VISIBLE
                binding.layoutShopOldComputer.visibility = VISIBLE
                binding.layoutShopUsualComputer.visibility = VISIBLE
                binding.layoutShopXiaomiComputer.visibility = VISIBLE
                binding.layoutShopMacbookComputer.visibility = VISIBLE
            }
            else{
                binding.layoutShopPreviouslyUsedComputer.visibility = GONE
                binding.layoutShopOldComputer.visibility = GONE
                binding.layoutShopUsualComputer.visibility = GONE
                binding.layoutShopXiaomiComputer.visibility = GONE
                binding.layoutShopMacbookComputer.visibility = GONE
            }
        }


        /**
         * Actions for guitar courses buttons
         */
        binding.shopGuitarCourseV1.setOnClickListener {
            try {
                Game.player.buyNextGuitarCourse(YardGuitarCourseState::class)
                updateUI()
            } catch(exception: NotEnoughMoneyException){
                binding.layoutShopGuitarCourseV1.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
            } catch(exception: IsNotAvailableException){
                Toast.makeText(activity, "USSR guitar or better is required", Toast.LENGTH_SHORT).show()
                binding.layoutShopGuitarCourseV1.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
            }
        }

        binding.shopGuitarCourseV2.setOnClickListener {
            if(Game.player.current_courses.guitar_course is YardGuitarCourseState){
                try {
                    Game.player.buyNextGuitarCourse(FirstSongCourseState::class)
                    updateUI()
                } catch(exception: NotEnoughMoneyException){
                    binding.layoutShopGuitarCourseV2.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
                } catch(exception: IsNotAvailableException){
                    Toast.makeText(activity, "Ural guitar or better is required", Toast.LENGTH_SHORT).show()
                    binding.layoutShopGuitarCourseV2.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
                }
            }
            else{
                Toast.makeText(activity, "buy previous", Toast.LENGTH_SHORT).show()
                binding.layoutShopGuitarCourseV2.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
            }
        }

        binding.shopGuitarCourseV3.setOnClickListener {
            if(Game.player.current_courses.guitar_course is FirstSongCourseState){
                try {
                    Game.player.buyNextGuitarCourse(YardSongCourseState::class)
                    updateUI()
                } catch(exception: NotEnoughMoneyException){
                    binding.layoutShopGuitarCourseV3.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
                } catch(exception: IsNotAvailableException){
                    Toast.makeText(activity, "Yamaha guitar or better is required", Toast.LENGTH_SHORT).show()
                    binding.layoutShopGuitarCourseV3.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
                }
            }
            else{
                Toast.makeText(activity, "buy previous", Toast.LENGTH_SHORT).show()
                binding.layoutShopGuitarCourseV3.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
            }
        }

        binding.shopGuitarCourseV4.setOnClickListener {
            if(Game.player.current_courses.guitar_course is YardSongCourseState){
                try {
                    Game.player.buyNextGuitarCourse(MusicalSchoolCourseState::class)
                    updateUI()
                } catch(exception: NotEnoughMoneyException){
                    binding.layoutShopGuitarCourseV4.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
                } catch(exception: IsNotAvailableException){
                    Toast.makeText(activity, "Fender guitar or better is required", Toast.LENGTH_SHORT).show()
                    binding.layoutShopGuitarCourseV4.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
                }
            }
            else{
                Toast.makeText(activity, "buy previous", Toast.LENGTH_SHORT).show()
                binding.layoutShopGuitarCourseV4.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
            }
        }

        binding.shopGuitarCourseV5.setOnClickListener {
            if(Game.player.current_courses.guitar_course is MusicalSchoolCourseState){
                try {
                    Game.player.buyNextGuitarCourse(MusicalObservatoryCourseState::class)
                    updateUI()
                } catch(exception: NotEnoughMoneyException){
                    binding.layoutShopGuitarCourseV5.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
                } catch(exception: IsNotAvailableException){
                    Toast.makeText(activity, "Double neck guitar is required", Toast.LENGTH_SHORT).show()
                    binding.layoutShopGuitarCourseV5.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
                }
            }
            else{
                Toast.makeText(activity, "buy previous", Toast.LENGTH_SHORT).show()
                binding.layoutShopGuitarCourseV5.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
            }
        }



        /**
         * Actions for computer courses buttons
         */
        binding.shopComputerCourseV1.setOnClickListener {
            try {
                Game.player.buyNextComputerCourse(FriendsCourseState::class)
                updateUI()
            } catch(exception: NotEnoughMoneyException){
                binding.layoutShopComputerCourseV1.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
            } catch(exception: IsNotAvailableException){
                Toast.makeText(activity, "buy new computer", Toast.LENGTH_SHORT).show()
                binding.layoutShopComputerCourseV1.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
            }
        }

        binding.shopComputerCourseV2.setOnClickListener {
            if(Game.player.current_courses.computer_course is FriendsCourseState){
                try {
                    Game.player.buyNextComputerCourse(OnlineWorkCourseState::class)
                    updateUI()
                } catch(exception: NotEnoughMoneyException){
                    binding.layoutShopComputerCourseV2.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
                } catch(exception: IsNotAvailableException){
                    Toast.makeText(activity, "buy new computer", Toast.LENGTH_SHORT).show()
                    binding.layoutShopComputerCourseV2.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
                }
            }
            else{
                Toast.makeText(activity, "buy previous", Toast.LENGTH_SHORT).show()
                binding.layoutShopComputerCourseV2.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
            }
        }

        binding.shopComputerCourseV3.setOnClickListener {
            if(Game.player.current_courses.computer_course is OnlineWorkCourseState){
                try {
                    Game.player.buyNextComputerCourse(WebDesignCourseState::class)
                    updateUI()
                } catch(exception: NotEnoughMoneyException){
                    binding.layoutShopComputerCourseV3.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
                } catch(exception: IsNotAvailableException){
                    Toast.makeText(activity, "buy new computer", Toast.LENGTH_SHORT).show()
                    binding.layoutShopComputerCourseV3.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
                }
            }
            else{
                Toast.makeText(activity, "buy previous", Toast.LENGTH_SHORT).show()
                binding.layoutShopComputerCourseV3.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
            }
        }

        binding.shopComputerCourseV4.setOnClickListener {
            if(Game.player.current_courses.computer_course is WebDesignCourseState){
                try {
                    Game.player.buyNextComputerCourse(VideoEditingCourseState::class)
                    updateUI()
                } catch(exception: NotEnoughMoneyException){
                    binding.layoutShopComputerCourseV4.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
                } catch(exception: IsNotAvailableException){
                    Toast.makeText(activity, "buy new computer", Toast.LENGTH_SHORT).show()
                    binding.layoutShopComputerCourseV4.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
                }
            }
            else{
                Toast.makeText(activity, "buy previous", Toast.LENGTH_SHORT).show()
                binding.layoutShopComputerCourseV4.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
            }
        }

        binding.shopComputerCourseV5.setOnClickListener {
            if(Game.player.current_courses.computer_course is VideoEditingCourseState){
                try {
                    Game.player.buyNextComputerCourse(GameDevelopmentCourseState::class)
                    updateUI()
                } catch(exception: NotEnoughMoneyException){
                    binding.layoutShopComputerCourseV5.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
                } catch(exception: IsNotAvailableException){
                    Toast.makeText(activity, "buy new computer", Toast.LENGTH_SHORT).show()
                    binding.layoutShopComputerCourseV5.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
                }
            }
            else{
                Toast.makeText(activity, "buy previous", Toast.LENGTH_SHORT).show()
                binding.layoutShopComputerCourseV5.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
            }
        }


        /**
         * Actions for bicycles buttons
         */
        binding.shopUssrBicycle.setOnClickListener {
                try {
                    Game.player.buyNewBicycle()
                    updateUI()
                } catch(exception: NotEnoughMoneyException){
                    binding.layoutShopUssrBicycle.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
                }
        }

        binding.shopUsualBicycle.setOnClickListener {
            if(Game.player.items.bicycle is UssrBicycleState){
                try {
                    Game.player.buyNewBicycle()
                    updateUI()
                } catch(exception: NotEnoughMoneyException){
                    binding.layoutShopUsualBicycle.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
                }
            }
            else{
                Toast.makeText(activity, "buy previous", Toast.LENGTH_SHORT).show()
                binding.layoutShopUsualBicycle.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
            }
        }

        binding.shopMountainBicycle.setOnClickListener {
            if(Game.player.items.bicycle is UsualBicycleState){
                try {
                    Game.player.buyNewBicycle()
                    updateUI()
                } catch(exception: NotEnoughMoneyException){
                    binding.layoutShopMountainBicycle.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
                }
            }
            else{
                Toast.makeText(activity, "buy previous", Toast.LENGTH_SHORT).show()
                binding.layoutShopMountainBicycle.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
            }
        }


        /**
         * Actions for guitars buttons
         */
        binding.shopUssrGuitar.setOnClickListener {
            try {
                Game.player.buyNewGuitar()
                updateUI()
            } catch(exception: NotEnoughMoneyException){
                binding.shopUssrGuitar.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
            }
        }

        binding.shopUralGuitar.setOnClickListener {
            if(Game.player.items.guitar is UssrGuitarState){
                try {
                    Game.player.buyNewGuitar()
                    updateUI()
                } catch(exception: NotEnoughMoneyException){
                    binding.layoutShopUralGuitar.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
                }
            }
            else{
                Toast.makeText(activity, "buy previous", Toast.LENGTH_SHORT).show()
                binding.layoutShopUralGuitar.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
            }
        }

        binding.shopUralGuitar.setOnClickListener {
            if(Game.player.items.guitar is UssrGuitarState){
                try {
                    Game.player.buyNewGuitar()
                    updateUI()
                } catch(exception: NotEnoughMoneyException){
                    binding.layoutShopUralGuitar.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
                }
            }
            else{
                Toast.makeText(activity, "buy previous", Toast.LENGTH_SHORT).show()
                binding.layoutShopUralGuitar.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
            }
        }

        binding.shopYamahaGuitar.setOnClickListener {
            if(Game.player.items.guitar is UralGuitarState){
                try {
                    Game.player.buyNewGuitar()
                    updateUI()
                } catch(exception: NotEnoughMoneyException){
                    binding.layoutShopYamahaGuitar.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
                }
            }
            else{
                Toast.makeText(activity, "buy previous", Toast.LENGTH_SHORT).show()
                binding.layoutShopYamahaGuitar.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
            }
        }

        binding.shopFenderGuitar.setOnClickListener {
            if(Game.player.items.guitar is YamahaGuitarState){
                try {
                    Game.player.buyNewGuitar()
                    updateUI()
                } catch(exception: NotEnoughMoneyException){
                    binding.layoutShopFenderGuitar.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
                }
            }
            else{
                Toast.makeText(activity, "buy previous", Toast.LENGTH_SHORT).show()
                binding.layoutShopFenderGuitar.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
            }
        }

        binding.shopDoubleNeckGuitar.setOnClickListener {
            if(Game.player.items.guitar is FenderGuitarState){
                try {
                    Game.player.buyNewGuitar()
                    updateUI()
                } catch(exception: NotEnoughMoneyException){
                    binding.layoutShopDoubleNeckGuitar.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
                }
            }
            else{
                Toast.makeText(activity, "buy previous", Toast.LENGTH_SHORT).show()
                binding.layoutShopDoubleNeckGuitar.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
            }
        }


        /**
         * Actions for computer buttons
         */
        binding.shopPreviouslyUsedComputer.setOnClickListener {
            try {
                Game.player.buyNewComputer()
                updateUI()
            } catch(exception: NotEnoughMoneyException){
                binding.layoutShopPreviouslyUsedComputer.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
            }
        }

        binding.shopOldComputer.setOnClickListener {
            if(Game.player.items.computer is PreviouslyUsedComputerState){
                try {
                    Game.player.buyNewComputer()
                    updateUI()
                } catch(exception: NotEnoughMoneyException){
                    binding.layoutShopOldComputer.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
                }
            }
            else{
                Toast.makeText(activity, "buy previous", Toast.LENGTH_SHORT).show()
                binding.layoutShopOldComputer.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
            }
        }

        binding.shopUsualComputer.setOnClickListener {
            if(Game.player.items.computer is OldComputerState){
                try {
                    Game.player.buyNewComputer()
                    updateUI()
                } catch(exception: NotEnoughMoneyException){
                    binding.layoutShopUsualComputer.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
                }
            }
            else{
                Toast.makeText(activity, "buy previous", Toast.LENGTH_SHORT).show()
                binding.layoutShopUsualComputer.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
            }
        }

        binding.shopXiaomiComputer.setOnClickListener {
            if(Game.player.items.computer is UsualComputerState){
                try {
                    Game.player.buyNewComputer()
                    updateUI()
                } catch(exception: NotEnoughMoneyException){
                    binding.layoutShopXiaomiComputer.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
                }
            }
            else{
                Toast.makeText(activity, "buy previous", Toast.LENGTH_SHORT).show()
                binding.layoutShopXiaomiComputer.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
            }
        }

        binding.shopMacbookComputer.setOnClickListener {
            if(Game.player.items.computer is XiaomiMiNotebookState){
                try {
                    Game.player.buyNewComputer()
                    updateUI()
                } catch(exception: NotEnoughMoneyException){
                    binding.layoutShopMacbookComputer.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
                }
            }
            else{
                Toast.makeText(activity, "buy previous", Toast.LENGTH_SHORT).show()
                binding.layoutShopMacbookComputer.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
            }
        }

    }

    override fun onResume() {
        super.onResume()
        updateUI()
    }

    fun updateUI(){
        /**
         * Buttons for Computer coursers
         */
        when(Game.player.current_courses.computer_course){
            is GameDevelopmentCourseState ->{
                isBought(binding.shopComputerCourseV1, binding.layoutShopComputerCourseV1, binding.imageViewComputerCourseV1Money, binding.textViewComputerCourseV1price)
                isBought(binding.shopComputerCourseV2, binding.layoutShopComputerCourseV2, binding.imageViewComputerCourseV2Money, binding.textViewComputerCourseV2price)
                isBought(binding.shopComputerCourseV3, binding.layoutShopComputerCourseV3, binding.imageViewComputerCourseV3Money, binding.textViewComputerCourseV3price)
                isBought(binding.shopComputerCourseV4, binding.layoutShopComputerCourseV4, binding.imageViewComputerCourseV4Money, binding.textViewComputerCourseV4price)
                isBought(binding.shopComputerCourseV5, binding.layoutShopComputerCourseV5, binding.imageViewComputerCourseV5Money, binding.textViewComputerCourseV5price)
            }
            is VideoEditingCourseState ->{
                isBought(binding.shopComputerCourseV1, binding.layoutShopComputerCourseV1, binding.imageViewComputerCourseV1Money, binding.textViewComputerCourseV1price)
                isBought(binding.shopComputerCourseV2, binding.layoutShopComputerCourseV2, binding.imageViewComputerCourseV2Money, binding.textViewComputerCourseV2price)
                isBought(binding.shopComputerCourseV3, binding.layoutShopComputerCourseV3, binding.imageViewComputerCourseV3Money, binding.textViewComputerCourseV3price)
                isBought(binding.shopComputerCourseV4, binding.layoutShopComputerCourseV4, binding.imageViewComputerCourseV4Money, binding.textViewComputerCourseV4price)
                canBuy(binding.shopComputerCourseV5, binding.layoutShopComputerCourseV5, binding.imageViewComputerCourseV5Money, binding.textViewComputerCourseV5price)
            }
            is WebDesignCourseState ->{
                isBought(binding.shopComputerCourseV1, binding.layoutShopComputerCourseV1, binding.imageViewComputerCourseV1Money, binding.textViewComputerCourseV1price)
                isBought(binding.shopComputerCourseV2, binding.layoutShopComputerCourseV2, binding.imageViewComputerCourseV2Money, binding.textViewComputerCourseV2price)
                isBought(binding.shopComputerCourseV3, binding.layoutShopComputerCourseV3, binding.imageViewComputerCourseV3Money, binding.textViewComputerCourseV3price)
                canBuy(binding.shopComputerCourseV4, binding.layoutShopComputerCourseV4, binding.imageViewComputerCourseV4Money, binding.textViewComputerCourseV4price)
            }
            is OnlineWorkCourseState ->{
                isBought(binding.shopComputerCourseV1, binding.layoutShopComputerCourseV1, binding.imageViewComputerCourseV1Money, binding.textViewComputerCourseV1price)
                isBought(binding.shopComputerCourseV2, binding.layoutShopComputerCourseV2, binding.imageViewComputerCourseV2Money, binding.textViewComputerCourseV2price)
                canBuy(binding.shopComputerCourseV3, binding.layoutShopComputerCourseV3, binding.imageViewComputerCourseV3Money, binding.textViewComputerCourseV3price)
            }
            is FriendsCourseState ->{
                isBought(binding.shopComputerCourseV1, binding.layoutShopComputerCourseV1, binding.imageViewComputerCourseV1Money, binding.textViewComputerCourseV1price)
                canBuy(binding.shopComputerCourseV2, binding.layoutShopComputerCourseV2, binding.imageViewComputerCourseV2Money, binding.textViewComputerCourseV2price)
            }
            is NullComputerCourseState ->{
                canBuy(binding.shopComputerCourseV1, binding.layoutShopComputerCourseV1, binding.imageViewComputerCourseV1Money, binding.textViewComputerCourseV1price)
            }
        }
        /**
         * Buttons for Computers
         */
        when(Game.player.items.computer){
            is MacbookState ->{
                isBought(binding.shopPreviouslyUsedComputer, binding.layoutShopPreviouslyUsedComputer, binding.imageViewPreviouslyUsedComputerMoney, binding.textViewPreviouslyUsedComputerPrice)
                isBought(binding.shopOldComputer, binding.layoutShopOldComputer, binding.imageViewOldComputerMoney, binding.textViewOldComputerPrice)
                isBought(binding.shopUsualComputer, binding.layoutShopUsualComputer, binding.imageViewUsualComputerMoney, binding.textViewUsualComputerPrice)
                isBought(binding.shopXiaomiComputer, binding.layoutShopXiaomiComputer, binding.imageViewXiaomiComputerMoney, binding.textViewXiaomiComputerPrice)
                isBought(binding.shopMacbookComputer, binding.layoutShopMacbookComputer, binding.imageViewMacbookComputerMoney, binding.textViewMacbookComputerPrice)
            }
            is XiaomiMiNotebookState ->{
                isBought(binding.shopPreviouslyUsedComputer, binding.layoutShopPreviouslyUsedComputer, binding.imageViewPreviouslyUsedComputerMoney, binding.textViewPreviouslyUsedComputerPrice)
                isBought(binding.shopOldComputer, binding.layoutShopOldComputer, binding.imageViewOldComputerMoney, binding.textViewOldComputerPrice)
                isBought(binding.shopUsualComputer, binding.layoutShopUsualComputer, binding.imageViewUsualComputerMoney, binding.textViewUsualComputerPrice)
                isBought(binding.shopXiaomiComputer, binding.layoutShopXiaomiComputer, binding.imageViewXiaomiComputerMoney, binding.textViewXiaomiComputerPrice)
                canBuy(binding.shopMacbookComputer, binding.layoutShopMacbookComputer, binding.imageViewMacbookComputerMoney, binding.textViewMacbookComputerPrice)
            }
            is UsualComputerState ->{
                isBought(binding.shopPreviouslyUsedComputer, binding.layoutShopPreviouslyUsedComputer, binding.imageViewPreviouslyUsedComputerMoney, binding.textViewPreviouslyUsedComputerPrice)
                isBought(binding.shopOldComputer, binding.layoutShopOldComputer, binding.imageViewOldComputerMoney, binding.textViewOldComputerPrice)
                isBought(binding.shopUsualComputer, binding.layoutShopUsualComputer, binding.imageViewUsualComputerMoney, binding.textViewUsualComputerPrice)
                canBuy(binding.shopXiaomiComputer, binding.layoutShopXiaomiComputer, binding.imageViewXiaomiComputerMoney, binding.textViewXiaomiComputerPrice)
            }
            is OldComputerState ->{
                isBought(binding.shopPreviouslyUsedComputer, binding.layoutShopPreviouslyUsedComputer, binding.imageViewPreviouslyUsedComputerMoney, binding.textViewPreviouslyUsedComputerPrice)
                isBought(binding.shopOldComputer, binding.layoutShopOldComputer, binding.imageViewOldComputerMoney, binding.textViewOldComputerPrice)
                canBuy(binding.shopUsualComputer, binding.layoutShopUsualComputer, binding.imageViewUsualComputerMoney, binding.textViewUsualComputerPrice)
            }
            is PreviouslyUsedComputerState ->{
                isBought(binding.shopPreviouslyUsedComputer, binding.layoutShopPreviouslyUsedComputer, binding.imageViewPreviouslyUsedComputerMoney, binding.textViewPreviouslyUsedComputerPrice)
                canBuy(binding.shopOldComputer, binding.layoutShopOldComputer, binding.imageViewOldComputerMoney, binding.textViewOldComputerPrice)
            }
            is NullComputerState ->{
                canBuy(binding.shopPreviouslyUsedComputer, binding.layoutShopPreviouslyUsedComputer, binding.imageViewPreviouslyUsedComputerMoney, binding.textViewPreviouslyUsedComputerPrice)
            }
        }
        /**
         * Buttons for Guitar courses
         */
        when(Game.player.current_courses.guitar_course){
            is MusicalObservatoryCourseState ->{
                isBought(binding.shopGuitarCourseV1, binding.layoutShopGuitarCourseV1, binding.imageViewGuitarCourseV1Money, binding.textViewGuitarCourseV1price)
                isBought(binding.shopGuitarCourseV2, binding.layoutShopGuitarCourseV2, binding.imageViewGuitarCourseV2Money, binding.textViewGuitarCourseV2price)
                isBought(binding.shopGuitarCourseV3, binding.layoutShopGuitarCourseV3, binding.imageViewGuitarCourseV3Money, binding.textViewGuitarCourseV3price)
                isBought(binding.shopGuitarCourseV4, binding.layoutShopGuitarCourseV4, binding.imageViewGuitarCourseV4Money, binding.textViewGuitarCourseV4price)
                isBought(binding.shopGuitarCourseV5, binding.layoutShopGuitarCourseV5, binding.imageViewGuitarCourseV5Money, binding.textViewGuitarCourseV5price)
            }
            is MusicalSchoolCourseState ->{
                isBought(binding.shopGuitarCourseV1, binding.layoutShopGuitarCourseV1, binding.imageViewGuitarCourseV1Money, binding.textViewGuitarCourseV1price)
                isBought(binding.shopGuitarCourseV2, binding.layoutShopGuitarCourseV2, binding.imageViewGuitarCourseV2Money, binding.textViewGuitarCourseV2price)
                isBought(binding.shopGuitarCourseV3, binding.layoutShopGuitarCourseV3, binding.imageViewGuitarCourseV3Money, binding.textViewGuitarCourseV3price)
                isBought(binding.shopGuitarCourseV4, binding.layoutShopGuitarCourseV4, binding.imageViewGuitarCourseV4Money, binding.textViewGuitarCourseV4price)
                canBuy(binding.shopGuitarCourseV5, binding.layoutShopGuitarCourseV5, binding.imageViewGuitarCourseV5Money, binding.textViewGuitarCourseV5price)
            }
            is YardSongCourseState ->{
                isBought(binding.shopGuitarCourseV1, binding.layoutShopGuitarCourseV1, binding.imageViewGuitarCourseV1Money, binding.textViewGuitarCourseV1price)
                isBought(binding.shopGuitarCourseV2, binding.layoutShopGuitarCourseV2, binding.imageViewGuitarCourseV2Money, binding.textViewGuitarCourseV2price)
                isBought(binding.shopGuitarCourseV3, binding.layoutShopGuitarCourseV3, binding.imageViewGuitarCourseV3Money, binding.textViewGuitarCourseV3price)
                canBuy(binding.shopGuitarCourseV4, binding.layoutShopGuitarCourseV4, binding.imageViewGuitarCourseV4Money, binding.textViewGuitarCourseV4price)
            }
            is FirstSongCourseState ->{
                isBought(binding.shopGuitarCourseV1, binding.layoutShopGuitarCourseV1, binding.imageViewGuitarCourseV1Money, binding.textViewGuitarCourseV1price)
                isBought(binding.shopGuitarCourseV2, binding.layoutShopGuitarCourseV2, binding.imageViewGuitarCourseV2Money, binding.textViewGuitarCourseV2price)
                canBuy(binding.shopGuitarCourseV3, binding.layoutShopGuitarCourseV3, binding.imageViewGuitarCourseV3Money, binding.textViewGuitarCourseV3price)
            }
            is YardGuitarCourseState ->{
                isBought(binding.shopGuitarCourseV1, binding.layoutShopGuitarCourseV1, binding.imageViewGuitarCourseV1Money, binding.textViewGuitarCourseV1price)
                 canBuy(binding.shopGuitarCourseV2, binding.layoutShopGuitarCourseV2, binding.imageViewGuitarCourseV2Money, binding.textViewGuitarCourseV2price)
            }
            is NullGuitarCourseState ->{
                canBuy(binding.shopGuitarCourseV1, binding.layoutShopGuitarCourseV1, binding.imageViewGuitarCourseV1Money, binding.textViewGuitarCourseV1price)
            }
        }
        /**
         * Buttons for Guitars
         */
        when(Game.player.items.guitar){
            is DoubleNeckGuitarState->{
                isBought(binding.shopUssrGuitar, binding.layoutShopUssrGuitar, binding.imageViewUssrGuitarMoney, binding.textViewUssrGuitarPrice)
                isBought(binding.shopUralGuitar, binding.layoutShopUralGuitar, binding.imageViewUralGuitarMoney, binding.textViewUralGuitarPrice)
                isBought(binding.shopYamahaGuitar, binding.layoutShopYamahaGuitar, binding.imageViewYamahaGuitarMoney, binding.textViewYamahaGuitarPrice)
                isBought(binding.shopFenderGuitar, binding.layoutShopFenderGuitar, binding.imageViewFenderGuitarMoney, binding.textViewFenderGuitarPrice)
                isBought(binding.shopDoubleNeckGuitar, binding.layoutShopDoubleNeckGuitar, binding.imageViewDoubleNeckGuitarMoney, binding.textViewDoubleNeckGuitarPrice)
            }
            is FenderGuitarState->{
                isBought(binding.shopUssrGuitar, binding.layoutShopUssrGuitar, binding.imageViewUssrGuitarMoney, binding.textViewUssrGuitarPrice)
                isBought(binding.shopUralGuitar, binding.layoutShopUralGuitar, binding.imageViewUralGuitarMoney, binding.textViewUralGuitarPrice)
                isBought(binding.shopYamahaGuitar, binding.layoutShopYamahaGuitar, binding.imageViewYamahaGuitarMoney, binding.textViewYamahaGuitarPrice)
                isBought(binding.shopFenderGuitar, binding.layoutShopFenderGuitar, binding.imageViewFenderGuitarMoney, binding.textViewFenderGuitarPrice)
                canBuy(binding.shopDoubleNeckGuitar, binding.layoutShopDoubleNeckGuitar, binding.imageViewDoubleNeckGuitarMoney, binding.textViewDoubleNeckGuitarPrice)
            }
            is YamahaGuitarState->{
                isBought(binding.shopUssrGuitar, binding.layoutShopUssrGuitar, binding.imageViewUssrGuitarMoney, binding.textViewUssrGuitarPrice)
                isBought(binding.shopUralGuitar, binding.layoutShopUralGuitar, binding.imageViewUralGuitarMoney, binding.textViewUralGuitarPrice)
                isBought(binding.shopYamahaGuitar, binding.layoutShopYamahaGuitar, binding.imageViewYamahaGuitarMoney, binding.textViewYamahaGuitarPrice)
                canBuy(binding.shopFenderGuitar, binding.layoutShopFenderGuitar, binding.imageViewFenderGuitarMoney, binding.textViewFenderGuitarPrice)
            }
            is UralGuitarState->{
                isBought(binding.shopUssrGuitar, binding.layoutShopUssrGuitar, binding.imageViewUssrGuitarMoney, binding.textViewUssrGuitarPrice)
                isBought(binding.shopUralGuitar, binding.layoutShopUralGuitar, binding.imageViewUralGuitarMoney, binding.textViewUralGuitarPrice)
                canBuy(binding.shopYamahaGuitar, binding.layoutShopYamahaGuitar, binding.imageViewYamahaGuitarMoney, binding.textViewYamahaGuitarPrice)
            }
            is UssrGuitarState->{
                isBought(binding.shopUssrGuitar, binding.layoutShopUssrGuitar, binding.imageViewUssrGuitarMoney, binding.textViewUssrGuitarPrice)
                canBuy(binding.shopUralGuitar, binding.layoutShopUralGuitar, binding.imageViewUralGuitarMoney, binding.textViewUralGuitarPrice)
            }
            is NullGuitarState->{
                canBuy(binding.shopUssrGuitar, binding.layoutShopUssrGuitar, binding.imageViewUssrGuitarMoney, binding.textViewUssrGuitarPrice)
            }

        }
        /**
         * Buttons for Bicycles
         */
        when(Game.player.items.bicycle){
            is MountainBicycleState ->{
                isBought(binding.shopUssrBicycle, binding.layoutShopUssrBicycle, binding.imageViewUssrBicycleMoney, binding.textViewUssrBicyclePrice)
                isBought(binding.shopUsualBicycle,binding.layoutShopUsualBicycle, binding.imageViewUsualBicycleMoney, binding.textViewUsualBicyclePrice)
                isBought(binding.shopMountainBicycle, binding.layoutShopMountainBicycle, binding.imageViewMountainBicycleMoney, binding.textViewMountainBicyclePrice)
            }
            is UsualBicycleState->{
                isBought(binding.shopUssrBicycle, binding.layoutShopUssrBicycle, binding.imageViewUssrBicycleMoney, binding.textViewUssrBicyclePrice)
                isBought(binding.shopUsualBicycle,binding.layoutShopUsualBicycle, binding.imageViewUsualBicycleMoney, binding.textViewUsualBicyclePrice)
                canBuy(binding.shopMountainBicycle, binding.layoutShopMountainBicycle, binding.imageViewMountainBicycleMoney, binding.textViewMountainBicyclePrice)
            }
            is UssrBicycleState->{
                isBought(binding.shopUssrBicycle, binding.layoutShopUssrBicycle, binding.imageViewUssrBicycleMoney, binding.textViewUssrBicyclePrice)
                canBuy(binding.shopUsualBicycle,binding.layoutShopUsualBicycle, binding.imageViewUsualBicycleMoney, binding.textViewUsualBicyclePrice)
            }
            else->{
                canBuy(binding.shopUssrBicycle, binding.layoutShopUssrBicycle, binding.imageViewUssrBicycleMoney, binding.textViewUssrBicyclePrice)
            }
        }
        (activity as GameActivity).updateStats()
    }
    fun isBought(button: Button, layout: ConstraintLayout, image_view: ImageView, text_view: TextView){
        layout.setBackgroundColor(GREEN)
        button.isClickable = false
        image_view.setImageResource(R.drawable.ic_money)
        text_view.visibility = VISIBLE

    }
    fun canBuy(button: Button, layout: ConstraintLayout, image_view: ImageView, text_view: TextView){
        layout.setBackgroundColor(selectableItemBackground)
        image_view.setImageResource(R.drawable.ic_money)
        text_view.visibility = VISIBLE
    }
/*    fun isLocked(button: Button){
        button.setBackgroundColor(RED)
    }*/
}
