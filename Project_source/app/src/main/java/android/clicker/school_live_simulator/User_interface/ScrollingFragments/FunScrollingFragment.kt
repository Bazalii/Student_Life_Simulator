package android.clicker.school_live_simulator.User_interface.ScrollingFragments

import android.clicker.school_live_simulator.databinding.FragmentFunScrollingBinding
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class FunScrollingFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentFunScrollingBinding.inflate(inflater)
        return binding.root
    }
}
