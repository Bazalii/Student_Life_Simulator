package android.clicker.school_live_simulator

import kotlinx.serialization.Serializable

@Serializable
open class NullGuitarState : GuitarState() {
    override val price: Int = 0

    override fun changeState(bag: Player.Bag) {
        bag.guitar = UssrGuitarState()
    }
}
