package android.clicker.school_live_simulator

import android.clicker.school_live_simulator.Classes.IsNotAvailableException

open class NullBicycleState : BicycleState() {
    override val price: Int = 0

    override fun changeState(bag: Player.Bag) {
        bag.bicycle = UssrBicycleState()
    }
}
