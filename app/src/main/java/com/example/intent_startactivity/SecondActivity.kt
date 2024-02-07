package com.example.intent_startactivity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.intent_startactivity.databinding.ActivitySecondBinding

class SecondActivity:AppCompatActivity() {
    lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonBack.setOnClickListener{
             finish()
        }

        binding.buttonThird.setOnClickListener{
            Intent(this,ThirdActivity::class.java).also {
                startActivity(it)
            }
        }
    }
}