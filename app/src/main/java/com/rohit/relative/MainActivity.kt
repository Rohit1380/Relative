package com.rohit.relative

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.rohit.relative.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding= ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.btn.setOnClickListener {
            if (binding.etName.text.isEmpty()) {
                binding.etName.error = "Enter your name"
            } else if (binding.etphone.text.isEmpty()) {
                binding.etphone.error = "Enter phone number"
            } else if (binding.etpassword.text.isEmpty()) {
                binding.etpassword.error = "enter password"
            } else if (binding.etconfirm.text.isEmpty()) {
                binding.etconfirm.error = "Confirm password"
            }
            else if(binding.etconfirm.text.toString().equals(binding.etpassword.text.toString())==false){
                binding.etconfirm.error="Confirm password is not same"
            }
            else{
                intent= Intent(this,Login::class.java)
                startActivity(intent)
            }
        }
        binding.rbtn2.setOnCheckedChangeListener { buttonview,onlychecked ->
            if (onlychecked) {
                binding.etothers.visibility = View.VISIBLE
            } else {
                binding.etothers.visibility = View.GONE
            }
        }
    }
}