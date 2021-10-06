package android.clicker.school_live_simulator.User_interface.ScrollingFragments

import android.clicker.school_live_simulator.*
import android.clicker.school_live_simulator.Classes.Achievements_classes.Random_achievements.FoodEventsRandomAchievements
import android.clicker.school_live_simulator.Classes.Achievements_classes.Random_achievements.SongEventsRandomAchievements
import android.clicker.school_live_simulator.Classes.Enum_classes.OtherWork
import android.clicker.school_live_simulator.Classes.IsNotAvailableException
import android.clicker.school_live_simulator.User_interface.GameActivity
import android.clicker.school_live_simulator.databinding.FragmentWorkScrollingBinding
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.Toast
import androidx.core.content.ContextCompat.getColor
import androidx.core.content.ContextCompat.getDrawable
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
            Game.player.work(OtherWork.COLLECT_CHANGE)
            binding.layoutWorkCollectChange.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.click))
            Game.counters[Game.context_bundle.getTitle("work_collect_change")] =
                (Game.counters[Game.context_bundle.getTitle("work_collect_change")] ?: 0) + 1
            (activity as GameActivity).updateStats()
        }

        binding.workWatchAds.setOnClickListener{
            try {
                if (Game.player.items.computer is NullComputerState) throw IsNotAvailableException("Buy comuter first!")
                Game.player.work(OtherWork.WATCH_ADS)
                binding.layoutWorkWatchAds.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.click))
                Game.counters[Game.context_bundle.getTitle("work_watch_ads")] =
                    (Game.counters[Game.context_bundle.getTitle("work_watch_ads")] ?: 0) + 1
                (activity as GameActivity).updateStats()
            } catch(exception: IsNotAvailableException) {
                Toast.makeText(activity, getString(R.string.toast_buy_computer), Toast.LENGTH_SHORT).show()
                binding.layoutWorkWatchAds.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
            }
        }

        binding.workDistributeFlyers.setOnClickListener{
            Game.player.work(OtherWork.DISTRIBUTE_FLYERS)
            binding.layoutWorkDistributeFlyers.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.click))
            Game.counters[Game.context_bundle.getTitle("work_distribute_flyers")] =
                (Game.counters[Game.context_bundle.getTitle("work_distribute_flyers")] ?: 0) + 1
            (activity as GameActivity).updateStats()
        }

        binding.workAsAGreener.setOnClickListener{
            Game.player.work(OtherWork.AS_A_GREENER)
            binding.layoutWorkAsAGreener.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.click))
            Game.counters[Game.context_bundle.getTitle("work_as_a_greener")] =
                (Game.counters[Game.context_bundle.getTitle("work_as_a_greener")] ?: 0) + 1
            (activity as GameActivity).updateStats()
        }

        binding.workAsACourier.setOnClickListener{
            try {
                Game.player.deliver()
                binding.layoutWorkAsACourier.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.click))
                Game.counters[Game.context_bundle.getTitle("work_as_a_courier")] =
                    (Game.counters[Game.context_bundle.getTitle("work_as_a_courier")] ?: 0) + 1
                (activity as GameActivity).updateStats()
            } catch(exception: IsNotAvailableException) {
                Toast.makeText(activity, getString(R.string.toast_buy_bike), Toast.LENGTH_SHORT).show()
                binding.layoutWorkAsACourier.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
            }
        }

        binding.workAsAnOperator.setOnClickListener{
            Game.player.work(OtherWork.AS_AN_OPERATOR)
            binding.layoutWorkAsAnOperator.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.click))
            Game.counters[Game.context_bundle.getTitle("work_as_an_operator")] =
                (Game.counters[Game.context_bundle.getTitle("work_as_an_operator")] ?: 0) + 1
            (activity as GameActivity).updateStats()
        }

        binding.workPlayGuitar.setOnClickListener{
            try {
                Game.player.playSong()
                binding.layoutWorkPlayGuitar.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.click))
                Game.counters[Game.context_bundle.getTitle("work_play_guitar")] =
                    (Game.counters[Game.context_bundle.getTitle("work_play_guitar")] ?: 0) + 1
                (activity as GameActivity).updateStats()
                (activity as GameActivity).achieve(SongEventsRandomAchievements.WRONG_CHORDS)
            } catch(exception: IsNotAvailableException) {
                Toast.makeText(activity, getString(R.string.toast_not_passed), Toast.LENGTH_SHORT).show()
                binding.layoutWorkPlayGuitar.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
            }
            (activity as GameActivity).updateStats()
        }

        binding.workOnTheNet.setOnClickListener{
            try {
                Game.player.realiseWebTask()
                binding.layoutWorkOnTheNet.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.click))
                Game.counters[Game.context_bundle.getTitle("work_on_the_net")] =
                    (Game.counters[Game.context_bundle.getTitle("work_on_the_net")] ?: 0) + 1
                (activity as GameActivity).updateStats()
            } catch(exception: IsNotAvailableException) {
                Toast.makeText(activity, getString(R.string.toast_not_passed), Toast.LENGTH_SHORT).show()
                binding.layoutWorkOnTheNet.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
            }
            (activity as GameActivity).updateStats()
        }
    }

    override fun onResume() {
        super.onResume()
        when(Game.player.items.bicycle){
            is MountainBicycleState -> {
                binding.textViewWorkAsACourier.text = getString(R.string.work_as_a_courier_v3)
                binding.textViewWorkAsACourierMoney.text = getString(R.string.work_as_a_courier_v3_income)
                binding.textViewWorkAsACourierHappiness.text = getString(R.string.work_as_a_courier_v3_happiness)
            }
            is UsualBicycleState-> {
                binding.textViewWorkAsACourier.text = getString(R.string.work_as_a_courier_v2)
                binding.textViewWorkAsACourierMoney.text = getString(R.string.work_as_a_courier_v2_income)
                binding.textViewWorkAsACourierHappiness.text = getString(R.string.work_as_a_courier_v2_happiness)
            }
            is UssrBicycleState->{
                binding.textViewWorkAsACourier.text = getString(R.string.work_as_a_courier_v1)
                binding.textViewWorkAsACourierMoney.text = getString(R.string.work_as_a_courier_v1_income)
                binding.textViewWorkAsACourierHappiness.text = getString(R.string.work_as_a_courier_v1_happiness)
                }
            else->
                binding.textViewWorkAsACourier.text = getString(R.string.work_as_a_courier_v0)

        }

        when(Game.player.current_courses.guitar_course){
            is MusicalObservatoryCourseState -> {
                binding.textViewWorkPlayGuitar.text = getString(R.string.work_play_guitar_v5)
                binding.textViewWorkPlayGuitarMoney.text = getString(R.string.work_play_guitar_v5_income)
                binding.textViewWorkPlayGuitarHappiness.text = getString(R.string.work_play_guitar_v5_happiness)
            }
            is MusicalSchoolCourseState -> {
                binding.textViewWorkPlayGuitar.text = getString(R.string.work_play_guitar_v4)
                binding.textViewWorkPlayGuitarMoney.text = getString(R.string.work_play_guitar_v4_income)
                binding.textViewWorkPlayGuitarHappiness.text = getString(R.string.work_play_guitar_v4_happiness)
            }
            is YardSongCourseState -> {
                binding.textViewWorkPlayGuitar.text = getString(R.string.work_play_guitar_v3)
                binding.textViewWorkPlayGuitarMoney.text = getString(R.string.work_play_guitar_v3_income)
                binding.textViewWorkPlayGuitarHappiness.text = getString(R.string.work_play_guitar_v3_happiness)
            }
            is FirstSongCourseState -> {
                binding.textViewWorkPlayGuitar.text = getString(R.string.work_play_guitar_v2)
                binding.textViewWorkPlayGuitarMoney.text = getString(R.string.work_play_guitar_v2_income)
                binding.textViewWorkPlayGuitarHappiness.text = getString(R.string.work_play_guitar_v2_happiness)
            }
            is YardGuitarCourseState -> {
                binding.textViewWorkPlayGuitar.text = getString(R.string.work_play_guitar_v1)
                binding.textViewWorkPlayGuitarMoney.text = getString(R.string.work_play_guitar_v1_income)
                binding.textViewWorkPlayGuitarHappiness.text = getString(R.string.work_play_guitar_v1_happiness)
            }
            else ->
                binding.textViewWorkPlayGuitar.text = getString(R.string.work_play_guitar_v0)

        }
        when(Game.player.current_courses.computer_course){
            is GameDevelopmentCourseState -> {
                binding.textViewWorkOnTheNet.text = getString(R.string.work_on_the_net_v5)
                binding.textViewWorkOnTheNetMoney.text = getString(R.string.work_on_the_net_v5_income)
                binding.textViewWorkOnTheNetHappiness.text = getString(R.string.work_on_the_net_v5_happiness)
            }
            is VideoEditingCourseState -> {
                binding.textViewWorkOnTheNet.text = getString(R.string.work_on_the_net_v4)
                binding.textViewWorkOnTheNetMoney.text = getString(R.string.work_on_the_net_v4_income)
                binding.textViewWorkOnTheNetHappiness.text = getString(R.string.work_on_the_net_v4_happiness)
            }
            is WebDesignCourseState -> {
                binding.textViewWorkOnTheNet.text = getString(R.string.work_on_the_net_v3)
                binding.textViewWorkOnTheNetMoney.text = getString(R.string.work_on_the_net_v3_income)
                binding.textViewWorkOnTheNetHappiness.text = getString(R.string.work_on_the_net_v3_happiness)
            }
            is OnlineWorkCourseState -> {
                binding.textViewWorkOnTheNet.text = getString(R.string.work_on_the_net_v2)
                binding.textViewWorkOnTheNetMoney.text = getString(R.string.work_on_the_net_v2_income)
                binding.textViewWorkOnTheNetHappiness.text = getString(R.string.work_on_the_net_v2_happiness)
            }
            is FriendsCourseState -> {
                binding.textViewWorkOnTheNet.text = getString(R.string.work_on_the_net_v1)
                binding.textViewWorkOnTheNetHappiness.text = getString(R.string.work_on_the_net_v1_happiness)
                binding.textViewWorkOnTheNetSatiety.text = getString(R.string.work_on_the_net_v1_satiety)
                binding.textViewWorkOnTheNetMoney.text = getString(R.string.work_on_the_net_v1_income)
            }
            else ->
                binding.textViewWorkOnTheNet.text = getString(R.string.work_on_the_net_v0)

        }
    }
}
