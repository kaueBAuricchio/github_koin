package com.example.githubkoin.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.githubkoin.databinding.ActivityMainBinding
import com.example.githubkoin.viewmodel.UserViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {
    private  val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    private val viewModel : UserViewModel by viewModel()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.ButtonCallNetwork.setOnClickListener {
            viewModel.getAllUsers()
        }
    }
}