package com.example.myhouse

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivitySystemView: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity_system_view)
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerview)

        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)

        val data = mutableListOf<ItemUiModel>()

        for (i in 1..15) {
            data.add(ItemUiModel(R.drawable.ic_launcher_background, "state name $i", "$$i.00"))
        }

        val adapter = StatesAdapter(data)

        recyclerView.adapter = adapter

    }
}