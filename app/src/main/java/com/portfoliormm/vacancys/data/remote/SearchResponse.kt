package com.portfoliormm.vacancys.data.remote

import com.portfoliormm.vacancys.data.model.VacanciesResponse

data class SearchResponse(val resultCount : Int, val results : MutableList<VacanciesResponse>)