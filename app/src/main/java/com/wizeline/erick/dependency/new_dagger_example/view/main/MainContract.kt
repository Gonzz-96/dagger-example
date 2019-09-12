package com.wizeline.erick.dependency.new_dagger_example.view.main

interface MainContract {
    interface View {
        fun showText(s: String)
    }

    interface Presenter {
        fun processText(s: String)
    }
}