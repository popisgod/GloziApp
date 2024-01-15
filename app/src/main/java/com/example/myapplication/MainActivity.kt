package com.example.myapplication

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication.ui.theme.MyApplicationTheme
import com.example.myapplication.databinding.ActivityMainBinding


class MainActivity : ComponentActivity() {

    private lateinit var binding : ActivityMainBinding


    lateinit var username : EditText
    lateinit var password : EditText
    lateinit var loginButton : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.loginButton.setOnClickListener(View.OnClickListener {
            if (binding.username.text.toString().trim() == "") {
                Toast.makeText(this, "The username must be a valid email.", Toast.LENGTH_LONG).show()
                return@OnClickListener
            } else if (binding.password.text.toString().trim().length in 6..20) {
                Toast.makeText(this, "The password must be between 6-20 characters long.", Toast.LENGTH_LONG).show()
                return@OnClickListener
            }

            if (binding.username.text.toString() == "user" && binding.password.text.toString() == "1234"){
                Toast.makeText(this, "Logged in successfully", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Wrong password. Try again or Press On forgot password to reset it.", Toast.LENGTH_SHORT).show()
            }



        })
    }
}

