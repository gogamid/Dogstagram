package com.example.dogglers.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.dogglers.R
import com.example.dogglers.model.Dog

class GridItemAdapter(
  private val context: Context,
  private val dataset: List<Dog>
) : RecyclerView.Adapter<GridItemAdapter.ItemViewHolder>() {

  class ItemViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    val dog_image: ImageView = view.findViewById(R.id.dog_image)
    val dog_name: TextView = view.findViewById(R.id.dog_name)
    val dog_age: TextView = view.findViewById(R.id.dog_age)
    val dog_hobbies: TextView = view.findViewById(R.id.dog_hobbies)
  }

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
    val adapterLayout = LayoutInflater.from(parent.context)
      .inflate(R.layout.grid_list_item, parent, false)
    return ItemViewHolder(adapterLayout)
  }

  override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
    val item = dataset[position]
    holder.dog_image.setImageResource(item.imgId)
    holder.dog_name.text = item.name
    holder.dog_age.text = context.resources.getString(R.string.age_s, item.age.toString())
    holder.dog_hobbies.text = context.resources.getString(R.string.hobbies_s, item.hobbies)
  }

  override fun getItemCount(): Int = dataset.size
}