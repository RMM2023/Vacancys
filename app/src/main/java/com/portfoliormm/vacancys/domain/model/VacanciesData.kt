package com.portfoliormm.vacancys.domain.model

import com.portfoliormm.vacancys.data.model.ParametersVacancy

data class VacanciesData(
    val parametersVacancy: ParametersVacancy,
    val favourite : Boolean
)
