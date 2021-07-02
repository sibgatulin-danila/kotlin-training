package com.example.diceroll

class Dice (private val sides: Int = 6) {
    fun roll(): Int {
        return (1..sides).random()
    }
}