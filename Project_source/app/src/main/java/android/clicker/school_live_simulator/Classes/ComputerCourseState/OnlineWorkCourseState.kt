package android.clicker.school_live_simulator

open class OnlineWorkCourseState : FriendsCourseState () {
    override val price: Int = 100

    override var best_web_task: WebTask? = null

    override fun buyNextCourse(courses: Player.Courses) {
        courses.computer_course = WebDesignCourseState()
    }

    override fun timerTickHandler(){

    }
    override fun timerEndHandler(){
        this.best_web_task = WebTask.PUBLIC_PR
    }
}
