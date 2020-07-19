package com.padcmyanmar.padcx.customviewtesting.mvp.presenters

import androidx.lifecycle.LifecycleOwner
import com.padcmyanmar.padcx.customviewtesting.mvp.views.NewsDetailsView

interface NewsDetailsPresenter : BasePresenter<NewsDetailsView>{
    fun onUiReady(lifeCycleOwner: LifecycleOwner, newsId : Int)
}