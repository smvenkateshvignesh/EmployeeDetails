package com.sample.employeedetails.ui.hrcategory.chooseattendence

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.sample.employeedetails.R
import com.sample.employeedetails.base.BaseActivity
import com.sample.employeedetails.ui.employeeslistactivity.EmployeesListActivity
import com.sample.employeedetails.ui.hrcategory.chooseattendence.attendancepickers.AttendancePickersActivity
import com.sample.employeedetails.ui.hrcategory.chooseattendence.attendancepickers.PickersActivityCommunicator
import kotlinx.android.synthetic.main.activity_choose_attendence.*
import kotlinx.android.synthetic.main.choose_attendence_item.view.*

class ChooseAttendanceActivity : BaseActivity() {
    override fun setLayout(): Int {

        return R.layout.activity_choose_attendence
    }


    override fun initView(savedInstanceState: Bundle?) {
        leaves.txtChooser.text = "Leaves"
        leaves.imgChooser.setImageResource(R.drawable.ic_leave_vector)
        permissions.txtChooser.text = "Permissions"
        permissions.imgChooser.setImageResource(R.drawable.ic_permission_vector)
        setOnCLickListeners()
    }

    private fun setOnCLickListeners() {
        leaves.setOnClickListener {
            val intent = Intent(this@ChooseAttendanceActivity, AttendancePickersActivity::class.java)
            startActivity(intent)
            finish()
        }
        permissions.setOnClickListener {
            val intent = Intent(this@ChooseAttendanceActivity, EmployeesListActivity::class.java)
            startActivity(intent)
            finish()
        }
        imgChooseAttendenceBack.setOnClickListener {
            onBackPressed()

        }
    }

}