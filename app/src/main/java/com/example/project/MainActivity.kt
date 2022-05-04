package com.example.project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_menu)
        setContentView(R.layout.create_account_menu)
        setContentView(R.layout.main_menu)

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.bottom_nav_menu, menu)
        return true
    }

}