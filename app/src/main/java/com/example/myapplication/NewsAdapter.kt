package com.example.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class NewsAdapter(private val list: List<String>) : RecyclerView.Adapter<NewsAdapter.NewsViewHolder> () {

    class NewsViewHolder(view: View):RecyclerView.ViewHolder(view){
        var title: TextView = view.findViewById(R.id.newsTitle)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder {
         var view = LayoutInflater.from(parent.context).inflate(R.layout.card, parent, false)
         return NewsViewHolder(view)
    }

    override fun onBindViewHolder(holder: NewsViewHolder, position: Int) {
        holder.title.text = list[position]
    }

    override fun getItemCount(): Int = list.size
}