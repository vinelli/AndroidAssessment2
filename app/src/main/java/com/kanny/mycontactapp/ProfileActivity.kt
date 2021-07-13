package com.kanny.mycontactapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


lateinit var binding: ActivityProfileBinding

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.profileName.text = intent.getStringExtra("name")
        binding.profilePhoneNumber.text = intent.getStringExtra("phoneNumber")
        //val profileName = intent.getStringExtra("name")
    }
}
