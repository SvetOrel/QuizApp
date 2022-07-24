package com.example.quizapp

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var btnStart : Button = findViewById(R.id.btn_start)
        var etInput : EditText = findViewById(R.id.et_Input)

        val serviceIntent = Intent(this, BackgroundSoundService::class.java)
        startService(serviceIntent)

        btnStart.setOnClickListener{
            if(etInput.text.isEmpty()){
                Toast.makeText(this,
                    "Please enter your name",Toast.LENGTH_LONG).show()
            }
            else{
                val intent = Intent(this,QuizQuestionsActivity::class.java)
                intent.putExtra(Constants.USER_NAME,etInput.text.toString())
                startActivity(intent)
            }
        }
    }
}