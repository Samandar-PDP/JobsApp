package com.example.jobapp.model

import com.google.gson.annotations.SerializedName

data class RemoteJob(
    @SerializedName("job-count")
    val jobCount: Int?,
    val jobs: List<Job>?,
    val legalNotice: String?
)