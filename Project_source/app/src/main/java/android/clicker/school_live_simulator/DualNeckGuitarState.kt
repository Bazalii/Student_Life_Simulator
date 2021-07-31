package android.clicker.school_live_simulator

class DualNeckGuitarState: FenderGuitarState() {
    override val price: Int = 150000

    init {

    }

    override fun changeState(bag: Player.Bag):
        Unit = throw UnsupportedOperationException("Operation not supported")
}
