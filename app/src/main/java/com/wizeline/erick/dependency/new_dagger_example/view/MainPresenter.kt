package com.wizeline.erick.dependency.new_dagger_example.view

import java.util.*

class MainPresenter(private val view: MainContract.View) : MainContract.Presenter {

    override fun processText(s: String) {
        view.showText(s.toUpperCase(Locale.getDefault()))
    }

}