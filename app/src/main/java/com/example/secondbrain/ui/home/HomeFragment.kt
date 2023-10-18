package com.example.secondbrain.ui.home

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.secondbrain.R
import com.example.secondbrain.adapter.HomeAdapter
import com.example.secondbrain.databinding.FragmentHomeBinding
import com.example.secondbrain.model.homeModel
import com.example.secondbrain.ui.capture.CaptureActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton

class HomeFragment : Fragment() {

    private lateinit var _binding: FragmentHomeBinding
    private lateinit var adapter: HomeAdapter
    private lateinit var add:FloatingActionButton

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setHomeAdapter()
        val fab = view.findViewById<FloatingActionButton>(R.id.tmbh_catatan)
        fab.setOnClickListener {
            val intent = Intent(context, CaptureActivity::class.java )
            startActivity(intent)
        }
    }


    private fun setHomeAdapter() {
        val dataList: MutableList<homeModel> = mutableListOf()

        judul().forEachIndexed { index, judul ->
            dataList.add(homeModel(circle()[index], judul, tanggal()[index]))
        }
        Log.d("ISI DATANYA ", dataList.toString())
        adapter = HomeAdapter(dataList, this@HomeFragment)
        binding.rvCatatan.layoutManager = LinearLayoutManager(requireContext())
        binding.rvCatatan.adapter = adapter
    }

    private fun judul(): Array<String> = resources.getStringArray(R.array.judul)
    private fun tanggal(): Array<String> = resources.getStringArray(R.array.tanggal)

    private fun circle(): List<Int> = listOf(
        R.drawable.circle_danger,
        R.drawable.circle_safe,
        R.drawable.circle_safe,
        R.drawable.circle_common,
        R.drawable.circle_danger,
        R.drawable.circle_safe,
        R.drawable.circle_safe,
        R.drawable.circle_common
    )

}