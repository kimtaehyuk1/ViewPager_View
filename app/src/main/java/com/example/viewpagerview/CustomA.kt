package com.example.viewpagerview

import android.content.Context
import android.view.LayoutInflater
import androidx.appcompat.widget.LinearLayoutCompat

//앞에서 만든 layout들을 인플레이트 할거여서 만들거임
class CustomA(context: Context?) : LinearLayoutCompat(context) {
    init {
        val view = LayoutInflater.from(context).inflate(R.layout.layout_a,this,false)
        addView(view)
    }

}