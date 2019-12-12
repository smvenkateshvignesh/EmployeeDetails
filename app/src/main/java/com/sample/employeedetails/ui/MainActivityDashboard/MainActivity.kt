package com.sample.employeedetails.ui.MainActivityDashboard

import android.os.Bundle
import com.sample.employeedetails.R
import com.sample.employeedetails.base.BaseActivity

class MainActivity : BaseActivity() {
    override fun setLayout(): Int {
        return R.layout.list_cardview_item
    }

    override fun initView(savedInstanceState: Bundle?) {

    }


}
