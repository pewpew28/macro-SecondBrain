package com.example.secondbrain.ui.notification

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.secondbrain.R
import com.example.secondbrain.adapter.HomeAdapter
import com.example.secondbrain.adapter.NotifAdapter
import com.example.secondbrain.databinding.FragmentHomeBinding
import com.example.secondbrain.databinding.FragmentNotificationBinding
import com.example.secondbrain.model.homeModel
import com.example.secondbrain.model.notifModel


class NotificationFragment : Fragment() {

    private lateinit var _binding: FragmentNotificationBinding
    private lateinit var adapter: NotifAdapter

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentNotificationBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setHomeAdapter()
    }


    private fun setHomeAdapter() {
        val dataList: MutableList<notifModel> = mutableListOf()

        tanggal().forEachIndexed { index, tanggal ->
            dataList.add(notifModel(circle()[index], tanggal, desc()[index]))
        }
        Log.d("ISI DATANYA ", dataList.toString())
        adapter = NotifAdapter(dataList, this@NotificationFragment)
        binding.rvCatatan.layoutManager = LinearLayoutManager(requireContext())
        binding.rvCatatan.adapter = adapter
    }

    private fun tanggal(): Array<String> = resources.getStringArray(R.array.tanggal)
    private fun desc(): Array<String> = resources.getStringArray(R.array.desc)

    private fun circle(): List<Int> = listOf(
        R.drawable.belum_dibaca,
        R.drawable.belum_dibaca,
        R.drawable.belum_dibaca,
        R.drawable.belum_dibaca,
        R.drawable.belum_dibaca,
        R.drawable.belum_dibaca,
        R.drawable.sudah_dibaca,
        R.drawable.sudah_dibaca,
    )

}