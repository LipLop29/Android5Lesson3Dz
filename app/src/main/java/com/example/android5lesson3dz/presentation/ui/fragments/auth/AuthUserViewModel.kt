package com.example.android5lesson3dz.presentation.ui.fragments.auth

import androidx.lifecycle.ViewModel
import com.example.android5lesson3dz.domain.usecases.AuthUserUseCase
import com.example.android5lesson3dz.domain.usecases.GetUserUseCase
import com.example.android5lesson3dz.models.UserData
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class AuthUserViewModel @Inject constructor(
    private val authUserUseCase : AuthUserUseCase,
    private val getUserUseCase : GetUserUseCase
): ViewModel() {

    fun authUser(name : String, surname : String, age : Int){
        authUserUseCase(name, surname, age)
    }

    fun getUser() : UserData{
        return getUserUseCase()
    }
}