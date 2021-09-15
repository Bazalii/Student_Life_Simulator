package android.clicker.school_live_simulator.User_interface

import android.clicker.school_live_simulator.Classes.Enum_classes.Months
import android.clicker.school_live_simulator.Classes.GameDate.GameDate
import android.clicker.school_live_simulator.Game
import android.clicker.school_live_simulator.NormalMode
import android.clicker.school_live_simulator.Player
import android.clicker.school_live_simulator.R
import android.clicker.school_live_simulator.databinding.ActivityMainMenuBinding
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import java.util.*
import android.graphics.Color.*
import android.view.View.GONE
import android.view.View.VISIBLE
import androidx.core.content.ContextCompat

class MainMenuActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainMenuBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (Game.isDefaultLanguage) {
//            Game.locale = resources.configuration.locale.toString().take(2)
            Game.locale = Locale.getDefault().toString().take(2)
        }
        else {
            Game.setLocale(resources, this@MainMenuActivity)
        }
        binding = ActivityMainMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Game.context_bundle.context = this.applicationContext
    }

}
