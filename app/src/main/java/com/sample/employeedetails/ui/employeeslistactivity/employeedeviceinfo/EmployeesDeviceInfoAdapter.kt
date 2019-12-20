package com.sample.employeedetails.ui.employeeslistactivity.employeedeviceinfo

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.sample.employeedetails.R
import com.sample.employeedetails.application.MyApplication
import com.sample.employeedetails.ui.employeeslistactivity.EmployeesListModel
import com.sample.employeedetails.ui.hrcategory.deviceinfo.DeviceInfoModel


class EmployeesDeviceInfoAdapter(private val deviceInfoModel: ArrayList<DeviceInfoModel>) :
    RecyclerView.Adapter<EmployeesDeviceInfoAdapter.EmployeesDeviceInfoViewHolder>() {

    private var employeeDetails: EmployeesListModel? = null


    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): EmployeesDeviceInfoViewHolder {
        val view: View = LayoutInflater.from(parent.context)
            .inflate(R.layout.device_info_rv, parent, false)
        return EmployeesDeviceInfoViewHolder(view)
    }

    override fun getItemCount(): Int {
        return deviceInfoModel.size
    }

    override fun onBindViewHolder(holder: EmployeesDeviceInfoViewHolder, position: Int) {
        holder.bind(deviceInfoModel[position])
    }

    inner class EmployeesDeviceInfoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(deviceInfoModel: DeviceInfoModel) {
            Glide.with(MyApplication.getApplicationContext())
                .load(deviceInfoModel.deviceIcon)
                .into(deviceImage)
            deviceHeading.text = deviceInfoModel.deviceName
        }

        private val deviceImage: ImageView = itemView.findViewById(R.id.deviceInfoLaptop)
        private val deviceHeading: TextView = itemView.findViewById(R.id.deviceInfoLaptopHeading)

    }

    interface getDeviceInfo {
        fun getEmployeeDeviceInfo()
    }
}
