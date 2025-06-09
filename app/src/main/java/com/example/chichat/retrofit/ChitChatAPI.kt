package com.example.chichat.retrofit

import com.example.chichat.model.popVideo
import retrofit2.http.GET
import retrofit2.http.Query

interface ReelflowAPI {

    @GET("popular")
    suspend fun getPopVideos(@Query("page") page : Int): popVideo

}