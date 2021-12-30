package com.adrobz.mytoastlib.Model

import com.google.gson.annotations.SerializedName

data class TestApiRequest(
    @SerializedName("title") val title: String? = "",
    @SerializedName("body") val body: String? = "",
    @SerializedName("userId") val userId: String? = "",
)