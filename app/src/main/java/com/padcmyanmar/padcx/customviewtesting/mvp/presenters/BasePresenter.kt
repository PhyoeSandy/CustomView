package com.padcmyanmar.padcx.customviewtesting.mvp.presenters

import com.padcmyanmar.padcx.padc_x_recyclerview_ypst.mvp.views.BaseView

interface BasePresenter<T : BaseView> {

    fun initPresenter(view: T)

}