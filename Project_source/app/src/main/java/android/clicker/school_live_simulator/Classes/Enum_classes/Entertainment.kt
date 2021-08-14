package android.clicker.school_live_simulator.Classes.Enum_classes

enum class Entertainment(val happiness: Int, val money_diff: Int) {
    DRAW_ON_DESK(30, 0),
    DRAW_GRAFFITIES(50, 0),
    WRITE_A_POEM(70, 0),
    MAKE_SOMETHING_HANDMADE(150, -500),
    COVER_A_SONG(150, 0),
    WRITE_A_SONG(100, 3000),
    STREAM(-100, 5000),
    MAKE_A_YOUTUBE_VIDEO(-50, 10000), //TODO monthly payment

    DO_NOTHING(50, 0),
    GO_CYCLING(100, 0),
    LISTEN_TO_THE_MUSIC(10, -169),//TODO everyday happiness and monthly payment
    DONATE_AND_PLAY_COMPUTER(300, -1000),
    GO_TO_THE_SHOPPING_MALL(500, -10000),
    WALK_WITH_YOUR_GIRLFRIEND(800, -20000),

    READ_A_BOOK(30, 0),
    HELP_YOUNGSTERS_WITH_HOMEWORK(50, 0),
    DO_SPORT(100, -1500),//TODO monthly payment
    PLAY_GUITAR(150, -5000),
    GO_TO_THE_THEATRE(300, -4000),
    GO_TO_THE_CONCERT(700, -10000),

    KICK_A_TRASH_CAN(70, 0),
    INTIMIDATE_YOUNGSTERS(100, 150),
    UPLOAD_VIRUS(250, 0),
    USE_CHAT_ROULETTE(450, -5000),
    HAVE_A_PARTY(600, -10000),
    GO_TO_THE_CLUB(1000, -20000)
}
