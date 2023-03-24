package com.example.mob1lab

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.TextView
import com.example.mob1lab.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var Act :ActivityMainBinding

    var n1 : Int = 0
    var n2 : Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Act = ActivityMainBinding.inflate(layoutInflater)
        setContentView(Act.root)

        Act.t1.text = n1.toString()
        Act.t2.text = n2.toString()

        Act.sum.setOnClickListener(){
            n1 +=n2
            Act.t1.text = (n1).toString()
            n2 = 0
            Act.t2.text = (n2).toString()

        }

        Act.inc.setOnClickListener(){
            n2++
            Act.t2.text = n2.toString()

        }

        Act.mult.setOnClickListener(){
            Act.result.text = (n1*n2).toString()
            Act.result.visibility = View.VISIBLE
        }

        Act.buttonLeft.setOnClickListener(){
            val intent = Intent(this,SecondActivity::class.java)
            startActivity(intent)
        }

        Act.buttonRight.setOnClickListener(){
            val intent = Intent(this,ThirdActivity::class.java)
            startActivity(intent)
        }
    }


}