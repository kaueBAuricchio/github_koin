package com.example.githubkoin.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.githubkoin.repository.UsersRepository
import kotlinx.coroutines.launch

class UserViewModel(
    private val repository: UsersRepository
) : ViewModel() {

    fun getAllUsers() = viewModelScope.launch {
        val users = repository.getAllUsers()

        for (user in users) {
            Log.i("Kaue", user.login)
        }
    }
}