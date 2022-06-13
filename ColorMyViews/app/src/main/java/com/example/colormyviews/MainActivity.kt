package com.example.colormyviews

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val Yellow = findViewById<Button>(R.id.yellowButton);
        val red = findViewById<Button>(R.id.redButton);
        val green = findViewById<Button>(R.id.greenButton);
        Yellow.setOnClickListener(){
            yellowClick()
        }
        red.setOnClickListener(){
            redClick()
        }
        green.setOnClickListener(){
            greenClick()
        }
        clickBox()
    }
    fun clickBox(){
        val boxOne =findViewById<TextView>(R.id.box_one)
        boxOne.setOnClickListener(){
            boxOne.setBackgroundColor(Color.GRAY)
        }
        val boxTwo =findViewById<TextView>(R.id.box_two)
        boxTwo.setOnClickListener(){
            boxTwo.setBackgroundColor(Color.GRAY)
        }
        val boxThree =findViewById<TextView>(R.id.box_three)
        boxThree.setOnClickListener(){
            boxThree.setBackgroundColor(Color.GRAY)
        }

        val boxFour =findViewById<TextView>(R.id.box_four)
        boxFour.setOnClickListener(){
            boxFour.setBackgroundColor(Color.GRAY)
        }
        val boxFive =findViewById<TextView>(R.id.box_five)
        boxFive.setOnClickListener(){
            boxFive.setBackgroundColor(Color.GRAY)
        }
    }


    fun yellowClick(){
        val boxFour = findViewById<TextView>(R.id.box_four)
        boxFour.setBackgroundColor(Color.YELLOW)
    }
    fun redClick(){
        val boxThree = findViewById<TextView>(R.id.box_three)
        boxThree.setBackgroundColor(Color.RED)
    }
    fun greenClick(){
        val boxFive = findViewById<TextView>(R.id.box_five)
        boxFive.setBackgroundColor(Color.GREEN)

    }


}
