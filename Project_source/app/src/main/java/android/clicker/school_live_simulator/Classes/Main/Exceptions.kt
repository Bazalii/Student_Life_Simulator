package android.clicker.school_live_simulator.Classes

/**
 * Exception that is thrown when player hasn't enough
 * money to buy something
 */
class NotEnoughMoneyException(input_message: String) : Throwable(input_message) {

}

/**
 * Exception that is thrown when player can't buy something.
 * For example course when he didn't buy needed guitar or computer
 */
class IsNotAvailableException(input_message: String) : Throwable(input_message) {

}

