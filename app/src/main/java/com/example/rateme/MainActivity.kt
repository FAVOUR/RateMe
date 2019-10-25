package com.example.rateme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.rateme.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       val datatoBind: ActivityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        datatoBind.lastName ="Olije"
        datatoBind.setFirstName("Favour")

    }
}
