package com.example.zodiac

import android.gesture.GestureLibrary
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val zodiacSigns = resources.getStringArray(R.array.ZodiacSigns)
        val spinner: Spinner = findViewById(R.id.spinner2)
        val button: Button = findViewById(R.id.result)

        spinner.adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, zodiacSigns)

        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View?, p1: Int, id: Long) {
                val selectedZodiac = parent.getItemAtPosition(p1).toString()
                Toast.makeText(applicationContext, "You selected: $selectedZodiac", Toast.LENGTH_SHORT).show()
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }


        }

        button.setOnClickListener {
            val selectedZodiac = spinner.selectedItem.toString()
            Toast.makeText(applicationContext, "You selected: $selectedZodiac", Toast.LENGTH_SHORT).show()
        }
    }
}