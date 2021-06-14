package com.example.kotlin_start

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.kotlin_start.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater);
        //setContentView(R.layout.activity_main)
        setContentView(binding.root);
        binding.titleApplication.setOnClickListener {
            Toast.makeText(applicationContext, "Title Application Click", Toast.LENGTH_SHORT).show()
        }
    }
}