package com.padcmyanmar.padcx.customviewtesting

import android.app.Application
import androidx.work.OneTimeWorkRequest
import androidx.work.WorkManager
import com.padcmyanmar.padcx.customviewtesting.data.models.NewsModelImpl
import com.padcmyanmar.padcx.customviewtesting.workers.GetNewsWorker

class NewsApp : Application() {

    override fun onCreate() {
        super.onCreate()

        NewsModelImpl.initDatabase(applicationContext)
        getNewsOneTime()
    }

    private fun getNewsOneTime(){
        val getEventsWorkRequest = OneTimeWorkRequest
            .Builder(GetNewsWorker::class.java)
            .build()
        WorkManager.getInstance(applicationContext)
            .enqueue(getEventsWorkRequest)
    }
}