package com.wizeline.erick.dependency.new_dagger_example.view

import javax.inject.Inject

class MainPresenter(private val view: MainContract.View) : MainContract.Presenter