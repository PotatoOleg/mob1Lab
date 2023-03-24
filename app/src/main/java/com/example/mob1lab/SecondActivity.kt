package com.example.mob1lab

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mob1lab.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    lateinit var Act :ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Act = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(Act.root)
    }
}