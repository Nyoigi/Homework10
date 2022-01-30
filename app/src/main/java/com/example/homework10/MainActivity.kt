package com.example.homework10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnAction.setOnClickListener {
            chooseImage()
        }
    }

    private fun chooseImage() {
        when (etSearchPicture.text.toString()) {
            "Щенок" -> ivImageOutput.setBackgroundResource(R.drawable.puppy)
            "Хорек" -> ivImageOutput.setBackgroundResource(R.drawable.hor)
            "Капибара" -> ivImageOutput.setBackgroundResource(R.drawable.capibara)
            "Пейзаж" -> ivImageOutput.setBackgroundResource(R.drawable.beautiful)
        }
    }
}