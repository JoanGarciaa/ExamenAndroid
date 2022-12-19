package com.example.examen_joangarcia.view

import android.R.attr.focusable
import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.PopupWindow
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.examen_joangarcia.R
import com.example.examen_joangarcia.databinding.FragmentAlumneBinding


class AlumneFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding = DataBindingUtil.inflate<FragmentAlumneBinding>(
            inflater,
            com.example.examen_joangarcia.R.layout.fragment_alumne, container, false
        )

//        val width = LinearLayout.LayoutParams.MATCH_PARENT
//        val height = LinearLayout.LayoutParams.MATCH_PARENT
//        val focusable = true
//        val popupView: View = inflater.inflate(com.example.examen_joangarcia.R.layout.popup, null)

        // val popupWindow = PopupWindow(popupView, width, height, focusable)

        val nom = binding.editTextTextPersonName3
        val edat = binding.editTextTextPersonName4

        binding.buttonAgregar.setOnClickListener(){
            // popupWindow.showAtLocation(it, Gravity.NO_GRAVITY, 10, 10)
            val bundle = Bundle()
            bundle.putString("nom", nom.toString())
            bundle.putString("edat",edat.toString())
            view?.findNavController()?.navigate(R.id.action_alumneFragment_to_popupFragment)

        }

        binding.buttonLlistat.setOnClickListener(){
            view?.findNavController()?.navigate(R.id.action_alumneFragment_to_listFragment)
        }

        setHasOptionsMenu(true)
        return binding.root
    }
}