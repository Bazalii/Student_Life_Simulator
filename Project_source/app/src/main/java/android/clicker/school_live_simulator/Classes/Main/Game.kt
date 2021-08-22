package android.clicker.school_live_simulator

import android.clicker.school_live_simulator.User_interface.GameActivity
import android.clicker.school_live_simulator.Classes.Main.GameData
import kotlinx.serialization.*
import kotlinx.serialization.json.Json
import java.io.File

object Game {
    private var difficulty_state: GameDifficultyState = NormalMode()

    var player: Player = Player()
//    lateinit var game_date: GameDate
//    lateinit var game_status: GameStatus


    fun init() {
        TODO("Not yet implemented")
    }
    fun tick() {
        //TODO("Not yet implemented")
        player.tick()
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



    /**
     * init game_data with fields from object Game,
     * encode to JSON-format and write to file GameData.txt
     */
    fun save() {
        val game_data = GameData(difficulty_state, player)//, game_date, game_status)
        val game_data_to_json = Json.encodeToString(game_data)
        File("GameData.txt").writeText(game_data_to_json)
    }

    /**
     * read fields of game_data from GameData.txt, decode from JSON-format and
     * fill Game's fields
     */
    fun load(): Game {
        val game_data_text = File("GameData.txt").readText()
        val game_data = Json.decodeFromString<GameData>(game_data_text)
        Game.difficulty_state = game_data.difficulty_state
        Game.player = game_data.player
        //Game.game_date = game_data.game_date
        //Game.game_status = game_data.game_status
        return Game
    }
}
