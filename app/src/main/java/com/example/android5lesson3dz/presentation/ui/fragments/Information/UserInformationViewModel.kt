package com.example.android5lesson3dz.presentation.ui.fragments.Information

import androidx.lifecycle.ViewModel
import com.example.android5lesson3dz.domain.usecases.GetUserUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class UserInformationViewModel @Inject constructor(
    private val getUserUseCase: GetUserUseCase
) : ViewModel() {

    fun getUser() = getUserUseCase()
}