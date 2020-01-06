package com.sample.employeedetails.ui.userprofile

import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.animation.AnimationUtils
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.sample.employeedetails.R
import com.sample.employeedetails.application.MyApplication
import com.sample.employeedetails.base.BaseActivity
import com.sample.employeedetails.ui.employeeslistactivity.EmployeesListActivity
import com.sample.employeedetails.ui.employeeslistactivity.EmployeesListModel
import kotlinx.android.synthetic.main.activity_user_profile.*

class UserProfileActivity : BaseActivity() {
    override fun setLayout(): Int {
        return R.layout.activity_user_profile
    }

    override fun initView(savedInstanceState: Bundle?) {
        profileBackIcon.setOnClickListener {
            onBackPressed()
        }
        getEmployeeDetails()
        setAnimLeft()
        setAnimRight()
    }

    private fun setAnimRight() {

        val animAboutDescription = AnimationUtils.loadAnimation(MyApplication.getApplicationContext(), R.anim.slide_in_right)
        txtAboutDescription.startAnimation(animAboutDescription)

        val animEmployIdNum = AnimationUtils.loadAnimation(MyApplication.getApplicationContext(), R.anim.slide_in_right)
        txtEmployIdNum.startAnimation(animEmployIdNum)

        val animEmId = AnimationUtils.loadAnimation(MyApplication.getApplicationContext(), R.anim.slide_in_right)
        txtDOJDate.startAnimation(animEmId)

        val animRelievedDate = AnimationUtils.loadAnimation(MyApplication.getApplicationContext(), R.anim.slide_in_right)
        txtRelievedDate.startAnimation(animRelievedDate)

        val animDOBDate = AnimationUtils.loadAnimation(MyApplication.getApplicationContext(), R.anim.slide_in_right)
        txtDOBDate.startAnimation(animDOBDate)

        val animSalary = AnimationUtils.loadAnimation(MyApplication.getApplicationContext(), R.anim.slide_in_right)
        txtSalary.startAnimation(animSalary)

    }

    private fun setAnimLeft() {

        val animAbout = AnimationUtils.loadAnimation(MyApplication.getApplicationContext(), R.anim.slide_in_left)
        txtAboutHeading.startAnimation(animAbout)

        val animDetail = AnimationUtils.loadAnimation(MyApplication.getApplicationContext(), R.anim.slide_in_left)
        txtDetailsHeading.startAnimation(animDetail)

        val animEmId = AnimationUtils.loadAnimation(MyApplication.getApplicationContext(), R.anim.slide_in_left)
        txtEmployIdHeading.startAnimation(animEmId)

        val animDOJ = AnimationUtils.loadAnimation(MyApplication.getApplicationContext(), R.anim.slide_in_left)
        txtEmployDOJHeading.startAnimation(animDOJ)

        val animRelive = AnimationUtils.loadAnimation(MyApplication.getApplicationContext(), R.anim.slide_in_left)
        txtEmployRelivedHeading.startAnimation(animRelive)

        val animDOB = AnimationUtils.loadAnimation(MyApplication.getApplicationContext(), R.anim.slide_in_left)
        txtEmployDOBHeading.startAnimation(animDOB)

        val animSalary = AnimationUtils.loadAnimation(MyApplication.getApplicationContext(), R.anim.slide_in_left)
        txtEmploySalaryHeading.startAnimation(animSalary)

        val animBackicon = AnimationUtils.loadAnimation(MyApplication.getApplicationContext(), R.anim.slide_in_left)
        profileBackIcon.startAnimation(animBackicon)

    }

    private fun getEmployeeDetails() {
        if (intent.hasExtra(EmployeesListActivity.BUNDEL_EMPLOYEE_DETAILS)) {

            val employeeDetails: EmployeesListModel =
                intent.getSerializableExtra(EmployeesListActivity.BUNDEL_EMPLOYEE_DETAILS) as EmployeesListModel
            Log.e("Employee", employeeDetails.name)
            txtProfileName.text = employeeDetails.name
            txtAboutDescriptionignation.text = employeeDetails.designation.value
            txtDOJDate.text = employeeDetails.joiningDate
            txtDOBDate.text = employeeDetails.dateOfBirth
            txtSalary.text = "${employeeDetails.salary} L p.a"
            textProfileNum.text = employeeDetails.contactPhone
            textProfileAddress.text = employeeDetails.address

            Glide.with(this).load(employeeDetails.profile)
                .apply(RequestOptions.circleCropTransform())
                .into(imgProfilePic)
            when (employeeDetails.status) {
                0 -> {
                    groupDateOfRelive.visibility = View.VISIBLE
                }
                1 -> {
                    groupDateOfRelive.visibility = View.GONE
                }
                2 -> {
                    groupDateOfRelive.visibility = View.VISIBLE
                    txtEmployRelivedHeading.text = "Date Of Reliving"
                }
            }
        }
    }
}