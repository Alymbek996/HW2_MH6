package com.geektech.hw2_mh6

import android.widget.ImageView
import com.bumptech.glide.Glide

fun ImageView.load(msg:String){
    Glide.with(this).load(msg).into(this)
}