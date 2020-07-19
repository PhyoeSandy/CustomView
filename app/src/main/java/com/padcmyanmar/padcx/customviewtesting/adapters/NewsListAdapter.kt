package com.padcmyanmar.padcx.customviewtesting.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import com.padcmyanmar.padcx.customviewtesting.R
import com.padcmyanmar.padcx.customviewtesting.data.vos.NewsVO
import com.padcmyanmar.padcx.customviewtesting.delegates.NewsItemDelegate
import com.padcmyanmar.padcx.customviewtesting.views.viewholders.BaseNewsViewHolder
import com.padcmyanmar.padcx.customviewtesting.views.viewholders.NewsSmallViewHolder
import com.padcmyanmar.padcx.customviewtesting.views.viewholders.NewsViewHolder

class NewsListAdapter(delegate: NewsItemDelegate) : BaseRecyclerAdapter<BaseNewsViewHolder, NewsVO>(){

    val mDelegate: NewsItemDelegate = delegate
    val VIEW_TYPE_LARGE = 2244
    val VIEW_TYPE_SMALL = 1122

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseNewsViewHolder {

        when (viewType) {
            VIEW_TYPE_LARGE -> {
                val view =
                    LayoutInflater.from(parent.context).inflate(R.layout.item_news, parent, false)
                return NewsViewHolder(view, mDelegate)
            }
            VIEW_TYPE_SMALL -> {
                val view = LayoutInflater.from(parent.context)
                    .inflate(R.layout.item_news_smalll, parent, false)
                return NewsSmallViewHolder(view, mDelegate)
            }
            else -> {
                val view =
                    LayoutInflater.from(parent.context).inflate(R.layout.item_news, parent, false)
                return NewsViewHolder(view, mDelegate)
            }
        }

    }

    override fun getItemViewType(position: Int): Int {
        when {
            position % 3 == 0 -> {
                return VIEW_TYPE_LARGE
            }
            else -> {
                return VIEW_TYPE_SMALL
            }
        }
    }
}