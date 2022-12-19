package com.example.examen_joangarcia.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.examen_joangarcia.R
import com.example.examen_joangarcia.adapter.ListAdapter
import com.example.examen_joangarcia.data.Provider
import com.example.examen_joangarcia.databinding.FragmentEntrarBinding
import com.example.examen_joangarcia.databinding.FragmentListBinding
import com.example.examen_joangarcia.model.Alumno

class ListFragment : Fragment() {

    class EntrarFragment : Fragment() {


        override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
            val binding = DataBindingUtil.inflate<FragmentListBinding>(
                inflater,
                R.layout.fragment_list, container, false
            )

            setHasOptionsMenu(true)
            val recyclerView = binding.recyclerView
            val adapter = ListAdapter(Provider().alumnos())
            recyclerView.layoutManager = LinearLayoutManager(requireContext())
            recyclerView.adapter = adapter

            binding?.apply {
                lifecycleOwner = viewLifecycleOwner
            }





            return binding.root
        }

    }

}