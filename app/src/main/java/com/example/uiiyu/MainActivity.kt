package com.example.uiiyu

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private var user: EditText? = null
    private var button: Button? = null
    private var res: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        user = findViewById(R.id.user)
        button = findViewById(R.id.button)
        res = findViewById(R.id.res)

        button?.setOnClickListener {
           if (user?.text?.toString()?.trim()?.equals("")!!)
               Toast.makeText(this, "Введите город", Toast.LENGTH_LONG).show()
           else {
               var city: String = user?.text.toString()
               var key: String = "2bbfdf3644723e29c2acdc3db11a6fd8"
               var url: String = "http://api.openweathermap.org/data/2.5/weather?q=$city&appid=$key&units=metric&lang=ru"




           }
        }
    }
}