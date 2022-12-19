package com.example.examen_joangarcia.view

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.examen_joangarcia.R
import com.example.examen_joangarcia.databinding.FragmentCursBinding
import com.example.examen_joangarcia.databinding.FragmentInitBinding


class CursFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding = DataBindingUtil.inflate<FragmentCursBinding>(
            inflater,
            R.layout.fragment_curs, container, false
        )

        var curs = ""

        val spinnerInfo = resources.getStringArray(R.array.cursos)
        var arrayAdapter = ArrayAdapter(requireContext(),R.layout.item_dropdown,spinnerInfo)


        binding.spinner.apply {
            adapter = arrayAdapter
        }



        binding.testSpinner.setOnClickListener {
            var itemSelected = binding.spinner.selectedItem
            val Bundle = Bundle()
            Bundle.putString("curs", itemSelected as String?)
            Log.i("curs",itemSelected)
            view?.findNavController()?.navigate(R.id.action_cursFragment_to_entrarFragment)
        }

        setHasOptionsMenu(true)
        return binding.root
    }
}