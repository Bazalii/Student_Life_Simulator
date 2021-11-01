package android.clicker.school_live_simulator.Classes.AchievementsClasses.PurchaseAchievements

import android.clicker.school_live_simulator.Classes.AchievementsClasses.Interfaces.PurchaseAchievements
import android.clicker.school_live_simulator.Game

/**
 * Purchase Achievements related to the purchase of a computer
 */
enum class ComputerEventsAchievements(
    override val achievement_name: String,
    override val achievement_message: String
) : PurchaseAchievements {
    PREVIOUSLY_USED_COMPUTER(
        achievement_name = Game.context_bundle.getTitle("ach_previously_used_computer_name"),
        achievement_message = Game.context_bundle.getTitle("ach_previously_used_computer_text")
    ),
    XIAOMI_MI_NOTEBOOK(
        achievement_name = Game.context_bundle.getTitle("ach_xiaomi_mi_notebook_name"),
        achievement_message = Game.context_bundle.getTitle("ach_xiaomi_mi_notebook_text")
    ),
    MACBOOK(
        achievement_name = Game.context_bundle.getTitle("ach_macbook_name"),
        achievement_message = Game.context_bundle.getTitle("ach_macbook_text")
    )
}
