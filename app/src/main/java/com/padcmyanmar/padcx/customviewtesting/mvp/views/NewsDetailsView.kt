package com.padcmyanmar.padcx.customviewtesting.mvp.views

import com.padcmyanmar.padcx.customviewtesting.data.vos.NewsVO
import com.padcmyanmar.padcx.padc_x_recyclerview_ypst.mvp.views.BaseView

interface NewsDetailsView : BaseView {
    fun displayNewsDetails(news: NewsVO)
}