package android.clicker.school_live_simulator.User_interface

import android.clicker.school_live_simulator.databinding.FragmentSchoolScrollingBinding
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class SchoolScrollingFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentSchoolScrollingBinding.inflate(inflater)
        return binding.root
    }
}
