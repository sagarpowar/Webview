package com.example.webiewv

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.webiewv.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    setContentView(binding.root)
        binding.webview.loadUrl("https://www.facebook.com/")


    }
}

