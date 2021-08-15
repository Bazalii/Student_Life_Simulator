package android.clicker.school_live_simulator.User_interface.ScrollingFragments

import android.clicker.school_live_simulator.*
import android.clicker.school_live_simulator.User_interface.GameActivity
import android.clicker.school_live_simulator.databinding.FragmentWorkScrollingBinding
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
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
            //Some logic to write
            (activity as GameActivity).updateStats()
        }

        binding.workWatchAds.setOnClickListener{
            //Some logic to write
            (activity as GameActivity).updateStats()
        }

        binding.workDistributeFlyers.setOnClickListener{
            //Some logic to write
            (activity as GameActivity).updateStats()
        }

        binding.workAsAGreener.setOnClickListener{
            //Some logic to write
            (activity as GameActivity).updateStats()
        }

        binding.workAsACourier.setOnClickListener{
            //Some logic to write
            (activity as GameActivity).updateStats()
        }

        binding.workAsAnOperator.setOnClickListener{
            //Some logic to write
            (activity as GameActivity).updateStats()
        }

        binding.workPlayGuitarV1.setOnClickListener{
            //Some logic to write
            (activity as GameActivity).updateStats()
        }

        binding.workOnTheNetV1.setOnClickListener{
            //Some logic to write
            (activity as GameActivity).updateStats()
        }
    }

    override fun onResume() {
        super.onResume()
        when(Game.player.items.bicycle){
            is MountainBicycleState ->{
                binding.workAsACourier.text =
            }
            is UsualBicycleState->{
                binding.workAsACourier.text =
            }
            is UssrBicycleState->{
                binding.workAsACourier.text =
            }
            else->{
                binding.workAsACourier.text =
            }
        }

        when(Game.player.current_courses.guitar_course){
            is MusicalObservatoryCourseState ->{
               binding.workPlayGuitarV1.text =
            }
            is MusicalSchoolCourseState ->{
                binding.workPlayGuitarV1.text =
            }
            is YardSongCourseState ->{
                binding.workPlayGuitarV1.text =
            }
            is FirstSongCourseState ->{
                binding.workPlayGuitarV1.text =
            }
            is YardGuitarCourseState ->{
                binding.workPlayGuitarV1.text =
            }
            else ->{
                binding.workPlayGuitarV1.text =
            }
        }
        when(Game.player.current_courses.computer_course){
            is GameDevelopmentCourseState ->{
                binding.workOnTheNetV1.text =
            }
            is VideoEditingCourseState ->{
                binding.workOnTheNetV1.text =
            }
            is WebDesignCourseState ->{
                binding.workOnTheNetV1.text =
            }
            is OnlineWorkCourseState ->{
                binding.workOnTheNetV1.text =
            }
            is FriendsCourseState ->{
                binding.workOnTheNetV1.text =
            }
            else ->{
                binding.workOnTheNetV1.text = //maybe text like pass the course previously
            }
        }


    }
}
