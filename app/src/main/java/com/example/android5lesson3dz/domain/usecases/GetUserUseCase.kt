package com.example.android5lesson3dz.domain.usecases

import com.example.android5lesson3dz.domain.repositories.UserDataRepository
import javax.inject.Inject

class GetUserUseCase @Inject constructor(
    private val userDataRepository : UserDataRepository
) {
    operator fun invoke() = userDataRepository.getUser()
}