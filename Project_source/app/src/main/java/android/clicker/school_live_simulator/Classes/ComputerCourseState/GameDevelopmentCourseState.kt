package android.clicker.school_live_simulator

open class GameDevelopmentCourseState : VideoEditingCourseState() {
    override val price: Int = 2700

    override var best_web_task: WebTask? = null

    override fun buyNextCourse(courses: Player.Courses) {
//        Unit = throw UnsupportedOperationException("Operation not supported")
    }

    override fun timerTickHandler(){

    }
    override fun timerEndHandler(){
        this.best_web_task = WebTask.MAKE_A_GAME
    }
}
