package com.wizeline.erick.dependency.new_dagger_example.di

import android.app.Application
import com.wizeline.erick.dependency.new_dagger_example.DaggerApp
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule

@Component(
    modules = [AndroidInjectionModule::class, AppModule::class, ActivityBinder::class]
)
interface AppComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(app: Application) : Builder
        fun build() : AppComponent
    }

    fun inject(app: DaggerApp)
}