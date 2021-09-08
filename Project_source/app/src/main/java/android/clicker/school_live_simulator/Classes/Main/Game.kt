package android.clicker.school_live_simulator


import android.clicker.school_live_simulator.Classes.Enum_classes.Entertainment
import android.clicker.school_live_simulator.Classes.Enum_classes.Studies
import android.clicker.school_live_simulator.Classes.GameDate.GameDate
import android.clicker.school_live_simulator.Classes.Main.ContextBundle
import android.clicker.school_live_simulator.Classes.Main.GameData
import android.content.Context
import android.content.res.Resources
import android.os.Build
import android.util.Log
import kotlinx.serialization.*
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json
import kotlinx.serialization.modules.SerializersModule
import kotlinx.serialization.modules.polymorphic
import kotlinx.serialization.modules.subclass
import java.io.*
import java.util.*


val module = SerializersModule {
    polymorphic(GameDifficultyState::class) {
        subclass(NormalMode::class)
        subclass(HardMode::class)
    }
    polymorphic(BicycleState::class) {
        subclass(NullBicycleState::class)
        subclass(UssrBicycleState::class)
        subclass(UsualBicycleState::class)
        subclass(MountainBicycleState::class)
    }
    polymorphic(GuitarState::class) {
        subclass(NullGuitarState::class)
        subclass(UssrGuitarState::class)
        subclass(UralGuitarState::class)
        subclass(YamahaGuitarState::class)
        subclass(FenderGuitarState::class)
        subclass(DoubleNeckGuitarState::class)
    }
    polymorphic(GuitarCourseState::class) {
        subclass(NullGuitarCourseState::class)
        subclass(YardGuitarCourseState::class)
        subclass(FirstSongCourseState::class)
        subclass(YardSongCourseState::class)
        subclass(MusicalSchoolCourseState::class)
        subclass(MusicalObservatoryCourseState::class)
    }
    polymorphic(ComputerState::class) {
        subclass(NullComputerState::class)
        subclass(PreviouslyUsedComputerState::class)
        subclass(OldComputerState::class)
        subclass(UsualComputerState::class)
        subclass(XiaomiMiNotebookState::class)
        subclass(MacbookState::class)
    }
    polymorphic(ComputerCourseState::class) {
        subclass(NullComputerCourseState::class)
        subclass(FriendsCourseState::class)
        subclass(OnlineWorkCourseState::class)
        subclass(WebDesignCourseState::class)
        subclass(VideoEditingCourseState::class)
        subclass(GameDevelopmentCourseState::class)
    }
    polymorphic(PlayerState::class) {
        subclass(NormalState::class)
        subclass(BadState::class)
        subclass(ExtremeState::class)
    }
}



@Serializable
object Game {
    var difficulty_state: GameDifficultyState = NormalMode

    lateinit var locale: String

    var isDefaultLanguage = true

    var counters: MutableMap<String, Int> = mutableMapOf()

    var player: Player = Player()

    lateinit var game_date: GameDate

//    lateinit var game_status: GameStatus
    @kotlinx.serialization.Transient
    var context_bundle: ContextBundle = ContextBundle()


    fun setLocale(resources: Resources, context: Context){
        val config = resources.configuration
        val lang = this.locale // your language code
        val locale = Locale(lang)
        Locale.setDefault(locale)
        config.setLocale(locale)

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N)
            context.createConfigurationContext(config)
        resources.updateConfiguration(config, resources.displayMetrics)
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
     * Init game_data with fields from object Game,
     * encode to JSON-format and write to file GameData.txt
     */
    fun save(path: File) {
        val format = Json {
            serializersModule = module
            encodeDefaults = true
            prettyPrint = true
        }
        val game_data = GameData(this.difficulty_state, this.counters, this.player, this.game_date)
        val game_data_to_json = format.encodeToString(game_data)
        Log.d("MyLog", game_data_to_json)
        File(path,"GameData.txt").writeText(game_data_to_json)
    }

    /**
     * Read fields of game_data from GameData.txt, decode from JSON-format and
     * fill Game's fields
     */
    fun load(path: File) {
        val format = Json { serializersModule = module }
        val game_data_text = File(path,"GameData.txt").readText()
        val game_data = format.decodeFromString<GameData>(game_data_text)


        this.difficulty_state = game_data.difficulty_state
        this.counters = game_data.counters
        this.player = game_data.player
        this.game_date = game_data.game_date


        this.game_date.end_signal_handlers[Studies.GO_TO_SCHOOL.name.lowercase()] =
            Studies.GO_TO_SCHOOL::goToSchool
        this.game_date.end_signal_handlers[Studies.SIGN_UP_IN_AN_ONLINE_SCHOOL.name.lowercase()] =
            Studies.SIGN_UP_IN_AN_ONLINE_SCHOOL::signUpInOnlineSchool

        this.game_date.end_signal_handlers[Entertainment.MAKE_A_YOUTUBE_VIDEO.name.lowercase()] =
            Entertainment.MAKE_A_YOUTUBE_VIDEO::makeYouTubeVideo
        this.game_date.end_signal_handlers[Entertainment.LISTEN_TO_THE_MUSIC.name.lowercase()] =
            Entertainment.LISTEN_TO_THE_MUSIC::listenToTheMusic
        this.game_date.end_signal_handlers[Entertainment.DO_SPORT.name.lowercase()] =
            Entertainment.DO_SPORT::doSport

        this.game_date.end_signal_handlers["computer_course"] =
            this.player.current_courses.computer_course::timerEndHandler
        this.game_date.end_signal_handlers["guitar_course"] =
            this.player.current_courses.guitar_course::timerEndHandler
    }
}
