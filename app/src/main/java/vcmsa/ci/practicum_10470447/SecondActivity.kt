package vcmsa.ci.practicum_10470447

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.content.ContextCompat.startActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SecondActivity : AppCompatActivity() {
    playlistDetails: String? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second)

        displayTextView = findViewById<TextView>(R.id.displayTextView)
        pla

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
                } val playlistDetails = StringBuilder()
                playlistDetails.append("---Playlist Details---\n\n")

                for((index,song) in playlist.withIndex()){
                    playlistDetails.append("SongTitle #${index+1})\n")
                    playlistDetails.append("ArtistsName: ${song.artistsName}\n")
                    playlistDetails.append("Rating: ${song.rating}\n")
                    playlistDetails.append("Comments: ${song.Comments.ifEmpty { "N/A" }}\n")
                    playlistDetails.append("--------------\n\n")

                    displayTextView.text = playlistDetails.toString()
                    Toast.makeText(this, "playlist is being displayed", Toast.LENGTH_SHORT).show()


        }

"
        )
        )
        button3.setOnClickListener {
            Toast.makeText(this, "back to main page", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
    }
}
