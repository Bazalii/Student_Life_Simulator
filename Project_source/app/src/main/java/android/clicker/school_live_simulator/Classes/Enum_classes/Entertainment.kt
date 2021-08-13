package android.clicker.school_live_simulator.Classes.Enum_classes

enum class Entertainment(val happiness: Int, val money: Int) {
    DRAW_ON_DESK(3, 0),
    DRAW_GRAFFITIES(5, 0),
    WRITE_A_POEM(7, 0),
    MAKE_SOMETHING_HANDMADE(15, -500),
    COVER_A_SONG(15, 0),
    WRITE_A_SONG(10, 3000),
    STREAM(-10, 5000),
    MAKE_A_YOUTUBE_VIDEO(-5, 10000), //TODO monthly payment

    DO_NOTHING(5, 0),
    GO_CYCLING(10, 0),
    LISTEN_TO_THE_MUSIC(1, -169),//TODO everyday happiness and monthly payment
    DONATE_AND_PLAY_COMPUTER(30, -1000),
    GO_TO_THE_SHOPPING_MALL(50, -10000),
    WALK_WITH_YOUR_GIRLFRIEND(80, -20000),

    READ_A_BOOK(3, 0),
    HELP_YOUNGSTERS_WITH_HOMEWORK(5, 0),
    DO_SPORT(10, -1500),//TODO monthly payment
    PLAY_GUITAR(15, -5000),
    GO_TO_THE_THEATRE(30, -4000),
    GO_TO_THE_CONCERT(70, -10000),

    KICK_A_TRASH_CAN(7, 0),
    INTIMIDATE_YOUNGSTERS(10, 150),
    UPLOAD_VIRUS(25, 0),
    USE_CHAT_ROULETTE(45, -5000),
    HAVE_A_PARTY(60, 10000),
    GO_TO_THE_CLUB(100, -20000)
}
