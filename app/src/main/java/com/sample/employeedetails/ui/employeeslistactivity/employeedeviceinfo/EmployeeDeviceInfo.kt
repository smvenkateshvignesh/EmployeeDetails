package com.sample.employeedetails.ui.employeeslistactivity.employeedeviceinfo

import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.sample.employeedetails.R
import com.sample.employeedetails.base.BaseActivity
import com.sample.employeedetails.ui.employeeslistactivity.EmployeesListActivity
import com.sample.employeedetails.ui.employeeslistactivity.EmployeesListModel
import com.sample.employeedetails.ui.hrcategory.deviceinfo.DeviceInfoModel
import kotlinx.android.synthetic.main.activity_device_info.deviceInfoBack
import kotlinx.android.synthetic.main.activity_employee_device_info.*

class EmployeeDeviceInfo:BaseActivity(),EmployeesDeviceInfoAdapter.getDeviceInfo{
    lateinit var deviceInfoModel: ArrayList<DeviceInfoModel>
    lateinit var employeeDeviceInfoAdapter: EmployeesDeviceInfoAdapter

    private var employeeDetails: EmployeesListModel?= null

    override fun setLayout(): Int {
        return R.layout.activity_employee_device_info
    }

    override fun initView(savedInstanceState: Bundle?) {
        deviceInfoModel = ArrayList()
        deviceInfoModel.add(DeviceInfoModel(1, R.drawable.laptop, "Laptops", 20))
        deviceInfoModel.add(DeviceInfoModel(2, R.drawable.mobile, "Mobiles", 12))
        deviceInfoModel.add(DeviceInfoModel(4, R.drawable.chairs, "Chairs", 23))
        deviceInfoModel.add(DeviceInfoModel(5, R.drawable.bag, "Bags", 20))
        deviceInfoModel.add(DeviceInfoModel(6, R.drawable.cable, "Cables", 2))
        deviceInfoModel.add(DeviceInfoModel(7, R.drawable.ipad, "Tabs", 10))
        deviceInfoModel.add(DeviceInfoModel(8, R.drawable.mouse, "Mouse", 35))
        deviceInfoModel.add(DeviceInfoModel(9, R.drawable.usb, "Pen Drives", 90))

        employeeDeviceInfo_rv.layoutManager = GridLayoutManager(this, 3)
        employeeDeviceInfoAdapter = EmployeesDeviceInfoAdapter(deviceInfoModel)
        val itemOffsetDecoration1 =
            EmployeesListActivity.ItemOffsetDecoration(
                this,
                R.dimen._10dp
            )
        employeeDeviceInfo_rv.adapter = employeeDeviceInfoAdapter
        employeeDeviceInfo_rv.addItemDecoration(itemOffsetDecoration1)

        deviceInfoBack.setOnClickListener {
            onBackPressed()
            getEmployeeDeviceInfo()
        }
    }

    override fun getEmployeeDeviceInfo() {

        if (intent.hasExtra(EmployeesListActivity.BUNDEL_EMPLOYEE_DETAILS)) {
            employeeDetails = intent.getSerializableExtra(EmployeesListActivity.BUNDEL_EMPLOYEE_DETAILS) as EmployeesListModel
        }
    }
}