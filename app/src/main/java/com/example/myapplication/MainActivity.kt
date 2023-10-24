package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.myapplication.R.id.registrbutton


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val joinbutton: Button = findViewById(R.id.joinbutton)
        var registrbutton = Button(this)
        registrbutton = findViewById(R.id.registrbutton)


        joinbutton.setOnClickListener{
            val joinintent = Intent(this,JoinActivity::class.java)
            startActivity(joinintent)
        }
registrbutton.setOnClickListener{
    val registrintent = Intent(this,RegistrActivity::class.java)
    startActivity(registrintent)
}
    }
}