package com.sample.employeedetails.ui.hrcategory.chooseattendence.attendancepickers


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView


import com.sample.employeedetails.R
import com.sample.employeedetails.base.BaseFragment


class MonthPickerFragment :BaseFragment() {
    override fun setLayout(): Int {
        return R.layout.fragment_attendance_month_picker
    }

    override fun initView(savedInstanceState: Bundle?) {
    }


}
