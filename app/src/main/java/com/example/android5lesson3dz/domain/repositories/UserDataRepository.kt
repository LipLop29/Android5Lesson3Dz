package com.example.android5lesson3dz.domain.repositories

import com.example.android5lesson3dz.models.UserData

interface UserDataRepository {
    fun authUser(name : String, surname : String, age : Int)

    fun getUser() : UserData
}