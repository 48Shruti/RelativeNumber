package com.shruti.relativenumber

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var btPlus : Button?=null
    var btSub : Button ?= null
    var btMulti : Button ?= null
    var btDiv : Button? = null
    var tvNumber : TextView ?= null
    var number = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btPlus = findViewById(R.id.btPlus)
        btSub = findViewById(R.id.btSub)
        btMulti = findViewById(R.id.btMulti)
        btDiv = findViewById(R.id.btDiv)
        tvNumber = findViewById(R.id.tvNumber)

        btPlus?.setOnClickListener {
            number += 2
            tvNumber?.setText(number.toString())
        }
        btSub?.setOnClickListener {
            number -= 2
           tvNumber?.setText(number.toString())
        }
        btMulti?.setOnClickListener {
            number *= 2
            tvNumber?.setText(number.toString())
        }
        btDiv?.setOnClickListener {
            number /= 2
           tvNumber?.setText(number.toString())
        }
    }
}