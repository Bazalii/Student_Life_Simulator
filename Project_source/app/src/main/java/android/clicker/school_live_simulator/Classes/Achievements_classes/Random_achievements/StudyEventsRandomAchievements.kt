package android.clicker.school_live_simulator.Classes.Achievements_classes.Random_achievements

import android.clicker.school_live_simulator.Classes.Achievements_classes.Interfaces.RandomAchievements
import android.clicker.school_live_simulator.Game

/**
 * Random achievements related to education
 */
enum class StudyEventsRandomAchievements(val achievement_name: String, val achievement_message: String): RandomAchievements {
    DRUNK_STUDENT(achievement_name = Game.context_bundle.getTitle("ach_drunk_student_name"), achievement_message = Game.context_bundle.getTitle("ach_drunk_student_text")),
    PAR_ABOUT_REPRODUCTIVE(achievement_name = Game.context_bundle.getTitle("ach_par_about_reproductive_name"), achievement_message = Game.context_bundle.getTitle("ach_par_about_reproductive_text")),
    OLD_ANSWER_BOOK(achievement_name = Game.context_bundle.getTitle("ach_old_answer_book_name"), achievement_message = Game.context_bundle.getTitle("ach_old_answer_book_text")),
    FALL_ASLEEP_AT_WEBINAR(achievement_name = Game.context_bundle.getTitle("ach_fall_asleep_at_webinar_name"), achievement_message = Game.context_bundle.getTitle("ach_fall_asleep_at_webinar_text")),
    STORIES_ABOUT_USSR(achievement_name = Game.context_bundle.getTitle("ach_stories_about_ussr_name"), achievement_message = Game.context_bundle.getTitle("ach_stories_about_ussr_text"))
}
