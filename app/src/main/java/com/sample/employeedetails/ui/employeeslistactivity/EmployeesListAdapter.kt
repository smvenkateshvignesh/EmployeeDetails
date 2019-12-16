package com.sample.employeedetails.ui.employeeslistactivity

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Filter
import android.widget.Filterable
import android.widget.ImageView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.sample.employeedetails.R
import com.sample.employeedetails.application.MyApplication
import com.sample.employeedetails.widgets.MyTextView


class EmployeesListAdapter(private val searchList: ArrayList<EmployeesListModel>) :
    RecyclerView.Adapter<EmployeesListAdapter.ViewHolder>(), Filterable {
    private val employeeList = ArrayList(searchList)

    var employeeDetailsClickListener: EmployeeDetailsClickListener? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view: View = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_cardview_item, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return searchList.size
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(searchList[position])
    }

    inner class ViewHolder( itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(searchList: EmployeesListModel) {
            employeeName.text = searchList.name
            empDesignation.text = "(${searchList.designation})"
            empId.text = searchList.id
            empProfile.setImageResource(searchList.profile)
            if (searchList.status == 1) {
                empStatus.setImageResource(R.drawable.ic_active_status)
            } else if (searchList.status == 2) {
                empStatus.setImageResource(R.drawable.ic_hold_status)
            } else {
                empStatus.setImageResource(R.drawable.ic_inactive_status)
            }
            Glide.with(MyApplication.getApplicationContext())
                .load(searchList.profile)
                .apply(RequestOptions.circleCropTransform())
                .into(empProfile)
            cardEmployeeDetails.setOnClickListener {

                employeeDetailsClickListener?.onClick(searchList)
            }
        }

        private val employeeName: MyTextView
        private val empDesignation: MyTextView
        private val empId: MyTextView
        private val empProfile: ImageView
        private val empStatus: ImageView
        private val cardEmployeeDetails:CardView

        init {
            employeeName = itemView.findViewById(R.id.cardEmpName)
            empDesignation = itemView.findViewById(R.id.cardEmpDesignation)
            empId = itemView.findViewById(R.id.cardEmpIdNumber)
            empProfile = itemView.findViewById(R.id.cardEmpProfile)
            empStatus = itemView.findViewById(R.id.empStatusIndicator)
            cardEmployeeDetails=itemView.findViewById(R.id.cardEmployeeDetails)
        }
    }

    fun setOnClickListener(employeeDetailsClickListener: EmployeeDetailsClickListener) {
        this.employeeDetailsClickListener = employeeDetailsClickListener
    }

    interface EmployeeDetailsClickListener {
        fun onClick(searchList: EmployeesListModel)
        fun showNoDataMessage(show: Boolean)
    }


    override fun getFilter(): Filter {
        return EmpFilter
    }

    private val EmpFilter: Filter = object : Filter() {
        override fun performFiltering(constraint: CharSequence?): FilterResults {
            val empFilteredList: ArrayList<EmployeesListModel> = ArrayList()
            if (constraint?.isEmpty() == true) {
                empFilteredList.addAll(employeeList)
            } else {
                val searchedName = constraint.toString().trim()
                for (item in employeeList) {
                    if (item.name.contains(searchedName, true)) {
                        empFilteredList.add(item)
                    }
                }
            }
            val results = FilterResults()
            results.values = empFilteredList
            return results
        }

        override fun publishResults(constraint: CharSequence?, results: FilterResults?) {
            searchList.clear()
            if (results?.values != null) {
                val searchedResults = results.values as ArrayList<EmployeesListModel>
                searchList.addAll(searchedResults)
                employeeDetailsClickListener?.showNoDataMessage(searchedResults.size<=0)

            }
            notifyDataSetChanged()
        }

    }
}
