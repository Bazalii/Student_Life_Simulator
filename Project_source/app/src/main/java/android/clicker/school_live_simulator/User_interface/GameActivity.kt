package android.clicker.school_live_simulator.User_interface

import android.clicker.school_live_simulator.R
import android.clicker.school_live_simulator.databinding.ActivityGameBinding
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class GameActivity : AppCompatActivity() {
    lateinit var binding_class: ActivityGameBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding_class = ActivityGameBinding.inflate(layoutInflater)
        setContentView(binding_class.root)
        supportFragmentManager.beginTransaction().replace(R.id.fragment, SchoolScrollingFragment()).commit()
    }
}

