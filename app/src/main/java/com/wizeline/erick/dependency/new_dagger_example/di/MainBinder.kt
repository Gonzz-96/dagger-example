package com.wizeline.erick.dependency.new_dagger_example.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import com.wizeline.erick.dependency.new_dagger_example.view.MainModule
import com.wizeline.erick.dependency.new_dagger_example.view.MainActivity

@Module
abstract class MainBinder {
    @ContributesAndroidInjector(modules = [MainModule::class])
    abstract fun mainActivity() : MainActivity
}