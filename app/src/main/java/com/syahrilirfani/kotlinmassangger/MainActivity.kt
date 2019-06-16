package com.syahrilirfani.kotlinmassangger

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_register_button_register.setOnClickListener {
            val username = username_edit_text_register.text.toString()
            val email = email_edit_text_register.text.toString()
            val password = password_edit_text_register.text.toString()

            Log.d("MainActivity", "Username :" + username)
            Log.d("MainActivity", "Email :" + email)
            Log.d("MainActivity", "Password :" + password)
        }

        alh_raedy_have_account_text_view.setOnClickListener {
            Log.d("MainActivity", "Text view Clicked!")

            val intent = Intent(this, Login::class.java)

            startActivity(intent)
        }

    }
}
