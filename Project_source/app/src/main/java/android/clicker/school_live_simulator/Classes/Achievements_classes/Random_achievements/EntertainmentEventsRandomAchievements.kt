package android.clicker.school_live_simulator.Classes.Achievements_classes.Random_achievements

import android.clicker.school_live_simulator.Classes.Achievements_classes.Interfaces.RandomAchievements
import android.clicker.school_live_simulator.Game

/**
 * Random achievements related to entertainment
 *
 * @param   achievement_name    name of achievement
 * @param   achievement_message achievement message
 * @param   achievement_chance  achievement chance (in %)
 */
enum class EntertainmentEventsRandomAchievements(val achievement_name: String, val achievement_message: String, override val achievement_chance: Int): RandomAchievements {
    CAM2CAM_TRAP(achievement_name = Game.context_bundle.getTitle("ach_cam2cam_trap_name"), achievement_message = Game.context_bundle.getTitle("ach_cam2cam_trap_text"), achievement_chance = Game.context_bundle.getNumber("ach_cam2cam_trap_chance")),
    GET_BAN(achievement_name = Game.context_bundle.getTitle("ach_get_ban_name"), achievement_message = Game.context_bundle.getTitle("ach_get_ban_text"), achievement_chance = Game.context_bundle.getNumber("ach_get_ban_chance")),
    BE_REPORTED_BY_CHILDREN(achievement_name = Game.context_bundle.getTitle("ach_be_reported_by_children_name"), achievement_message = Game.context_bundle.getTitle("ach_be_reported_by_children_text"), achievement_chance = Game.context_bundle.getNumber("ach_be_reported_by_children_chance")),
    CAN_FLIP(achievement_name = Game.context_bundle.getTitle("ach_bottle_flip_name"), achievement_message = Game.context_bundle.getTitle("ach_bottle_flip_text"), achievement_chance = Game.context_bundle.getNumber("ach_bottle_flip_chance")),
    FUTURE_PIMP(achievement_name = Game.context_bundle.getTitle("ach_future_pimp_name"), achievement_message = Game.context_bundle.getTitle("ach_future_pimp_text"), achievement_chance = Game.context_bundle.getNumber("ach_future_pimp_chance")),
    FUTURE_GAY_PIMP(achievement_name = Game.context_bundle.getTitle("ach_future_gay_pimp_name"), achievement_message = Game.context_bundle.getTitle("ach_future_gay_pimp_text"), achievement_chance = Game.context_bundle.getNumber("ach_future_gay_pimp_chance")),
    FRIEND_IN_THEATRE(achievement_name = Game.context_bundle.getTitle("ach_friend_in_theatre_name"), achievement_message = Game.context_bundle.getTitle("ach_friend_in_theatre_text"), achievement_chance = Game.context_bundle.getNumber("ach_friend_in_theatre_chance")),
    //TODO MOMS_HACKER
    MOMS_HACKER(achievement_name = Game.context_bundle.getTitle("ach_moms_hacker_name"), achievement_message = Game.context_bundle.getTitle("ach_moms_hacker_text"), achievement_chance = Game.context_bundle.getNumber("ach_moms_hacker_chance")),
    EVACUATE_FROM_SHOP_CENTRE(achievement_name = Game.context_bundle.getTitle("ach_evacuate_from_shop_centre_name"), achievement_message = Game.context_bundle.getTitle("ach_evacuate_from_shop_centre_text"), achievement_chance = Game.context_bundle.getNumber("ach_evacuate_from_shop_centre_chance")),
    SEX_SCENE_IN_BOOK(achievement_name = Game.context_bundle.getTitle("ach_sex_scene_in_book_name"), achievement_message = Game.context_bundle.getTitle("ach_sex_scene_in_book_text"), achievement_chance = Game.context_bundle.getNumber("ach_sex_scene_in_book_chance")),
    GET_TIP_FROM_YOUNGS(achievement_name = Game.context_bundle.getTitle("ach_get_tip_from_youngs_name"), achievement_message = Game.context_bundle.getTitle("ach_get_tip_from_youngs_text"), achievement_chance = Game.context_bundle.getNumber("ach_get_tip_from_youngs_chance")),
    //TODO DESTROYED_HOUSE -> Have a party
    DESTROYED_HOUSE(achievement_name = Game.context_bundle.getTitle("ach_destroyed_house_name"), achievement_message = Game.context_bundle.getTitle("ach_destroyed_house_text"), achievement_chance = Game.context_bundle.getNumber("ach_destroyed_house_chance")),
    PHOTO_WITH_VOCALIST(achievement_name = Game.context_bundle.getTitle("ach_photo_with_vocalist_name"), achievement_message = Game.context_bundle.getTitle("ach_photo_with_vocalist_text"), achievement_chance = Game.context_bundle.getNumber("ach_photo_with_vocalist_chance")),
    TOO_FAST_RUNNING(achievement_name = Game.context_bundle.getTitle("ach_too_fast_running_name"), achievement_message = Game.context_bundle.getTitle("ach_too_fast_running_text"), achievement_chance = Game.context_bundle.getNumber("ach_too_fast_running_chance"))
}
