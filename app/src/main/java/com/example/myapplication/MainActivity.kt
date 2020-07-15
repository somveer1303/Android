package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnShowTost.setOnClickListener {

            Log.i("MainActivity", "buttonToast has clicked")
            Toast.makeText(this, "button had clicked", Toast.LENGTH_SHORT).show()
        }


    }
}