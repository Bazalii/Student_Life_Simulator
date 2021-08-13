package android.clicker.school_live_simulator.User_interface.ScrollingFragments

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
}
