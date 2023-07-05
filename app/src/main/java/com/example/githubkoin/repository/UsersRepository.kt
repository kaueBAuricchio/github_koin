package com.example.githubkoin.repository

import com.example.githubkoin.model.Users

interface UsersRepository {

    suspend fun getAllUsers() : List<Users>
}