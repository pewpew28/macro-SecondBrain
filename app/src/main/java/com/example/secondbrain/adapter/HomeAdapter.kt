package com.example.secondbrain.adapter

import android.content.Context
import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.secondbrain.databinding.HomeItemBinding
import com.example.secondbrain.model.homeModel
import com.example.secondbrain.ui.home.HomeFragment
import com.example.secondbrain.ui.note.OpenNoteActivity

class HomeAdapter(private val list: List<homeModel>, private val context: HomeFragment) :
    RecyclerView.Adapter<HomeAdapter.ViewHolder>() {

    class ViewHolder(val binding: HomeItemBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = HomeItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        with(holder) {
            with(list[position]) {
                binding.ivCircle.setImageResource(this.circle)
                binding.tvJudul.text = this.judul
                binding.tvTanggal.text = this.tanggal
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