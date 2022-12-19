package com.example.examen_joangarcia.adapter;

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.examen_joangarcia.R
import com.example.examen_joangarcia.model.Alumno

class ListAdapter(private val dataset: ArrayList<Alumno>) :
    RecyclerView.Adapter<ListAdapter.ViewHolder>() {


    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ViewHolder {
        val v =
            LayoutInflater.from(viewGroup.context).inflate(R.layout.card_layout, viewGroup, false)
        return ViewHolder(v as TextView)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, i: Int) {
        val data = dataset.get(i)
        viewHolder.textNom.text = data.nom
        viewHolder.textEdat.text = data.edat.toString()
    }

    override fun getItemCount(): Int {
        return dataset.size
    }

    inner class ViewHolder(val textView: TextView) :
        RecyclerView.ViewHolder(textView) {
        var textNom: TextView
        var textEdat: TextView

        init {
            textNom = itemView.findViewById(R.id.item_nom)
            textEdat = itemView.findViewById(R.id.item_edat)
        }
    }

}