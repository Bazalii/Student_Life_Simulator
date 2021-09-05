package android.clicker.school_live_simulator.Classes.Enum_classes

import android.clicker.school_live_simulator.Classes.GameDate.Timer
import android.clicker.school_live_simulator.Classes.NotEnoughMoneyException
import android.clicker.school_live_simulator.Game


enum class Entertainment(val happiness: Int, val money_diff: Int) {
    DRAW_ON_DESK(
        Game.context_bundle.getNumber("fun_draw_on_desks_happiness"),
        Game.context_bundle.getNumber("fun_draw_on_desks_price")
    ),
    DRAW_GRAFFITIES(
        Game.context_bundle.getNumber("fun_draw_graffities_happiness"),
        Game.context_bundle.getNumber("fun_draw_graffities_price")
    ),
    WRITE_A_POEM(
        Game.context_bundle.getNumber("fun_write_a_poem_happiness"),
        Game.context_bundle.getNumber("fun_write_a_poem_price")
    ),
    MAKE_SOMETHING_HANDMADE(
        Game.context_bundle.getNumber("fun_make_something_handmade_happiness"),
        Game.context_bundle.getNumber("fun_make_something_handmade_price")
    ),
    COVER_A_SONG(
        Game.context_bundle.getNumber("fun_cover_a_song_happiness"),
        Game.context_bundle.getNumber("fun_cover_a_song_price")
    ),
    WRITE_A_SONG(
        Game.context_bundle.getNumber("fun_write_a_song_happiness"),
        Game.context_bundle.getNumber("fun_write_a_song_price")
    ),
    STREAM(
        Game.context_bundle.getNumber("fun_stream_happiness"),
        Game.context_bundle.getNumber("fun_stream_price")
    ),
    MAKE_A_YOUTUBE_VIDEO(
        Game.context_bundle.getNumber("fun_make_a_youtube_video_happiness"),
        Game.context_bundle.getNumber("fun_make_a_youtube_video_price")
    ),

    DO_NOTHING(
        Game.context_bundle.getNumber("fun_do_nothing_happiness"),
        Game.context_bundle.getNumber("fun_do_nothing_price")
    ),
    GO_CYCLING(
        Game.context_bundle.getNumber("fun_go_cycling_happiness"),
        Game.context_bundle.getNumber("fun_go_cycling_price")
    ),
    LISTEN_TO_THE_MUSIC(
        Game.context_bundle.getNumber("fun_listen_to_the_music_happiness"),
        Game.context_bundle.getNumber("fun_listen_to_the_music_price")
    ),
    DONATE_AND_PLAY_COMPUTER(
        Game.context_bundle.getNumber("fun_donate_and_play_computer_happiness"),
        Game.context_bundle.getNumber("fun_donate_and_play_computer_price")
    ),
    GO_TO_THE_SHOPPING_MALL(
        Game.context_bundle.getNumber("fun_go_to_the_shopping_mall_happiness"),
        Game.context_bundle.getNumber("fun_go_to_the_shopping_mall_price")
    ),
    WALK_WITH_YOUR_GIRLFRIEND(
        Game.context_bundle.getNumber("fun_walk_with_your_girlfriend_happiness"),
        Game.context_bundle.getNumber("fun_walk_with_your_girlfriend_price")
    ),

    READ_A_BOOK(
        Game.context_bundle.getNumber("fun_read_a_book_happiness"),
        Game.context_bundle.getNumber("fun_read_a_book_price")
    ),
    HELP_YOUNGSTERS_WITH_HOMEWORK(
        Game.context_bundle.getNumber("fun_help_youngsters_with_homework_happiness"),
        Game.context_bundle.getNumber("fun_help_youngsters_with_homework_price")
    ),
    DO_SPORT(
        Game.context_bundle.getNumber("fun_do_sport_happiness"),
        Game.context_bundle.getNumber("fun_do_sport_price")
    ),
    PLAY_GUITAR(
        Game.context_bundle.getNumber("fun_play_guitar_happiness"),
        Game.context_bundle.getNumber("fun_play_guitar_price")
    ),
    GO_TO_THE_THEATRE(
        Game.context_bundle.getNumber("fun_go_to_the_theatre_happiness"),
        Game.context_bundle.getNumber("fun_go_to_the_theatre_price")
    ),
    GO_TO_THE_CONCERT(
        Game.context_bundle.getNumber("fun_go_to_the_concert_happiness"),
        Game.context_bundle.getNumber("fun_go_to_the_concert_price")
    ),

    KICK_A_TRASH_CAN(
        Game.context_bundle.getNumber("fun_kick_a_trash_can_happiness"),
        Game.context_bundle.getNumber("fun_kick_a_trash_can_price")
    ),
    INTIMIDATE_YOUNGSTERS(
        Game.context_bundle.getNumber("fun_intimidate_youngsters_happiness"),
        Game.context_bundle.getNumber("fun_intimidate_youngsters_price")
    ),
    UPLOAD_VIRUS(
        Game.context_bundle.getNumber("fun_upload_virus_happiness"),
        Game.context_bundle.getNumber("fun_upload_virus_price")
    ),
    USE_CHAT_ROULETTE(
        Game.context_bundle.getNumber("fun_use_chat_roulette_happiness"),
        Game.context_bundle.getNumber("fun_use_chat_roulette_price")
    ),
    HAVE_A_PARTY(
        Game.context_bundle.getNumber("fun_have_a_party_happiness"),
        Game.context_bundle.getNumber("fun_have_a_party_price")
    ),
    GO_TO_THE_CLUB(
        Game.context_bundle.getNumber("fun_go_to_the_club_happiness"),
        Game.context_bundle.getNumber("fun_go_to_the_club_price")
    );

    fun listenToTheMusic() {
        try {
            Game.player.entertain(LISTEN_TO_THE_MUSIC)
            Timer(Game.game_date.subscription_length).setEndSignalHandler(
                LISTEN_TO_THE_MUSIC.name.lowercase(),
                LISTEN_TO_THE_MUSIC::listenToTheMusic
            )
        } catch (exception: NotEnoughMoneyException){

        }
    }
    fun makeYouTubeVideo() {
        try {
            Game.player.entertain(MAKE_A_YOUTUBE_VIDEO)
            Timer(Game.game_date.subscription_length).setEndSignalHandler(
                MAKE_A_YOUTUBE_VIDEO.name.lowercase(),
                MAKE_A_YOUTUBE_VIDEO::makeYouTubeVideo
            )
        } catch (exception: NotEnoughMoneyException){

        }
    }
    fun doSport() {
        try {
            Game.player.entertain(DO_SPORT)
            Timer(Game.game_date.subscription_length).setEndSignalHandler(
                DO_SPORT.name.lowercase(),
                DO_SPORT::doSport
            )
        } catch (exception: NotEnoughMoneyException){

        }
    }
}
