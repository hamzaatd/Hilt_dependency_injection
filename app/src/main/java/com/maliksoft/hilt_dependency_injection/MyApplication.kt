package com.maliksoft.hilt_dependency_injection

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject

//@Inject
 //lateinit var userRepository: UserRepository

@HiltAndroidApp
class MyApplication :Application() {
    override fun onCreate() {
        super.onCreate()

        // filed injection in application class

     //   userRepository.save()






    }

}