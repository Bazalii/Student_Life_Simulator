package android.clicker.school_live_simulator.Classes.Achievements_classes.Special_achievements

import android.clicker.school_live_simulator.Classes.Achievements_classes.Interfaces.SpecialAchievements
import android.clicker.school_live_simulator.Game

/**
 * Special Achievements related to player's special actions
 */
enum class SpecialEventsAchievements(val achievement_name: String, val achievement_message: String): SpecialAchievements {
    SPARTAK_WINNER(achievement_name = Game.context_bundle.getTitle(""), achievement_message = Game.context_bundle.getTitle("")),
    ZENIT_WINNER(achievement_name = Game.context_bundle.getTitle(""), achievement_message = Game.context_bundle.getTitle("")),
    JOIN_TO_WINNERS(achievement_name = Game.context_bundle.getTitle(""), achievement_message = Game.context_bundle.getTitle("")),
    JOIN_TO_LOSERS(achievement_name = Game.context_bundle.getTitle(""), achievement_message = Game.context_bundle.getTitle("")),
    MOMS_BUSINESSMAN(achievement_name = Game.context_bundle.getTitle(""), achievement_message = Game.context_bundle.getTitle("")),
    MOMS_NOT_BUSSINESSMAN(achievement_name = Game.context_bundle.getTitle(""), achievement_message = Game.context_bundle.getTitle(""))
}
