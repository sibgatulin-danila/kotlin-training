package com.example.diceroll

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById<Button>(R.id.button2)
        rollButton.setOnClickListener { roll() }

        roll()
    }



    private fun roll() {
        val dice = Dice()
        val side = dice.roll()

        var diceImage: ImageView = findViewById<ImageView>(R.id.imageView2)

        val drawableResource = when (side) {
            1 -> R.drawable.dice1
            2 -> R.drawable.dice2
            3 -> R.drawable.dice3
            4 -> R.drawable.dice4
            5 -> R.drawable.dice5
            6 -> R.drawable.dice6
            else -> R.drawable.dice1
        }


        diceImage.setImageResource(drawableResource)
    }
}