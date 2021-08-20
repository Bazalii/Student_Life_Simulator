package android.clicker.school_live_simulator

enum class Food(val satiety: Int, val happiness: Int, val money_diff: Int) {
    CRACKERS(Game.context_bundle.getNumber("crackers_satiety"),Game.context_bundle.getNumber("crackers_happiness"),Game.context_bundle.getNumber("crackers_money")),
    DOSHIRAK(Game.context_bundle.getNumber("doshirack_satiety"),Game.context_bundle.getNumber("doshirack_happiness"),Game.context_bundle.getNumber("doshirack_money")),
    EATERY_FOOD(Game.context_bundle.getNumber("eatery_food_satiety"),Game.context_bundle.getNumber("eatery_food_happiness"),Game.context_bundle.getNumber("eatery_food_money")),
    MCDONALDS(Game.context_bundle.getNumber("mcdonalds_satiety"),Game.context_bundle.getNumber("mcdonalds_happiness"),Game.context_bundle.getNumber("mcdonalds_money")),
    PIZZA_AT_HOME(Game.context_bundle.getNumber("pizza_at_home_satiety"),Game.context_bundle.getNumber("pizza_at_home_happiness"),Game.context_bundle.getNumber("pizza_at_home_money")),
    RESTORANT_FOOD(Game.context_bundle.getNumber("restaurant_food_satiety"),Game.context_bundle.getNumber("restaurant_food_happiness"),Game.context_bundle.getNumber("restaurant_food_money"))
}
