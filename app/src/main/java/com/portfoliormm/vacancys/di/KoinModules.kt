package com.portfoliormm.vacancys.di

import com.portfoliormm.vacancys.data.remote.VacancyApiService
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

val dataModule = module {
    single<VacancyApiService> {
        Retrofit.Builder()
            .baseUrl("https://drive.usercontent.google.com")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(VacancyApiService::class.java)
    }
}