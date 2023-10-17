package com.example.secondbrain.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.secondbrain.R
import com.example.secondbrain.model.CategoryModel
import com.example.secondbrain.model.FolderDataFactory

class CategoryAdapter(var parents: List<CategoryModel>) : RecyclerView.Adapter<CategoryAdapter.MyViewHolder>() {

    private val viewPool = RecyclerView.RecycledViewPool()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_category,parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return parents.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val category = parents[position]
        holder.category.text = category.title
        holder.recyclerView.apply {
            layoutManager = LinearLayoutManager(holder.recyclerView.context,RecyclerView.VERTICAL, false)
            adapter = FolderAdapter(FolderDataFactory.getChildren(5))
        }
    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        val category : TextView = itemView.findViewById(R.id.tv_category)
        val recyclerView : RecyclerView = itemView.findViewById(R.id.rv_folder)

    }
}