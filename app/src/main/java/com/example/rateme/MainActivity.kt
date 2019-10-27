package com.example.rateme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.example.rateme.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val userViewModel:UserViewModel=ViewModelProviders.of(this)[UserViewModel::class.java]
       val datatoBind: ActivityMainBinding = DataBindingUtil. setContentView(this,R.layout.activity_main)

//        datatoBind.lastName ="Olije"
//        datatoBind.setFirstName("Favour")

        datatoBind.lifecycleOwner = this

        datatoBind.viewmodel=userViewModel

    }
}
