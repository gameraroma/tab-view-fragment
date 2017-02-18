package com.example.game.tabviewfragment

import android.app.TabActivity
import android.os.Bundle
import android.widget.TabHost
import android.content.Intent


class MainActivity : TabActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)

        val mTabHost: TabHost = findViewById(R.id.tabs_host) as TabHost

        mTabHost.addTab(mTabHost.newTabSpec("first").setIndicator("First").setContent(Intent(this, Page1::class.java)))
        mTabHost.addTab(mTabHost.newTabSpec("second").setIndicator("Second").setContent(Intent(this, Page2::class.java)))
        mTabHost.currentTab = 0

    }
}
