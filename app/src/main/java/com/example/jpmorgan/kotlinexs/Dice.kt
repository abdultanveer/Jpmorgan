package com.example.jpmorgan.kotlinexs

class Dice(val numSides: Int) {
    var sides = 6

    fun roll():Int {
        return (1..numSides).random()

    }

}

fun main() {
    val myFirstDice = Dice(6)
    val diceRoll = myFirstDice.roll()
    println("Your ${myFirstDice.sides} sided dice rolled ${diceRoll}!")

    myFirstDice.sides = 20
    println("Your ${myFirstDice.sides} sided dice rolled ${myFirstDice.roll()}!")
}