package com.example.githubkoin.di.modules

import com.example.githubkoin.repository.UserApi
import com.example.githubkoin.repository.UsersRepository
import com.example.githubkoin.repository.UsersRepositoryImpl
import org.koin.dsl.module

val repositoryModule = module {
    single<UsersRepository> {
        providerUserRepository(
            userApi = get()
        )
    }
}

fun providerUserRepository(userApi: UserApi) : UsersRepositoryImpl {
    return UsersRepositoryImpl(
        userApi = userApi
    )
}
