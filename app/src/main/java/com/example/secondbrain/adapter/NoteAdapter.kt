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
import com.example.secondbrain.model.NoteModel
import com.example.secondbrain.ui.note.OpenNoteActivity

class NoteAdapter (private val children: List<NoteModel>) : RecyclerView.Adapter<NoteAdapter.MyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_note,parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return children.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val note = children[position]
        holder.note.text = note.title

        holder.itemView.setOnClickListener {
            val context = it!!.context
            val intent = Intent(context, OpenNoteActivity::class.java)
            Log.d("MyApp", "Tombol diklik, memulai OpenNoteActivity")
            context.startActivity(intent)
        }
    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val note : TextView = itemView.findViewById(R.id.tv_note)

    }
}