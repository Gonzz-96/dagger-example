package com.wizeline.erick.dependency.new_dagger_example.di

import com.wizeline.erick.dependency.new_dagger_example.view.MainActivity
import com.wizeline.erick.dependency.new_dagger_example.view.MainModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class MainBinder {

    @ContributesAndroidInjector(modules = [MainModule::class])
    abstract fun mainActivity() : MainActivity
}