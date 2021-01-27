package com.example.jetpack

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.jetpack.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = ActivityMainBinding.inflate(layoutInflater)
        val rootview = binding.root

        // get view model data
        var mainViewModel = MainViewModel()
        mainViewModel.ani.value!!.name = "Dog"
        mainViewModel.ani.observe(this, Observer {
            Toast.makeText(this, "Changed!", Toast.LENGTH_LONG).show()
        })

        // let view data change as
        binding.submit.setOnClickListener(View.OnClickListener {
            mainViewModel.ani.value!!.shoutct += 1
            binding.Show.text = mainViewModel.ani.value!!.shoutct.toString()
        })

        setContentView(rootview)
    }
}