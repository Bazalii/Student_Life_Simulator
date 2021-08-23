package android.clicker.school_live_simulator.Classes.Achievements_classes.Random_achievements

import android.clicker.school_live_simulator.Classes.Achievements_classes.Interfaces.RandomAchievements
import android.clicker.school_live_simulator.Game

/**
 * Random achievements related to creativity
 *
 * @param   achievement_name    name of achievement
 * @param   achievement_message achievement message
 * @param   achievement_chance  achievement chance (in %)
 */
enum class CreativityEventsRandomAchievements(val achievement_name: String, val achievement_message: String, override val achievement_chance: Int): RandomAchievements {
    DRAW_ON_TOP_OF_OTHER_ART(achievement_name = Game.context_bundle.getTitle("ach_draw_on_top_of_other_art_name"), achievement_message = Game.context_bundle.getTitle("ach_draw_on_top_of_other_art_text"), achievement_chance = Game.context_bundle.getNumber("ach_draw_on_top_of_other_art_chance")),
    MISTER_PROPER(achievement_name = Game.context_bundle.getTitle("ach_mister_proper_name"), achievement_message = Game.context_bundle.getTitle("ach_mister_proper_text"), achievement_chance = Game.context_bundle.getNumber("ach_mister_proper_chance")),
    IVANS_INTERNATIONAL(achievement_name = Game.context_bundle.getTitle("ach_ivans_international_name"), achievement_message = Game.context_bundle.getTitle("ach_ivans_international_text"), achievement_chance = Game.context_bundle.getNumber("ach_ivans_international_chance")),
    POEM_POSTED_BY_TEACHER(achievement_name = Game.context_bundle.getTitle("ach_poem_posted_by_teacher_name"), achievement_message = Game.context_bundle.getTitle("ach_poem_posted_by_teacher_text"), achievement_chance = Game.context_bundle.getNumber("ach_poem_posted_by_teacher_chance")),
    GIRLS_LIKE_THE_SONG(achievement_name = Game.context_bundle.getTitle("ach_girls_like_the_song_name"), achievement_message = Game.context_bundle.getTitle("ach_girls_like_the_song_text"), achievement_chance = Game.context_bundle.getNumber("ach_girls_like_the_song_chance"))
}
