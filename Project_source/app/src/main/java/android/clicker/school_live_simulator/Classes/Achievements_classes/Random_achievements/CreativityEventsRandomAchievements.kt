package android.clicker.school_live_simulator.Classes.Achievements_classes.Random_achievements

import android.clicker.school_live_simulator.Classes.Achievements_classes.Interfaces.RandomAchievements
import android.clicker.school_live_simulator.Game

/**
 * Random achievements related to creativity
 */
enum class CreativityEventsRandomAchievements(val achievement_name: String, val achievement_message: String): RandomAchievements {
    DRAW_ON_TOP_OF_OTHER_ART(achievement_name = Game.context_bundle.getTitle("ach_draw_on_top_of_other_art_name"), achievement_message = Game.context_bundle.getTitle("ach_draw_on_top_of_other_art_text")),
    MISTER_PROPER(achievement_name = Game.context_bundle.getTitle("ach_mister_proper_name"), achievement_message = Game.context_bundle.getTitle("ach_mister_proper_text")),
    IVANS_INTERNATIONAL(achievement_name = Game.context_bundle.getTitle("ach_ivans_international_name"), achievement_message = Game.context_bundle.getTitle("ach_ivans_international_text")),
    POEM_IN_SPOTLIGHT(achievement_name = Game.context_bundle.getTitle("ach_poem_in_spotlight_name"), achievement_message = Game.context_bundle.getTitle("ach_poem_in_spotlight_text")),
    SONG_IN_SPOTLIGHT(achievement_name = Game.context_bundle.getTitle("ach_song_in_spotlight_name"), achievement_message = Game.context_bundle.getTitle("ach_song_in_spotlight_text"))
}
