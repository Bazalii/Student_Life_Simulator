package android.clicker.school_live_simulator

open class OnlineWorkCourseState : FriendsCourseState () {
    override val price: Int = 100

    override fun buyNexCourse(courses: Player.Courses) {
        courses.computer_course = WebDesignCourseState()
    }

    override fun timerTickHandler(){

    }
    override fun timerEndHandler(){
        available_web_task.add(WebTask.PUBLIC_PR)
    }
}
