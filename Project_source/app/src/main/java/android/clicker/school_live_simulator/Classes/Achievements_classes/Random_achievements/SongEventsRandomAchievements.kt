package android.clicker.school_live_simulator.Classes.Achievements_classes.Random_achievements

import android.clicker.school_live_simulator.Classes.Achievements_classes.Interfaces.RandomAchievements
import android.clicker.school_live_simulator.Game

/**
 * Random song-related achievements
 */
enum class SongEventsRandomAchievements(val achievement_name: String, val achievement_message: String): RandomAchievements {
    WRONG_CHORDS(achievement_name = Game.context_bundle.getTitle(""), achievement_message = Game.context_bundle.getTitle("")),
    IN_SPOTLIGHT(achievement_name = Game.context_bundle.getTitle(""), achievement_message = Game.context_bundle.getTitle(""))
}
