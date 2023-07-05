package com.example.githubkoin.di

import com.example.githubkoin.repository.Constants
import com.example.githubkoin.repository.UserApi
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.create

val apiModule = module {
    single {providerUserApi()}
}

fun providerUserApi() : UserApi {
    return Retrofit.Builder()
        .baseUrl(Constants.BASE_URL)
        .addConverterFactory(MoshiConverterFactory.create())
        .build().create(UserApi::class.java)
}
