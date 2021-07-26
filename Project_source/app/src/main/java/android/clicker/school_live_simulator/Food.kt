package android.clicker.school_live_simulator

enum class Food(val satiety: Int, val happiness: Int, val cost: Int) {
    CRACKERS(25, +5, 10),
    DOSHIRAK(50, -10, 50),
    EATERY_FOOD(120, -15, 300),
    MCDONALDS(200, -20, 1000),
    PIZZA_AT_HOME(450, +5, 4000),
    RESTORANT_FOOD(800, +50, 10000)
}