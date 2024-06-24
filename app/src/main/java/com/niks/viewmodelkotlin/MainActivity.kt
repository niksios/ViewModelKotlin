package com.niks.viewmodelkotlin

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {

    var count = 0

    private lateinit var viewModel: MainActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)

        val tvCount = findViewById<TextView>(R.id.tvCount)
        val btnCount = findViewById<Button>(R.id.btnCount)

        //tvCount.text = count.toString()
        //getting viewModel count variable value and setting to textview
        //tvCount.text = viewModel.count.toString()
        //LiveData
        viewModel.count.observe(this, Observer {
            tvCount.text = it.toString()
        })

        btnCount.setOnClickListener {
            //++count
            //tvCount.text = count.toString()
            viewModel.updateCount()
            //tvCount.text = viewModel.count.toString()

        }


    }
}