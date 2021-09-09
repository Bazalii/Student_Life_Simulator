package android.clicker.school_live_simulator.Classes.Main

import android.clicker.school_live_simulator.*
import android.clicker.school_live_simulator.Classes.GameDate.GameDate
import kotlinx.serialization.Serializable


/**
 * Data class that contains all fields for serialization
 */
@Serializable
data class GameData(
    var difficulty_state: GameDifficultyState,
    var counters: MutableMap<String, Int>,
    var player: Player,
    var game_date: GameDate,
)
