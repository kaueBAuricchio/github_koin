package com.example.githubkoin.di.modules

import com.example.githubkoin.repository.UsersRepository
import com.example.githubkoin.viewmodel.UserViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelsModule = module {

    viewModel {
        providerUserViewModel(
            repository = get()
        )
    }
}

fun providerUserViewModel(repository: UsersRepository): UserViewModel {
    return UserViewModel(
        repository = repository
    )
}
