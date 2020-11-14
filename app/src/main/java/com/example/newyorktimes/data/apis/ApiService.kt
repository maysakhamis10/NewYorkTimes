package com.example.newyorktimes.data.apis

import com.example.newyorktimes.data.datamodels.TopStoriesModel
import com.example.newyorktimes.utilis.Constants
import retrofit2.http.GET

interface ApiService {

    @GET("https://api.nytimes.com/svc/topstories/v2/arts.json?api-key=rZU3lmNSDRh4KwnnkTP0ILGRDHUuMoFE")
    @JvmSuppressWildcards
    fun fetchTopStories(): TopStoriesModel

}


