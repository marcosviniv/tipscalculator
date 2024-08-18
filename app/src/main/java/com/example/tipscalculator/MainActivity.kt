package com.example.tipscalculator

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.tipscalculator.databinding.ActivityMainBinding
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {

    // Valor  total da conta
    // Número de Pessoas
    // Porcentagem da Gorjeta
    // 10% , 15% ou 20%
    // Calcular
    // Limpar

    // Recuperar as Views do Layout
        // Find view by id
    // View Binding

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.btnClean.setOnClickListener{
            println("Marcos " + binding.tieTotal.text)
            println("Marcos " + binding.tieNumberOfPeople.text)
        }

        }
    }