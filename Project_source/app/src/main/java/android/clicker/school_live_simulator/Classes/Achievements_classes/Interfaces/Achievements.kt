package android.clicker.school_live_simulator.Classes.Achievements_classes.Interfaces

import kotlinx.serialization.Serializable

/**
 * Marker interface
 *
 * All types of achievements
 */

interface Achievements {
    val achievement_name: String
    val achievement_message: String
}
