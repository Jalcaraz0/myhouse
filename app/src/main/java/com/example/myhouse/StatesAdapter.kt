package com.example.myhouse

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class StatesAdapter(private val itemList: List<ItemUiModel>) : RecyclerView.Adapter<StatesAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StatesAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.estate_item, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: StatesAdapter.ViewHolder, position: Int) {
        val itemsUiModel = itemList[position]

        holder.imageView.setImageResource(itemsUiModel.image)
        holder.stateName.text = itemsUiModel.name
        holder.statePrice.text = itemsUiModel.price

    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.state_image)
        val stateName: TextView = itemView.findViewById(R.id.state_name)
        val statePrice: TextView = itemView.findViewById(R.id.state_price)
    }
}