package android.clicker.school_live_simulator.User_interface.ScrollingFragments

import android.clicker.school_live_simulator.User_interface.GameActivity
import android.clicker.school_live_simulator.databinding.FragmentShopScrollingBinding
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.View.GONE
import android.view.View.VISIBLE
import android.view.ViewGroup
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
            }
        }

    }
}
