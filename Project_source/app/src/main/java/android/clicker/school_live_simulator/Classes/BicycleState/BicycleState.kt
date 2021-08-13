package android.clicker.school_live_simulator

/**
 * Class defines player's bicycle.
 * Player can do delivery with his bicycle.
 * The better bicycle the faster delivery is available.
 * Player can upgrade bicycle (change his bicycle state).
 */
abstract class BicycleState {
    /**
     * Bike price
     */
    abstract val price: Int

    /**
     * A list of available types of delivery.
     * These types are described in enumeration class Delivery.
     */
    protected val available_delivery: ArrayList<Delivery> = arrayListOf<Delivery>()

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
    fun isAvailable(delivery: Delivery): Boolean {
        return delivery in available_delivery
    }
}
