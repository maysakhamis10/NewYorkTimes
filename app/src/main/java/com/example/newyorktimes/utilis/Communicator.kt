package com.example.newyorktimes.utilis

import com.example.newyorktimes.data.datamodels.ResultStories

interface Communicator {

    fun passDataCom(storyBookMarked: ResultStories)

}