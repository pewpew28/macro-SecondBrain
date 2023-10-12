package com.example.secondbrain.ui.note

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.secondbrain.R
import com.example.secondbrain.adapter.CategoryAdapter
import com.example.secondbrain.databinding.FragmentNoteBinding
import com.example.secondbrain.model.categoryModel

class NoteFragment : Fragment() {

    private lateinit var _binding: FragmentNoteBinding
    private lateinit var adapter: CategoryAdapter

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentNoteBinding.inflate(inflater, container, false)
        val root: View = binding.root

        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setCategoryAdapter()
    }

    private fun setCategoryAdapter() {
        val dataList: MutableList<categoryModel> = mutableListOf()

        title().forEachIndexed { index, title ->
            dataList.add(categoryModel(title()[index]))
        }
        Log.d("ISI DATANYA ", dataList.toString())
        adapter = CategoryAdapter(dataList as ArrayList<categoryModel>, this@NoteFragment)
        binding.rvCategory.layoutManager = LinearLayoutManager(requireContext())
        binding.rvCategory.adapter = adapter
    }

    private fun title(): Array<String> = resources.getStringArray(R.array.title)

}