package android.clicker.school_live_simulator.User_interface.ScrollingFragments

import android.clicker.school_live_simulator.Classes.Achievements_classes.Random_achievements.CreativityEventsRandomAchievements
import android.clicker.school_live_simulator.Classes.Achievements_classes.Random_achievements.EntertainmentEventsRandomAchievements
import android.clicker.school_live_simulator.Classes.Achievements_classes.Random_achievements.SongEventsRandomAchievements
import android.clicker.school_live_simulator.Classes.Enum_classes.Entertainment
import android.clicker.school_live_simulator.Classes.GameDate.Timer
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
            if(binding.layoutFunWritePoem.visibility == GONE){
                binding.layoutFunWritePoem.visibility = VISIBLE
                binding.layoutFunDrawGraffities.visibility = VISIBLE
                binding.layoutFunDrawOnDesks.visibility = VISIBLE
                binding.layoutFunMakeSomethingHandmade.visibility = VISIBLE
                binding.layoutFunCoverASong.visibility = VISIBLE
                binding.layoutFunWriteASong.visibility = VISIBLE
                binding.layoutFunStream.visibility = VISIBLE
                binding.layoutFunMakeAYoutubeVideo.visibility = VISIBLE
            }
            else{
                binding.layoutFunWritePoem.visibility = GONE
                binding.layoutFunDrawGraffities.visibility = GONE
                binding.layoutFunDrawOnDesks.visibility = GONE
                binding.layoutFunMakeSomethingHandmade.visibility = GONE
                binding.layoutFunCoverASong.visibility = GONE
                binding.layoutFunWriteASong.visibility = GONE
                binding.layoutFunStream.visibility = GONE
                binding.layoutFunMakeAYoutubeVideo.visibility = GONE
            }
        }

        binding.funDrawOnDesks.setOnClickListener{
            try {
                Game.player.entertain(Entertainment.DRAW_ON_DESK)
                Game.counters[Game.context_bundle.getTitle("fun_draw_on_desks")] =
                    (Game.counters[Game.context_bundle.getTitle("fun_draw_on_desks")] ?: 0) + 1
                (activity as GameActivity).updateStats()
                (activity as GameActivity).achieve(CreativityEventsRandomAchievements.MISTER_PROPER)
            } catch (exception: NotEnoughMoneyException){
                binding.funDrawOnDesks.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
                (activity as GameActivity).notEnoughMoneyAnim()
            }

        }

        binding.funDrawGraffities.setOnClickListener{
            try {
                Game.player.entertain(Entertainment.DRAW_GRAFFITIES)
                Game.counters[Game.context_bundle.getTitle("fun_draw_graffities")] =
                    (Game.counters[Game.context_bundle.getTitle("fun_draw_graffities")] ?: 0) + 1
                (activity as GameActivity).updateStats()
                (activity as GameActivity).achieve(CreativityEventsRandomAchievements.DRAW_ON_TOP_OF_OTHER_ART)
            } catch (exception: NotEnoughMoneyException){
                binding.funDrawGraffities.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
                (activity as GameActivity).notEnoughMoneyAnim()
            }
        }

        binding.funWritePoem.setOnClickListener{
            try {
                Game.player.entertain(Entertainment.WRITE_A_POEM)
                Game.counters[Game.context_bundle.getTitle("fun_write_a_poem")] =
                    (Game.counters[Game.context_bundle.getTitle("fun_write_a_poem")] ?: 0) + 1
                (activity as GameActivity).updateStats()
                (activity as GameActivity).achieve(CreativityEventsRandomAchievements.POEM_POSTED_BY_TEACHER)
            } catch (exception: NotEnoughMoneyException){
                binding.funWritePoem.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
                (activity as GameActivity).notEnoughMoneyAnim()
            }
        }

        binding.funMakeSomethingHandmade.setOnClickListener{
            try {
                Game.player.entertain(Entertainment.MAKE_SOMETHING_HANDMADE)
                Game.counters[Game.context_bundle.getTitle("fun_make_something_handmade")] =
                    (Game.counters[Game.context_bundle.getTitle("fun_make_something_handmade")] ?: 0) + 1
                (activity as GameActivity).updateStats()
            } catch (exception: NotEnoughMoneyException){
                binding.funMakeSomethingHandmade.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
                (activity as GameActivity).notEnoughMoneyAnim()
            }
        }

        binding.funCoverASong.setOnClickListener{
            try {
                Game.player.entertain(Entertainment.COVER_A_SONG)
                Game.counters[Game.context_bundle.getTitle("fun_cover_a_song")] =
                    (Game.counters[Game.context_bundle.getTitle("fun_cover_a_song")] ?: 0) + 1
                (activity as GameActivity).updateStats()
            } catch (exception: NotEnoughMoneyException){
                binding.funCoverASong.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
                (activity as GameActivity).notEnoughMoneyAnim()
            }
        }

        binding.funWriteASong.setOnClickListener{
            try {
                Game.player.entertain(Entertainment.WRITE_A_SONG)
                Game.counters[Game.context_bundle.getTitle("fun_write_a_song")] =
                    (Game.counters[Game.context_bundle.getTitle("fun_write_a_song")] ?: 0) + 1
                (activity as GameActivity).updateStats()
                (activity as GameActivity).achieve(CreativityEventsRandomAchievements.IVANS_INTERNATIONAL)
                (activity as GameActivity).achieve(CreativityEventsRandomAchievements.GIRLS_LIKE_THE_SONG)
            } catch (exception: NotEnoughMoneyException){
                binding.funWriteASong.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
                (activity as GameActivity).notEnoughMoneyAnim()
            }
        }

        binding.funStream.setOnClickListener{
            try {
                Game.player.entertain(Entertainment.STREAM)
                Game.counters[Game.context_bundle.getTitle("fun_stream")] =
                    (Game.counters[Game.context_bundle.getTitle("fun_stream")] ?: 0) + 1
                (activity as GameActivity).updateStats()
            } catch (exception: NotEnoughMoneyException){
                binding.funStream.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
                (activity as GameActivity).notEnoughMoneyAnim()
            }
        }

        binding.funMakeAYoutubeVideo.setOnClickListener{
            try {
                (activity as GameActivity).updateStats()
                Game.game_date.end_signal_handlers[Entertainment.MAKE_A_YOUTUBE_VIDEO.name.lowercase()] =
                    Entertainment.MAKE_A_YOUTUBE_VIDEO::makeYouTubeVideo
                Timer(Game.game_date.subscription_length).registerTimeHandler(Entertainment.MAKE_A_YOUTUBE_VIDEO.name.lowercase())
            } catch (exception: NotEnoughMoneyException){
                binding.funMakeAYoutubeVideo.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
                (activity as GameActivity).notEnoughMoneyAnim()
            }
        }

        binding.funDoNothing.setOnClickListener{
            try {
                Game.player.entertain(Entertainment.DO_NOTHING)
                binding.layoutFunDoNothing.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.click))
                Game.counters[Game.context_bundle.getTitle("fun_do_nothing")] =
                    (Game.counters[Game.context_bundle.getTitle("fun_do_nothing")] ?: 0) + 1
                (activity as GameActivity).updateStats()
            } catch (exception: NotEnoughMoneyException){
                binding.layoutFunDoNothing.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
                (activity as GameActivity).notEnoughMoneyAnim()
            }
        }

        binding.funGoCycling.setOnClickListener{
            try {
                Game.player.entertain(Entertainment.GO_CYCLING)
                binding.layoutFunGoCycling.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.click))
                Game.counters[Game.context_bundle.getTitle("fun_go_cycling")] =
                    (Game.counters[Game.context_bundle.getTitle("fun_go_cycling")] ?: 0) + 1
                (activity as GameActivity).updateStats()
            } catch (exception: NotEnoughMoneyException){
                binding.layoutFunGoCycling.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
                (activity as GameActivity).notEnoughMoneyAnim()
            }
        }

        binding.funListenToTheMusic.setOnClickListener{
            try {
                (activity as GameActivity).updateStats()
                binding.layoutFunListenToTheMusic.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.click))
                Game.game_date.end_signal_handlers[Entertainment.LISTEN_TO_THE_MUSIC.name.lowercase()] =
                    Entertainment.LISTEN_TO_THE_MUSIC::listenToTheMusic
                Timer(Game.game_date.subscription_length).registerTimeHandler(Entertainment.LISTEN_TO_THE_MUSIC.name.lowercase())
            } catch (exception: NotEnoughMoneyException){
                binding.layoutFunListenToTheMusic.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
                (activity as GameActivity).notEnoughMoneyAnim()
            }
        }

        binding.funDonateAndPlayComputer.setOnClickListener{
            try {
                Game.player.entertain(Entertainment.DONATE_AND_PLAY_COMPUTER)
                binding.layoutFunDonateAndPlayComputer.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.click))
                Game.counters[Game.context_bundle.getTitle("fun_donate_and_play_computer")] =
                    (Game.counters[Game.context_bundle.getTitle("fun_donate_and_play_computer")] ?: 0) + 1
                (activity as GameActivity).updateStats()
                (activity as GameActivity).achieve(EntertainmentEventsRandomAchievements.GET_BAN)
            } catch (exception: NotEnoughMoneyException){
                binding.layoutFunDonateAndPlayComputer.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
                (activity as GameActivity).notEnoughMoneyAnim()
            }
        }

        binding.funGoToTheShoppingMall.setOnClickListener{
            try {
                Game.player.entertain(Entertainment.GO_TO_THE_SHOPPING_MALL)
                binding.layoutFunGoToTheShoppingMall.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.click))
                Game.counters[Game.context_bundle.getTitle("fun_go_to_the_shopping_mall")] =
                    (Game.counters[Game.context_bundle.getTitle("fun_go_to_the_shopping_mall")] ?: 0) + 1
                (activity as GameActivity).updateStats()
                (activity as GameActivity).achieve(EntertainmentEventsRandomAchievements.EVACUATE_FROM_SHOP_CENTRE)
            } catch (exception: NotEnoughMoneyException){
                binding.layoutFunGoToTheShoppingMall.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
                (activity as GameActivity).notEnoughMoneyAnim()
            }
        }

        binding.funWalkWithYourGirlfriend.setOnClickListener{
            try {
                Game.player.entertain(Entertainment.WALK_WITH_YOUR_GIRLFRIEND)
                Game.counters[Game.context_bundle.getTitle("fun_walk_with_your_girlfriend")] =
                    (Game.counters[Game.context_bundle.getTitle("fun_walk_with_your_girlfriend")] ?: 0) + 1
                binding.layoutFunWalkWithYourGirlfriend.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.click))
                (activity as GameActivity).updateStats()
            } catch (exception: NotEnoughMoneyException){
                binding.layoutFunWalkWithYourGirlfriend.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
                (activity as GameActivity).notEnoughMoneyAnim()
            }
        }

        binding.funReadABook.setOnClickListener{
            try {
                Game.player.entertain(Entertainment.READ_A_BOOK)
                binding.layoutFunReadABook.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.click))
                Game.counters[Game.context_bundle.getTitle("fun_read_a_book")] =
                    (Game.counters[Game.context_bundle.getTitle("fun_read_a_book")] ?: 0) + 1
                (activity as GameActivity).updateStats()
                (activity as GameActivity).achieve(EntertainmentEventsRandomAchievements.SEX_SCENE_IN_BOOK)
            } catch (exception: NotEnoughMoneyException){
                binding.layoutFunReadABook.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
                (activity as GameActivity).notEnoughMoneyAnim()
            }
        }

        binding.funHelpYoungstersWithHomework.setOnClickListener{
            try {
                Game.player.entertain(Entertainment.HELP_YOUNGSTERS_WITH_HOMEWORK)
                binding.layoutFunHelpYoungstersWithHomework.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.click))
                Game.counters[Game.context_bundle.getTitle("fun_help_youngsters_with_homework")] =
                    (Game.counters[Game.context_bundle.getTitle("fun_help_youngsters_with_homework")] ?: 0) + 1
                (activity as GameActivity).updateStats()
                (activity as GameActivity).achieve(EntertainmentEventsRandomAchievements.GET_TIP_FROM_YOUNGS)
            } catch (exception: NotEnoughMoneyException){
                binding.layoutFunHelpYoungstersWithHomework.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
                (activity as GameActivity).notEnoughMoneyAnim()
            }
        }

        binding.funDoSport.setOnClickListener{
            try {
                (activity as GameActivity).updateStats()
                binding.layoutFunDoSport.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.click))
                Game.game_date.end_signal_handlers[Entertainment.DO_SPORT.name.lowercase()] =
                    Entertainment.DO_SPORT::doSport
                Timer(Game.game_date.subscription_length).registerTimeHandler(Entertainment.DO_SPORT.name.lowercase())
                (activity as GameActivity).achieve(EntertainmentEventsRandomAchievements.TOO_FAST_RUNNING)
            } catch (exception: NotEnoughMoneyException){
                binding.layoutFunDoSport.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
                (activity as GameActivity).notEnoughMoneyAnim()
            }
        }

        binding.funPlayGuitar.setOnClickListener{
            try {
                Game.player.entertain(Entertainment.PLAY_GUITAR)
                binding.layoutFunPlayGuitar.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.click))
                Game.counters[Game.context_bundle.getTitle("fun_play_guitar")] =
                    (Game.counters[Game.context_bundle.getTitle("fun_play_guitar")] ?: 0) + 1
                (activity as GameActivity).updateStats()
                (activity as GameActivity).achieve(SongEventsRandomAchievements.COMPANY_AROUND)
            } catch (exception: NotEnoughMoneyException){
                binding.layoutFunPlayGuitar.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
                (activity as GameActivity).notEnoughMoneyAnim()
            }
        }

        binding.funGoToTheTheatre.setOnClickListener{
            try {
                Game.player.entertain(Entertainment.GO_TO_THE_THEATRE)
                binding.layoutFunGoToTheTheatre.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.click))
                Game.counters[Game.context_bundle.getTitle("fun_go_to_the_theatre")] =
                    (Game.counters[Game.context_bundle.getTitle("fun_go_to_the_theatre")] ?: 0) + 1
                (activity as GameActivity).updateStats()
                (activity as GameActivity).achieve(EntertainmentEventsRandomAchievements.FRIEND_IN_THEATRE)
            } catch (exception: NotEnoughMoneyException){
                binding.layoutFunGoToTheTheatre.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
                (activity as GameActivity).notEnoughMoneyAnim()
            }
        }

        binding.funGoToTheConcert.setOnClickListener{
            try {
                Game.player.entertain(Entertainment.GO_TO_THE_CONCERT)
                binding.layoutFunGoToTheConcert.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.click))
                Game.counters[Game.context_bundle.getTitle("fun_go_to_the_concert")] =
                    (Game.counters[Game.context_bundle.getTitle("fun_go_to_the_concert")] ?: 0) + 1
                (activity as GameActivity).updateStats()
                (activity as GameActivity).achieve(EntertainmentEventsRandomAchievements.PHOTO_WITH_VOCALIST)
            } catch (exception: NotEnoughMoneyException){
                binding.layoutFunGoToTheConcert.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
                (activity as GameActivity).notEnoughMoneyAnim()
            }
        }

        binding.funKickATrashCan.setOnClickListener{
            try {
                Game.player.entertain(Entertainment.KICK_A_TRASH_CAN)
                binding.layoutFunKickATrashCan.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.click))
                Game.counters[Game.context_bundle.getTitle("fun_kick_a_trash_can")] =
                    (Game.counters[Game.context_bundle.getTitle("fun_kick_a_trash_can")] ?: 0) + 1
                (activity as GameActivity).updateStats()
                (activity as GameActivity).achieve(EntertainmentEventsRandomAchievements.CAN_FLIP)
            } catch (exception: NotEnoughMoneyException){
                binding.layoutFunKickATrashCan.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
                (activity as GameActivity).notEnoughMoneyAnim()
            }
        }

        binding.funIntimidateYoungsters.setOnClickListener{
            try {
                Game.player.entertain(Entertainment.INTIMIDATE_YOUNGSTERS)
                binding.layoutFunIntimidateYoungsters.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.click))
                Game.counters[Game.context_bundle.getTitle("fun_intimidate_youngsters")] =
                    (Game.counters[Game.context_bundle.getTitle("fun_intimidate_youngsters")] ?: 0) + 1
                (activity as GameActivity).updateStats()
                (activity as GameActivity).achieve(EntertainmentEventsRandomAchievements.BE_REPORTED_BY_CHILDREN)
            } catch (exception: NotEnoughMoneyException){
                binding.layoutFunIntimidateYoungsters.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
                (activity as GameActivity).notEnoughMoneyAnim()
            }
        }

        binding.funUploadVirus.setOnClickListener{
            try {
                Game.player.entertain(Entertainment.UPLOAD_VIRUS)
                binding.layoutFunUploadVirus.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.click))
                Game.counters[Game.context_bundle.getTitle("fun_upload_virus")] =
                    (Game.counters[Game.context_bundle.getTitle("fun_upload_virus")] ?: 0) + 1
                (activity as GameActivity).updateStats()
            } catch (exception: NotEnoughMoneyException){
                binding.layoutFunUploadVirus.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
                (activity as GameActivity).notEnoughMoneyAnim()
            }
        }

        binding.funUseChatRoulette.setOnClickListener{
            try {
                Game.player.entertain(Entertainment.USE_CHAT_ROULETTE)
                binding.layoutFunUseChatRoulette.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.click))
                Game.counters[Game.context_bundle.getTitle("fun_use_chat_roulette")] =
                    (Game.counters[Game.context_bundle.getTitle("fun_use_chat_roulette")] ?: 0) + 1
                (activity as GameActivity).updateStats()
                (activity as GameActivity).achieve(EntertainmentEventsRandomAchievements.CAM2CAM_TRAP)
            } catch (exception: NotEnoughMoneyException){
                binding.layoutFunUseChatRoulette.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
                (activity as GameActivity).notEnoughMoneyAnim()
            }
        }

        binding.funHaveAParty.setOnClickListener{
            try {
                Game.player.entertain(Entertainment.HAVE_A_PARTY)
                binding.layoutFunHaveAParty.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.click))
                Game.counters[Game.context_bundle.getTitle("fun_have_a_party")] =
                    (Game.counters[Game.context_bundle.getTitle("fun_have_a_party")] ?: 0) + 1
                (activity as GameActivity).updateStats()
                (activity as GameActivity).achieve(EntertainmentEventsRandomAchievements.DESTROYED_HOUSE)
            } catch (exception: NotEnoughMoneyException){
                binding.layoutFunHaveAParty.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
                (activity as GameActivity).notEnoughMoneyAnim()
            }
        }

        binding.funGoToTheClub.setOnClickListener{
            try {
                Game.player.entertain(Entertainment.GO_TO_THE_CLUB)
                binding.layoutFunGoToTheClub.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.click))
                Game.counters[Game.context_bundle.getTitle("fun_go_to_the_club")] =
                    (Game.counters[Game.context_bundle.getTitle("fun_go_to_the_club")] ?: 0) + 1
                (activity as GameActivity).updateStats()
                (activity as GameActivity).achieve(EntertainmentEventsRandomAchievements.FUTURE_PIMP)
                (activity as GameActivity).achieve(EntertainmentEventsRandomAchievements.FUTURE_GAY_PIMP)
            } catch (exception: NotEnoughMoneyException){
                binding.layoutFunGoToTheClub.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
                (activity as GameActivity).notEnoughMoneyAnim()
            }
        }

    }
}
