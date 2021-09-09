package android.clicker.school_live_simulator


enum class Song(val money_diff: Int) {
    SINGLE_CHORD(Game.context_bundle.getNumber("work_play_guitar_v1_income")),
    GAZ_SECTOR(Game.context_bundle.getNumber("work_play_guitar_v2_income")),
    SMELLS_LIKE(Game.context_bundle.getNumber("work_play_guitar_v3_income")),
    JAZZ(Game.context_bundle.getNumber("work_play_guitar_v4_income")),
    BAXA(Game.context_bundle.getNumber("work_play_guitar_v5_income"))
}
