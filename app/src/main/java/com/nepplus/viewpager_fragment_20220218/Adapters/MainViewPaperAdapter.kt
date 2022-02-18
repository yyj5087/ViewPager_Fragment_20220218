package com.nepplus.viewpager_fragment_20220218.Adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.nepplus.viewpager_fragment_20220218.Fragments.BirthYearFragment
import com.nepplus.viewpager_fragment_20220218.Fragments.HelloFragment
import com.nepplus.viewpager_fragment_20220218.Fragments.NameFragment

class MainViewPaperAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {
    override fun getCount(): Int {
        return 3
    }

    override fun getItem(position: Int): Fragment {
        if(position == 0){
            return NameFragment()
        }
        else if (position == 1){
            return BirthYearFragment()
        }
        else{
            return HelloFragment()
        }
    }

}