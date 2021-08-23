package android.clicker.school_live_simulator.Classes.Achievements_classes.Random_achievements

import android.clicker.school_live_simulator.Classes.Achievements_classes.Interfaces.RandomAchievements
import android.clicker.school_live_simulator.Game

/**
 * Random song-related achievements
 *
 * @param   achievement_name    name of achievement
 * @param   achievement_message achievement message
 * @param   achievement_chance  achievement chance (in %)
 */
enum class SongEventsRandomAchievements(val achievement_name: String, val achievement_message: String, override val achievement_chance: Int): RandomAchievements {
    WRONG_CHORDS(achievement_name = Game.context_bundle.getTitle("ach_wrong_chords_name"), achievement_message = Game.context_bundle.getTitle("ach_wrong_chords_text"), achievement_chance = Game.context_bundle.getNumber("ach_wrong_chords_chance")),
    COMPANY_AROUND(achievement_name = Game.context_bundle.getTitle("ach_company_around_name"), achievement_message = Game.context_bundle.getTitle("ach_company_around_text"), achievement_chance = Game.context_bundle.getNumber("ach_company_around_chance"))
}
