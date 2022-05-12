package com.example.dogglers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.dogglers.adapter.GridItemAdapter
import com.example.dogglers.adapter.VerticalHorizontalItemAdapter
import com.example.dogglers.data.Datasource
import com.example.dogglers.databinding.ActivityRecyclerViewBinding

class RecyclerViewActivity : AppCompatActivity() {
  private lateinit var binding: ActivityRecyclerViewBinding
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = ActivityRecyclerViewBinding.inflate(layoutInflater)
    setContentView(binding.root)


    val layoutType: String? = intent.extras?.getString("layoutManager")
    val myDataset = Datasource().loadDogs()

    binding.recyclerView.apply {
      when (layoutType) {
        "vertical" -> {
          adapter = VerticalHorizontalItemAdapter(this@RecyclerViewActivity, myDataset)
          layoutManager = LinearLayoutManager(this@RecyclerViewActivity).also {
            it.orientation = RecyclerView.VERTICAL
          }
        }
        "horizontal" -> {
          adapter = VerticalHorizontalItemAdapter(this@RecyclerViewActivity, myDataset)
          layoutManager = LinearLayoutManager(this@RecyclerViewActivity).also {
            it.orientation = RecyclerView.HORIZONTAL
          }
        }
        else -> {
          adapter = GridItemAdapter(this@RecyclerViewActivity, myDataset)
          layoutManager = GridLayoutManager(this@RecyclerViewActivity, 2)
        }
      }
      setHasFixedSize(true)
    }
  }
}