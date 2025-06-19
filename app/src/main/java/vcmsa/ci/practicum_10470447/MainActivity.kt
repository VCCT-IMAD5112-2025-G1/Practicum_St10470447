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

    private lateinit var SongTitleText: EditText
    private lateinit var ArtistsNameText: EditText
    private lateinit var RatingText: EditText
    private lateinit var CommentsText: EditText
    private lateinit var NextButton: Button
    private lateinit var ExitButton: Button

    data class SongEntry(
        val songTitle: String,
        val artistsName: String,
        val rating: Int,
        val comments: String
    )
    private var playlist = mutableListOf<SongEntry>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        // initialize views
        SongTitleText = findViewById(R.id.SongTitleText)
        ArtistsNameText = findViewById(R.id.ArtistsNameText)
        RatingText = findViewById(R.id.RatingText)
        CommentsText = findViewById(R.id.CommentsText)
        NextButton = findViewById(R.id.NextButton)
        ExitButton = findViewById(R.id.ExitButton)
        playlist = findViewById(R.id.PlaylistButton)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        (playlist).setOnClickListener {
            val SongTitle = SongTitleText.text.toString().trim()
            val ArtistsName = ArtistsNameText.text.toString().trim()
            val Rating = RatingText.text.toString().trim()
            val Comments = CommentsText.text.toString().trim()

            if (SongTitle.isEmpty()) {
                SongTitleText.error = "SONG TITLE IS REQUIRED"
                Toast.makeText(this, "PLEASE ENTER THE SONG TITLE", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            if (ArtistsName.isEmpty()) {
                ArtistsNameText.error = "ARTISTS NAME IS REQUIRED"
                Toast.makeText(this, "PLEASE ENTER THE ARTISTS NAME", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            if (Rating.isEmpty()) {
                RatingText.error = "RATING IS REQUIRED"
                Toast.makeText(this, "PLEASE ENTER THE RATING", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            if (Comments.isEmpty()) {
                CommentsText.error = "COMMENTS IS REQUIRED"
                Toast.makeText(this, "PLEASE ENTER THE COMMENTS", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            SongTitleText.text.clear()
            ArtistsNameText.text.clear()
            RatingText.text.clear()
            CommentsText.text.clear()

        }
        ExitButton.setOnClickListener {
            Toast.makeText(this, "Exiting application", Toast.LENGTH_SHORT).show()
            finishAffinity() // Exits the app and finishes all activities in the task
            NextButton.setOnClickListener {
                // Your existing NextButton logic
                Toast.makeText(this, "Next button Clicked", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, SecondActivity::class.java)
                startActivity(intent)
            }
        }


        // declaring arrays
        val songs: Array<String> = arrayOf(
            "",
            "",
            "",
            ""
        )
        val artists: Array<String> = arrayOf(
            "",
            "",
            "",
            ""
        )
        val ratings: Array<String> = arrayOf(
            "",
            "",
            "",
            ""
        )
        val comment: Array<String> = arrayOf(
            "",
            "",
            "",
            ""
        )


    }}