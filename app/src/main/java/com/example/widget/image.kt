package com.example.widget

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_image.*

class image : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image)

        btn_toast.setOnClickListener {
            Toast.makeText(this, "Ini Toast", Toast.LENGTH_SHORT).show()
        }
    }
}