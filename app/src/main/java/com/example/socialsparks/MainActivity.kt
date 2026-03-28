package com.example.socialsparks

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.socialsparks.ui.theme.SocialSparksTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        //1. connect UI element
        val timeInput = findViewById<EditText>(R.id.timeInput)
        val checkButton = findViewById<Button>(R.id.btnCheck)
        val textResult = findViewById<TextView>(R.id.textResult)
        val resetButton = findViewById<Button>(R.id.btnReset)

        //2. Check Button Logic
        checkButton.setOnClickListener {

            val time = timeInput.text.toString().lowercase()

            if (time == "morning") {
                textResult.text = "Send a 'Good morning' text to a family member"
            }
            else if (time == "mid-morning") {
                textResult.text = "Say thank you to a colleague"
            }
            else if (time == "afternoon") {
                textResult.text = "Share a funny meme or interesting link witgh a friend"
            }
            else if (time == "afternoon snack") {
                textResult.text = "Send a quick 'thinking of you' message"
            }
            else if (time == "dinner") {
                textResult.text = "Call a friend or relative for a 5-minutes catch up "
            }
            else if (time == "after dinner") {
                textResult.text = "Leave a thoughtful comment on a friend post"
            }
            else {
                textResult.text = "Invalid input! Please Enter For e.g 'Morning' , 'Afternoon' , 'Dinner', etc."
            }
        }

        //3. Reset Button Logic
        resetButton.setOnClickListener {
            timeInput.text.clear()
            textResult.text = "Results will appear here"
        }


    }
}