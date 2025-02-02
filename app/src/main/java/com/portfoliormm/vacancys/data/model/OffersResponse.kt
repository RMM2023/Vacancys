package com.portfoliormm.vacancys.data.model

data class OffersResponse(
    val jobsNearby: JobsNearby,
    val raiseResume: RaiseResume,
    val temporaryWork: TemporaryWork,
    val usefulArticles: UsefulArticles
)