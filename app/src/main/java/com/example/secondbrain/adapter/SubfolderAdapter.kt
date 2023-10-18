package com.example.secondbrain.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.secondbrain.R
import com.example.secondbrain.model.FolderDataFactory
import com.example.secondbrain.model.NoteDataFactory
import com.example.secondbrain.model.SubfolderModel

class SubfolderAdapter (var parents: List<SubfolderModel>) : RecyclerView.Adapter<SubfolderAdapter.MyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_subfolder,parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return parents.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val category = parents[position]
        holder.subfolder.text = category.title
        holder.recyclerView.apply {
            layoutManager = LinearLayoutManager(holder.recyclerView.context,
                RecyclerView.VERTICAL, false)
            adapter = NoteAdapter(NoteDataFactory.getChildren(5))
        }

        //Expandable Functionality
        val isExpandable = category.isExpandable
        holder.recyclerView.visibility = if (isExpandable) View.VISIBLE else View.GONE

        holder.subfolder.setOnClickListener(){
            category.isExpandable = !category.isExpandable
            notifyItemChanged(position)
        }
    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        val subfolder : TextView = itemView.findViewById(R.id.tv_subfolder)
        val recyclerView : RecyclerView = itemView.findViewById(R.id.rv_note)

    }

}