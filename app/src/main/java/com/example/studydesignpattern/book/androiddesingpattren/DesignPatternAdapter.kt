package com.example.studydesignpattern.book.androiddesingpattren

import android.app.Activity
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class DesignPatternAdapter : RecyclerView.Adapter<DesignPatternViewHolder>() {

    private val patternList = mutableListOf<Pair<String, Activity>>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DesignPatternViewHolder {
        return DesignPatternViewHolder(parent)
    }

    override fun onBindViewHolder(holder: DesignPatternViewHolder, position: Int) {
        holder.bind(patternList[position])
    }

    override fun getItemCount(): Int =
        patternList.size


    fun setPatternList(list: List<Pair<String, Activity>>) {
        patternList.addAll(list)
        notifyDataSetChanged()
    }

}