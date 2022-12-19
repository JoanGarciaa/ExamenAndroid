package com.example.examen_joangarcia.view

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.examen_joangarcia.R
import com.example.examen_joangarcia.databinding.FragmentEntrarBinding

class EntrarFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val selectedValue = arguments?.getString("curs")
        var curs = view?.findViewById<TextView>(R.id.textViewCursTriat)
        Log.i("cursTriat", curs.toString())
        if (curs != null) {
            curs.setText(selectedValue)
            Log.i("cursTriat", curs.toString())
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding = DataBindingUtil.inflate<FragmentEntrarBinding>(
            inflater,
            R.layout.fragment_entrar, container, false
        )
        binding.buttonEntrar.setOnClickListener(){
            view?.findNavController()?.navigate(R.id.action_entrarFragment_to_alumneFragment)
        }


        binding.buttonCursos.setOnClickListener(){
            view?.findNavController()?.navigate(R.id.action_entrarFragment_to_cursFragment)
        }


        setHasOptionsMenu(true)
        return binding.root
    }
}
