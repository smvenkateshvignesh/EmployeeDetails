package com.sample.employeedetails.ui.hrcategory

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.transition.AutoTransition
import android.transition.TransitionManager
import androidx.constraintlayout.widget.ConstraintSet
import com.sample.employeedetails.R
import com.sample.employeedetails.base.BaseActivity
import com.sample.employeedetails.ui.employeeslistactivity.EmployeesListActivity
import com.sample.employeedetails.ui.hrcategory.chooseattendence.ChooseAttendanceActivity
import com.sample.employeedetails.ui.hrcategory.deviceinfo.DeviceInfoActivity
import com.sample.employeedetails.ui.hrcategory.projects.ProjectDashboardActivity
import kotlinx.android.synthetic.main.activity_hr_category.categoryAttendance
import kotlinx.android.synthetic.main.activity_hr_category.categoryEmployee
import kotlinx.android.synthetic.main.activity_hr_category_first.*

class HrCategoryActivity : BaseActivity() {
    override fun initView(savedInstanceState: Bundle?) {
        setOnCLickListeners()
        Handler().postDelayed({
            swap(R.layout.activity_hr_category)

        },50)
    }

    private fun setOnCLickListeners() {
        categoryEmployee.setOnClickListener {
            val intent=Intent(this@HrCategoryActivity,EmployeesListActivity::class.java)
            startActivity(intent)
        }
        categoryAttendance.setOnClickListener {
            val intent=Intent(this@HrCategoryActivity,ChooseAttendanceActivity::class.java)
            startActivity(intent)
        }
        categoryDevices.setOnClickListener {
            val intent=Intent(this@HrCategoryActivity,DeviceInfoActivity::class.java)
            startActivity(intent)
        }
        categoryProjects.setOnClickListener {
            val intent = Intent(this@HrCategoryActivity, ProjectDashboardActivity::class.java)
            startActivity(intent)
        }
    }

    override fun setLayout(): Int {
        return R.layout.activity_hr_category_first
    }

    private fun swap(layoutId: Int) {
        val constraintSet = ConstraintSet()
        constraintSet.clone(this, layoutId)
        val transation = AutoTransition()
//        transation.interpolator = AnticipateOvershootInterpolator(1.5f)
        transation.duration = 800
        TransitionManager.beginDelayedTransition(constraintHrCategory,transation)
        constraintSet.applyTo(constraintHrCategory)

    }
}