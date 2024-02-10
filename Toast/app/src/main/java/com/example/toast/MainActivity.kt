package com.example.toast

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val uploadButton = findViewById<Button>(R.id.BtnUpload)
        val downloadButton = findViewById<Button>(R.id.btnDownload)

        uploadButton.setOnClickListener{
            Toast.makeText(this,"Uploading...",Toast.LENGTH_SHORT).show()

        }
        downloadButton.setOnClickListener {
            Toast.makeText(this,"Downloading...",Toast.LENGTH_SHORT).show()
        }
    }
}