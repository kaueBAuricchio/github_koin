package com.example.githubkoin.repository

import com.example.githubkoin.model.Users

class UsersRepositoryImpl(
    private val userApi: UserApi
) : UsersRepository {
    override suspend fun getAllUsers(): List<Users> {
        return userApi.getAllUsers()
    }
}