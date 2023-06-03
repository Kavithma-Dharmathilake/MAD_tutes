package com.example.mad_tute.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.mad_tute.R

class TodoAdapter:RecyclerView.Adapter<TodoAdapter.ViewHolder>() {

    class ViewHolder(view: View) :RecyclerView.ViewHolder(view){
        val cbTodo:CheckBox
        val cvDelete:ImageView

        init {
            cbTodo = view.findViewById(R.id.cbTodo)
            cvDelete=view.findViewById(R.id.ivDelete)
        }

    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       val view = LayoutInflater.from(parent.context).inflate(R.layout.view_item,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.cbTodo.text="Sample Text"
    }

    override fun getItemCount(): Int {
       return 1
    }

}