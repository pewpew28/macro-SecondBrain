package com.example.secondbrain.ui.note

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.secondbrain.R
import com.example.secondbrain.databinding.FragmentNoteBinding

class NoteFragment : Fragment() {

    private var binding: FragmentNoteBinding? = null

    private lateinit var rvCategory: RecyclerView

//     This property is only valid between onCreateView and
//     onDestroyView.
//    private val binding get() = _binding!!
//
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        //Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_note, container, false)
        //Recycle View Category

        val lm = LinearLayoutManager(activity)
        rvCategory = view.findViewById(R.id.recyclerViewCategory)

        val adapterCategory = CategoryAdapter(ArrayCategory,activity)
        rvCategory.setHasFixedSize(true)
        rvCategory.layoutManager = lm
        rvCategory.adapter = adapterCategory

        return view
    }
    //Data Dummy
    private val ArrayCategory : ArrayList<ModelCategory>get(){

        val arraycategory = ArrayList<ModelCategory>()

        val category1 = ModelCategory()
        category1.title = "Projects"
        val category2 = ModelCategory()
        category2.title = "Areas"
        val category3 = ModelCategory()
        category3.title = "Resources"
        val category4 = ModelCategory()
        category4.title = "Archives"

        arraycategory.add(category1)
        arraycategory.add(category2)
        arraycategory.add(category3)
        arraycategory.add(category4)

        return arraycategory
    }
    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }


}