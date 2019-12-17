package com.sample.employeedetails.ui.splashscreen

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.animation.AnimationUtils
import com.sample.employeedetails.R
import com.sample.employeedetails.base.BaseActivity
import com.sample.employeedetails.ui.hrcategory.HrCategoryActivity
import kotlinx.android.synthetic.main.activity_splash_screen.*

class SplashScreenActivity : BaseActivity() {
    override fun setLayout(): Int {

        return R.layout.activity_splash_screen
    }


    override fun initView(savedInstanceState: Bundle?) {

        val animation=AnimationUtils.loadAnimation(applicationContext,R.anim.rotate_splash_logo)
        logo.startAnimation(animation)
        val handler = Handler()
        val delayrunnable = Runnable {

            startActivity(Intent(this@SplashScreenActivity,HrCategoryActivity::class.java))
            finish()
        }
        handler.postDelayed(delayrunnable, 3000)

    }

}
