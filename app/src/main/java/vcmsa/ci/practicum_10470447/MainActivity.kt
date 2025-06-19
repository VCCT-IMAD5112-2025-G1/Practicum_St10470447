package vcmsa.ci.practicum_10470447


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
    fun main {

    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        supportActionBar? = "SYMPHONY"

        // initialising the variables
        var songTitle = findViewById<EditText>(R.id.SongTitleText)
        var artistsName = findViewById<EditText>(R.id.ArtistsNameText)
        var rating = findViewById<EditText>(R.id.RatingText)
        var comments = findViewById<EditText>(R.id.CommentsText)
        var next = findViewById<Button>(R.id.NextButton)
        var reset = findViewById<Button>(R.id.ResetButton)
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


val btn = findViewById<Button>(R.id.PlaylistButton)
        btn.setOnClickListener {
            Toast.makeText(this,"ENTER THE DETAILS FOR THE PLAYLIST", Toast.LENGTH_SHORT).show()

        }





        val btn = findViewById<Button>(R.id.NextButton)
        btn.setOnClickListener {
            Toast.makeText(this,"Clicked", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}