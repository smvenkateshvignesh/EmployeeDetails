package com.sample.employeedetails.ui.hrcategory.chooseattendence.attendancepickers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.sample.employeedetails.R
import com.sample.employeedetails.base.BaseActivity

class AttendancePickersActivity : BaseActivity(),PickersActivityCommunicator {
    override fun setLayout(): Int {
        return R.layout.activity_attendance_pickers
    }

    override fun initView(savedInstanceState: Bundle?) {
       loadFragment(YearPickerFragment())
    }

    override fun loadFragment(fragment: Fragment) {
        val ft = supportFragmentManager.beginTransaction()
        val fragmentTransaction = ft.replace(R.id.attendenceChooserFrameLayout, fragment)
        fragmentTransaction.addToBackStack(fragment.javaClass.name).commit()

    }

    override fun onBackPressed() {

         if (supportFragmentManager.backStackEntryCount > 1) {
            supportFragmentManager.popBackStack()
        } else {
            finish()
        }
    }
}
