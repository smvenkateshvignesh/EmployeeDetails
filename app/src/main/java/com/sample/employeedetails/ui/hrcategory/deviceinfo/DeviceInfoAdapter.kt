package com.sample.employeedetails.ui.hrcategory.deviceinfo

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.sample.employeedetails.R
import com.sample.employeedetails.application.MyApplication
import org.w3c.dom.Text

class DeviceInfoAdapter(private val deviceInfoModel: ArrayList<DeviceInfoModel>) :
    RecyclerView.Adapter<DeviceInfoAdapter.DeviceInfoViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DeviceInfoViewHolder {
        val view: View = LayoutInflater.from(parent.context)
            .inflate(R.layout.device_info_rv, parent, false)
        return DeviceInfoViewHolder(view)
    }

    override fun getItemCount(): Int {
        return deviceInfoModel.size
    }

    override fun onBindViewHolder(holder: DeviceInfoViewHolder, position: Int) {
        holder.bind(deviceInfoModel[position])
    }

    inner class DeviceInfoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(deviceInfoModel: DeviceInfoModel) {
            Glide.with(MyApplication.getApplicationContext())
                .load(deviceInfoModel.deviceIcon)
                .into(deviceImage)
            deviceHeading.text = deviceInfoModel.deviceName
        }

        private val deviceImage: ImageView = itemView.findViewById(R.id.deviceInfoLaptop)
        private val deviceHeading: TextView = itemView.findViewById(R.id.deviceInfoLaptopHeading)

    }
}