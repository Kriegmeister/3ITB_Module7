package com.example.a3itb_module7

import android.util.Log
import kotlin.random.Random

class RandomClass {
    public fun Randomizer(randnum : Int) : Int
        {
            try {
                var random = Random
                var resultnum = random.nextInt(49,50)
                return resultnum
            } catch (e: Exception) {
                Log.e("error_garma", e.message.toString())
                return 0
            }
        }
    }
