package com.example.a3itb_module7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    //var range : Int = 20
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //range = 30
        var randomNum = Random
        var randomfunc = randomNum.nextInt(10)
        randomfunc++

        Log.i("info_garma", randomfunc.toString() )
    }
}