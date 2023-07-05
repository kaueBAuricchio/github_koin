package com.example.githubkoin.viewmodel.factory

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.githubkoin.repository.UsersRepository
import com.example.githubkoin.viewmodel.UserViewModel
import java.lang.IllegalArgumentException

class UserViewModelFactory constructor(private val repository: UsersRepository) :
    ViewModelProvider.Factory {

        override fun <T : ViewModel> create(modelClass: Class<T>): T {
            return if (modelClass.isAssignableFrom(UserViewModelFactory::class.java)) {
                UserViewModel(this.repository) as T
            } else {
                throw IllegalArgumentException("ViewModel not found")
            }
        }
}