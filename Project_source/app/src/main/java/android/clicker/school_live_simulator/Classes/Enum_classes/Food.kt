package android.clicker.school_live_simulator

enum class Food(val satiety: Int, val happiness: Int, val money_diff: Int) {
    CRACKERS(25, 50, -10),
    DOSHIRAK(50, -100, -50),
    EATERY_FOOD(120, -150, -300),
    MCDONALDS(200, -200, -1000),
    PIZZA_AT_HOME(450, 50, -4000),
    RESTORANT_FOOD(800, 500, -10000)
}
