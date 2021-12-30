package com.adrobz.mytoastlib.API

import com.adrobz.mytoastlib.Model.TestApiRequest
import com.adrobz.mytoastlib.Model.TestApiResponse
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface UserService {
    @POST("posts")
    fun fetchTestRecord(@Body requestBody: TestApiRequest): Call<TestApiResponse>

}