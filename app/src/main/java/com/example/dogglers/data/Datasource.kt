package com.example.dogglers.data

import com.example.dogglers.R
import com.example.dogglers.model.Dog

class Datasource {

  fun loadDogs(): List<Dog> {
    return listOf<Dog>(
      Dog(R.drawable.bella, "Bella", 3, "Chasing"),
      Dog(R.drawable.faye, "Faye", 4, "Giving kisses"),
      Dog(R.drawable.frankie, "Frankie", 5, "Stealing sock"),
      Dog(R.drawable.leroy, "Leroy", 6, "Sleeping in dangerous places"),
      Dog(R.drawable.nox, "Nox", 7, "Meeting new animals"),
      Dog(R.drawable.tzeitel, "Tzeitel", 8, "Sunbathing")
    )
  }
}