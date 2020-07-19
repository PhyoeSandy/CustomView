package com.padcmyanmar.padcx.customviewtesting.workers

import android.content.Context
import androidx.work.Worker
import androidx.work.WorkerParameters
import com.padcmyanmar.padcx.customviewtesting.data.models.NewsModel
import com.padcmyanmar.padcx.customviewtesting.data.models.NewsModelImpl

abstract class BaseWorker(context: Context, workerParams: WorkerParameters) : Worker(context, workerParams) {
    val mNewsModel : NewsModel = NewsModelImpl
}