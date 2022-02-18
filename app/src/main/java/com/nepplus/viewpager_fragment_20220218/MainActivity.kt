package com.nepplus.viewpager_fragment_20220218

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nepplus.viewpager_fragment_20220218.Adapters.MainViewPaperAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var mAdapter : MainViewPaperAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvent()
        setValues()
    }

    fun setupEvent(){

    }
    fun setValues(){
        mAdapter = MainViewPaperAdapter(supportFragmentManager)
        mainViewPager.adapter = mAdapter
    }

}