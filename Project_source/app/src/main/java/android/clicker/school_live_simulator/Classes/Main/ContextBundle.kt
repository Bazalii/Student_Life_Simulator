package android.clicker.school_live_simulator.Classes.Main

import android.clicker.school_live_simulator.Game
import android.clicker.school_live_simulator.R
import android.content.Context

class ContextBundle {

    /**
     * Link to application's context
     */
    lateinit var context: Context

    /**
     * Returns corresponding string from resources
     *
     * @param input Name of string in resources
     */
    fun getTitle(input: String): String {
        Game.setLocale(context.resources,context)
        return Game.context_bundle.context.resources.getString(Game.context_bundle.context.resources.getIdentifier(input, "string", context.getPackageName()))
    }

    /**
     * Returns corresponding number from resources
     *
     * @param input Name of number in resources
     */
    fun getNumber(input: String): Int {
        return Game.context_bundle.context.resources.getString(Game.context_bundle.context.resources.getIdentifier(input, "string", context.getPackageName())).toInt()
    }
}
