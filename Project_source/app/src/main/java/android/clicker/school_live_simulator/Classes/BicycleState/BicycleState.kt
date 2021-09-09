package android.clicker.school_live_simulator

import android.clicker.school_live_simulator.Classes.IsNotAvailableException
import kotlinx.serialization.*
import kotlinx.serialization.json.*
import kotlinx.serialization.modules.*

/**
 * Class defines player's bicycle.
 * Player can do delivery with his bicycle.
 * The better bicycle the faster delivery is available.
 * Player can upgrade bicycle (change his bicycle state).
 */



@Serializable
abstract class BicycleState {
    /**
     * Bike price
     */
    abstract val price: Int

    /**
     * A list of available types of delivery.
     * These types are described in enumeration class Delivery.
     */
    abstract val best_delivery: Delivery?

    /**
     * Upgrades bicycle.
     * @param bag player inventory.
     */
    abstract fun changeState(bag: Player.Bag)

    /**
     * Shows that the delivery can be performed.
     * @param  delivery Element of enum Delivery which describes certain type of delivery.
     * @return true if a player can do chosen type of delivery.
     */
    fun BestDelivery(): Delivery {
        return best_delivery ?: throw IsNotAvailableException("delivery is not available!")
    }
}
