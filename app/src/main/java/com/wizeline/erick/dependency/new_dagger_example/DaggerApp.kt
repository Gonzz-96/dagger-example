package com.wizeline.erick.dependency.new_dagger_example

import android.app.Activity
import android.app.Application
import com.wizeline.erick.dependency.new_dagger_example.di.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import javax.inject.Inject

class DaggerApp : Application(), HasAndroidInjector {

    @Inject
    lateinit var dispatch: DispatchingAndroidInjector<Any>

    override fun onCreate() {
        super.onCreate()

        DaggerAppComponent
            .builder()
            .application(this)
            .build()
            .inject(this)
    }

    override fun androidInjector() = dispatch
}