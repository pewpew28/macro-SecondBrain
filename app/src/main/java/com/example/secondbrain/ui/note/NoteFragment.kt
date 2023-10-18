package com.example.secondbrain.ui.note

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.secondbrain.R
import com.example.secondbrain.adapter.CategoryAdapter
import com.example.secondbrain.databinding.FragmentNoteBinding
import com.example.secondbrain.model.CategoryDataFactory

class NoteFragment : Fragment() {

    private var binding: FragmentNoteBinding? = null

    private lateinit var rvCategory: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        //Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_note, container, false)

        //RecyclerView Category
        val lm = LinearLayoutManager(activity)
        rvCategory = view.findViewById(R.id.rv_category)

        val adapterCategory = CategoryAdapter(CategoryDataFactory.getParents(4))
        rvCategory.setHasFixedSize(true)
        rvCategory.layoutManager = lm
        rvCategory.adapter = adapterCategory

        return view
    }

//     This property is only valid between onCreateView and
//     onDestroyView.
//    private val binding get() = _binding!!
//
//    override fun onCreateView(
//        inflater: LayoutInflater, container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View {
//        //Inflate the layout for this fragment
//        val view = inflater.inflate(R.layout.fragment_note, container, false)
//        //Recycle View Category
//
//        val lm = LinearLayoutManager(activity)
//        rvCategory = view.findViewById(R.id.recyclerViewCategory)
//
//        val adapterCategory = CategoryAdapter(ArrayCategory,activity)
//        rvCategory.setHasFixedSize(true)
//        rvCategory.layoutManager = lm
//        rvCategory.adapter = adapterCategory
//
//        return view
//    }
//    //Data Dummy
//    private val ArrayCategory : ArrayList<CategoryModel>get(){
//
//        val arraybaju = ArrayList<CategoryModel>()
//
//        val category1 = CategoryModel()
//        category1.title = "Projects"
//        val category2 = CategoryModel()
//        category2.title = "Areas"
//        val category3 = CategoryModel()
//        category3.title = "Resources"
//        val category4 = CategoryModel()
//        category4.title = "Archives"
//
//        arraybaju.add(category1)
//        arraybaju.add(category2)
//        arraybaju.add(category3)
//        arraybaju.add(category4)
//
//        return arraybaju
//    }
    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }


}