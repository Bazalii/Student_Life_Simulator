package android.clicker.school_live_simulator.User_interface

import android.clicker.school_live_simulator.Game
import android.clicker.school_live_simulator.R
import android.clicker.school_live_simulator.databinding.ActivityMainMenuBinding
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import java.util.*
import android.graphics.Color.*
import androidx.core.content.ContextCompat
import java.io.File

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

        val letDirectory = File(this.applicationContext.filesDir, "DATA")
        letDirectory.mkdirs()
//        val file = File(letDirectory, "GameData.txt")
    }

    fun onClickNewGame(view: View){
        Game.save(this.applicationContext.filesDir)

        /**
         * start GameActivity
         */
        val intent = Intent(this, GameActivity::class.java)
        startActivity(intent)
        overridePendingTransition(R.anim.start_activity_1, R.anim.start_activity_2)
    }
    fun OnClickRussianLanguage(view: View){
        Game.locale = "ru"
        Game.isDefaultLanguage = false
        this.recreate()
    }
    fun OnClickEnglishLanguage(view: View){
        Game.locale = "en"
        Game.isDefaultLanguage = false
        this.recreate()
    }
}
