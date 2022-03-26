package com.maliksoft.hilt_dependency_injection

import android.util.Log
import javax.inject.Inject

class UserRepository @Inject constructor(val firebaseServie: Firebase_servie) {

    fun save(){
      firebaseServie.user_added()
    }


}