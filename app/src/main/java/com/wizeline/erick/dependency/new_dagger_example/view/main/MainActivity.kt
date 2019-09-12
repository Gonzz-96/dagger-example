package com.wizeline.erick.dependency.new_dagger_example.view.main

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.wizeline.erick.dependency.new_dagger_example.R
import com.wizeline.erick.dependency.new_dagger_example.view.lol.LolActivity
import dagger.android.AndroidInjection
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity(), HasAndroidInjector,
    MainContract.View {

    @Inject lateinit var dispatch: DispatchingAndroidInjector<Any>
    @Inject lateinit var string: String
    @Inject lateinit var number: Number
    @Inject lateinit var presenter: MainContract.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        showToast()

        mainText.setOnClickListener {
            presenter.processText("This was done from presenter")
            startActivity(
                Intent(this, LolActivity::class.java)
            )
        }
    }

    private fun showToast() {
        Toast.makeText(this, "$string + $number", Toast.LENGTH_LONG).show()
    }

    override fun androidInjector(): AndroidInjector<Any> = dispatch

    override fun showText(s: String) {
        Toast.makeText(this, s, Toast.LENGTH_LONG).show()
    }
}
