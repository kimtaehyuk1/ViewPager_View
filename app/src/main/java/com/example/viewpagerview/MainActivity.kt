package com.example.viewpagerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val views:List<View> = listOf(CustomA(this),CustomB(this),CustomC(this))
        val adapter = CustomPagerAdapter()
        adapter.views = views
        viewPager.adapter = adapter



    }
}