package com.sample.employeedetails.ui.splashscreen

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import com.sample.employeedetails.R
import com.sample.employeedetails.base.BaseActivity
import com.sample.employeedetails.ui.employeeslistactivity.EmployeesListActivity

class SplashScreenActivity : BaseActivity() {
    override fun setLayout(): Int {
        return R.layout.activity_splash_screen
    }

    override fun initView(savedInstanceState: Bundle?) {
        val handler = Handler()
        val delayrunnable = Runnable {

            startActivity(Intent(this@SplashScreenActivity,EmployeesListActivity::class.java))
            finish()
        }
        handler.postDelayed(delayrunnable, 3000)

    }

}
