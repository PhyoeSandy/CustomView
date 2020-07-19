package com.padcmyanmar.padcx.customviewtesting.persistence.typeconverters

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.padcmyanmar.padcx.customviewtesting.data.vos.CommentVO

class CommentListTypeConverter {
    @TypeConverter
    fun toString(commentList: ArrayList<CommentVO>): String {
        return Gson().toJson(commentList)
    }

    @TypeConverter
    fun toCommentList(commentListJsonStr: String): ArrayList<CommentVO> {
        val commentListType = object : TypeToken<ArrayList<CommentVO>>() {}.type
        return Gson().fromJson(commentListJsonStr, commentListType)
    }
}