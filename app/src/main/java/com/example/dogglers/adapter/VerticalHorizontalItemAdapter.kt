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

class VerticalHorizontalItemAdapter(
  private val context: Context,
  private val dataset: List<Dog>
) : RecyclerView.Adapter<VerticalHorizontalItemAdapter.ItemViewHolder>() {

  class ItemViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    val dogImage: ImageView = view.findViewById(R.id.dog_image)
    val dogName: TextView = view.findViewById(R.id.dog_name)
    val dogAge: TextView = view.findViewById(R.id.dog_age)
    val dogHobbies: TextView = view.findViewById(R.id.dog_hobbies)
  }

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
    val adapterLayout = LayoutInflater.from(parent.context)
      .inflate(R.layout.vertical_horizontal_list_item, parent, false)
    return ItemViewHolder(adapterLayout)
  }

  override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
    val item = dataset[position]
    holder.dogImage.setImageResource(item.imgId)
    holder.dogName.text = item.name
    holder.dogAge.text = context.resources.getString(R.string.age_s, item.age.toString())
    holder.dogHobbies.text = context.resources.getString(R.string.hobbies_s, item.hobbies)
  }

  override fun getItemCount(): Int = dataset.size
}