package com.example.counterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnClickMe = findViewById<Button>(R.id.mybutton)
        val txtBlock = findViewById<TextView>(R.id.textView)
        var timesClicked = 0

        btnClickMe.setOnClickListener {
            timesClicked += 1
//"toString()" will convert the timesClicked which is an integer and display it like a string
            txtBlock.text = timesClicked.toString()
            Toast.makeText(this, "U just clicked me!", Toast.LENGTH_LONG).show()
        }

    }
}