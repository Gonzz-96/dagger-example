package com.wizeline.erick.dependency.new_dagger_example.domain.usecases

import com.wizeline.erick.dependency.new_dagger_example.domain.Resource
import com.wizeline.erick.dependency.new_dagger_example.domain.repositories.TextRepository
import kotlinx.coroutines.delay

class GetTextList(private val repository: TextRepository) {
   suspend operator fun invoke() : List<String> =
      when(val result = repository.getTextList()) {
         is Resource.Success<List<String>> -> result.data
         is Resource.Error -> throw result.exception
      }

}