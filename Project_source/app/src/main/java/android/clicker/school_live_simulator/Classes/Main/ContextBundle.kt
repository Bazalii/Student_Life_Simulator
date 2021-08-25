package android.clicker.school_live_simulator.Classes.Main

import android.clicker.school_live_simulator.Game
import android.clicker.school_live_simulator.R
import android.content.Context

class ContextBundle {
    lateinit var context: Context

    fun getTitle(input: String): String {
        Game.setLocale(context.resources,context)
        return Game.context_bundle.context.resources.getString(Game.context_bundle.context.resources.getIdentifier(input, "string", context.getPackageName()))
    }

    fun getNumber(input: String): Int {
        return Game.context_bundle.context.resources.getString(Game.context_bundle.context.resources.getIdentifier(input, "string", context.getPackageName())).toInt()
    }
}
