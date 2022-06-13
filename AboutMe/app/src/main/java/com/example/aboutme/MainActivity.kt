package com.example.aboutme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button:Button = findViewById<Button>(R.id.Done)
        button.setOnClickListener(){
            Click()
            button.visibility = View.GONE
        }
    }
    fun Click(){
        val textbox = findViewById<EditText>(R.id.editTextTextPersonName2)
        val viewResultBox = findViewById<TextView>(R.id.textView)
        viewResultBox.text = textbox.text
        textbox.visibility=View.GONE
        viewResultBox.visibility=View.VISIBLE
    }
}