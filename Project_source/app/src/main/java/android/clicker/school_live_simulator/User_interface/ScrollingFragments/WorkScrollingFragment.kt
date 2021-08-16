package android.clicker.school_live_simulator.User_interface.ScrollingFragments

import android.clicker.school_live_simulator.*
import android.clicker.school_live_simulator.Classes.Enum_classes.OtherWork
import android.clicker.school_live_simulator.Classes.IsNotAvailableException
import android.clicker.school_live_simulator.Classes.NotEnoughMoneyException
import android.clicker.school_live_simulator.User_interface.GameActivity
import android.clicker.school_live_simulator.databinding.FragmentWorkScrollingBinding
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.fragment.app.Fragment

class WorkScrollingFragment : Fragment() {
    lateinit var binding: FragmentWorkScrollingBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentWorkScrollingBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        binding.workCollectChange.setOnClickListener{
            Game.player.work(OtherWork.COLLECT_CHANGE)
            (activity as GameActivity).updateStats()
        }

        binding.workWatchAds.setOnClickListener{
            Game.player.work(OtherWork.WATCH_ADS)
            (activity as GameActivity).updateStats()
        }

        binding.workDistributeFlyers.setOnClickListener{
            Game.player.work(OtherWork.DISTRIBUTE_FLYERS)
            (activity as GameActivity).updateStats()
        }

        binding.workAsAGreener.setOnClickListener{
            Game.player.work(OtherWork.AS_A_GREENER)
            (activity as GameActivity).updateStats()
        }

        binding.workAsACourier.setOnClickListener{
            try {
                Game.player.deliver()
            } catch(exception: IsNotAvailableException) {
                binding.workAsACourier.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
            }
            (activity as GameActivity).updateStats()
        }

        binding.workAsAnOperator.setOnClickListener{
            Game.player.work(OtherWork.AS_AN_OPERATOR)
            (activity as GameActivity).updateStats()
        }

        binding.workPlayGuitar.setOnClickListener{
            try {
                Game.player.playSong()
            } catch(exception: IsNotAvailableException) {
                binding.workAsACourier.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
            }
            (activity as GameActivity).updateStats()
        }

        binding.workOnTheNet.setOnClickListener{
            try {
                Game.player.realiseWebTask()
            } catch(exception: IsNotAvailableException) {
                binding.workAsACourier.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
            }
            (activity as GameActivity).updateStats()
        }
    }

    override fun onResume() {
        super.onResume()
        when(Game.player.items.bicycle){
            is MountainBicycleState ->
                binding.workAsACourier.text = getString(R.string.work_as_a_courier_v3)
            is UsualBicycleState->
                binding.workAsACourier.text = getString(R.string.work_as_a_courier_v2)
            is UssrBicycleState->
                binding.workAsACourier.text = getString(R.string.work_as_a_courier_v1)
            else->
                binding.workAsACourier.text = getString(R.string.work_as_a_courier_v0)
        }

        when(Game.player.current_courses.guitar_course){
            is MusicalObservatoryCourseState ->
               binding.workPlayGuitar.text = getString(R.string.work_play_guitar_v5)
            is MusicalSchoolCourseState ->
                binding.workPlayGuitar.text = getString(R.string.work_play_guitar_v4)
            is YardSongCourseState ->
                binding.workPlayGuitar.text = getString(R.string.work_play_guitar_v3)
            is FirstSongCourseState ->
                binding.workPlayGuitar.text = getString(R.string.work_play_guitar_v2)
            is YardGuitarCourseState ->
                binding.workPlayGuitar.text = getString(R.string.work_play_guitar_v1)
            else ->
                binding.workPlayGuitar.text = getString(R.string.work_play_guitar_v0)
        }
        when(Game.player.current_courses.computer_course){
            is GameDevelopmentCourseState ->
                binding.workOnTheNet.text = getString(R.string.work_on_the_net_v5)
            is VideoEditingCourseState ->
                binding.workOnTheNet.text = getString(R.string.work_on_the_net_v4)
            is WebDesignCourseState ->
                binding.workOnTheNet.text = getString(R.string.work_on_the_net_v3)
            is OnlineWorkCourseState ->
                binding.workOnTheNet.text = getString(R.string.work_on_the_net_v2)
            is FriendsCourseState ->
                binding.workOnTheNet.text = getString(R.string.work_on_the_net_v1)
            else ->
                binding.workOnTheNet.text = getString(R.string.work_on_the_net_v0)
        }
    }
}
