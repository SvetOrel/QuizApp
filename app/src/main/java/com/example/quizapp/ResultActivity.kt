package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class ResultActivity : AppCompatActivity(){

    private var tvName :TextView? = null
    private var tvScore :TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        tvName = findViewById(R.id.tv_name)
        tvScore = findViewById(R.id.tv_score)
        val btnFinish :Button = findViewById(R.id.btn_finish)

        tvName?.text = intent.getStringExtra(Constants.USER_NAME)
        val correctAnswers = intent.getIntExtra(Constants.CORRECT_ANSWERS,0)
        val totalQuestions  = intent.getIntExtra(Constants.TOTAL_QUESTIONS,0)
        tvScore?.text = "Your Score is $correctAnswers/$totalQuestions"

        btnFinish.setOnClickListener{
            startActivity(Intent(this,MainActivity::class.java))
        }
    }
}