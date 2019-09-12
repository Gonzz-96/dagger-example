package com.wizeline.erick.dependency.new_dagger_example.domain

import java.lang.Exception

sealed class Resource<out T> {
    class Success<out T>(val data: T) : Resource<T>()
    class Error(val exception: Exception) : Resource<Nothing>()
}