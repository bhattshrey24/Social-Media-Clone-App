package com.example.socialmediacloneapp


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

//todo
// add bottom navigation
// add firebase
// add login feature
// add hilt
// Design how data will be stored for each user in firebase

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myBottomNav=findViewById<BottomNavigationView>(R.id.my_bottom_nav)
        val navController=findNavController(R.id.my_nav_host_fragment)
        myBottomNav.setupWithNavController(navController)
    }
}