package android.clicker.school_live_simulator.User_interface.ScrollingFragments

import android.clicker.school_live_simulator.Classes.Enum_classes.Entertainment
import android.clicker.school_live_simulator.Classes.NotEnoughMoneyException
import android.clicker.school_live_simulator.Game
import android.clicker.school_live_simulator.R
import android.clicker.school_live_simulator.User_interface.GameActivity
import android.clicker.school_live_simulator.databinding.FragmentFunScrollingBinding
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
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
            try {
                Game.player.entertain(Entertainment.DRAW_ON_DESK)
                (activity as GameActivity).updateStats()
            } catch (exception: NotEnoughMoneyException){
                binding.funDrawOnDesks.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
            }

        }

        binding.funDrawGraffities.setOnClickListener{
            try {
                Game.player.entertain(Entertainment.DRAW_GRAFFITIES)
                (activity as GameActivity).updateStats()
            } catch (exception: NotEnoughMoneyException){
                binding.funDrawGraffities.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
            }
        }

        binding.funWritePoem.setOnClickListener{
            try {
                Game.player.entertain(Entertainment.WRITE_A_POEM)
                (activity as GameActivity).updateStats()
            } catch (exception: NotEnoughMoneyException){
                binding.funWritePoem.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
            }
        }

        binding.funMakeSomethingHandmade.setOnClickListener{
            try {
                Game.player.entertain(Entertainment.MAKE_SOMETHING_HANDMADE)
                (activity as GameActivity).updateStats()
            } catch (exception: NotEnoughMoneyException){
                binding.funMakeSomethingHandmade.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
            }
        }

        binding.funCoverASong.setOnClickListener{
            try {
                Game.player.entertain(Entertainment.COVER_A_SONG)
                (activity as GameActivity).updateStats()
            } catch (exception: NotEnoughMoneyException){
                binding.funCoverASong.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
            }
        }

        binding.funWriteASong.setOnClickListener{
            try {
                Game.player.entertain(Entertainment.WRITE_A_SONG)
                (activity as GameActivity).updateStats()
            } catch (exception: NotEnoughMoneyException){
                binding.funWriteASong.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
            }
        }

        binding.funStream.setOnClickListener{
            try {
                Game.player.entertain(Entertainment.STREAM)
                (activity as GameActivity).updateStats()
            } catch (exception: NotEnoughMoneyException){
                binding.funStream.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
            }
        }

        binding.funMakeAYoutubeVideo.setOnClickListener{
            try {
                Game.player.entertain(Entertainment.MAKE_A_YOUTUBE_VIDEO)
                (activity as GameActivity).updateStats()
            } catch (exception: NotEnoughMoneyException){
                binding.funMakeAYoutubeVideo.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
            }
        }

        binding.funDoNothing.setOnClickListener{
            try {
                Game.player.entertain(Entertainment.DO_NOTHING)
                (activity as GameActivity).updateStats()
            } catch (exception: NotEnoughMoneyException){
                binding.funDoNothing.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
            }
        }

        binding.funGoCycling.setOnClickListener{
            try {
                Game.player.entertain(Entertainment.GO_CYCLING)
                (activity as GameActivity).updateStats()
            } catch (exception: NotEnoughMoneyException){
                binding.funGoCycling.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
            }
        }

        binding.funListenToTheMusic.setOnClickListener{
            try {
                Game.player.entertain(Entertainment.LISTEN_TO_THE_MUSIC)
                (activity as GameActivity).updateStats()
            } catch (exception: NotEnoughMoneyException){
                binding.funListenToTheMusic.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
            }
        }

        binding.funDonateAndPlayComputer.setOnClickListener{
            try {
                Game.player.entertain(Entertainment.DONATE_AND_PLAY_COMPUTER)
                (activity as GameActivity).updateStats()
            } catch (exception: NotEnoughMoneyException){
                binding.funDonateAndPlayComputer.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
            }
        }

        binding.funGoToTheShoppingMall.setOnClickListener{
            try {
                Game.player.entertain(Entertainment.GO_TO_THE_SHOPPING_MALL)
                (activity as GameActivity).updateStats()
            } catch (exception: NotEnoughMoneyException){
                binding.funGoToTheShoppingMall.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
            }
        }

        binding.funWalkWithYourGirlfriend.setOnClickListener{
            try {
                Game.player.entertain(Entertainment.WALK_WITH_YOUR_GIRLFRIEND)
                (activity as GameActivity).updateStats()
            } catch (exception: NotEnoughMoneyException){
                binding.funWalkWithYourGirlfriend.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
            }
        }

        binding.funReadABook.setOnClickListener{
            try {
                Game.player.entertain(Entertainment.READ_A_BOOK)
                (activity as GameActivity).updateStats()
            } catch (exception: NotEnoughMoneyException){
                binding.funReadABook.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
            }
        }

        binding.funHelpYoungstersWithHomework.setOnClickListener{
            try {
                Game.player.entertain(Entertainment.HELP_YOUNGSTERS_WITH_HOMEWORK)
                (activity as GameActivity).updateStats()
            } catch (exception: NotEnoughMoneyException){
                binding.funHelpYoungstersWithHomework.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
            }
        }

        binding.funDoSport.setOnClickListener{
            try {
                Game.player.entertain(Entertainment.DO_SPORT)
                (activity as GameActivity).updateStats()
            } catch (exception: NotEnoughMoneyException){
                binding.funDoSport.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
            }
        }

        binding.funPlayGuitar.setOnClickListener{
            try {
                Game.player.entertain(Entertainment.PLAY_GUITAR)
                (activity as GameActivity).updateStats()
            } catch (exception: NotEnoughMoneyException){
                binding.funPlayGuitar.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
            }
        }

        binding.funGoToTheTheatre.setOnClickListener{
            try {
                Game.player.entertain(Entertainment.GO_TO_THE_THEATRE)
                (activity as GameActivity).updateStats()
            } catch (exception: NotEnoughMoneyException){
                binding.funGoToTheTheatre.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
            }
        }

        binding.funGoToTheConcert.setOnClickListener{
            try {
                Game.player.entertain(Entertainment.GO_TO_THE_CONCERT)
                (activity as GameActivity).updateStats()
            } catch (exception: NotEnoughMoneyException){
                binding.funGoToTheConcert.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
            }
        }

        binding.funKickATrashCan.setOnClickListener{
            try {
                Game.player.entertain(Entertainment.KICK_A_TRASH_CAN)
                (activity as GameActivity).updateStats()
            } catch (exception: NotEnoughMoneyException){
                binding.funKickATrashCan.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
            }
        }

        binding.funIntimidateYoungsters.setOnClickListener{
            try {
                Game.player.entertain(Entertainment.INTIMIDATE_YOUNGSTERS)
                (activity as GameActivity).updateStats()
            } catch (exception: NotEnoughMoneyException){
                binding.funIntimidateYoungsters.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
            }
        }

        binding.funUploadVirus.setOnClickListener{
            try {
                Game.player.entertain(Entertainment.UPLOAD_VIRUS)
                (activity as GameActivity).updateStats()
            } catch (exception: NotEnoughMoneyException){
                binding.funUploadVirus.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
            }
        }

        binding.funUseChatRoulette.setOnClickListener{
            try {
                Game.player.entertain(Entertainment.USE_CHAT_ROULETTE)
                (activity as GameActivity).updateStats()
            } catch (exception: NotEnoughMoneyException){
                binding.funUseChatRoulette.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
            }
        }

        binding.funHaveAParty.setOnClickListener{
            try {
                Game.player.entertain(Entertainment.HAVE_A_PARTY)
                (activity as GameActivity).updateStats()
            } catch (exception: NotEnoughMoneyException){
                binding.funHaveAParty.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
            }
        }

        binding.funGoToTheClub.setOnClickListener{
            try {
                Game.player.entertain(Entertainment.GO_TO_THE_CLUB)
                (activity as GameActivity).updateStats()
            } catch (exception: NotEnoughMoneyException){
                binding.funGoToTheClub.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
            }
        }

    }
}
