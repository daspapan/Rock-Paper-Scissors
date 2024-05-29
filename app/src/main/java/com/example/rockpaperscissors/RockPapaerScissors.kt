package com.example.rockpaperscissors

fun main(){
    var computerChoice = ""
    var playerChoice = ""

    println("Rock, Paper or Scissors? Enter your choice!")

    playerChoice = readln()

    val randomNumber: Number = (1..3).random()

    when(randomNumber){
        1 -> {
            computerChoice = "Rock"
        }
        2 -> {
            computerChoice = "Paper"
        }
        3 -> {
            computerChoice = "Scissors"
        }

    }

    println("Player chose: " + playerChoice)
    println("Computer chose: " + computerChoice)

    val winner = when {
        playerChoice == computerChoice -> "Tie"
        playerChoice == "Rock" && computerChoice == "Scissors" -> "Player"
        playerChoice == "Paper" && computerChoice == "Rock" -> "Player"
        playerChoice == "Scissors" && computerChoice == "Paper" -> "Player"
        else -> "Computer"
    }

    if(winner == "Tie"){
        println("Its a tie!")
    }else if(winner == "Player"){
        println("Player won!")
    }else{
        println("Computer won!")
    }
}