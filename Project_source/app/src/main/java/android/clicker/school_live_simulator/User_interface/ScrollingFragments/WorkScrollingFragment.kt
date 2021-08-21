package android.clicker.school_live_simulator.User_interface.ScrollingFragments

import android.clicker.school_live_simulator.*
import android.clicker.school_live_simulator.Classes.Enum_classes.OtherWork
import android.clicker.school_live_simulator.Classes.IsNotAvailableException
import android.clicker.school_live_simulator.User_interface.GameActivity
import android.clicker.school_live_simulator.databinding.FragmentWorkScrollingBinding
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.Toast
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
                binding.layoutWorkAsACourier.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
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
                Toast.makeText(activity, "Course is not passed yet", Toast.LENGTH_SHORT).show()
                binding.layoutWorkPlayGuitar.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
            }
            (activity as GameActivity).updateStats()
        }

        binding.workOnTheNet.setOnClickListener{
            try {
                Game.player.realiseWebTask()
            } catch(exception: IsNotAvailableException) {
                Toast.makeText(activity, "Course is not passed yet", Toast.LENGTH_SHORT).show()
                binding.layoutWorkOnTheNet.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
            }
            (activity as GameActivity).updateStats()
        }
    }

    override fun onResume() {
        super.onResume()
        when(Game.player.items.bicycle){
            is MountainBicycleState ->
                binding.textViewWorkAsACourier.text = getString(R.string.work_as_a_courier_v3)
            is UsualBicycleState->
                binding.textViewWorkAsACourier.text = getString(R.string.work_as_a_courier_v2)
            is UssrBicycleState->
                binding.textViewWorkAsACourier.text = getString(R.string.work_as_a_courier_v1)
            else->
                binding.textViewWorkAsACourier.text = getString(R.string.work_as_a_courier_v0)
        }

        when(Game.player.current_courses.guitar_course){
            is MusicalObservatoryCourseState ->
               binding.textViewWorkPlayGuitar.text = getString(R.string.work_play_guitar_v5)
            is MusicalSchoolCourseState ->
                binding.textViewWorkPlayGuitar.text = getString(R.string.work_play_guitar_v4)
            is YardSongCourseState ->
                binding.textViewWorkPlayGuitar.text = getString(R.string.work_play_guitar_v3)
            is FirstSongCourseState ->
                binding.textViewWorkPlayGuitar.text = getString(R.string.work_play_guitar_v2)
            is YardGuitarCourseState ->
                binding.textViewWorkPlayGuitar.text = getString(R.string.work_play_guitar_v1)
            else ->
                binding.textViewWorkPlayGuitar.text = getString(R.string.work_play_guitar_v0)
        }
        when(Game.player.current_courses.computer_course){
            is GameDevelopmentCourseState ->
                binding.textViewWorkOnTheNet.text = getString(R.string.work_on_the_net_v5)
            is VideoEditingCourseState ->
                binding.textViewWorkOnTheNet.text = getString(R.string.work_on_the_net_v4)
            is WebDesignCourseState ->
                binding.textViewWorkOnTheNet.text = getString(R.string.work_on_the_net_v3)
            is OnlineWorkCourseState ->
                binding.textViewWorkOnTheNet.text = getString(R.string.work_on_the_net_v2)
            is FriendsCourseState ->
                binding.textViewWorkOnTheNet.text = getString(R.string.work_on_the_net_v1)
            else ->
                binding.textViewWorkOnTheNet.text = getString(R.string.work_on_the_net_v0)
        }
    }
}
