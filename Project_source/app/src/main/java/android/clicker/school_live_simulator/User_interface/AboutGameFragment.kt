package android.clicker.school_live_simulator.User_interface

import android.clicker.school_live_simulator.Game
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.clicker.school_live_simulator.R
import android.clicker.school_live_simulator.databinding.AchievementItemBinding
import android.clicker.school_live_simulator.databinding.FragmentAboutGameBinding
import android.clicker.school_live_simulator.databinding.FragmentFoodScrollingBinding
import android.clicker.school_live_simulator.databinding.IconAuthorItemBinding
import android.util.Log
import androidx.appcompat.content.res.AppCompatResources.getDrawable
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class AboutGameFragment : Fragment() {
    lateinit var binding: FragmentAboutGameBinding
    private val adapter = AboutGameAdapter()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentAboutGameBinding.inflate(inflater)
        binding.Toolbar.navigationIcon =
            getDrawable(activity as MainMenuActivity, R.drawable.ic_main_menu_back)
        binding.Toolbar.setNavigationOnClickListener {
            (activity as MainMenuActivity).onBackPressed()
        }

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.RecyclerView.layoutManager = LinearLayoutManager(activity as MainMenuActivity)
        binding.RecyclerView.adapter = adapter
    }
}

class AboutGameAdapter : RecyclerView.Adapter<AboutGameAdapter.AboutGameHolder>() {

    val icon_authors: ArrayList<String> = arrayListOf("photo3idea_studio", "Flat Icons", "Pixel perfect", "Roundicons", "Vectors Market", "monkik", "Freepik", "ultimatearm",  "surang", "mynamepong", "Nikita Golubev", "Eucalyp", "DinosoftLabs")

    inner class AboutGameHolder(item: View) : RecyclerView.ViewHolder(item) {
        val binding = IconAuthorItemBinding.bind(item)

        fun bind(author_name: String) = with(binding) {
            AuthorName.text = "- $author_name"

        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AboutGameHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.icon_author_item, parent, false)
        return AboutGameHolder(view)
    }

    override fun onBindViewHolder(holder: AboutGameHolder, position: Int) {
        holder.bind(icon_authors[position])
    }

    override fun getItemCount(): Int {
        return icon_authors.size
    }

}
