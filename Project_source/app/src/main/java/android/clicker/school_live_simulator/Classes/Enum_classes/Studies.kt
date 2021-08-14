package android.clicker.school_live_simulator.Classes.Enum_classes

enum class Studies(val school_performance: Int, val money_diff: Int) {
    GO_TO_SCHOOL(3, 0),//TODO everyday school_performance
    LEARN_YOURSELF(50, -100),
    BUY_CHEATBOOK(100, -300),
    LEARN_FROM_A_STUDENT(250, -1000),
    SIGN_UP_IN_AN_ONLINE_SCHOOL(15, -10000),//TODO monthly payment and everyday school_performance
    HIRE_A_GOOD_TUTOR(600, -15000),
    STUDY_WITH_UNI_TEACHER(1000, -25000)
}
