package com.example.notesntasks

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Next : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_next)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        var textField = findViewById<TextView>(R.id.next_text)
        textField.setText("User name is : "+ intent.extras!!.getString("user_name") +" Password is "+ intent.extras!!.getString("password"))
        var homeButton = findViewById<Button>(R.id.next_home_button)

        homeButton.setOnClickListener(){

            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}