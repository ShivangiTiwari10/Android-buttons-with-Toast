package com.example.displaytoast

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.displaytoast.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        binding.btnDownload.setOnClickListener {

            Toast.makeText(this, "Downloading...", Toast.LENGTH_SHORT).show()
        }
        setContentView(binding.root)
    }

}