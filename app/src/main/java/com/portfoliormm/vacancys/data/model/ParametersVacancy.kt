package com.portfoliormm.vacancys.data.model

data class ParametersVacancy(
    val id : String,
    val lookingNumber : Int?,
    val title : String,
    val address : List<Address>,
    val company : String,
    val experience : List<Experience>,
    val publishedDate : String,
    val isFavorite : Boolean,
    val salary : List<Salary>,
    val schedules : List<String>,
    val appliedNumber : Int,
    val description : String,
    val responsibilities : String,
    val questions : List<String>
)
