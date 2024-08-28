package com.example.mymusicapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.example.tugasp3.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // pastikan file xml tersebut bernama activity_main.xml

        // Inisialisasi Views
        val btnBack: ImageButton = findViewById(R.id.btn_back)
        val btnMore: ImageButton = findViewById(R.id.btn_more)
        val albumArt: ImageView = findViewById(R.id.album_art)
        val artistName: TextView = findViewById(R.id.artist_name)
        val songTitle: TextView = findViewById(R.id.song_title)
        val previousButton: ImageButton = findViewById(R.id.previous_button)
        val playButton: ImageButton = findViewById(R.id.play_button)
        val nextButton: ImageButton = findViewById(R.id.next_button)

        // Set OnClickListeners
        btnBack.setOnClickListener {
            // Aksi saat tombol kembali diklik
            Toast.makeText(this, "Back button clicked", Toast.LENGTH_SHORT).show()
        }

        btnMore.setOnClickListener {
            // Aksi saat tombol tiga titik diklik
            Toast.makeText(this, "More button clicked", Toast.LENGTH_SHORT).show()
        }

        previousButton.setOnClickListener {
            // Aksi saat tombol previous diklik
            Toast.makeText(this, "Previous button clicked", Toast.LENGTH_SHORT).show()
        }

        playButton.setOnClickListener {
            // Aksi saat tombol play diklik
            Toast.makeText(this, "Play button clicked", Toast.LENGTH_SHORT).show()
        }

        nextButton.setOnClickListener {
            // Aksi saat tombol next diklik
            Toast.makeText(this, "Next button clicked", Toast.LENGTH_SHORT).show()
        }

        // Anda dapat menambahkan lebih banyak logika di sini untuk menangani berbagai interaksi dan pengelolaan musik
    }
}
