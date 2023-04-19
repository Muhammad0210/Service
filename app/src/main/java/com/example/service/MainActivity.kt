package com.example.service

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.MediaController
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.work.PeriodicWorkRequestBuilder
import androidx.work.WorkManager
import com.example.service.databinding.ActivityMainBinding
import java.util.concurrent.TimeUnit

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.apply {
            btnStart.setOnClickListener {
                val worker = PeriodicWorkRequestBuilder<MyService>(15, TimeUnit.MINUTES).build()
                WorkManager.getInstance(this@MainActivity).enqueue(worker)
                Toast.makeText(this@MainActivity, "start", Toast.LENGTH_SHORT).show()
            }
        }
    }     
}