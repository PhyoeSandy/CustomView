package com.padcmyanmar.padcx.customviewtesting.mvp.views

import com.padcmyanmar.padcx.customviewtesting.data.vos.NewsVO
import com.padcmyanmar.padcx.padc_x_recyclerview_ypst.mvp.views.BaseView

interface MainView : BaseView {
    fun displayNewsList(newsList: List<NewsVO>)
    fun navigateToNewsDetails(newsId: Int)
    fun enableSwipeRefresh()
    fun disableSwipeRefresh()
}