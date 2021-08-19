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
import android.view.View.GONE
import android.view.View.VISIBLE
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

        binding.funNeutralActions.setOnClickListener {
            if(binding.layoutFunDoNothing.visibility == GONE){
                binding.layoutFunDoNothing.visibility = VISIBLE
                binding.layoutFunGoCycling.visibility = VISIBLE
                binding.layoutFunListenToTheMusic.visibility = VISIBLE
                binding.layoutFunDonateAndPlayComputer.visibility = VISIBLE
                binding.layoutFunGoToTheShoppingMall.visibility = VISIBLE
                binding.layoutFunWalkWithYourGirlfriend.visibility = VISIBLE
            }
            else{
                binding.layoutFunDoNothing.visibility = GONE
                binding.layoutFunGoCycling.visibility = GONE
                binding.layoutFunListenToTheMusic.visibility = GONE
                binding.layoutFunDonateAndPlayComputer.visibility = GONE
                binding.layoutFunGoToTheShoppingMall.visibility = GONE
                binding.layoutFunWalkWithYourGirlfriend.visibility = GONE
            }
        }

        binding.funGoodActions.setOnClickListener {
            if(binding.layoutFunReadABook.visibility == GONE){
                binding.layoutFunReadABook.visibility = VISIBLE
                binding.layoutFunHelpYoungstersWithHomework.visibility = VISIBLE
                binding.layoutFunDoSport.visibility = VISIBLE
                binding.layoutFunPlayGuitar.visibility = VISIBLE
                binding.layoutFunGoToTheTheatre.visibility = VISIBLE
                binding.layoutFunGoToTheConcert.visibility = VISIBLE
            }
            else{
                binding.layoutFunReadABook.visibility = GONE
                binding.layoutFunHelpYoungstersWithHomework.visibility = GONE
                binding.layoutFunDoSport.visibility = GONE
                binding.layoutFunPlayGuitar.visibility = GONE
                binding.layoutFunGoToTheTheatre.visibility = GONE
                binding.layoutFunGoToTheConcert.visibility = GONE
            }
        }

        binding.funBadActions.setOnClickListener {
            if(binding.layoutFunKickATrashCan.visibility == GONE){
                binding.layoutFunKickATrashCan.visibility = VISIBLE
                binding.layoutFunIntimidateYoungsters.visibility = VISIBLE
                binding.layoutFunUploadVirus.visibility = VISIBLE
                binding.layoutFunUseChatRoulette.visibility = VISIBLE
                binding.layoutFunHaveAParty.visibility = VISIBLE
                binding.layoutFunGoToTheClub.visibility = VISIBLE
            }
            else{
                binding.layoutFunKickATrashCan.visibility = GONE
                binding.layoutFunIntimidateYoungsters.visibility = GONE
                binding.layoutFunUploadVirus.visibility = GONE
                binding.layoutFunUseChatRoulette.visibility = GONE
                binding.layoutFunHaveAParty.visibility = GONE
                binding.layoutFunGoToTheClub.visibility = GONE
            }
        }
        binding.funArt.setOnClickListener {
            if(binding.funWritePoem.visibility == GONE){
                binding.funWritePoem.visibility = VISIBLE
                binding.funDrawGraffities.visibility = VISIBLE
                binding.funDrawOnDesks.visibility = VISIBLE
                binding.funMakeSomethingHandmade.visibility = VISIBLE
                binding.funCoverASong.visibility = VISIBLE
                binding.funWriteASong.visibility = VISIBLE
                binding.funStream.visibility = VISIBLE
                binding.funMakeAYoutubeVideo.visibility = VISIBLE
            }
            else{
                binding.funWritePoem.visibility = GONE
                binding.funDrawGraffities.visibility = GONE
                binding.funDrawOnDesks.visibility = GONE
                binding.funMakeSomethingHandmade.visibility = GONE
                binding.funCoverASong.visibility = GONE
                binding.funWriteASong.visibility = GONE
                binding.funStream.visibility = GONE
                binding.funMakeAYoutubeVideo.visibility = GONE
            }
        }

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
                binding.layoutFunDoNothing.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
            }
        }

        binding.funGoCycling.setOnClickListener{
            try {
                Game.player.entertain(Entertainment.GO_CYCLING)
                (activity as GameActivity).updateStats()
            } catch (exception: NotEnoughMoneyException){
                binding.layoutFunGoCycling.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
            }
        }

        binding.funListenToTheMusic.setOnClickListener{
            try {
                Game.player.entertain(Entertainment.LISTEN_TO_THE_MUSIC)
                (activity as GameActivity).updateStats()
            } catch (exception: NotEnoughMoneyException){
                binding.layoutFunListenToTheMusic.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
            }
        }

        binding.funDonateAndPlayComputer.setOnClickListener{
            try {
                Game.player.entertain(Entertainment.DONATE_AND_PLAY_COMPUTER)
                (activity as GameActivity).updateStats()
            } catch (exception: NotEnoughMoneyException){
                binding.layoutFunDonateAndPlayComputer.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
            }
        }

        binding.funGoToTheShoppingMall.setOnClickListener{
            try {
                Game.player.entertain(Entertainment.GO_TO_THE_SHOPPING_MALL)
                (activity as GameActivity).updateStats()
            } catch (exception: NotEnoughMoneyException){
                binding.layoutFunGoToTheShoppingMall.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
            }
        }

        binding.funWalkWithYourGirlfriend.setOnClickListener{
            try {
                Game.player.entertain(Entertainment.WALK_WITH_YOUR_GIRLFRIEND)
                (activity as GameActivity).updateStats()
            } catch (exception: NotEnoughMoneyException){
                binding.layoutFunWalkWithYourGirlfriend.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
            }
        }

        binding.funReadABook.setOnClickListener{
            try {
                Game.player.entertain(Entertainment.READ_A_BOOK)
                (activity as GameActivity).updateStats()
            } catch (exception: NotEnoughMoneyException){
                binding.layoutFunReadABook.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
            }
        }

        binding.funHelpYoungstersWithHomework.setOnClickListener{
            try {
                Game.player.entertain(Entertainment.HELP_YOUNGSTERS_WITH_HOMEWORK)
                (activity as GameActivity).updateStats()
            } catch (exception: NotEnoughMoneyException){
                binding.layoutFunHelpYoungstersWithHomework.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
            }
        }

        binding.funDoSport.setOnClickListener{
            try {
                Game.player.entertain(Entertainment.DO_SPORT)
                (activity as GameActivity).updateStats()
            } catch (exception: NotEnoughMoneyException){
                binding.layoutFunDoSport.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
            }
        }

        binding.funPlayGuitar.setOnClickListener{
            try {
                Game.player.entertain(Entertainment.PLAY_GUITAR)
                (activity as GameActivity).updateStats()
            } catch (exception: NotEnoughMoneyException){
                binding.layoutFunPlayGuitar.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
            }
        }

        binding.funGoToTheTheatre.setOnClickListener{
            try {
                Game.player.entertain(Entertainment.GO_TO_THE_THEATRE)
                (activity as GameActivity).updateStats()
            } catch (exception: NotEnoughMoneyException){
                binding.layoutFunGoToTheTheatre.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
            }
        }

        binding.funGoToTheConcert.setOnClickListener{
            try {
                Game.player.entertain(Entertainment.GO_TO_THE_CONCERT)
                (activity as GameActivity).updateStats()
            } catch (exception: NotEnoughMoneyException){
                binding.layoutFunGoToTheConcert.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
            }
        }

        binding.funKickATrashCan.setOnClickListener{
            try {
                Game.player.entertain(Entertainment.KICK_A_TRASH_CAN)
                (activity as GameActivity).updateStats()
            } catch (exception: NotEnoughMoneyException){
                binding.layoutFunKickATrashCan.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
            }
        }

        binding.funIntimidateYoungsters.setOnClickListener{
            try {
                Game.player.entertain(Entertainment.INTIMIDATE_YOUNGSTERS)
                (activity as GameActivity).updateStats()
            } catch (exception: NotEnoughMoneyException){
                binding.layoutFunIntimidateYoungsters.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
            }
        }

        binding.funUploadVirus.setOnClickListener{
            try {
                Game.player.entertain(Entertainment.UPLOAD_VIRUS)
                (activity as GameActivity).updateStats()
            } catch (exception: NotEnoughMoneyException){
                binding.layoutFunUploadVirus.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
            }
        }

        binding.funUseChatRoulette.setOnClickListener{
            try {
                Game.player.entertain(Entertainment.USE_CHAT_ROULETTE)
                (activity as GameActivity).updateStats()
            } catch (exception: NotEnoughMoneyException){
                binding.layoutFunUseChatRoulette.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
            }
        }

        binding.funHaveAParty.setOnClickListener{
            try {
                Game.player.entertain(Entertainment.HAVE_A_PARTY)
                (activity as GameActivity).updateStats()
            } catch (exception: NotEnoughMoneyException){
                binding.layoutFunHaveAParty.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
            }
        }

        binding.funGoToTheClub.setOnClickListener{
            try {
                Game.player.entertain(Entertainment.GO_TO_THE_CLUB)
                (activity as GameActivity).updateStats()
            } catch (exception: NotEnoughMoneyException){
                binding.layoutFunGoToTheClub.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
            }
        }

    }
}
