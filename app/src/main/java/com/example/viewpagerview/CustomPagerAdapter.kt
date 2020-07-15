package com.example.viewpagerview

import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.PagerAdapter
        //밑의 속성들은 페이져어뎁터의 속성들
class CustomPagerAdapter : PagerAdapter() {
    var views = listOf<View>()

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view == `object` as View
    }

    override fun getCount(): Int {
        return views.size
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        //여기선 getview와 비슷한 기능
        val view = views.get(position) // 뷰목록에서 현재 페이지에 맞는 뷰를 꺼내어 view변수에 담음
        container.addView(view) //뷰페이저의 container에, 앞에서 꺼낸 뷰를 담는다
        return view
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as View) //이기능은 뷰페이저가 빠른화면처리를 위해 페이지 3개를 생성하는데 그 페이지중 속하지 않는 페이지는 삭제해서 데이터 효율
    }

            override fun getPageTitle(position: Int): CharSequence? {
                return when (position) {
                    0 -> "홈"
                    1 -> "내정보"
                    else -> "커뮤니티"
                }
            }
        }