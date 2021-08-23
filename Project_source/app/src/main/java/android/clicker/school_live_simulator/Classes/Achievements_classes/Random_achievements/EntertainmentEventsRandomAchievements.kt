package android.clicker.school_live_simulator.Classes.Achievements_classes.Random_achievements

import android.clicker.school_live_simulator.Classes.Achievements_classes.Interfaces.RandomAchievements
import android.clicker.school_live_simulator.Game

/**
 * Random achievements related to entertainment
 */
enum class EntertainmentEventsRandomAchievements(val achievement_name: String, val achievement_message: String): RandomAchievements {
    CAM2CAM_TRAP(achievement_name = Game.context_bundle.getTitle("ach_cam2cam_trap_name"), achievement_message = Game.context_bundle.getTitle("ach_cam2cam_trap_text")),
    GET_BAN(achievement_name = Game.context_bundle.getTitle("ach_get_ban_name"), achievement_message = Game.context_bundle.getTitle("ach_get_ban_text")),
    BE_REPORTED_BY_CHILDREN(achievement_name = Game.context_bundle.getTitle("ach_be_reported_by_children_name"), achievement_message = Game.context_bundle.getTitle("ach_be_reported_by_children_text")),
    BOTTLE_FLIP(achievement_name = Game.context_bundle.getTitle("ach_bottle_flip_name"), achievement_message = Game.context_bundle.getTitle("ach_bottle_flip_text")),
    FUTURE_PIMP(achievement_name = Game.context_bundle.getTitle("ach_future_pimp_name"), achievement_message = Game.context_bundle.getTitle("ach_future_pimp_text")),
    FUTURE_GAY_PIMP(achievement_name = Game.context_bundle.getTitle("ach_future_gay_pimp_name"), achievement_message = Game.context_bundle.getTitle("ach_future_gay_pimp_text")),
    FRIEND_IN_THEATRE(achievement_name = Game.context_bundle.getTitle("ach_friend_in_theatre_name"), achievement_message = Game.context_bundle.getTitle("ach_friend_in_theatre_text")),
    MOMS_HACKER(achievement_name = Game.context_bundle.getTitle("ach_moms_hacker_name"), achievement_message = Game.context_bundle.getTitle("ach_moms_hacker_text")),
    EVACUATE_FROM_SHOP_CENTRE(achievement_name = Game.context_bundle.getTitle("ach_evacuate_from_shop_centre_name"), achievement_message = Game.context_bundle.getTitle("ach_evacuate_from_shop_centre_text")),
    SEX_SCENE_IN_BOOK(achievement_name = Game.context_bundle.getTitle("ach_sex_scene_in_book_name"), achievement_message = Game.context_bundle.getTitle("ach_sex_scene_in_book_text")),
    GET_TIP_FROM_YOUNGS(achievement_name = Game.context_bundle.getTitle("ach_get_tip_from_youngs_name"), achievement_message = Game.context_bundle.getTitle("ach_get_tip_from_youngs_text")),
    DESTROYED_HOUSE(achievement_name = Game.context_bundle.getTitle("ach_destroyed_house_name"), achievement_message = Game.context_bundle.getTitle("ach_destroyed_house_text")),
    PHOTO_WITH_VOCALIST(achievement_name = Game.context_bundle.getTitle("ach_photo_with_vocalist_name"), achievement_message = Game.context_bundle.getTitle("ach_photo_with_vocalist_text")),
    TOO_FAST_RUNNING(achievement_name = Game.context_bundle.getTitle("ach_too_fast_running_name"), achievement_message = Game.context_bundle.getTitle("ach_too_fast_running_text"))
}
