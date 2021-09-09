package android.clicker.school_live_simulator

import kotlinx.serialization.Serializable

@Serializable
sealed class GameDifficultyState {
    protected abstract fun checkDefeat()
}
