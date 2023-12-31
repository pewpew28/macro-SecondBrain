package com.example.secondbrain.adapter

import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.secondbrain.R
import com.example.secondbrain.model.FolderModel
import com.example.secondbrain.ui.note.FolderActivity

class FolderAdapter(private val children: List<FolderModel>) : RecyclerView.Adapter<FolderAdapter.MyViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_folder,parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return children.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val folder = children[position]
        holder.folder.text = folder.title

        holder.itemView.setOnClickListener {
            val context = it!!.context
            val intent = Intent(context, FolderActivity::class.java)
            Log.d("MyApp", "Tombol diklik, memulai FolderActivity")
            context.startActivity(intent)
        }
    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val folder : TextView = itemView.findViewById(R.id.tv_folder)

    }
}