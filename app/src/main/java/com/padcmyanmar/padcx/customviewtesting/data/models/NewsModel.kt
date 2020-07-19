package com.padcmyanmar.padcx.customviewtesting.data.models

import androidx.lifecycle.LiveData
import com.padcmyanmar.padcx.customviewtesting.data.vos.NewsVO

interface NewsModel {
    fun getAllNews(onError: (String) -> Unit) : LiveData<List<NewsVO>>

    fun getAllNewsFromApiAndSaveToDatabase(onSuccess: () -> Unit, onError: (String) -> Unit)

    fun getNewsById(newsId: Int) : LiveData<NewsVO>
}