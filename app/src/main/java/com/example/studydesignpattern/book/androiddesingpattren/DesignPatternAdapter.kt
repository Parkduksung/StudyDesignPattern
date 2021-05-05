package com.example.studydesignpattern.book.androiddesingpattren

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class DesignPatternAdapter : RecyclerView.Adapter<DesignPatternViewHolder>() {

    private val patternList = mutableListOf<String>()


    private lateinit var patternClickListener: PatternClickListener

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DesignPatternViewHolder {
        return DesignPatternViewHolder(parent)
    }

    override fun onBindViewHolder(holder: DesignPatternViewHolder, position: Int) {

        holder.apply {
            bind(patternList[position])
            itemView.setOnClickListener {
                patternClickListener.onClick(patternList[position])
            }
        }
    }

    override fun getItemCount(): Int =
        patternList.size


    fun setPatternList(list: List<String>) {
        patternList.addAll(list)
        notifyDataSetChanged()
    }

    fun setPatternClickListener(listener: PatternClickListener) {
        this.patternClickListener = listener
    }

    interface PatternClickListener {
        fun onClick(patternName: String)
    }
}