package com.sample.employeedetails.ui.employeedetails

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.transition.AutoTransition
import android.transition.TransitionManager
import androidx.constraintlayout.widget.ConstraintSet
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.sample.employeedetails.R
import com.sample.employeedetails.base.BaseActivity
import com.sample.employeedetails.ui.employeeslistactivity.EmployeesListActivity
import com.sample.employeedetails.ui.employeeslistactivity.EmployeesListModel
import com.sample.employeedetails.ui.employeeslistactivity.employeedeviceinfo.EmployeeDeviceInfo
import com.sample.employeedetails.ui.employeeslistactivity.salaryprogress.SalaryProgressActivity
import com.sample.employeedetails.ui.employeeslistactivity.team.TeamGraphActivity
import com.sample.employeedetails.ui.hrcategory.chooseattendence.ChooseAttendanceActivity
import com.sample.employeedetails.ui.hrcategory.deviceinfo.DeviceInfoActivity
import com.sample.employeedetails.ui.userprofile.UserProfileActivity
import kotlinx.android.synthetic.main.activity_employee_details.*
import kotlinx.android.synthetic.main.activity_hr_category.*

class EmployeeDetailsActivity : BaseActivity() {
    private var isShowingInfo = false
    private var employeeDetails: EmployeesListModel?= null

    override fun setLayout(): Int {
       return R.layout.activity_employee_details_first
    }

    override fun initView(savedInstanceState: Bundle?) {
        icon_back.setOnClickListener {
            onBackPressed()
        }
        getEmployeeDetails()
        Handler().postDelayed({
            swap(R.layout.activity_employee_details)

        },50)
//        employeeProfilePic.setOnClickListener {
//            if (isShowingInfo) {
//                swap(R.layout.activity_employee_details_first)
//            } else {
//                swap(R.layout.activity_employee_details)
//            }
//        }
        cardProfile.setOnClickListener {
            val myIntent =
                Intent(this@EmployeeDetailsActivity, UserProfileActivity::class.java)
            myIntent.putExtra(EmployeesListActivity.BUNDEL_EMPLOYEE_DETAILS, employeeDetails)
            startActivity(myIntent)
        }
        cardSalaryProgress.setOnClickListener{
            val intent=Intent(this@EmployeeDetailsActivity, SalaryProgressActivity::class.java)
            startActivity(intent)
        }
        cardAttendance.setOnClickListener {
            val intent=Intent(this@EmployeeDetailsActivity, ChooseAttendanceActivity::class.java)
            startActivity(intent)
        }
        cardDeviceInfo.setOnClickListener {
            val intent=Intent(this@EmployeeDetailsActivity, EmployeeDeviceInfo::class.java)
            startActivity(intent)
        }
        cardTeam.setOnClickListener {
            val intent=Intent(this@EmployeeDetailsActivity, TeamGraphActivity::class.java)
            startActivity(intent)
        }

    }
    private fun swap(layoutId: Int) {
        val constraintSet = ConstraintSet()
        constraintSet.clone(this, layoutId)
        val transation = AutoTransition()
//        transation.interpolator = AnticipateOvershootInterpolator(1.5f)
        transation.duration = 800
        TransitionManager.beginDelayedTransition(constraintEmployeeDetails,transation)
        constraintSet.applyTo(constraintEmployeeDetails)
        isShowingInfo = !isShowingInfo

    }

    private fun getEmployeeDetails() {
        if (intent.hasExtra(EmployeesListActivity.BUNDEL_EMPLOYEE_DETAILS)) {
            employeeDetails = intent.getSerializableExtra(EmployeesListActivity.BUNDEL_EMPLOYEE_DETAILS) as EmployeesListModel
            txtEmployeeName.text = employeeDetails?.name
            txtEmployeeDesc.text = "(${employeeDetails?.designation?.value})"
            Glide.with(this).load(employeeDetails?.profile).apply(RequestOptions.circleCropTransform())
                .into(employeeProfilePic)
        }
    }

}
