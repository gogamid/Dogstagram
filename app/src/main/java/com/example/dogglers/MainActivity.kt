package com.example.dogglers

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.dogglers.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
  lateinit var binding: ActivityMainBinding

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = ActivityMainBinding.inflate(layoutInflater)
    setContentView(binding.root)

    binding.apply {
      verticalBtn.setOnClickListener { launchRecyclerScreen() }
      horizontalBtn.setOnClickListener { makeToast("Horizontal button clicked") }
      gridBtn.setOnClickListener { makeToast("Grid button clicked") }
    }

  }

  private fun launchRecyclerScreen() {
    startActivity(Intent(this, RecyclerViewActivity::class.java))
  }

  private fun makeToast(message: String) {
    Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
  }
}