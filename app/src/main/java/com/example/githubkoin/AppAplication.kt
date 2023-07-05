package com.example.githubkoin

import android.app.Application
import com.example.githubkoin.di.modules.appModule
import org.koin.core.context.startKoin

class AppApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            modules(
                appModule
            )
        }
    }
}