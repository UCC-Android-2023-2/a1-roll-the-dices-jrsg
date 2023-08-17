package com.example.rollthedices

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val boton1 : Button = findViewById(R.id.boton1)
        val boton2 : Button = findViewById(R.id.boton2)
        val boton3 : Button = findViewById(R.id.boton3)

        val ivDado1 : ImageView = findViewById(R.id.ivDado1)

        boton1.setOnClickListener { 
            val numero : Int = generarAleatorio()
            //Log.i("MainActivity", numero.toString() )
            actualizaDado(ivDado1, numero)
        }
    }

    private fun actualizaDado(ivDado: ImageView, numero: Int) {
        val resId : Int = resources.getIdentifier("dice_$numero", "drawable", packageName)
        ivDado.setImageResource(resId)
    }

    private fun generarAleatorio(): Int {
        return (1..6).random()
    }
}