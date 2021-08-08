package android.clicker.school_live_simulator

open class NullComputerCourseState : ComputerCourseState() {
    override val price: Int = 0

    override fun buyNexCourse(courses: Player.Courses) {
        courses.computer_course = FriendsCourseState()
    }

    override fun timerTickHandler(){

    }
    override fun timerEndHandler(){

    }
}
