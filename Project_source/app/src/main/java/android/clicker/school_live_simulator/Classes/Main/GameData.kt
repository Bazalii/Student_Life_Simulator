package android.clicker.school_live_simulator.Classes.Main

import android.clicker.school_live_simulator.*
import android.clicker.school_live_simulator.Classes.GameDate.GameDate
import kotlinx.serialization.Serializable

@Serializable
/**
 * data class whose instances help to serialize data from Game object
 */
data class GameData(var difficulty_state: GameDifficultyState, var player: Player, var game_date: GameDate)
