package com.example.campuscoffeeorder

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.RadioGroup
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        Log.d("Create", "onCreate called")
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

            val submitBtn = findViewById<Button>(R.id.mainSubmitButton)

            submitBtn.setOnClickListener {
                        val coffeeEditText = findViewById<EditText>(R.id.mainCoffeeEditText).text.toString().trim()
                        val decaf = findViewById<CheckBox>(R.id.mainCheckBox).isChecked
                        val coffeeTemp = findViewById<RadioGroup>(R.id.mainRadioGroup)
                        val radioId = coffeeTemp.checkedRadioButtonId


                        if (coffeeEditText.isEmpty()) {
                            Toast.makeText(this@MainActivity, "Coffee order name is required!", Toast.LENGTH_SHORT).show()
                        }
                        else {
                            val intent = Intent(this@MainActivity, TableActivity::class.java)
                            intent.putExtra("coffeeText", coffeeEditText)
                            intent.putExtra("decaf", decaf)
                            val temp = if (radioId == R.id.radioOne) "Iced" else "Hot"
                            intent.putExtra("temp", temp)

                            startActivity(intent)
                        }

        }





    }
    override fun onStart() {
        super.onStart()
        Log.d("start", "onStart called")
    }
    override fun onResume() {
        super.onResume()
        Log.d("resume", "onResume called")
    }
    override fun onPause() {
        super.onPause()
        Log.d("pause", "onPause called")
    }
    override fun onStop() {
        super.onStop()
        Log.d("stop", "onStop called")
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.d("destroy", "onDestroy called")
    }
}