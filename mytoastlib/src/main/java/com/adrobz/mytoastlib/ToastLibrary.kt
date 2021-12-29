package com.adrobz.mytoastlib

import android.content.Context
import android.widget.Toast

class ToastLibrary {

    fun myToast(mcx: Context, message:String){
        Toast.makeText(mcx,message,Toast.LENGTH_SHORT).show()
    }
}