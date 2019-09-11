package com.wizeline.erick.dependency.new_dagger_example.view

import dagger.Binds
import dagger.BindsInstance
import dagger.Module
import dagger.Provides

@Module(
    includes = [
        MainModule.UiModule::class
    ]
)
class MainModule {

    @Module
    interface UiModule {
        @Binds
        fun getView(activity: MainActivity): MainContract.View

        @Binds
        fun presenter(presenter: MainPresenter): MainContract.Presenter
    }

    @Provides
    fun getMainPresenter(view: MainContract.View) = MainPresenter(view)


}