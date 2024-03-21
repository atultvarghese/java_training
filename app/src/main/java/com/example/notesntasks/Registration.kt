package com.example.notesntasks

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.ListView
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Spinner
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Registration : AppCompatActivity() {

    lateinit var selectedItem : String
    lateinit var selectGender : String
    lateinit var selectedAssets : String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_registration)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val userNameButton = findViewById<EditText>(R.id.registerUserName)
        val passwordButton = findViewById<EditText>(R.id.registerPassword)

        val genderRadioGroup = findViewById<RadioGroup>(R.id.gender)
//        val femaleRadio = findViewById<RadioButton>(R.id.female)
        val carCheckBox = findViewById<CheckBox>(R.id.car)
        val bikeCheckBox = findViewById<CheckBox>(R.id.bike)
        val countrySpinner = findViewById<Spinner>(R.id.spinnerCountryDropDown)

        var countries = listOf(
            "India", "Japan", "UK", "USA"
        )
        countrySpinner.adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, countries)
//        countrySpinner.onItemSelectedListener { Toast.makeText(this, countrySpinner.) }

        // Set an OnItemSelectedListener to the spinner
        countrySpinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>,
                view: View?,
                position: Int,
                id: Long
            ) {
                // Get the selected item from the spinner
                selectedItem = parent.getItemAtPosition(position).toString()
                // Do something with the selected item
                // For example, you can display it in a toast
//                Toast.makeText(
//                    applicationContext,
//                    "Selected item: $selectedItem",
//                    Toast.LENGTH_SHORT
//                ).show()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                // Another interface callback
                Toast.makeText(applicationContext, "Please select an item!", Toast.LENGTH_SHORT)
                    .show()
            }
        }

        genderRadioGroup.setOnCheckedChangeListener { group, cid ->
            val radioButton : RadioButton = findViewById(cid)
            selectGender = radioButton.text.toString()
        }


        val checkedOptions = StringBuilder()

        // Check each checkbox and append its text to the string if it's checked
        if (carCheckBox.isChecked) {
            checkedOptions.append("${carCheckBox.text}, ")
        }
        if (bikeCheckBox.isChecked) {
            checkedOptions.append("${bikeCheckBox.text}, ")
        }

        // Remove the trailing comma and space if there are any checked options
        if (checkedOptions.isNotEmpty()) {
            checkedOptions.delete(checkedOptions.length - 2, checkedOptions.length)
        } else {
            checkedOptions.append("No")
        }

        selectedAssets = checkedOptions.toString() + " Assets"

        var registerButton = findViewById<Button>(R.id.registerUser)
        registerButton.setOnClickListener(){
            Toast.makeText(this, "User name : ${userNameButton.text.toString()} password is ${passwordButton.text.toString()} gender: $selectGender having $selectedAssets country: $selectedItem ", Toast.LENGTH_LONG).show()
        }

    }
}