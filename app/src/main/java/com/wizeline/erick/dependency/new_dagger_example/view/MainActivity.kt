package com.wizeline.erick.dependency.new_dagger_example.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.annotation.IntegerRes
import com.wizeline.erick.dependency.new_dagger_example.R
import dagger.android.AndroidInjection
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import javax.inject.Inject

class MainActivity : AppCompatActivity(), HasAndroidInjector, MainContract.View {

    @Inject lateinit var dispatch: DispatchingAndroidInjector<Any>
    @Inject lateinit var string: String
    @Inject lateinit var number: Number
    @Inject lateinit var presenter: MainContract.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        showToast()
    }

    private fun showToast() {
        Toast.makeText(this, "$string + $number", Toast.LENGTH_LONG).show()
    }

    override fun androidInjector(): AndroidInjector<Any> = dispatch
}
