package android.clicker.school_live_simulator

import kotlinx.serialization.Serializable

@Serializable
abstract class GameDifficultyState {
    abstract protected fun checkDefeat()
}
