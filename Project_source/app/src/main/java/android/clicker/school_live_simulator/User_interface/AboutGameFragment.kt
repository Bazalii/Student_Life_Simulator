package android.clicker.school_live_simulator.User_interface

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.clicker.school_live_simulator.R
import android.clicker.school_live_simulator.databinding.FragmentAboutGameBinding
import android.clicker.school_live_simulator.databinding.FragmentFoodScrollingBinding


class AboutGameFragment : Fragment() {
    lateinit var binding: FragmentAboutGameBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentAboutGameBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }
}
