package android.clicker.school_live_simulator.Classes.Enum_classes

import android.clicker.school_live_simulator.Classes.GameDate.Timer
import android.clicker.school_live_simulator.Game

enum class Studies(val school_performance: Int, val money_diff: Int) {
    GO_TO_SCHOOL(3, 0),
    LEARN_YOURSELF(50, -100),
    BUY_CHEATBOOK(100, -300),
    LEARN_FROM_A_STUDENT(250, -1000),
    SIGN_UP_IN_AN_ONLINE_SCHOOL(15, -10000),
    HIRE_A_GOOD_TUTOR(600, -15000),
    STUDY_WITH_UNI_TEACHER(1000, -25000);

    fun goToSchool() {
        Game.player.study(Studies.GO_TO_SCHOOL)
        Timer(Game.game_date.subscription_length).setEndSignalHandler(Studies.GO_TO_SCHOOL::goToSchool)
    }
    fun signUpInOnlineSchool() {
        Game.player.study(Studies.SIGN_UP_IN_AN_ONLINE_SCHOOL)
        Timer(Game.game_date.subscription_length).setEndSignalHandler(Studies.SIGN_UP_IN_AN_ONLINE_SCHOOL::signUpInOnlineSchool)
    }

}
