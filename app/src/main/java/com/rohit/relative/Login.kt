package com.rohit.relative

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.rohit.relative.databinding.ActivityLoginBinding

class Login : AppCompatActivity() {
    lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding= ActivityLoginBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        binding.btnLogin.setOnClickListener {
            if(binding.etEmail.text.isEmpty())
            {
                binding.etEmail.setError("Enter Email")

            }
            else if(binding.etPass.text.isEmpty())
            {
                binding.etPass.setError("Enter Password")
            }
            else
            {
                Toast.makeText(applicationContext,"Login", Toast.LENGTH_SHORT)
                    .show()
            }
        }
    }
}