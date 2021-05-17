package com.peoplecounterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnClickMe=findViewById<Button>(R.id.button)
        var textCounter=findViewById<TextView>(R.id.text_view)
        var timeCounter=0

        btnClickMe.setOnClickListener {
            timeCounter=timeCounter+1
            textCounter.text= timeCounter.toString() + " Times"

          //  Toast.makeText(this,textCounter.text,Toast.LENGTH_SHORT).show()
        }
    }
}