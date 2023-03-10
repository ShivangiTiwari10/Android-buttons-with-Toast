package com.example.displaytoast

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.displaytoast.databinding.ActivityLayootsBinding

class Layouts : AppCompatActivity() {

    private lateinit var binding: ActivityLayootsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLayootsBinding.inflate(layoutInflater)
        binding.btn2.setOnClickListener {
            val intent = Intent(this, ScrollView::class.java)
            startActivity(intent)
        }
        setContentView(binding.root)
    }
}