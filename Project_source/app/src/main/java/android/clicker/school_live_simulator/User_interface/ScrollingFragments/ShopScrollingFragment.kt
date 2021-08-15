package android.clicker.school_live_simulator.User_interface.ScrollingFragments

import android.clicker.school_live_simulator.*
import android.clicker.school_live_simulator.Classes.IsNotAvailableException
import android.clicker.school_live_simulator.Classes.NotEnoughMoneyException
import android.clicker.school_live_simulator.User_interface.GameActivity
import android.clicker.school_live_simulator.databinding.FragmentShopScrollingBinding
import android.graphics.Color.*
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.View.GONE
import android.view.View.VISIBLE
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.Toast
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
         * Actions for guitar courses buttons
         */
        binding.shopGuitarCourseV1.setOnClickListener {
            try {
                Game.player.buyNextGuitarCourse(YardGuitarCourseState::class)
                updateUI()
            } catch(exception: NotEnoughMoneyException){
                binding.shopGuitarCourseV1.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
            } catch(exception: IsNotAvailableException){
                Toast.makeText(activity, "USSR guitar or better is required", Toast.LENGTH_SHORT).show()
                binding.shopComputerCourseV1.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
            }
        }

        binding.shopGuitarCourseV2.setOnClickListener {
            if(Game.player.current_courses.guitar_course is YardGuitarCourseState){
                try {
                    Game.player.buyNextGuitarCourse(FirstSongCourseState::class)
                    updateUI()
                } catch(exception: NotEnoughMoneyException){
                    binding.shopGuitarCourseV2.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
                } catch(exception: IsNotAvailableException){
                    Toast.makeText(activity, "Ural guitar or better is required", Toast.LENGTH_SHORT).show()
                    binding.shopComputerCourseV1.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
                }
            }
            else{
                Toast.makeText(activity, "buy previous", Toast.LENGTH_SHORT).show()
                binding.shopGuitarCourseV2.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
            }
        }

        binding.shopGuitarCourseV3.setOnClickListener {
            if(Game.player.current_courses.guitar_course is FirstSongCourseState){
                try {
                    Game.player.buyNextGuitarCourse(YardSongCourseState::class)
                    updateUI()
                } catch(exception: NotEnoughMoneyException){
                    binding.shopGuitarCourseV3.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
                } catch(exception: IsNotAvailableException){
                    Toast.makeText(activity, "Yamaha guitar or better is required", Toast.LENGTH_SHORT).show()
                    binding.shopComputerCourseV1.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
                }
            }
            else{
                Toast.makeText(activity, "buy previous", Toast.LENGTH_SHORT).show()
                binding.shopGuitarCourseV3.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
            }
        }

        binding.shopGuitarCourseV4.setOnClickListener {
            if(Game.player.current_courses.guitar_course is YardSongCourseState){
                try {
                    Game.player.buyNextGuitarCourse(MusicalSchoolCourseState::class)
                    updateUI()
                } catch(exception: NotEnoughMoneyException){
                    binding.shopGuitarCourseV4.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
                } catch(exception: IsNotAvailableException){
                    Toast.makeText(activity, "Fender guitar or better is required", Toast.LENGTH_SHORT).show()
                    binding.shopComputerCourseV1.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
                }
            }
            else{
                Toast.makeText(activity, "buy previous", Toast.LENGTH_SHORT).show()
                binding.shopGuitarCourseV4.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
            }
        }

        binding.shopGuitarCourseV5.setOnClickListener {
            if(Game.player.current_courses.guitar_course is MusicalSchoolCourseState){
                try {
                    Game.player.buyNextGuitarCourse(MusicalObservatoryCourseState::class)
                    updateUI()
                } catch(exception: NotEnoughMoneyException){
                    binding.shopGuitarCourseV5.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
                } catch(exception: IsNotAvailableException){
                    Toast.makeText(activity, "Double neck guitar is required", Toast.LENGTH_SHORT).show()
                    binding.shopComputerCourseV1.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
                }
            }
            else{
                Toast.makeText(activity, "buy previous", Toast.LENGTH_SHORT).show()
                binding.shopGuitarCourseV5.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
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
                binding.shopComputerCourseV1.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
            } catch(exception: IsNotAvailableException){
                Toast.makeText(activity, "buy new computer", Toast.LENGTH_SHORT).show()
                binding.shopComputerCourseV1.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
            }
        }

        binding.shopComputerCourseV2.setOnClickListener {
            if(Game.player.current_courses.computer_course is FriendsCourseState){
                try {
                    Game.player.buyNextComputerCourse(OnlineWorkCourseState::class)
                    updateUI()
                } catch(exception: NotEnoughMoneyException){
                    binding.shopComputerCourseV2.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
                } catch(exception: IsNotAvailableException){
                    Toast.makeText(activity, "buy new computer", Toast.LENGTH_SHORT).show()
                    binding.shopComputerCourseV2.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
                }
            }
            else{
                Toast.makeText(activity, "buy previous", Toast.LENGTH_SHORT).show()
                binding.shopComputerCourseV2.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
            }
        }

        binding.shopComputerCourseV3.setOnClickListener {
            if(Game.player.current_courses.computer_course is OnlineWorkCourseState){
                try {
                    Game.player.buyNextComputerCourse(WebDesignCourseState::class)
                    updateUI()
                } catch(exception: NotEnoughMoneyException){
                    binding.shopComputerCourseV3.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
                } catch(exception: IsNotAvailableException){
                    Toast.makeText(activity, "buy new computer", Toast.LENGTH_SHORT).show()
                    binding.shopComputerCourseV3.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
                }
            }
            else{
                Toast.makeText(activity, "buy previous", Toast.LENGTH_SHORT).show()
                binding.shopComputerCourseV3.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
            }
        }

        binding.shopComputerCourseV4.setOnClickListener {
            if(Game.player.current_courses.computer_course is WebDesignCourseState){
                try {
                    Game.player.buyNextComputerCourse(VideoEditingCourseState::class)
                    updateUI()
                } catch(exception: NotEnoughMoneyException){
                    binding.shopComputerCourseV4.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
                } catch(exception: IsNotAvailableException){
                    Toast.makeText(activity, "buy new computer", Toast.LENGTH_SHORT).show()
                    binding.shopComputerCourseV4.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
                }
            }
            else{
                Toast.makeText(activity, "buy previous", Toast.LENGTH_SHORT).show()
                binding.shopComputerCourseV4.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
            }
        }

        binding.shopComputerCourseV5.setOnClickListener {
            if(Game.player.current_courses.computer_course is VideoEditingCourseState){
                try {
                    Game.player.buyNextComputerCourse(GameDevelopmentCourseState::class)
                    updateUI()
                } catch(exception: NotEnoughMoneyException){
                    binding.shopComputerCourseV5.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
                } catch(exception: IsNotAvailableException){
                    Toast.makeText(activity, "buy new computer", Toast.LENGTH_SHORT).show()
                    binding.shopComputerCourseV5.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
                }
            }
            else{
                Toast.makeText(activity, "buy previous", Toast.LENGTH_SHORT).show()
                binding.shopComputerCourseV5.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
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
                    binding.shopUssrBicycle.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
                }
        }

        binding.shopUsualBicycle.setOnClickListener {
            if(Game.player.items.bicycle is UssrBicycleState){
                try {
                    Game.player.buyNewBicycle()
                    updateUI()
                } catch(exception: NotEnoughMoneyException){
                    binding.shopUsualBicycle.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
                }
            }
            else{
                Toast.makeText(activity, "buy previous", Toast.LENGTH_SHORT).show()
                binding.shopUsualBicycle.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
            }
        }

        binding.shopMountainBicycle.setOnClickListener {
            if(Game.player.items.bicycle is UsualBicycleState){
                try {
                    Game.player.buyNewBicycle()
                    updateUI()
                } catch(exception: NotEnoughMoneyException){
                    binding.shopMountainBicycle.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
                }
            }
            else{
                Toast.makeText(activity, "buy previous", Toast.LENGTH_SHORT).show()
                binding.shopMountainBicycle.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
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
                    binding.shopUralGuitar.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
                }
            }
            else{
                Toast.makeText(activity, "buy previous", Toast.LENGTH_SHORT).show()
                binding.shopUralGuitar.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
            }
        }

        binding.shopUralGuitar.setOnClickListener {
            if(Game.player.items.guitar is UssrGuitarState){
                try {
                    Game.player.buyNewGuitar()
                    updateUI()
                } catch(exception: NotEnoughMoneyException){
                    binding.shopUralGuitar.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
                }
            }
            else{
                Toast.makeText(activity, "buy previous", Toast.LENGTH_SHORT).show()
                binding.shopUralGuitar.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
            }
        }

        binding.shopYamahaGuitar.setOnClickListener {
            if(Game.player.items.guitar is UralGuitarState){
                try {
                    Game.player.buyNewGuitar()
                    updateUI()
                } catch(exception: NotEnoughMoneyException){
                    binding.shopYamahaGuitar.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
                }
            }
            else{
                Toast.makeText(activity, "buy previous", Toast.LENGTH_SHORT).show()
                binding.shopYamahaGuitar.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
            }
        }

        binding.shopFenderGuitar.setOnClickListener {
            if(Game.player.items.guitar is YamahaGuitarState){
                try {
                    Game.player.buyNewGuitar()
                    updateUI()
                } catch(exception: NotEnoughMoneyException){
                    binding.shopFenderGuitar.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
                }
            }
            else{
                Toast.makeText(activity, "buy previous", Toast.LENGTH_SHORT).show()
                binding.shopFenderGuitar.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
            }
        }

        binding.shopDoubleNeckGuitar.setOnClickListener {
            if(Game.player.items.guitar is FenderGuitarState){
                try {
                    Game.player.buyNewGuitar()
                    updateUI()
                } catch(exception: NotEnoughMoneyException){
                    binding.shopDoubleNeckGuitar.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
                }
            }
            else{
                Toast.makeText(activity, "buy previous", Toast.LENGTH_SHORT).show()
                binding.shopDoubleNeckGuitar.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
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
                binding.shopUssrGuitar.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
            }
        }

        binding.shopOldComputer.setOnClickListener {
            if(Game.player.items.computer is PreviouslyUsedComputerState){
                try {
                    Game.player.buyNewComputer()
                    updateUI()
                } catch(exception: NotEnoughMoneyException){
                    binding.shopOldComputer.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
                }
            }
            else{
                Toast.makeText(activity, "buy previous", Toast.LENGTH_SHORT).show()
                binding.shopOldComputer.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
            }
        }

        binding.shopUsualComputer.setOnClickListener {
            if(Game.player.items.computer is OldComputerState){
                try {
                    Game.player.buyNewComputer()
                    updateUI()
                } catch(exception: NotEnoughMoneyException){
                    binding.shopUsualComputer.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
                }
            }
            else{
                Toast.makeText(activity, "buy previous", Toast.LENGTH_SHORT).show()
                binding.shopUsualComputer.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
            }
        }

        binding.shopXiaomiComputer.setOnClickListener {
            if(Game.player.items.computer is UsualComputerState){
                try {
                    Game.player.buyNewComputer()
                    updateUI()
                } catch(exception: NotEnoughMoneyException){
                    binding.shopXiaomiComputer.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
                }
            }
            else{
                Toast.makeText(activity, "buy previous", Toast.LENGTH_SHORT).show()
                binding.shopXiaomiComputer.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
            }
        }

        binding.shopMacbookComputer.setOnClickListener {
            if(Game.player.items.computer is XiaomiMiNotebookState){
                try {
                    Game.player.buyNewComputer()
                    updateUI()
                } catch(exception: NotEnoughMoneyException){
                    binding.shopMacbookComputer.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
                }
            }
            else{
                Toast.makeText(activity, "buy previous", Toast.LENGTH_SHORT).show()
                binding.shopMacbookComputer.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
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
                isBought(binding.shopComputerCourseV1)
                isBought(binding.shopComputerCourseV2)
                isBought(binding.shopComputerCourseV3)
                isBought(binding.shopComputerCourseV4)
                isBought(binding.shopComputerCourseV5)
            }
            is VideoEditingCourseState ->{
                isBought(binding.shopComputerCourseV1)
                isBought(binding.shopComputerCourseV2)
                isBought(binding.shopComputerCourseV3)
                isBought(binding.shopComputerCourseV4)
                canBuy(binding.shopComputerCourseV5)
            }
            is WebDesignCourseState ->{
                isBought(binding.shopComputerCourseV1)
                isBought(binding.shopComputerCourseV2)
                isBought(binding.shopComputerCourseV3)
                canBuy(binding.shopComputerCourseV4)
            }
            is OnlineWorkCourseState ->{
                isBought(binding.shopComputerCourseV1)
                isBought(binding.shopComputerCourseV2)
                canBuy(binding.shopComputerCourseV3)
            }
            is FriendsCourseState ->{
                isBought(binding.shopComputerCourseV1)
                canBuy(binding.shopComputerCourseV2)
            }
            is NullComputerCourseState ->{
                canBuy(binding.shopComputerCourseV1)
            }
        }
        /**
         * Buttons for Computers
         */
        when(Game.player.items.computer){
            is MacbookState ->{
                isBought(binding.shopPreviouslyUsedComputer)
                isBought(binding.shopOldComputer)
                isBought(binding.shopUsualComputer)
                isBought(binding.shopXiaomiComputer)
                isBought(binding.shopMacbookComputer)
            }
            is XiaomiMiNotebookState ->{
                isBought(binding.shopPreviouslyUsedComputer)
                isBought(binding.shopOldComputer)
                isBought(binding.shopUsualComputer)
                isBought(binding.shopXiaomiComputer)
                canBuy(binding.shopMacbookComputer)
            }
            is UsualComputerState ->{
                isBought(binding.shopPreviouslyUsedComputer)
                isBought(binding.shopOldComputer)
                isBought(binding.shopUsualComputer)
                canBuy(binding.shopXiaomiComputer)
            }
            is OldComputerState ->{
                isBought(binding.shopPreviouslyUsedComputer)
                isBought(binding.shopOldComputer)
                canBuy(binding.shopUsualComputer)
            }
            is PreviouslyUsedComputerState ->{
                isBought(binding.shopPreviouslyUsedComputer)
                canBuy(binding.shopOldComputer)
            }
            is NullComputerState ->{
                canBuy(binding.shopPreviouslyUsedComputer)
            }
        }
        /**
         * Buttons for Guitar courses
         */
        when(Game.player.current_courses.guitar_course){
            is MusicalObservatoryCourseState ->{
                isBought(binding.shopGuitarCourseV1)
                isBought(binding.shopGuitarCourseV2)
                isBought(binding.shopGuitarCourseV3)
                isBought(binding.shopGuitarCourseV4)
                isBought(binding.shopGuitarCourseV5)
            }
            is MusicalSchoolCourseState ->{
                isBought(binding.shopGuitarCourseV1)
                isBought(binding.shopGuitarCourseV2)
                isBought(binding.shopGuitarCourseV3)
                isBought(binding.shopGuitarCourseV4)
                canBuy(binding.shopGuitarCourseV5)
            }
            is YardSongCourseState ->{
                isBought(binding.shopGuitarCourseV1)
                isBought(binding.shopGuitarCourseV2)
                isBought(binding.shopGuitarCourseV3)
                canBuy(binding.shopGuitarCourseV4)
            }
            is FirstSongCourseState ->{
                isBought(binding.shopGuitarCourseV1)
                isBought(binding.shopGuitarCourseV2)
                canBuy(binding.shopGuitarCourseV3)
            }
            is YardGuitarCourseState ->{
                isBought(binding.shopGuitarCourseV1)
                 canBuy(binding.shopGuitarCourseV2)
            }
            is NullGuitarCourseState ->{
                canBuy(binding.shopGuitarCourseV1)
            }
        }
        /**
         * Buttons for Guitars
         */
        when(Game.player.items.guitar){
            is DoubleNeckGuitarState->{
                isBought(binding.shopUssrGuitar)
                isBought(binding.shopUralGuitar)
                isBought(binding.shopYamahaGuitar)
                isBought(binding.shopFenderGuitar)
                isBought(binding.shopDoubleNeckGuitar)
            }
            is FenderGuitarState->{
                isBought(binding.shopUssrGuitar)
                isBought(binding.shopUralGuitar)
                isBought(binding.shopYamahaGuitar)
                isBought(binding.shopFenderGuitar)
                canBuy(binding.shopDoubleNeckGuitar)
            }
            is YamahaGuitarState->{
                isBought(binding.shopUssrGuitar)
                isBought(binding.shopUralGuitar)
                isBought(binding.shopYamahaGuitar)
                canBuy(binding.shopFenderGuitar)
            }
            is UralGuitarState->{
                isBought(binding.shopUssrGuitar)
                isBought(binding.shopUralGuitar)
                canBuy(binding.shopYamahaGuitar)
            }
            is UssrGuitarState->{
                isBought(binding.shopUssrGuitar)
                canBuy(binding.shopUralGuitar)
            }
            is NullGuitarState->{
                canBuy(binding.shopUssrGuitar)
            }

        }
        /**
         * Buttons for Bicycles
         */
        when(Game.player.items.bicycle){
            is MountainBicycleState ->{
                isBought(binding.shopUssrBicycle)
                isBought(binding.shopUsualBicycle)
                isBought(binding.shopMountainBicycle)
            }
            is UsualBicycleState->{
                isBought(binding.shopUssrBicycle)
                isBought(binding.shopUsualBicycle)
                canBuy(binding.shopMountainBicycle)
            }
            is UssrBicycleState->{
                isBought(binding.shopUssrBicycle)
                canBuy(binding.shopUsualBicycle)
            }
            else->{
                canBuy(binding.shopUssrBicycle)
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
