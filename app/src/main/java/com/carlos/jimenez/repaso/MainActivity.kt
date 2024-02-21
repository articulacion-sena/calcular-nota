package com.carlos.jimenez.repaso

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    private lateinit var digitarNombre: EditText
    private lateinit var digitarPorcentaje: EditText
    private lateinit var digitarNota: EditText
    private lateinit var botonNuevaNota: Button
    private lateinit var botonFinalizar: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        digitarNombre = findViewById(R.id.ingresar_nombre)
        digitarPorcentaje = findViewById(R.id.ingresar_porcentaje)
        digitarNota = findViewById(R.id.ingresar_nota)
        botonNuevaNota = findViewById(R.id.nueva_nota)
        botonFinalizar = findViewById(R.id.finalizar)

        


    }
}