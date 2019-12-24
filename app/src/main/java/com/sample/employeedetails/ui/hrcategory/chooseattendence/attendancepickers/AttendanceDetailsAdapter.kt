package com.sample.employeedetails.ui.hrcategory.chooseattendence.attendancepickers

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.kodmap.library.kmrecyclerviewstickyheader.KmStickyListener
import com.sample.employeedetails.R
import com.sample.employeedetails.widgets.MyTextView

class AttendanceDetailsAdapter(private val attendanceDetailsModel: ArrayList<AttendanceDetailsModel>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder?>(), KmStickyListener {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view: View
        when (viewType) {
            AttendanceDetailsModel.HEADER_TYPE -> {
                view = LayoutInflater.from(parent.context)
                    .inflate(R.layout.employee_attendance_details_item2, parent, false)
                return HeaderTypeViewHolder(view)
            }
            AttendanceDetailsModel.Date_TYPE -> {
                view = LayoutInflater.from(parent.context)
                    .inflate(R.layout.employee_attendance_details_item1, parent, false)
                return DateTypeViewHolder(view)
            }
            else -> {
                view = LayoutInflater.from(parent.context)
                    .inflate(R.layout.employee_attendance_details_item1, parent, false)
                return DateTypeViewHolder(view)
            }
        }

    }

    override fun getItemCount(): Int {
        return attendanceDetailsModel.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val objAttendanceDetailsModel: AttendanceDetailsModel = attendanceDetailsModel[position]
        if (objAttendanceDetailsModel != null) {
            when (objAttendanceDetailsModel.type) {
                AttendanceDetailsModel.HEADER_TYPE -> {
                    (holder as HeaderTypeViewHolder).bind(attendanceDetailsModel[position])
                }
                AttendanceDetailsModel.Date_TYPE -> {
                    (holder as DateTypeViewHolder).bind(attendanceDetailsModel[position])
                }
            }
        }
    }

    class HeaderTypeViewHolder(itemView: View) :
        RecyclerView.ViewHolder(itemView) {
        fun bind(attendanceDetailsModel: AttendanceDetailsModel) {
            txtMonth.text = attendanceDetailsModel.month
        }

        private val txtMonth: MyTextView


        init {
            txtMonth = itemView.findViewById(R.id.attendanceDetailsMonth)
        }
    }


    class DateTypeViewHolder(itemView: View) :
        RecyclerView.ViewHolder(itemView) {
        @SuppressLint("ResourceAsColor")
        fun bind(attendanceDetailsModel: AttendanceDetailsModel) {
            txtDay.text = attendanceDetailsModel.day
            txtDate.text = "${attendanceDetailsModel.date}"
            txtPunchINTime.text = "${attendanceDetailsModel.punchInTime} AM"
            txtPunchOutTime.text = "${attendanceDetailsModel.punchOutTime} PM"

            if (attendanceDetailsModel.punchInTime.isEmpty()&&attendanceDetailsModel.punchOutTime.isEmpty()&&attendanceDetailsModel.type.equals(AttendanceDetailsModel.Date_TYPE)){
                txtLeavePunch.visibility=View.VISIBLE
                imgPunchLeave.visibility=View.VISIBLE
                viewDottedLines.visibility=View.GONE
                imgPunchOut.visibility=View.GONE
                imgPunchIn.visibility=View.GONE
                headPunchOutTime.visibility=View.GONE
                headPunchINTime.visibility=View.GONE
                txtPunchOutTime.visibility=View.GONE
                txtPunchINTime.visibility=View.GONE
//                cardPunchDetails.setCardBackgroundColor(R.color.lightOrange)
                layoutPunchGroup.setBackgroundResource(R.color.lightOrange)
            }
            else{
                txtLeavePunch.visibility=View.GONE
                imgPunchLeave.visibility=View.GONE
                viewDottedLines.visibility=View.VISIBLE
                imgPunchOut.visibility=View.VISIBLE
                imgPunchIn.visibility=View.VISIBLE
                headPunchOutTime.visibility=View.VISIBLE
                headPunchINTime.visibility=View.VISIBLE
                txtPunchOutTime.visibility=View.VISIBLE
                txtPunchINTime.visibility=View.VISIBLE
//                cardPunchDetails.setCardBackgroundColor(R.color.white)
                layoutPunchGroup.setBackgroundResource(R.color.white)
            }


        }

        private val txtDate: MyTextView
        private val txtDay: MyTextView
        private val txtPunchINTime: MyTextView
        private val txtPunchOutTime: MyTextView
        private val headPunchINTime: MyTextView
        private val headPunchOutTime: MyTextView
        private val imgPunchIn: ImageView
        private val imgPunchOut: ImageView
        private val viewDottedLines: View
        private val cardPunchDetails:CardView
        private val imgPunchLeave:ImageView
private val txtLeavePunch:MyTextView
        private val layoutPunchGroup:ConstraintLayout
        init {
            txtDate = itemView.findViewById(R.id.txtAttendanceDetailsDate)
            txtDay = itemView.findViewById(R.id.txtAttendanceDetailsDay)
            txtPunchINTime = itemView.findViewById(R.id.txtPunchInTime)
            txtPunchOutTime = itemView.findViewById(R.id.txtPunchOutTime)
            headPunchINTime = itemView.findViewById(R.id.txtPunchIn)
            headPunchOutTime = itemView.findViewById(R.id.txtPunchOut)
            imgPunchIn = itemView.findViewById(R.id.imgPunchInArrow)
            imgPunchOut = itemView.findViewById(R.id.imgPunchOutArrow)
            viewDottedLines = itemView.findViewById(R.id.view)
            cardPunchDetails=itemView.findViewById(R.id.cardPunchTime)
            imgPunchLeave=itemView.findViewById(R.id.imgLeave)
            txtLeavePunch=itemView.findViewById(R.id.txtLeave)
            layoutPunchGroup=itemView.findViewById(R.id.layoutPunchTime)

        }
    }


    override fun getItemViewType(position: Int): Int {
        when (attendanceDetailsModel[position].type) {
            0 -> return AttendanceDetailsModel.HEADER_TYPE
            1 -> return AttendanceDetailsModel.Date_TYPE
        }
        return -1
    }

    override fun isHeader(itemPosition: Int?): Boolean {
        return attendanceDetailsModel[itemPosition!!].type == AttendanceDetailsModel.HEADER_TYPE
    }

    override fun getHeaderLayout(headerPosition: Int?): Int {
        return R.layout.employee_attendance_details_item2
    }

    override fun getHeaderPositionForItem(itemPosition: Int?): Int {
        var headerPosition: Int? = 0
        for (i in itemPosition!! downTo 1) {
            if (isHeader(i)) {
                headerPosition = i
                return headerPosition
            }


        }
        return headerPosition!!
    }

    override fun bindHeaderData(header: View?, headerPosition: Int?) {
        val txtHeaderAttendanceMonth = header!!.findViewById<TextView>(R.id.attendanceDetailsMonth)
        txtHeaderAttendanceMonth.text = attendanceDetailsModel[headerPosition!!].month
    }
}


