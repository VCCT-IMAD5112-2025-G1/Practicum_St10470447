package vcmsa.ci.practicum_10470447


import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private val playlist = mutableListOf<String>()
    @SuppressLint("CutPasteId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // initialize views
        var SongTitleText = findViewById(R.id.SongTitleText)
        var ArtistsNameText = findViewById(R.id.ArtistsNameText)
        var RatingText = findViewById(R.id.RatingText)
        var CommentsText = findViewById(R.id.CommentsText)
        var NextButton = findViewById(R.id.NextButton)
        var playlist = findViewById(R.id.PlaylistButton)


        // declaring  the variables
        var songTitle = findViewById<EditText>(R.id.SongTitleText)
        var artistsName = findViewById<EditText>(R.id.ArtistsNameText)
        var rating = findViewById<EditText>(R.id.RatingText)
        var comments = findViewById<EditText>(R.id.CommentsText)
        var next = findViewById<Button>(R.id.NextButton)
        var Exit = findViewById<Button>(R.id.ExitButton)
        var playlist = findViewById<Button>(R.id.PlaylistButton)


        // declaring arrays
        val songs: Array<String> = arrayOf("",
            "",
            "",
            "")
        val artists: Array<String> = arrayOf("",
            "",
            "",
            "")
        val ratings: Array<Int> = arrayOf("",
            "",
            "",
            "")
        val comment: Array<String> = arrayOf("",
            "",
            "",
            "")


        val Btn = findViewById<Button>(R.id.PlaylistButton)
        btn.setOnClickListener {
            Toast.makeText(this,"ENTER THE DETAILS FOR THE PLAYLIST", Toast.LENGTH_SHORT).show()

        }





        val Btn= findViewById<Button>(R.id.NextButton)
        btn.setOnClickListener {
            Toast.makeText(this, "Clicked", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)

            playlistButton.setOnClickListener {
                val SongTitle = SongTitleText.text.toString().trim()
                val ArtistsName = ArtistsNameText.text.toString().trim()
                val Rating = RatingText.text.toString().trim()
                val Comments = CommentsText.text.toString().trim()


        }           }
        va playlistButton = null
        playlistButton.setOnClickListener {
            val SongTitleText = .text.toString().trim()
            val ArtistsNameText = ArtistsNameText.text.toString().trim()
            val RatingText = RatingText.text.toString().trim()
        }