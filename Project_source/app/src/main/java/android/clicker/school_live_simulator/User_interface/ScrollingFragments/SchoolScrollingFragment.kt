package android.clicker.school_live_simulator.User_interface.ScrollingFragments

import android.clicker.school_live_simulator.Classes.Achievements_classes.Random_achievements.StudyEventsRandomAchievements
import android.clicker.school_live_simulator.Classes.Enum_classes.Studies
import android.clicker.school_live_simulator.Classes.GameDate.Timer
import android.clicker.school_live_simulator.Classes.NotEnoughMoneyException
import android.clicker.school_live_simulator.Game
import android.clicker.school_live_simulator.R
import android.clicker.school_live_simulator.User_interface.GameActivity
import android.clicker.school_live_simulator.databinding.FragmentSchoolScrollingBinding
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
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
            try {
                (activity as GameActivity).updateStats()
                binding.layoutSchoolGoToSchool.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.click))
                Game.game_date.end_signal_handlers[Studies.GO_TO_SCHOOL.name.lowercase()] =
                    Studies.GO_TO_SCHOOL::goToSchool
                Timer(Game.game_date.subscription_length).registerTimeHandler(Studies.GO_TO_SCHOOL.name.lowercase())
            } catch (exception: NotEnoughMoneyException){
                binding.layoutSchoolGoToSchool.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
                (activity as GameActivity).notEnoughMoneyAnim()
            }

        }

        binding.schoolBotat.setOnClickListener{
            try {
                Game.player.study(Studies.LEARN_YOURSELF)
                binding.layoutSchoolLearnYourself.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.click))
                Game.counters[Game.context_bundle.getTitle("school_learn_yourself")] =
                    (Game.counters[Game.context_bundle.getTitle("school_learn_yourself")] ?: 0) + 1
                (activity as GameActivity).updateStats()
                (activity as GameActivity).achieve(StudyEventsRandomAchievements.PAR_ABOUT_REPRODUCTIVE)
            } catch (exception: NotEnoughMoneyException){
                binding.layoutSchoolLearnYourself.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
                (activity as GameActivity).notEnoughMoneyAnim()
            }
        }

        binding.schoolBuyCheatbook.setOnClickListener{
            try {
                Game.player.study(Studies.BUY_CHEATBOOK)
                binding.layoutSchoolBuyCheatbook.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.click))
                Game.counters[Game.context_bundle.getTitle("school_buy_cheatbook")] =
                    (Game.counters[Game.context_bundle.getTitle("school_buy_cheatbook")] ?: 0) + 1
                (activity as GameActivity).updateStats()
                (activity as GameActivity).achieve(StudyEventsRandomAchievements.OLD_ANSWER_BOOK)
            } catch (exception: NotEnoughMoneyException){
                binding.layoutSchoolBuyCheatbook.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
                (activity as GameActivity).notEnoughMoneyAnim()
            }
        }

        binding.schoolLearnFromStudent.setOnClickListener{
            try {
                Game.player.study(Studies.LEARN_FROM_A_STUDENT)
                binding.layoutSchoolLearnFromStudent.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.click))
                Game.counters[Game.context_bundle.getTitle("school_learn_from_a_student")] =
                    (Game.counters[Game.context_bundle.getTitle("school_learn_from_a_student")] ?: 0) + 1
                (activity as GameActivity).updateStats()
                (activity as GameActivity).achieve(StudyEventsRandomAchievements.DRUNK_STUDENT)
            } catch (exception: NotEnoughMoneyException){
                binding.layoutSchoolLearnFromStudent.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
                (activity as GameActivity).notEnoughMoneyAnim()
            }
        }

        binding.schoolSignUpInAnOnlineSchool.setOnClickListener{
            try {
                (activity as GameActivity).updateStats()
                binding.layoutSchoolSignUpInAnOnlineSchool.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.click))
                Game.game_date.end_signal_handlers[Studies.SIGN_UP_IN_AN_ONLINE_SCHOOL.name.lowercase()] =
                    Studies.SIGN_UP_IN_AN_ONLINE_SCHOOL::signUpInOnlineSchool
                Timer(Game.game_date.subscription_length).registerTimeHandler(Studies.SIGN_UP_IN_AN_ONLINE_SCHOOL.name.lowercase())
                (activity as GameActivity).achieve(StudyEventsRandomAchievements.FALL_ASLEEP_AT_WEBINAR)
            } catch (exception: NotEnoughMoneyException){
                binding.layoutSchoolSignUpInAnOnlineSchool.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
                (activity as GameActivity).notEnoughMoneyAnim()
            }
        }

        binding.schoolHireAGoodTutor.setOnClickListener{
            try {
                Game.player.study(Studies.HIRE_A_GOOD_TUTOR)
                binding.layoutSchoolHireAGoodTutor.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.click))
                Game.counters[Game.context_bundle.getTitle("school_hire_a_good_tutor")] =
                    (Game.counters[Game.context_bundle.getTitle("school_hire_a_good_tutor")] ?: 0) + 1
                (activity as GameActivity).updateStats()
            } catch (exception: NotEnoughMoneyException){
                binding.layoutSchoolHireAGoodTutor.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
                (activity as GameActivity).notEnoughMoneyAnim()
            }
        }

        binding.schoolStudyWithUniTeacher.setOnClickListener{
            try {
                Game.player.study(Studies.STUDY_WITH_UNI_TEACHER)
                binding.layoutSchoolStudyWithUniTeacher.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.click))
                Game.counters[Game.context_bundle.getTitle("school_study_with_uni_teacher")] =
                    (Game.counters[Game.context_bundle.getTitle("school_study_with_uni_teacher")] ?: 0) + 1
                (activity as GameActivity).updateStats()
                (activity as GameActivity).achieve(StudyEventsRandomAchievements.STORIES_ABOUT_USSR)
            } catch (exception: NotEnoughMoneyException){
                binding.layoutSchoolStudyWithUniTeacher.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
                (activity as GameActivity).notEnoughMoneyAnim()
            }
        }

    }
}
