package com.guzya.home_worke77

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.guzya.home_worke77.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding

    private val adapter = AestheticsAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initialize()
        aestheticsList()
    }

    private fun initialize() = with(binding) {
        rvAesthetics.adapter = adapter
        adapter.setAppList(aestheticsList())
    }

    private fun aestheticsList() = listOf(
        AestheticsModels(R.drawable.book1 , "bok1"),
        AestheticsModels(R.drawable.book2 , "bok2"),
        AestheticsModels(R.drawable.book3, "bok3"),
        AestheticsModels(R.drawable.book2 , "bok4"),
        AestheticsModels(R.drawable.book1 ,  "bok5"),
        AestheticsModels(R.drawable.book3 , "bok6"),
        AestheticsModels(R.drawable.book1, "bok7"),
    )
}
