package android.clicker.school_live_simulator.User_interface.ScrollingFragments

import android.clicker.school_live_simulator.User_interface.GameActivity
import android.clicker.school_live_simulator.databinding.FragmentFunScrollingBinding
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class FunScrollingFragment : Fragment() {
    lateinit var binding: FragmentFunScrollingBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFunScrollingBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.funDrawOnDesks.setOnClickListener{
            //Some logic to write
            (activity as GameActivity).updateStats()
        }

        binding.funDrawGraffities.setOnClickListener{
            //Some logic to write
            (activity as GameActivity).updateStats()
        }

        binding.funMakeSomethingHandmade.setOnClickListener{
            //Some logic to write
            (activity as GameActivity).updateStats()
        }

        binding.funCoverASong.setOnClickListener{
            //Some logic to write
            (activity as GameActivity).updateStats()
        }

        binding.funWriteASong.setOnClickListener{
            //Some logic to write
            (activity as GameActivity).updateStats()
        }

        binding.funStream.setOnClickListener{
            //Some logic to write
            (activity as GameActivity).updateStats()
        }

        binding.funMakeAYoutubeVideo.setOnClickListener{
            //Some logic to write
            (activity as GameActivity).updateStats()
        }

        binding.funDoNothing.setOnClickListener{
            //Some logic to write
            (activity as GameActivity).updateStats()
        }

        binding.funGoCycling.setOnClickListener{
            //Some logic to write
            (activity as GameActivity).updateStats()
        }

        binding.funListenToTheMusic.setOnClickListener{
            //Some logic to write
            (activity as GameActivity).updateStats()
        }

        binding.funDonateAndPlayComputer.setOnClickListener{
            //Some logic to write
            (activity as GameActivity).updateStats()
        }

        binding.funGoToTheShoppingMall.setOnClickListener{
            //Some logic to write
            (activity as GameActivity).updateStats()
        }

        binding.funWalkWithYourGirlfriend.setOnClickListener{
            //Some logic to write
            (activity as GameActivity).updateStats()
        }

        binding.funReadABook.setOnClickListener{
            //Some logic to write
            (activity as GameActivity).updateStats()
        }

        binding.funHelpYoungstersWithHomework.setOnClickListener{
            //Some logic to write
            (activity as GameActivity).updateStats()
        }

        binding.funDoSport.setOnClickListener{
            //Some logic to write
            (activity as GameActivity).updateStats()
        }

        binding.funPlayGuitar.setOnClickListener{
            //Some logic to write
            (activity as GameActivity).updateStats()
        }

        binding.funGoToTheTheatre.setOnClickListener{
            //Some logic to write
            (activity as GameActivity).updateStats()
        }

        binding.funGoToTheConcert.setOnClickListener{
            //Some logic to write
            (activity as GameActivity).updateStats()
        }

        binding.funKickATrashCan.setOnClickListener{
            //Some logic to write
            (activity as GameActivity).updateStats()
        }

        binding.funIntimidateYoungsters.setOnClickListener{
            //Some logic to write
            (activity as GameActivity).updateStats()
        }

        binding.funUploadVirus.setOnClickListener{
            //Some logic to write
            (activity as GameActivity).updateStats()
        }

        binding.funUseChatRoulette.setOnClickListener{
            //Some logic to write
            (activity as GameActivity).updateStats()
        }

        binding.funHaveAParty.setOnClickListener{
            //Some logic to write
            (activity as GameActivity).updateStats()
        }

        binding.funGoToTheClub.setOnClickListener{
            //Some logic to write
            (activity as GameActivity).updateStats()
        }

    }
}
