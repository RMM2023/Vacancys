package com.portfoliormm.vacancys.data.remote

import retrofit2.http.GET

interface VacancyApiService {
    @GET("u/0/uc?id=1z4TbeDkbfXkvgpoJprXbN85uCcD7f00r&export=download")
    suspend fun searchVacancy() : SearchResponse
}