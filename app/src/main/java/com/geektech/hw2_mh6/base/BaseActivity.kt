package com.example.baselesson.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModel
import androidx.viewbinding.ViewBinding

abstract class BaseActivity<VB : ViewBinding, VM : ViewModel> : AppCompatActivity() {

    private lateinit var binding: VB
    protected lateinit var viewModel: VM
    abstract fun inflateVB(): VB

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = inflateVB()
        setContentView(binding.root)

        checkInternet()
        initViews()
        initViewModel()
        initListener()

    }

    open fun checkInternet() {} // метод для проверки интернета
    open fun initViews() {} // Сетить текст в текствью, поменять цвет кнопки
    open fun initListener() {} // Клики
    open fun initViewModel() {} // Все обзерверы нашего viewModel
}