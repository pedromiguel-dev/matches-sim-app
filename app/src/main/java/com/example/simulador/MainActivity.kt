package com.example.simulador

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.simulador.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        //binding.textoEita.text = "Teste de Eita bbs"
    }
}