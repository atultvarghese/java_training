package com.example.notesntasks

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.concurrent.thread

class MainActivity : AppCompatActivity() {

    lateinit var user_name: EditText
    lateinit var password: EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        password = findViewById(R.id.editTextTextPassword)
        user_name = findViewById(R.id.editTextText)
//
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
//        }
//
        val buttonClick = findViewById<Button>(R.id.button)
        buttonClick.setOnClickListener {
            val bundle = Bundle()
            bundle.putString("user_name", user_name.text.toString())
//            bundle.putString("password", password.text.toString())

//            val intent = Intent(this, Profile::class.java)
//            intent.putExtras(bundle)
//            startActivity(intent)

            if ((user_name.text.toString() == "Atul") and (password.text.toString() == "7")){
                Toast.makeText(this, "Logged in successfully", Toast.LENGTH_LONG).show()
                thread {
                    Thread.sleep(3000)
                    val intent = Intent(this, Profile::class.java)
                    intent.putExtras(bundle)
                    startActivity(intent)
                }
            } else {
                Toast.makeText(this, "Invalid login credentials", Toast.LENGTH_LONG).show()
            }
        }

        var backButton = findViewById<Button>(R.id.back_button)

        backButton.setOnClickListener() {
            val back_intent = Intent(this, Back::class.java)
            startActivity(back_intent)
        }

        var nextButton = findViewById<Button>(R.id.next_button)
        nextButton.setOnClickListener() {
            var next_intent = Intent(this, Next::class.java)
            next_intent.putExtra("user_name", user_name.text.toString())
            next_intent.putExtra("password", password.text.toString())
            startActivity(next_intent)
        }
//        var submitButton = findViewById<Button>(R.id.button)
//
//        submitButton.setOnClickListener {
//            Toast.makeText(this, "Button clicked", Toast.LENGTH_LONG).show()
//        }

        var registractionButton = findViewById<Button>(R.id.register)

        registractionButton.setOnClickListener(){
            var reg_intent = Intent(this, Registration::class.java)
            startActivity(reg_intent)
        }
        
    }
}