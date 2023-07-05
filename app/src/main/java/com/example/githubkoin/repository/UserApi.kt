package com.example.githubkoin.repository

import com.example.githubkoin.model.Users
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET


interface UserApi {

    @GET("/users")
    suspend fun getAllUsers() : List<Users>

    companion object {

        private var retrofitService: UserApi? = null

        fun getInstance(): UserApi {
            if (retrofitService == null) {
            }
            return retrofitService!!

        }
    }
}