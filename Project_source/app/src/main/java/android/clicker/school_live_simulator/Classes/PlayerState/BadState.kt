package android.clicker.school_live_simulator

import kotlinx.serialization.Serializable

@Serializable
object BadState : PlayerState() {
    /**
     * values will be balanced in the future, now they are default(=0)
     */
    @kotlinx.serialization.Transient
    override val reduce_school_performance_value: Int = 0

    @kotlinx.serialization.Transient
    override val reduce_happiness_value: Int = 0

    @kotlinx.serialization.Transient
    override val reduce_satiety_value: Int = 0
}
