package com.adrobz.mytoastlib

import android.content.Context
import android.util.Log
import android.widget.Toast
import com.adrobz.mytoastlib.API.RetrofitClient
import com.adrobz.mytoastlib.Model.TestApiRequest
import com.adrobz.mytoastlib.Model.TestApiResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class ToastLib {

    fun myToast(mcx: Context, message: String) {
        Toast.makeText(mcx, message, Toast.LENGTH_SHORT).show()
    }

    fun fetchTestRecord(title: String, body: String, userId: String, mcx: Context) {
        RetrofitClient.instance.fetchTestRecord(
            TestApiRequest(
                title = title,
                body = body,
                userId = userId
            )
        ).enqueue(object : Callback<TestApiResponse> {
            override fun onFailure(call: Call<TestApiResponse>, t: Throwable) {
                myToast(mcx, "Server Error" + t.localizedMessage)
            }

            override fun onResponse(
                call: Call<TestApiResponse>,
                response: Response<TestApiResponse>
            ) {
                try {
                    myToast(mcx, response.body()!!.title!!)
                } catch (e: Exception) {
                    myToast(mcx, e.localizedMessage)
                }

            }
        })
    }
}