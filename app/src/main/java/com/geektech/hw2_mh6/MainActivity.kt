package com.geektech.hw2_mh6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.baselesson.base.BaseActivity
import com.example.baselesson.base.BaseViewModel
import com.geektech.hw2_mh6.databinding.ActivityMainBinding

class MainActivity : BaseActivity<ActivityMainBinding, BaseViewModel>() {
    override fun inflateVB(): ActivityMainBinding {
        return ActivityMainBinding.inflate(layoutInflater)
    }
}
