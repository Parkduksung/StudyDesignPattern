package com.example.studydesignpattern.book.androiddesingpattren

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.studydesignpattern.R

class DesignPatternViewHolder(viewGroup: ViewGroup) : RecyclerView.ViewHolder(
    LayoutInflater.from(viewGroup.context).inflate(
        R.layout.item_design_pattern, viewGroup, false
    )
) {
    fun bind(string: String) {
        itemView.findViewById<TextView>(R.id.name_tv).text = string
    }
}