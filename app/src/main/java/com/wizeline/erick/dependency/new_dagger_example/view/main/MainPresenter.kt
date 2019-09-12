package com.wizeline.erick.dependency.new_dagger_example.view.main

import com.wizeline.erick.dependency.new_dagger_example.domain.usecases.GetTextList
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MainPresenter(private val view: MainContract.View, private val getTextList: GetTextList) :
    MainContract.Presenter {

    override fun processText(s: String) {
        GlobalScope.launch {
            withContext(Dispatchers.Main) {
                view.showText(getTextList().joinToString(separator = "-"))
            }
        }
    }

}