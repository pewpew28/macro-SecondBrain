package com.example.secondbrain.adapter

import android.content.Context
import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.secondbrain.databinding.HomeItemBinding
import com.example.secondbrain.databinding.NotifItemBinding
import com.example.secondbrain.model.homeModel
import com.example.secondbrain.model.notifModel
import com.example.secondbrain.ui.home.HomeFragment
import com.example.secondbrain.ui.note.OpenNoteActivity
import com.example.secondbrain.ui.notification.NotificationFragment

class NotifAdapter(private val list: List<notifModel>, private val context: NotificationFragment) :
    RecyclerView.Adapter<NotifAdapter.ViewHolder>() {

    class ViewHolder(val binding: NotifItemBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = NotifItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        with(holder) {
            with(list[position]) {
                binding.ivCircle.setImageResource(this.circle)
                binding.tvTanggal.text = this.tanggal
                binding.tvDesc.text = this.desc
            }
        }
        holder.itemView.setOnClickListener {
            val context = it!!.context
            val intent = Intent(context, OpenNoteActivity::class.java)
            Log.d("MyApp", "Tombol diklik, memulai OpenNoteActivity")
            context.startActivity(intent)
        }
    }
}