package com.example.intent_startactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.intent_startactivity.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonOpenActivity.setOnClickListener{
            //to start a second activity we need an intent(an intention to do smth)
            //this (inside an activity class, reference class we want to open(don't create instance))
            ////it is the intent we just created
            Intent(this,SecondActivity::class.java).also {
                startActivity(it )
            }
        }
    }
}