package com.example.android5lesson3dz.di

import com.example.android5lesson3dz.data.repositories.UserDataRepositoryImpl
import com.example.android5lesson3dz.domain.repositories.UserDataRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface RepositoriesModule {

    @Binds
    fun provideUserRepository(repositoryImpl: UserDataRepositoryImpl): UserDataRepository
}