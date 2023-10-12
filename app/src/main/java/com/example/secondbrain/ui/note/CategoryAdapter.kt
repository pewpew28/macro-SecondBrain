package com.example.secondbrain.ui.note

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.secondbrain.R

class CategoryAdapter(var data : ArrayList<ModelCategory>, var context: Activity?) : RecyclerView.Adapter<CategoryAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item_category,parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val category = data[position]
        holder.category.text = category.title
    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        val category : TextView = itemView.findViewById(R.id.tv_category)

    }
}