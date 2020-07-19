package com.padcmyanmar.padcx.customviewtesting.workers

import android.content.Context
import androidx.work.WorkerParameters

class GetNewsWorker(context: Context, workerParams: WorkerParameters) :
    BaseWorker(context, workerParams) {

    override fun doWork(): Result {
        var result = Result.failure()

        mNewsModel.getAllNewsFromApiAndSaveToDatabase(
            onSuccess = {
                result = Result.success()
            },
            onError = {
                result = Result.failure()
            }
        )
        return result
    }
}