package com.padcmyanmar.padcx.customviewtesting.mvp.presenters

import androidx.lifecycle.LifecycleOwner
import com.padcmyanmar.padcx.customviewtesting.delegates.NewsItemDelegate
import com.padcmyanmar.padcx.customviewtesting.mvp.views.MainView

interface MainPresenter : NewsItemDelegate, BasePresenter<MainView> {
    fun onSwipeRefresh(lifecycleOwner: LifecycleOwner)
    fun onUiReady(lifeCycleOwner: LifecycleOwner)
}
