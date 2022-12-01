package com.example.jobapp.mapper

import com.example.jobapp.model.Job
import com.example.jobapp.model.JobToSave

fun Job.toJobToSave(): JobToSave {
    return JobToSave(
        candidateRequiredLocation = candidateRequiredLocation,
        category = category,
        companyLogoUrl = companyLogoUrl,
        companyName = companyName,
        description = description,
        jobId = id,
        jobType = jobType,
        publicationDate = publicationDate,
        salary = salary,
        title = title,
        url = url
    )
}