package com.wizeline.erick.dependency.new_dagger_example.view

import dagger.Module
import dagger.Provides

@Module
class MainModule {
    @Provides
    fun getView(activity: MainActivity): MainContract.View = activity


    @Provides
    fun getMainPresenter(view: MainContract.View): MainContract.Presenter = MainPresenter(view)
}