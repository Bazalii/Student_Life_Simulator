package android.clicker.school_live_simulator

import kotlinx.serialization.*


@Serializable
object NormalState : PlayerState() {
    /**
     * values will be balanced in the future, now they are default(=0)
     */
    @kotlinx.serialization.Transient
    override val reduce_school_performance_value: Int = -1

    @kotlinx.serialization.Transient
    override val reduce_happiness_value: Int = -3

    @kotlinx.serialization.Transient
    override val reduce_satiety_value: Int = -5
}
