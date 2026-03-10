package com.example.campuscoffeeorder

import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


//        val submitButton = findViewById<Button>(R.id.mainSubmitButton)
//        submitButton.setOnClickListener { v->
//            Log.d("Click","fart")
//        }

        val submitButton = object : View.onClickListener {
            override fun onClick (view: View?) {
                when (view?.id) {
                    R.id.mainSubmitButton -> {
                        val intent = Intent(this@MainActivity, )
                    }
                }
            }
        }

    }
}