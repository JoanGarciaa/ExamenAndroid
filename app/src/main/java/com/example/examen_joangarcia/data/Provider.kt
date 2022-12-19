package com.example.examen_joangarcia.data;

import com.example.examen_joangarcia.model.Alumno

class Provider {
    companion object{
        private val alumnos = arrayListOf<Alumno>(
            Alumno("Alumn1" , 15),
            Alumno("Alumn2",16),
        )
    }

    fun alumnos(): ArrayList<Alumno>{
        return alumnos
    }

}
