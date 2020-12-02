package com.yourgurunet.android.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toGuess = "Android"

        val btn = findViewById<Button>(R.id.btnGuess)
        val input = findViewById<EditText>(R.id.inputWord)


        btn.setOnClickListener{
            if (toGuess == input.text.toString()){
                Toast.makeText( this@MainActivity, "Nice! You WIN!", Toast.LENGTH_SHORT).show()
            } else{
                Toast.makeText( this@MainActivity, "Sorry you insert wrong answer!", Toast.LENGTH_SHORT).show()
            }

        }
    }
}