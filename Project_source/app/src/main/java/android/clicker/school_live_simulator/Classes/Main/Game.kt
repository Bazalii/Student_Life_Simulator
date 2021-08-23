package android.clicker.school_live_simulator


import android.clicker.school_live_simulator.Classes.GameDate.GameDate
import android.clicker.school_live_simulator.Classes.Main.ContextBundle
import android.clicker.school_live_simulator.Classes.Main.GameData
import kotlinx.serialization.*
import kotlinx.serialization.json.Json
import java.io.File


@Serializable
object Game {
    private var difficulty_state: GameDifficultyState = NormalMode()

    var player: Player = Player()
//    game: Game
    var game_date: GameDate = GameDate()

//    lateinit var game_status: GameStatus
    var context_bundle: ContextBundle = ContextBundle()

    fun init() {
        TODO("Not yet implemented")
    }
    fun tick() {
        this.player.tick()
        this.game_date.tick()
    }

    fun checkDefeat(school_performance: Int, happiness: Int, satiety: Int) {
        TODO("Not yet implemented")
    }
    fun isActAvaliable(): Boolean {
        TODO("Not yet implemented")
    }


    /**
     * init game_data with fields from object Game,
     * encode to JSON-format and write to file GameData.txt
     */
    fun save() {
        val game_data = GameData(difficulty_state, player, game_date)
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
