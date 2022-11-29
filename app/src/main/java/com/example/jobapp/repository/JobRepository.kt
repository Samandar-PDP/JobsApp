package com.example.jobapp.repository

import com.example.jobapp.network.ApiService

class JobRepository(
    private val apiService: ApiService
) {
    suspend fun getAllJobs(limit: Int = 25) = apiService.getRemoteJobs(limit)
}