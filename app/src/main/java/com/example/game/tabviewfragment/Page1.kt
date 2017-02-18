package com.example.game.tabviewfragment

import android.app.Activity
import android.os.Bundle


class Page1 : Activity() {
    val ARG_OBJECT = "Page 1"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.page_1)
    }
}