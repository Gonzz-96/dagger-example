package com.wizeline.erick.dependency.new_dagger_example.di

import dagger.Module
import dagger.Provides

@Module
class AppModule {

    @Provides
    fun getString() = "This string was injected"

    @Provides
    fun getNumber(): Number = 5
}