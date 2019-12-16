package com.sample.employeedetails.ui.hrcategory

import android.content.Intent
import android.os.Bundle
import com.sample.employeedetails.R
import com.sample.employeedetails.base.BaseActivity
import com.sample.employeedetails.ui.employeeslistactivity.EmployeesListActivity
import kotlinx.android.synthetic.main.activity_hr_category.*

class HrCategoryActivity : BaseActivity() {
    override fun initView(savedInstanceState: Bundle?) {

        setOnCLickListeners()

    }

    private fun setOnCLickListeners() {
        categoryEmployee.setOnClickListener {
            val intent=Intent(this@HrCategoryActivity,EmployeesListActivity::class.java)
            startActivity(intent)
        }
        categoryAttendance.setOnClickListener {
            val intent=Intent(this@HrCategoryActivity,EmployeesListActivity::class.java)
            startActivity(intent)
        }
    }

    override fun setLayout(): Int {
        makeFullScreen()
        return R.layout.activity_hr_category
    }
}