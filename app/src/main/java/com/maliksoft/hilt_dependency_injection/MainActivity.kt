package com.maliksoft.hilt_dependency_injection

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var userRepository: UserRepository

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        userRepository.save()
        Toast.makeText(this,"i am on experiment branch",Toast.LENGTH_LONG).show()
        Toast.makeText(this,"i am from another pc",Toast.LENGTH_LONG).show()



    }
}