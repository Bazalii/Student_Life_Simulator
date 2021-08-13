package android.clicker.school_live_simulator.User_interface.ScrollingFragments

import android.clicker.school_live_simulator.Food
import android.clicker.school_live_simulator.Game
import android.clicker.school_live_simulator.User_interface.GameActivity
import android.clicker.school_live_simulator.databinding.FragmentSchoolScrollingBinding
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class SchoolScrollingFragment : Fragment() {
    lateinit var binding: FragmentSchoolScrollingBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSchoolScrollingBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.schoolGoToSchool.setOnClickListener{
            //Some logic to write
            (activity as GameActivity).updateStats()
        }

        binding.schoolBotat.setOnClickListener{
            //Some logic to write
            (activity as GameActivity).updateStats()
        }

        binding.schoolBuyCheatbook.setOnClickListener{
            //Some logic to write
            (activity as GameActivity).updateStats()
        }

        binding.schoolHireATutor.setOnClickListener{
            //Some logic to write
            (activity as GameActivity).updateStats()
        }

        binding.schoolSignUpInAnOnlineSchool.setOnClickListener{
            //Some logic to write
            (activity as GameActivity).updateStats()
        }

        binding.schoolStudyWithUniTeacher.setOnClickListener{
            //Some logic to write
            (activity as GameActivity).updateStats()
        }

    }
}
