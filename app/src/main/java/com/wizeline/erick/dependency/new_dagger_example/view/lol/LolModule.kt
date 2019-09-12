package com.wizeline.erick.dependency.new_dagger_example.view.lol

import dagger.Module
import dagger.Provides

@Module
class LolModule {
    @Provides
    fun list() : List<Int> = (0 until 10).toList()
}