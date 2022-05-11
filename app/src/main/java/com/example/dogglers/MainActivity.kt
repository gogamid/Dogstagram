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
      verticalBtn.setOnClickListener { launchRecyclerScreen("vertical") }
      horizontalBtn.setOnClickListener { launchRecyclerScreen("horizontal") }
      gridBtn.setOnClickListener { launchRecyclerScreen("grid") }
    }

  }

  private fun launchRecyclerScreen(layoutManager: String) {
    val intent = Intent(this, RecyclerViewActivity::class.java)
    intent.putExtra("layoutManager", layoutManager)
    startActivity(intent)
  }
}