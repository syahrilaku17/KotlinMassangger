package com.syahrilirfani.kotlinmassangger

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_main.*

class Login: AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btn_login_button_login.setOnClickListener {
            val email = email_edit_text_login.text.toString()
            val password = password_edit_text_login.text.toString()

            Log.d("Login", "Email" + email)
            Log.d("Login", "Password" + password)
        }

        back_to_register_text_view_login.setOnClickListener {
            finish()
        }
    }
}