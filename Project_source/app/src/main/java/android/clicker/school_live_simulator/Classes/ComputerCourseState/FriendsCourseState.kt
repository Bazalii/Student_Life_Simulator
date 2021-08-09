package android.clicker.school_live_simulator

open class FriendsCourseState : NullComputerCourseState() {
    override val price: Int = 0

    override fun buyNextCourse(courses: Player.Courses) {
        courses.computer_course = OnlineWorkCourseState()
    }

    override fun timerTickHandler(){

    }
    override fun timerEndHandler(){
        available_web_tasks.add(WebTask.ACCOUNT_BOOST)
    }
}
