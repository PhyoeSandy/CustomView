package com.padcmyanmar.padcx.customviewtesting.data.vos

import androidx.room.*
import com.google.gson.annotations.SerializedName
import com.padcmyanmar.padcx.customviewtesting.persistence.typeconverters.CommentListTypeConverter
import com.padcmyanmar.padcx.customviewtesting.persistence.typeconverters.LikeUsersTypeConverter

@Entity(tableName = "news")
@TypeConverters(LikeUsersTypeConverter::class, CommentListTypeConverter::class)
data class NewsVO(
    @PrimaryKey
    @SerializedName("id") var id: Int = 0,
    @SerializedName("title") var title: String = "",
    @SerializedName("hero_image") var heroImage: String = "",
    @SerializedName("description") var description: String = "",
    @Embedded
    @SerializedName("publication") var publication: PublicationVO? = null,
    @SerializedName("liked_users") var likedUsers: ArrayList<UserVO> = arrayListOf(),
    @SerializedName("comments") var comments: ArrayList<CommentVO> = arrayListOf()
)