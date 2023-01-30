package com.example.customviewexample.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.customviewexample.modals.Response
import com.example.customviewexample.modals.response

class MainViewModel: ViewModel() {
    var htmlResponse = MutableLiveData<Response>()

    fun getHtml() {
        htmlResponse.postValue(response)
    }
}