package com.sample.employeedetails.ui.mainactivity

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.sample.employeedetails.R
import com.sample.employeedetails.application.MyApplication
import com.sample.employeedetails.widgets.MyTextView


class MainAdater(private val mainModel: ArrayList<MainModel>) :
    RecyclerView.Adapter<MainAdater.ViewHolder>() {

     var employeeDetailsClickListener :EmployeeDetailsClickListener? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view: View = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_cardview_item, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return mainModel.size
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(mainModel[position])
    }

   inner class ViewHolder : RecyclerView.ViewHolder {
        fun bind(mainModel: MainModel) {
            employeeName.text = mainModel.name
            empDesignation.setText("(${mainModel.designation})")
            empId.text = mainModel.id
            empProfile.setImageResource(mainModel.profile)
            if (mainModel.status==1){
                empStatus.setImageResource(R.drawable.ic_active_status)
            }else if (mainModel.status==2){
                empStatus.setImageResource(R.drawable.ic_hold_status)
            }else{
                empStatus.setImageResource(R.drawable.ic_inactive_status)
            }
            Glide.with(MyApplication.getApplicationContext())
                .load(mainModel.profile)
                .apply(RequestOptions.circleCropTransform())
                .into(empProfile)
            empProfile.setOnClickListener{

                employeeDetailsClickListener?.onClick(mainModel)
            }
        }

        private val employeeName: MyTextView
        private val empDesignation: MyTextView
        private val empId: MyTextView
        private val empProfile: ImageView
        private val empStatus: ImageView
        constructor(itemView: View) : super(itemView) {
            employeeName = itemView.findViewById(R.id.cardEmpName)
            empDesignation = itemView.findViewById(R.id.cardEmpDesignation)
            empId = itemView.findViewById(R.id.cardEmpIdNumber)
            empProfile = itemView.findViewById(R.id.cardEmpProfile)
            empStatus = itemView.findViewById(R.id.empStatusIndicator)
        }
    }

    fun setOnClickListener(employeeDetailsClickListener :EmployeeDetailsClickListener){
        this.employeeDetailsClickListener = employeeDetailsClickListener
    }
    interface EmployeeDetailsClickListener{
         fun onClick(mainModel: MainModel)

    }
}