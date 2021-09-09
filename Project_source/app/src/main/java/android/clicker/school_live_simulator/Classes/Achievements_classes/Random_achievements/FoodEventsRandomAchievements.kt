package android.clicker.school_live_simulator.Classes.Achievements_classes.Random_achievements

import android.clicker.school_live_simulator.Classes.Achievements_classes.Interfaces.RandomAchievements
import android.clicker.school_live_simulator.Game

/**
 * Random food-related achievements
 *
 * @param   achievement_name    name of achievement
 * @param   achievement_message achievement message
 * @param   achievement_chance  achievement chance (in %)
 */
enum class FoodEventsRandomAchievements(
    override val achievement_name: String,
    override val achievement_message: String,
    override val achievement_chance: Int
) : RandomAchievements {
    TWO_SPICES(
        achievement_name = Game.context_bundle.getTitle("ach_two_spices_name"),
        achievement_message = Game.context_bundle.getTitle("ach_two_spices_text"),
        achievement_chance = Game.context_bundle.getNumber("ach_two_spices_chance")
    ),
    POISONING_OF_EATERY_FOOD(
        achievement_name = Game.context_bundle.getTitle("ach_poisoning_of_eatery_food_name"),
        achievement_message = Game.context_bundle.getTitle("ach_poisoning_of_eatery_food_text"),
        achievement_chance = Game.context_bundle.getNumber("ach_poisoning_of_eatery_food_chance")
    )
}
