package za.ac.iie.mydoggyapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class DoogyPage1 : AppCompatActivity() {
    // Define initial status levels
    private var hungerLevel = 0
    private var happinessLevel = 0
    private var cleanlinessLevel = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_doogy_page1)

        val btnPlay2 = findViewById<Button>(R.id.btnPlay2)
        val btnEat = findViewById<Button>(R.id.btnEat)
        val btnWash = findViewById<Button>(R.id.btnWash)
        val petImageView = findViewById<ImageView>(R.id.imageView4)
        val cleanStatusLevel = findViewById<TextView>(R.id.cleanStatuslevel)
        val playStatusLevel = findViewById<TextView>(R.id.playStatusLevel)
        val eatStatusLevel = findViewById<TextView>(R.id.eatStatusLevel)

        // Set initial image of the pet
        petImageView.setImageResource(R.drawable.img_4)

        // Update UI with initial status levels
        updateUI()

        // Set onClickListeners for buttons
        btnEat.setOnClickListener {
            // Change the pet's image to match the feeding action icon
            petImageView.setImageResource(R.drawable.img_8)

            // Update hunger level
            hungerLevel += 10

            // Update UI
            updateUI()
        }

        btnWash.setOnClickListener {
            // Change the pet's image to match the cleaning action icon
            petImageView.setImageResource(R.drawable.img_6)

            // Update cleanliness level
            cleanlinessLevel += 10

            // Update UI
            updateUI()
        }

        btnPlay2.setOnClickListener {
            // Change the pet's image to match the playing action icon
            petImageView.setImageResource(R.drawable.img_7)

            // Update happiness level
            happinessLevel += 10

            // Update UI
            updateUI()
        }
    }

    // Function to update UI with current status levels
    private fun updateUI() {
        // Update UI elements here (e.g., text views displaying status levels)
        val cleanStatusLevel = findViewById<TextView>(R.id.cleanStatuslevel)
        val playStatusLevel = findViewById<TextView>(R.id.playStatusLevel)
        val eatStatusLevel = findViewById<TextView>(R.id.eatStatusLevel)

        cleanStatusLevel.text = "Cleanliness Level: $cleanlinessLevel"
        playStatusLevel.text = "Happiness Level: $happinessLevel"
        eatStatusLevel.text = "Hunger Level: $hungerLevel"
    }
}
