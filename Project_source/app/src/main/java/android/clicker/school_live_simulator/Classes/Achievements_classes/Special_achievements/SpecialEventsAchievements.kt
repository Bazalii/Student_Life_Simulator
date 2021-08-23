package android.clicker.school_live_simulator.Classes.Achievements_classes.Special_achievements

import android.clicker.school_live_simulator.Classes.Achievements_classes.Interfaces.SpecialAchievements
import android.clicker.school_live_simulator.Game

/**
 * Special Achievements related to player's special actions
 */
enum class SpecialEventsAchievements(override val achievement_name: String, override val achievement_message: String): SpecialAchievements {
    SPARTAK_WINNER(achievement_name = Game.context_bundle.getTitle("ach_spartak_winner_name"), achievement_message = Game.context_bundle.getTitle("ach_spartak_winner_text")),
    ZENIT_WINNER(achievement_name = Game.context_bundle.getTitle("ach_zenit_winner_name"), achievement_message = Game.context_bundle.getTitle("ach_zenit_winner_text")),
    JOIN_TO_WINNERS(achievement_name = Game.context_bundle.getTitle("ach_join_to_winners_name"), achievement_message = Game.context_bundle.getTitle("ach_join_to_winners_text")),
    JOIN_TO_LOSERS(achievement_name = Game.context_bundle.getTitle("ach_join_to_losers_name"), achievement_message = Game.context_bundle.getTitle("ach_join_to_losers_text")),
    MOMS_BUSINESSMAN(achievement_name = Game.context_bundle.getTitle("ach_moms_businessman_name"), achievement_message = Game.context_bundle.getTitle("ach_moms_businessman_text")),
    MOMS_NOT_BUSSINESSMAN(achievement_name = Game.context_bundle.getTitle("ach_moms_not_bussinessman_name"), achievement_message = Game.context_bundle.getTitle("ach_moms_not_bussinessman_text"))
}
