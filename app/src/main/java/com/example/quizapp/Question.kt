package com.example.quizapp

data class Question (
    val id : Int,
    val question : String,
    val image: Int,
    val optionOne : String,
    val optionTwo : String,
    val optionThree : String,
    val optionFour : String,
    val optionFive : String,
    val optionSix : String,
    val optionSeven : String,
    val optionEight : String,
    val optionNine : String,
    val optionTen : String,
    val correctAnswer : Int
)