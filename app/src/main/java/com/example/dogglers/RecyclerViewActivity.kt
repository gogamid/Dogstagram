package com.example.dogglers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.dogglers.databinding.ActivityRecyclerViewBinding

class RecyclerViewActivity : AppCompatActivity() {
  lateinit var binding: ActivityRecyclerViewBinding
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = ActivityRecyclerViewBinding.inflate(layoutInflater)
    setContentView(binding.root)


    val layoutManager: String? = intent.extras?.getString("layoutManager")
    Toast.makeText(this, layoutManager ?: "null", Toast.LENGTH_SHORT).show()

  }
}