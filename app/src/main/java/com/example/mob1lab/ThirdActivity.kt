package com.example.mob1lab

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mob1lab.databinding.ActivityThirdBinding

class ThirdActivity : AppCompatActivity() {
    lateinit var Act :ActivityThirdBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Act = ActivityThirdBinding.inflate(layoutInflater)
        setContentView(Act.root)
    }
}