package android.clicker.school_live_simulator

open class FriendsCourseState : NullComputerCourseState() {
    override val price: Int = 0

    override val course_length: Int = 30

    override fun buyNextCourse(courses: Player.Courses) {
        courses.computer_course = OnlineWorkCourseState()
    }

    override fun timerTickHandler(){

    }
    override fun timerEndHandler(){
        this.best_web_task = WebTask.ACCOUNT_BOOST
    }
}
