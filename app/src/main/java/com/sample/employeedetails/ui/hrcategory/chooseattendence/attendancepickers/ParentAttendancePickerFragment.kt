package com.sample.employeedetails.ui.hrcategory.chooseattendence.attendancepickers

import android.os.Bundle
import androidx.fragment.app.Fragment
import com.sample.employeedetails.R
import com.sample.employeedetails.base.BaseFragment

class ParentAttendancePickerFragment:BaseFragment() {
    override fun setLayout(): Int {
        return R.layout.parent_attendance_picker_fragment
    }

    override fun initView(savedInstanceState: Bundle?) {
//        loadFragment(YearPickerFragment())
    }

//    override fun loadFragment(fragment: Fragment) {
//        val ft = childFragmentManager.beginTransaction()
//        val fragmentTransaction = ft.add(R.id.parentAttendencePickerFrameLayout, fragment)
//        fragmentTransaction.addToBackStack(fragment.javaClass.name).commit()
//    }
}