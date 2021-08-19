package android.clicker.school_live_simulator.Classes.Enum_classes

import android.clicker.school_live_simulator.Classes.GameDate.Timer
import android.clicker.school_live_simulator.Game
import android.clicker.school_live_simulator.R
import android.util.Log

enum class Entertainment(val happiness: Int, val money_diff: Int) {
    DRAW_ON_DESK(30, 0),
    DRAW_GRAFFITIES(50, money_diff = Game.context_bundle.getTitle("test_number")),
    WRITE_A_POEM(70, 0),
    MAKE_SOMETHING_HANDMADE(150, -500),
    COVER_A_SONG(150, 0),
    WRITE_A_SONG(100, 3000),
    STREAM(-100, 5000),
    MAKE_A_YOUTUBE_VIDEO(-50, 10000),

    DO_NOTHING(50, 0),
    GO_CYCLING(100, 0),
    LISTEN_TO_THE_MUSIC(10, -169),
    DONATE_AND_PLAY_COMPUTER(300, -1000),
    GO_TO_THE_SHOPPING_MALL(500, -10000),
    WALK_WITH_YOUR_GIRLFRIEND(800, -20000),

    READ_A_BOOK(30, 0),
    HELP_YOUNGSTERS_WITH_HOMEWORK(50, 0),
    DO_SPORT(100, -1500),
    PLAY_GUITAR(150, -5000),
    GO_TO_THE_THEATRE(300, -4000),
    GO_TO_THE_CONCERT(700, -10000),

    KICK_A_TRASH_CAN(70, 0),
    INTIMIDATE_YOUNGSTERS(100, 150),
    UPLOAD_VIRUS(250, 0),
    USE_CHAT_ROULETTE(450, -5000),
    HAVE_A_PARTY(600, -10000),
    GO_TO_THE_CLUB(1000, -20000);

    fun listenToTheMusic() {
        Game.player.entertain(Entertainment.LISTEN_TO_THE_MUSIC)
        Timer(Game.game_date.subscription_length).setEndSignalHandler(Entertainment.LISTEN_TO_THE_MUSIC::listenToTheMusic)
    }
    fun makeYouTubeVideo() {
        Game.player.entertain(Entertainment.MAKE_A_YOUTUBE_VIDEO)
        Timer(Game.game_date.subscription_length).setEndSignalHandler(Entertainment.MAKE_A_YOUTUBE_VIDEO::makeYouTubeVideo)
    }
    fun doSport() {
        Game.player.entertain(Entertainment.DO_SPORT)
        Timer(Game.game_date.subscription_length).setEndSignalHandler(Entertainment.DO_SPORT::doSport)
    }
}
