package com.wizeline.erick.dependency.new_dagger_example.di

import com.wizeline.erick.dependency.new_dagger_example.view.lol.LolActivity
import com.wizeline.erick.dependency.new_dagger_example.view.lol.LolModule
import dagger.Module
import dagger.android.ContributesAndroidInjector
import com.wizeline.erick.dependency.new_dagger_example.view.main.MainModule
import com.wizeline.erick.dependency.new_dagger_example.view.main.MainActivity

@Module
abstract class ActivityBinder {
    @ContributesAndroidInjector(modules = [MainModule::class])
    abstract fun mainActivity() : MainActivity

    @ContributesAndroidInjector(modules = [LolModule::class])
    abstract fun lolActivity() : LolActivity
}