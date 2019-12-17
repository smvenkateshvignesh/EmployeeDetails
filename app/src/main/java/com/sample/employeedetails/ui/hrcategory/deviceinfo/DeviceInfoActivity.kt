package com.sample.employeedetails.ui.hrcategory.deviceinfo

import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.sample.employeedetails.R
import com.sample.employeedetails.base.BaseActivity
import kotlinx.android.synthetic.main.activity_device_info.*

class DeviceInfoActivity: BaseActivity() {
    lateinit var deviceInfoModel:ArrayList<DeviceInfoModel>
    lateinit var deviceInfoAdapter:DeviceInfoAdapter
    override fun setLayout(): Int {
        return R.layout.activity_device_info
    }

    override fun initView(savedInstanceState: Bundle?) {
        deviceInfoModel=ArrayList()
       deviceInfoModel.add(DeviceInfoModel(1,R.drawable.smartphone,"Laptops/20",20))
        deviceInfoModel.add(DeviceInfoModel(1,R.drawable.smartphone,"Laptops/20",20))
        deviceInfoModel.add(DeviceInfoModel(1,R.drawable.smartphone,"Laptops/20",20))
        deviceInfoModel.add(DeviceInfoModel(1,R.drawable.smartphone,"Laptops/20",20))

        deviceInfo_rv.layoutManager=GridLayoutManager(this,2)
        deviceInfoAdapter= DeviceInfoAdapter(deviceInfoModel)
        deviceInfo_rv.adapter=deviceInfoAdapter

    }
}