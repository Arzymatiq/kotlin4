package com.example.myapplication

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class NewsViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView) {
    var image:ImageView = itemView.findViewById(R.id.newsImage)
    var title:TextView = itemView.findViewById(R.id.newsTitle)
}
