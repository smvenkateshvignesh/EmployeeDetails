package com.sample.employeedetails.ui.employeedetails

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sample.employeedetails.R
import com.sample.employeedetails.base.BaseActivity
import kotlinx.android.synthetic.main.activity_employee_details.*

class EmployeeDetailsActivity : BaseActivity() {
    override fun setLayout(): Int {
       return R.layout.activity_employee_details
    }

    override fun initView(savedInstanceState: Bundle?) {

    }

}
