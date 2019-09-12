package com.wizeline.erick.dependency.new_dagger_example.view.main

import com.wizeline.erick.dependency.new_dagger_example.domain.repositories.TextRepository
import com.wizeline.erick.dependency.new_dagger_example.domain.usecases.GetTextList
import dagger.Module
import dagger.Provides

@Module
class MainModule {

    @Provides
    fun getMainPresenter(view: MainContract.View, usecase: GetTextList): MainContract.Presenter =
        MainPresenter(view, usecase)

    @Provides
    fun getView(activity: MainActivity): MainContract.View = activity

    @Provides
    fun getUseCase(repo: TextRepository): GetTextList = GetTextList(repo)

    @Provides
    fun getRepository(): TextRepository = TextRepository()
}