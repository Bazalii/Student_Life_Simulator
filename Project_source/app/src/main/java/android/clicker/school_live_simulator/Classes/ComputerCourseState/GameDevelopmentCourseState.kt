package android.clicker.school_live_simulator

open class GameDevelopmentCourseState : VideoEditingCourseState() {
    override val price: Int = 2700


    override fun buyNexCourse(courses: Player.Courses) {
        Unit = throw UnsupportedOperationException("Operation not supported")
    }

    override fun timerTickHandler(){

    }
    override fun timerEndHandler(){
        available_web_task.add(WebTask.MAKE_A_GAME)
    }
}
