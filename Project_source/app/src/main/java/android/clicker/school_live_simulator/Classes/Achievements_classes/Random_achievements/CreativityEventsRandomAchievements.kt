package android.clicker.school_live_simulator.Classes.Achievements_classes.Random_achievements

import android.clicker.school_live_simulator.Classes.Achievements_classes.Interfaces.RandomAchievements
import android.clicker.school_live_simulator.Game

/**
 * Random achievements related to creativity
 */
enum class CreativityEventsRandomAchievements(val achievement_name: String, val achievement_message: String): RandomAchievements {
    DRAW_ON_TOP_OF_OTHER_ART(achievement_name = Game.context_bundle.getTitle(""), achievement_message = Game.context_bundle.getTitle("")),
    MISTER_PROPER(achievement_name = Game.context_bundle.getTitle(""), achievement_message = Game.context_bundle.getTitle("")),
    IVANS_INTERNATIONAL(achievement_name = Game.context_bundle.getTitle(""), achievement_message = Game.context_bundle.getTitle("")),
    POEM_IN_SPOTLIGHT(achievement_name = Game.context_bundle.getTitle(""), achievement_message = Game.context_bundle.getTitle("")),
    SONG_IN_SPOTLIGHT(achievement_name = Game.context_bundle.getTitle(""), achievement_message = Game.context_bundle.getTitle(""))
}
