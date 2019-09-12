package com.wizeline.erick.dependency.new_dagger_example.view.lol

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.wizeline.erick.dependency.new_dagger_example.R
import dagger.android.AndroidInjection
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import javax.inject.Inject

class LolActivity : AppCompatActivity(), HasAndroidInjector {

    @Inject lateinit var dispatch: DispatchingAndroidInjector<Any>
    @Inject lateinit var list: List<Int>

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lol)

        Toast.makeText(this, list.joinToString(separator = "-"), Toast.LENGTH_LONG).show()
    }

    override fun androidInjector(): AndroidInjector<Any> = dispatch
}
