package com.padcmyanmar.padcx.customviewtesting.views.viewholders

import android.view.View
import com.bumptech.glide.Glide
import com.padcmyanmar.padcx.customviewtesting.data.vos.NewsVO
import com.padcmyanmar.padcx.customviewtesting.delegates.NewsItemDelegate
import kotlinx.android.synthetic.main.item_news_smalll.view.*

class NewsSmallViewHolder(itemView: View, delegate : NewsItemDelegate) : BaseNewsViewHolder(itemView){

    init {
        itemView.setOnClickListener {
            mData?.let {
                delegate.onTapNewsItem(it.id)
            }
        }
    }

    override fun bindData(data: NewsVO) {
        mData = data
        Glide.with(itemView.context)
            .load(data.heroImage)
            .into(itemView.ivNewsImage)
        itemView.tvNewsHeadLine.text = data.title
    }
}