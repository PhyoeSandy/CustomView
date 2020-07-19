package com.padcmyanmar.padcx.customviewtesting.mvp.presenters

import androidx.lifecycle.LifecycleOwner
import com.padcmyanmar.padcx.customviewtesting.mvp.views.NewsDetailsView

class NewsDetailsPresenterImpl : NewsDetailsPresenter, AbstractBasePresenter<NewsDetailsView>() {
    override fun onUiReady(lifeCycleOwner: LifecycleOwner, newsId: Int) {

    }
}