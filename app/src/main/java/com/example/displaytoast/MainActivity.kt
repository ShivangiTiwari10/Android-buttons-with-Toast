package com.example.displaytoast

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.displaytoast.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    @SuppressLint("ResourceAsColor", "UseCompatLoadingForDrawables")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        binding.btnDownload.setOnClickListener {
            val intent = Intent(this, Layouts::class.java)
            startActivity(intent)

            Toast.makeText(this, "Downloading...", Toast.LENGTH_SHORT).show()
        }
        binding.btnUpload.setOnClickListener {

            Toast.makeText(this, "Uploading...", Toast.LENGTH_SHORT).show()
        }

        binding.btnLight.setOnClickListener {
//            binding.btnLight.setBackgroundColor(resources.getColor(R.color.teal_700))
//            binding.interactiveUi.setBackgroundColor(resources.getColor(R.color.purple_200))
            binding.interactiveUi.setBackgroundResource(R.color.yellow)
        }
        binding.btnDark.setOnClickListener {

            binding.interactiveUi.setBackgroundResource(R.color.Dark)
        }
        setContentView(binding.root)
    }

}