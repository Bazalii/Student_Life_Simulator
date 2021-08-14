package android.clicker.school_live_simulator

open class UssrBicycleState : BicycleState() {
    override val price = 2000

    /**
     * Use init block to execute method .add during the initialization of a class instance.
     * This way list available_delivery is created in abstract class and
     * subclasses just add new properties in order of bicycles improvement without
     * overriding the whole list in every subclass.
     */

    override val available_delivery  = arrayListOf<Delivery>(Delivery.SLOW_DELIVERY)


    override fun changeState(bag: Player.Bag) {
        bag.bicycle = UsualBicycleState()
    }

}
