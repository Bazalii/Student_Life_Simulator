package android.clicker.school_live_simulator.Classes.Achievements_classes.Random_achievements

import android.clicker.school_live_simulator.Classes.Achievements_classes.Interfaces.RandomAchievements
import android.clicker.school_live_simulator.Game

/**
 * Random food-related achievements
 */
enum class FoodEventsRandomAchievements(val achievement_name: String, val achievement_message: String): RandomAchievements {
    TWO_SPICES(achievement_name = Game.context_bundle.getTitle("ach_two_spices_name"), achievement_message = Game.context_bundle.getTitle("ach_two_spices_text")),
    POISONING_OF_EATERY_FOOD(achievement_name = Game.context_bundle.getTitle("ach_poisoning_of_eatery_food_name"), achievement_message = Game.context_bundle.getTitle("ach_poisoning_of_eatery_food_text"))
}
