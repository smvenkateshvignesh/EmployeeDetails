package com.sample.employeedetails.ui.hrcategory.deviceinfo

import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.sample.employeedetails.R
import com.sample.employeedetails.base.BaseActivity
import com.sample.employeedetails.ui.employeeslistactivity.EmployeesListActivity
import kotlinx.android.synthetic.main.activity_device_info.*

class DeviceInfoActivity : BaseActivity() {
    lateinit var deviceInfoModel: ArrayList<DeviceInfoModel>
    lateinit var deviceInfoAdapter: DeviceInfoAdapter
    override fun setLayout(): Int {
        return R.layout.activity_device_info
    }

    override fun initView(savedInstanceState: Bundle?) {
        deviceInfoModel = ArrayList()
        deviceInfoModel.add(DeviceInfoModel(1, R.drawable.laptop, "Laptops", 20))
        deviceInfoModel.add(DeviceInfoModel(1, R.drawable.mobile, "Mobiles", 12))
        deviceInfoModel.add(DeviceInfoModel(1, R.drawable.airconditioner, "Ac", 9))
        deviceInfoModel.add(DeviceInfoModel(1, R.drawable.chairs, "Chairs", 23))
        deviceInfoModel.add(DeviceInfoModel(1, R.drawable.bag, "Bags", 20))
        deviceInfoModel.add(DeviceInfoModel(1, R.drawable.cable, "Cables", 2))
        deviceInfoModel.add(DeviceInfoModel(1, R.drawable.charger, "Chargers", 10))
        deviceInfoModel.add(DeviceInfoModel(1, R.drawable.mouse, "Mouse", 35))
        deviceInfoModel.add(DeviceInfoModel(1, R.drawable.usb, "Pen Drives", 90))

        deviceInfo_rv.layoutManager = GridLayoutManager(this, 3)
        deviceInfoAdapter = DeviceInfoAdapter(deviceInfoModel)
        val itemOffsetDecoration1 =
            EmployeesListActivity.ItemOffsetDecoration(this, R.dimen._10dp)
        deviceInfo_rv.adapter = deviceInfoAdapter
        deviceInfo_rv.addItemDecoration(itemOffsetDecoration1)

        deviceInfoBack.setOnClickListener {
            onBackPressed()
        }

    }
}