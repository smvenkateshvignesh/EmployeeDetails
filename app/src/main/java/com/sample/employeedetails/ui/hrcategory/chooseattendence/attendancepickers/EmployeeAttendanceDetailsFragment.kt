package com.sample.employeedetails.ui.hrcategory.chooseattendence.attendancepickers


import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager


import com.sample.employeedetails.R
import com.sample.employeedetails.application.MyApplication
import com.sample.employeedetails.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_employee_attendance_details.*


class EmployeeAttendanceDetailsFragment : BaseFragment() {
    lateinit var attendanceDetailsModel: ArrayList<AttendanceDetailsModel>
    override fun setLayout(): Int {

        return R.layout.fragment_employee_attendance_details
    }

    override fun initView(savedInstanceState: Bundle?) {
attendanceDetailsModel=ArrayList()
        attendanceDetailsModel.add(AttendanceDetailsModel(AttendanceDetailsModel.HEADER_TYPE,"November","","","",""))
   attendanceDetailsModel.add(AttendanceDetailsModel(AttendanceDetailsModel.Date_TYPE,"","01","Mon","09:00","06:00"))
        attendanceDetailsModel.add(AttendanceDetailsModel(AttendanceDetailsModel.Date_TYPE,"","01","Mon","09:00","06:00"))
        attendanceDetailsModel.add(AttendanceDetailsModel(AttendanceDetailsModel.Date_TYPE,"","01","Mon","09:00","06:00"))
        attendanceDetailsModel.add(AttendanceDetailsModel(AttendanceDetailsModel.Date_TYPE,"","01","Mon","09:00","06:00"))
        attendanceDetailsModel.add(AttendanceDetailsModel(AttendanceDetailsModel.Date_TYPE,"","01","Mon","09:00","06:00"))
        attendanceDetailsModel.add(AttendanceDetailsModel(AttendanceDetailsModel.Date_TYPE,"","01","Mon","09:00","06:00"))
        attendanceDetailsModel.add(AttendanceDetailsModel(AttendanceDetailsModel.Date_TYPE,"","01","Mon","09:00","06:00"))
        attendanceDetailsModel.add(AttendanceDetailsModel(AttendanceDetailsModel.Date_TYPE,"","01","Mon","09:00","06:00"))
        attendanceDetailsModel.add(AttendanceDetailsModel(AttendanceDetailsModel.Date_TYPE,"","01","Mon","09:00","06:00"))
        attendanceDetailsModel.add(AttendanceDetailsModel(AttendanceDetailsModel.Date_TYPE,"","01","Mon","09:00","06:00"))
        attendanceDetailsModel.add(AttendanceDetailsModel(AttendanceDetailsModel.Date_TYPE,"","01","Mon","09:00","06:00"))
        attendanceDetailsModel.add(AttendanceDetailsModel(AttendanceDetailsModel.Date_TYPE,"","01","Mon","",""))
        attendanceDetailsModel.add(AttendanceDetailsModel(AttendanceDetailsModel.HEADER_TYPE,"December","","","",""))
        attendanceDetailsModel.add(AttendanceDetailsModel(AttendanceDetailsModel.Date_TYPE,"","01","Mon","09:00","06:00"))
        attendanceDetailsModel.add(AttendanceDetailsModel(AttendanceDetailsModel.Date_TYPE,"","01","Mon","09:00","06:00"))
        attendanceDetailsModel.add(AttendanceDetailsModel(AttendanceDetailsModel.Date_TYPE,"","01","Mon","09:00","06:00"))
        attendanceDetailsModel.add(AttendanceDetailsModel(AttendanceDetailsModel.Date_TYPE,"","01","Mon","09:00","06:00"))
        attendanceDetailsModel.add(AttendanceDetailsModel(AttendanceDetailsModel.Date_TYPE,"","01","Mon","09:00","06:00"))
        attendanceDetailsModel.add(AttendanceDetailsModel(AttendanceDetailsModel.Date_TYPE,"","01","Mon","09:00","06:00"))
        attendanceDetailsModel.add(AttendanceDetailsModel(AttendanceDetailsModel.Date_TYPE,"","01","Mon","09:00","06:00"))
        attendanceDetailsModel.add(AttendanceDetailsModel(AttendanceDetailsModel.Date_TYPE,"","01","Mon","09:00","06:00"))
        attendanceDetailsModel.add(AttendanceDetailsModel(AttendanceDetailsModel.Date_TYPE,"","01","Mon","09:00","06:00"))
        attendanceDetailsModel.add(AttendanceDetailsModel(AttendanceDetailsModel.Date_TYPE,"","01","Mon","09:00","06:00"))
        attendanceDetailsModel.add(AttendanceDetailsModel(AttendanceDetailsModel.Date_TYPE,"","01","Mon","09:00","06:00"))
        attendanceDetailsModel.add(AttendanceDetailsModel(AttendanceDetailsModel.Date_TYPE,"","01","Mon","09:00","06:00"))
        attendanceDetailsModel.add(AttendanceDetailsModel(AttendanceDetailsModel.HEADER_TYPE,"january","","","",""))
        attendanceDetailsModel.add(AttendanceDetailsModel(AttendanceDetailsModel.Date_TYPE,"","01","Mon","09:00","06:00"))
        attendanceDetailsModel.add(AttendanceDetailsModel(AttendanceDetailsModel.Date_TYPE,"","01","Mon","09:00","06:00"))
        attendanceDetailsModel.add(AttendanceDetailsModel(AttendanceDetailsModel.Date_TYPE,"","01","Mon","09:00","06:00"))
        attendanceDetailsModel.add(AttendanceDetailsModel(AttendanceDetailsModel.Date_TYPE,"","01","Mon","09:00","06:00"))
        attendanceDetailsModel.add(AttendanceDetailsModel(AttendanceDetailsModel.Date_TYPE,"","01","Mon","09:00","06:00"))
        attendanceDetailsModel.add(AttendanceDetailsModel(AttendanceDetailsModel.Date_TYPE,"","01","Mon","09:00","06:00"))
        attendanceDetailsModel.add(AttendanceDetailsModel(AttendanceDetailsModel.Date_TYPE,"","01","Mon","09:00","06:00"))
        attendanceDetailsModel.add(AttendanceDetailsModel(AttendanceDetailsModel.Date_TYPE,"","01","Mon","09:00","06:00"))
        attendanceDetailsModel.add(AttendanceDetailsModel(AttendanceDetailsModel.Date_TYPE,"","01","Mon","09:00","06:00"))
        attendanceDetailsModel.add(AttendanceDetailsModel(AttendanceDetailsModel.Date_TYPE,"","01","Mon","09:00","06:00"))
        attendanceDetailsModel.add(AttendanceDetailsModel(AttendanceDetailsModel.Date_TYPE,"","01","Mon","09:00","06:00"))
        attendanceDetailsModel.add(AttendanceDetailsModel(AttendanceDetailsModel.Date_TYPE,"","01","Mon","09:00","06:00"))
        attendanceDetailsModel.add(AttendanceDetailsModel(AttendanceDetailsModel.HEADER_TYPE,"february","","","",""))
        attendanceDetailsModel.add(AttendanceDetailsModel(AttendanceDetailsModel.Date_TYPE,"","01","Mon","09:00","06:00"))
        attendanceDetailsModel.add(AttendanceDetailsModel(AttendanceDetailsModel.Date_TYPE,"","01","Mon","09:00","06:00"))
        attendanceDetailsModel.add(AttendanceDetailsModel(AttendanceDetailsModel.Date_TYPE,"","01","Mon","09:00","06:00"))
        attendanceDetailsModel.add(AttendanceDetailsModel(AttendanceDetailsModel.Date_TYPE,"","01","Mon","09:00","06:00"))
        attendanceDetailsModel.add(AttendanceDetailsModel(AttendanceDetailsModel.Date_TYPE,"","01","Mon","09:00","06:00"))
        attendanceDetailsModel.add(AttendanceDetailsModel(AttendanceDetailsModel.Date_TYPE,"","01","Mon","09:00","06:00"))
        attendanceDetailsModel.add(AttendanceDetailsModel(AttendanceDetailsModel.Date_TYPE,"","01","Mon","09:00","06:00"))
        attendanceDetailsModel.add(AttendanceDetailsModel(AttendanceDetailsModel.Date_TYPE,"","01","Mon","09:00","06:00"))
        attendanceDetailsModel.add(AttendanceDetailsModel(AttendanceDetailsModel.Date_TYPE,"","01","Mon","09:00","06:00"))
        attendanceDetailsModel.add(AttendanceDetailsModel(AttendanceDetailsModel.Date_TYPE,"","01","Mon","09:00","06:00"))
        attendanceDetailsModel.add(AttendanceDetailsModel(AttendanceDetailsModel.Date_TYPE,"","01","Mon","09:00","06:00"))
        attendanceDetailsModel.add(AttendanceDetailsModel(AttendanceDetailsModel.Date_TYPE,"","01","Mon","09:00","06:00"))

        attendanceDetailsRecyclerView.layoutManager=LinearLayoutManager(MyApplication.getApplicationContext())
        attendanceDetailsRecyclerView.adapter=AttendanceDetailsAdapter(attendanceDetailsModel)


    }




}
