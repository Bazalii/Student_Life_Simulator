package android.clicker.school_live_simulator

import android.clicker.school_live_simulator.Classes.GameDate.GameDate
import android.clicker.school_live_simulator.Classes.Main.ContextBundle
import android.clicker.school_live_simulator.User_interface.GameActivity
import android.content.Context

object Game {
    private var difficulty_state: GameDifficultyState = NormalMode()

    /**
     * Commented because that should be realised later
     */
//    private var save_handlers: ArrayList<function> = ArrayListOf()
//    private var load_handlers: ArrayList<function> = ArrayListOf()

    var player: Player = Player()
//    game: Game
    lateinit var game_date: GameDate
//    lateinit var game_status: GameStatus
    var context_bundle: ContextBundle = ContextBundle()

    fun init() {
        TODO("Not yet implemented")
    }
    fun tick() {
        this.player.tick()
    }

    fun checkDefeat(school_performance: Int, happiness: Int, satiety: Int) {
        TODO("Not yet implemented")
    }
    fun isActAvaliable(): Boolean {
        TODO("Not yet implemented")
    }

    /**
     * Commented because that should be realised later
      */
//    fun registerSaveHandler(handler: function) {
//        TODO("Not yet implemented")
//    }
//    fun registerLoadHandler(handler: function) {
//        TODO("Not yet implemented")
//    }



    fun save() {
        TODO("Not yet implemented")
    }
    fun load() {
        TODO("Not yet implemented")
    }
}
