package com.wizeline.erick.dependency.new_dagger_example.domain.repositories

import com.wizeline.erick.dependency.new_dagger_example.domain.Resource
import kotlinx.coroutines.delay

class TextRepository {

    suspend fun getTextList() = try {
        delay(1000)
        Resource.Success(listOf("This", "comes", "from", "repo"))
    } catch(e: Exception) {
        Resource.Error(e)
    }

}
