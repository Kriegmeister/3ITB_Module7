package com.example.a3itb_module7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.lang.Integer.parseInt
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    //var range : Int = 20
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*range = 30
        var randomNum = Random
        var randomfunc = randomNum.nextInt(10)
        randomfunc++

        Log.i("info_garma", randomfunc.toString() )*/
        var randClass = RandomClass()
        var textRandom : TextView = findViewById(R.id.txtRandom)
        var editRange : EditText = findViewById(R.id.edtRange)
        var buttonRandom : Button = findViewById(R.id.btnRandom)

        buttonRandom.setOnClickListener {
            var intValue = parseInt(editRange.text.toString())
            textRandom.setText(randClass.Randomizer(intValue).toString())
        }
    }
}