package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.button)
        val resultTextView: TextView = findViewById(R.id.textView)
        rollButton.setOnClickListener {
            rollDice()
        }
    }

    private fun rollDice() {
        // dice1
        val dice1 = Dice(6)
        val diceRoll1 = dice1.roll()
        val resultTextView1: TextView = findViewById(R.id.textView)
        resultTextView1.text = diceRoll1.toString()

        // dice2
        val dice2 = Dice(6)
        val diceRoll2 = dice2.roll()
        val resultTextView2: TextView = findViewById(R.id.textView2)
        resultTextView2.text = diceRoll2.toString()

        if (diceRoll1  == diceRoll2)
            Toast.makeText(this, "vous avez gagne", Toast.LENGTH_SHORT).show()
    }

    class Dice(val numSides: Int) {

        fun roll(): Int {
            return (1..numSides).random()
        }
    }
}