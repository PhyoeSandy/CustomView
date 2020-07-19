package com.padcmyanmar.padcx.customviewtesting.network.responses

import com.google.gson.annotations.SerializedName
import com.padcmyanmar.padcx.customviewtesting.data.vos.NewsVO

data class GetAllNewsResponse(
    @SerializedName("code") val code : Int  = 0,
    @SerializedName("message") val message : String = "",
    @SerializedName("data") val data: ArrayList<NewsVO>? = null
){
    fun isResponseOk() = (code == 200) && (data != null)
}