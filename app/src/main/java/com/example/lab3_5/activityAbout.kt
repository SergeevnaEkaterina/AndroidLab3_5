package com.example.lab3_5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lab3_5.databinding.ActivityAboutBinding

class activityAbout : AppCompatActivity() {

    private lateinit var binding: ActivityAboutBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAboutBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

    }
    override fun onSupportNavigateUp(): Boolean {
        finish()
        return true
    }

}