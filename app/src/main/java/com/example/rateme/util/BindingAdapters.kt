package com.example.rateme.util

import android.view.View
import android.widget.ProgressBar
import androidx.databinding.BindingAdapter

/**
 * Created by Olije Favour on 10/27/2019.
 *Copyright (c) 2019    All rights reserved.
 */



@BindingAdapter("app:hideifZero")
 fun bindifZero(view: View,int:Int ) {

    view.visibility = if (int == 0) View.GONE else View.VISIBLE
}

    @BindingAdapter(value=["app:progressScaled", "android:max"],requireAll = true)

    fun setProgress(progressBar: ProgressBar, max:Int, likes:Int){

        progressBar.progress=(max * likes/5).coerceAtMost(max)
    }




