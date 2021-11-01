package android.clicker.school_live_simulator.Classes.AchievementsClasses.Interfaces

import java.util.concurrent.ThreadLocalRandom

/**
 * Marker interface
 *
 * Random Achievements - the type of achievements that a player gets with
 *                       some chance when performing certain actions
 */
interface RandomAchievements: Achievements {
    /**
     * Chance of certain achievement
     */
    val achievement_chance: Int

    /**
     * Function checks if the achievement got
     */
    fun achievementGetCheck(): Boolean {
        val RANDOM_DISPERSION = 10
        val RANDOM_MAX: Int = 100 * RANDOM_DISPERSION
        val RANDOM_MIN: Int = 1

        var random_result: Int = ThreadLocalRandom.current().nextInt(RANDOM_MIN, RANDOM_MAX) / RANDOM_DISPERSION
        return (random_result <= achievement_chance)
    }
}
