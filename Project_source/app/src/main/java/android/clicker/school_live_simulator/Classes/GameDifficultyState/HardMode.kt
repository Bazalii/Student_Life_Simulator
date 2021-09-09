package android.clicker.school_live_simulator

import kotlinx.serialization.Serializable

@Serializable
object HardMode : GameDifficultyState() {
    override fun checkDefeat() {
        TODO("Not yet implemented")
    }
}
