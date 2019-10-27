package com.example.rateme

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

/**
 * Created by Olije Favour on 10/25/2019.
 *Copyright (c) 2019    All rights reserved.
 */



class UserViewModel :ViewModel (){

    private val _firstName =MutableLiveData("Yolo")
    private val _surName=MutableLiveData("Ma")
    private var _like =MutableLiveData(0)


    val  firstName:LiveData<String> = _firstName
    val  surname:LiveData<String> = _surName
    val  like:LiveData<Int> = _like


     fun OnLike(){

        _like.value = (_like.value ?:0 ) + 1

         Log.i("Like >>>>>",like.value.toString())
    }
}