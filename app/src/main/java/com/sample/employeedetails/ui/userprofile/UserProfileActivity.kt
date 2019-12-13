package com.sample.employeedetails.ui.userprofile

import android.os.Bundle
import android.util.Log
import android.view.View
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.sample.employeedetails.R
import com.sample.employeedetails.base.BaseActivity
import com.sample.employeedetails.ui.employeeslistactivity.EmployeesListActivity
import com.sample.employeedetails.ui.employeeslistactivity.EmployeesListModel
import kotlinx.android.synthetic.main.activity_user_profile.*

class UserProfileActivity : BaseActivity() {
    override fun setLayout(): Int {
        return R.layout.activity_user_profile
    }

    override fun initView(savedInstanceState: Bundle?) {
        getEmployeeDetails()
    }

    private fun getEmployeeDetails() {
        if (intent.hasExtra(EmployeesListActivity.BUNDEL_EMPLOYEE_DETAILS)) {

            val employeeDetails:EmployeesListModel = intent.getSerializableExtra(EmployeesListActivity.BUNDEL_EMPLOYEE_DETAILS) as EmployeesListModel
            Log.e("Employee",employeeDetails.name)
            txtProfileName.text = employeeDetails.name
            txtAboutDescriptionignation.text = employeeDetails.designation
            txtEmployIdNum.text = employeeDetails.id
            txtDOJDate.text = employeeDetails.joiningDate
            txtDOBDate.text = employeeDetails.dateOfBirth
            txtSalary.setText(employeeDetails.salary.toString() +"L p.a")
            textProfileNum.text = employeeDetails.contactPhone
            textProfileAddress.text = employeeDetails.address

            Glide.with(this).load(employeeDetails.profile).apply(RequestOptions.circleCropTransform())
                .into(imgProfilePic)
            when(employeeDetails.status){
                0->{
                    groupDateOfRelive.visibility=View.VISIBLE
                }
                1->{
                    groupDateOfRelive.visibility=View.GONE
                }
                2->{
                    groupDateOfRelive.visibility=View.VISIBLE
                    txtEmployRelivedHeading.text = "Date Of Reliving"
                }
            }

        }
    }
}