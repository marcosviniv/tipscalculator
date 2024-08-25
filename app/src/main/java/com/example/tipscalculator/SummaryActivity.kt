package com.example.tipscalculator

import android.os.Bundle
import android.view.LayoutInflater
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.tipscalculator.databinding.ActivitySummaryBinding

class SummaryActivity : AppCompatActivity() {

    private lateinit var bindind: ActivitySummaryBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        bindind = ActivitySummaryBinding.inflate(layoutInflater)

        setContentView(bindind.root)

        val totalTable = intent.getFloatExtra("totalTable", 0.0f)
        val numPeople = intent.getIntExtra("numPeople", 1)
        val percentage = intent.getIntExtra("percentage", 0)
        val totalWithTips = intent.getFloatExtra("totalWithTips", 0.0f)

        bindind.tvTotalTable.text = "$" + totalTable.toString()
        bindind.tvNumPeople.text = numPeople.toString()
        bindind.tvPercentage.text = percentage.toString() + "%"
        bindind.tvTotalAmount.text = "$" + totalWithTips.toString()

        bindind.btnRefresh.setOnClickListener {
            finish()
        }

    }
}