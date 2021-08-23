package android.clicker.school_live_simulator.User_interface

import android.clicker.school_live_simulator.Game
import android.clicker.school_live_simulator.databinding.ActivityMainMenuBinding
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View

class MainMenuActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainMenuBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun onClickNewGame(view: View){
        /**
         * start GameActivity
         */
        val intent = Intent(this, GameActivity::class.java)
        startActivity(intent)
    }
}
