package android.clicker.school_live_simulator.User_interface

import android.clicker.school_live_simulator.Game
import android.clicker.school_live_simulator.databinding.ActivityMainMenuBinding
import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import java.util.*
import android.graphics.Color.*
import androidx.core.content.ContextCompat

class MainMenuActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainMenuBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (Game.isDefaultLanguage) {
            Game.locale = resources.configuration.locale.toString().take(2)
        }
        else {
            Game.setLocale(resources, this@MainMenuActivity)
        }
        binding = ActivityMainMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)
        when(Game.locale){
            "ru" -> binding.RussianButton.setBackgroundColor(ContextCompat.getColor(this, android.R.color.holo_green_dark))
            else -> binding.EnglishButton.setBackgroundColor(ContextCompat.getColor(this, android.R.color.holo_green_dark))
        }
    }

    fun onClickNewGame(view: View){
        /**
         * start GameActivity
         */
        val intent = Intent(this, GameActivity::class.java)
        startActivity(intent)
    }
    fun OnClickRussianLanguage(view: View){
        Game.locale = "ru"
        Game.isDefaultLanguage = false
        /*finish();
        overridePendingTransition(0, 0);
        startActivity(intent)
        overridePendingTransition(0, 0);*/
        this.recreate()
    }
    fun OnClickEnglishLanguage(view: View){
        Game.locale = "en"
        Game.isDefaultLanguage = false
        this.recreate()
    }
}
