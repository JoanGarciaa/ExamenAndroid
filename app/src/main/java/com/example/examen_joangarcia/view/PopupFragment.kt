package com.example.examen_joangarcia.view;

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.examen_joangarcia.R
import com.example.examen_joangarcia.databinding.FragmentEntrarBinding
import com.example.examen_joangarcia.databinding.PopupBinding

class PopupFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding = DataBindingUtil.inflate<PopupBinding>(
            inflater,
            R.layout.popup, container, false
        )
        binding.buttonSi.setOnClickListener(){
            view?.findNavController()?.navigate(R.id.action_popupFragment_to_listFragment)
        }

        binding.buttonNo.setOnClickListener(){
            view?.findNavController()?.navigate(R.id.action_popupFragment_to_alumneFragment)
        }
        setHasOptionsMenu(true)
        return binding.root
    }
}