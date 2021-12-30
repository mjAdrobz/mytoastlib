package com.adrobz.mytoastlib.Model

import com.google.gson.annotations.SerializedName

class TestApiResponse(
    @SerializedName("title") val title: String? = "",
    @SerializedName("body") val body: String? = "",
    @SerializedName("userId") val userId: Int = 0,
    @SerializedName("id") val id: Int = 0,
)