package android.clicker.school_live_simulator.Classes.EnumClasses

import android.clicker.school_live_simulator.Game

enum class Months(val title: String, val days: Int) {
    January(Game.context_bundle.getTitle("months_january"), 31 ),
    February(Game.context_bundle.getTitle("months_february"),28),
    March(Game.context_bundle.getTitle("months_march"),31),
    April(Game.context_bundle.getTitle("months_april"),30),
    May(Game.context_bundle.getTitle("months_may"),31),
    June(Game.context_bundle.getTitle("months_june"),30),
    July(Game.context_bundle.getTitle("months_july"),31),
    August(Game.context_bundle.getTitle("months_august"),31),
    September(Game.context_bundle.getTitle("months_september"),30),
    October(Game.context_bundle.getTitle("months_october"),31),
    November(Game.context_bundle.getTitle("months_november"),30),
    December(Game.context_bundle.getTitle("months_december"),31)
}
