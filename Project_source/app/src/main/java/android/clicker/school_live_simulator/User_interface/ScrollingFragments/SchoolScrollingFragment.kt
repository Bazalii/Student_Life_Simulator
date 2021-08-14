package android.clicker.school_live_simulator.User_interface.ScrollingFragments

import android.clicker.school_live_simulator.Classes.Enum_classes.Studies
import android.clicker.school_live_simulator.Classes.IncorrectValueException
import android.clicker.school_live_simulator.Food
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
                Game.player.study(Studies.GO_TO_SCHOOL)
                (activity as GameActivity).updateStats()
            }catch (exception: IncorrectValueException){
                binding.schoolGoToSchool.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
            }

        }

        binding.schoolBotat.setOnClickListener{
            try {
                Game.player.study(Studies.LEARN_YOURSELF)
                (activity as GameActivity).updateStats()
            }catch (exception: IncorrectValueException){
                binding.schoolBotat.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
            }
        }

        binding.schoolBuyCheatbook.setOnClickListener{
            try {
                Game.player.study(Studies.BUY_CHEATBOOK)
                (activity as GameActivity).updateStats()
            }catch (exception: IncorrectValueException){
                binding.schoolBuyCheatbook.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
            }
        }

        binding.schoolLearnFromStudent.setOnClickListener{
            try {
                Game.player.study(Studies.LEARN_FROM_A_STUDENT)
                (activity as GameActivity).updateStats()
            }catch (exception: IncorrectValueException){
                binding.schoolLearnFromStudent.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
            }
        }
        binding.schoolHireAGoodTutor.setOnClickListener{
            try {
                Game.player.study(Studies.HIRE_A_GOOD_TUTOR)
                (activity as GameActivity).updateStats()
            }catch (exception: IncorrectValueException){
                binding.schoolHireAGoodTutor.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
            }
        }

        binding.schoolSignUpInAnOnlineSchool.setOnClickListener{
            try {
                Game.player.study(Studies.SIGN_UP_IN_AN_ONLINE_SCHOOL)
                (activity as GameActivity).updateStats()
            }catch (exception: IncorrectValueException){
                binding.schoolSignUpInAnOnlineSchool.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
            }
        }

        binding.schoolStudyWithUniTeacher.setOnClickListener{
            try {
                Game.player.study(Studies.STUDY_WITH_UNI_TEACHER)
                (activity as GameActivity).updateStats()
            }catch (exception: IncorrectValueException){
                binding.schoolStudyWithUniTeacher.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.shake))
            }
        }

    }
}
