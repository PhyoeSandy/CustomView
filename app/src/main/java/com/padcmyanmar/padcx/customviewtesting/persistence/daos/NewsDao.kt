package com.padcmyanmar.padcx.customviewtesting.persistence.daos

import androidx.lifecycle.LiveData
import androidx.room.*
import com.padcmyanmar.padcx.customviewtesting.data.vos.NewsVO

@Dao
interface NewsDao {

    @Query("SELECT * FROM news")
    fun getAllNews(): LiveData<List<NewsVO>>

    @Query("SELECT * FROM news WHERE id = :newsId")
    fun getNewsById(newsId: Int) : LiveData<NewsVO>

    @Query("DELETE FROM news")
    fun deleteAll()

    @Delete
    fun deleteNews(news: NewsVO)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertNews(newsVO: NewsVO)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAllNews(news: List<NewsVO>)
}