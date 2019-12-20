package com.sample.employeedetails.ui.hrcategory.chooseattendence.attendancepickers


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


import com.sample.employeedetails.R
import com.sample.employeedetails.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_attendance_year_picker.*


class YearPickerFragment :BaseFragment(){
    override fun setLayout(): Int {
        return R.layout.fragment_attendance_year_picker
    }

    override fun initView(savedInstanceState: Bundle?) {
        imgYearPickerAttendenceBack.setOnClickListener {
            activity?.onBackPressed()

        }
        fabYearPicker.setOnClickListener{

            val fm = activity?.supportFragmentManager
            fm?.beginTransaction()
                ?.replace(R.id.attendenceChooserFrameLayout, MonthPickerFragment())
                ?.addToBackStack(null)
                ?.commit()
        }

    }


}
