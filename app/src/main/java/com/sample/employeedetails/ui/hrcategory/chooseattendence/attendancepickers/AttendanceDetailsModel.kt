package com.sample.employeedetails.ui.hrcategory.chooseattendence.attendancepickers

class AttendanceDetailsModel(
    var type: Int,
    var month: String,
    var date: String,
    var day: String,
    var punchInTime: String,
    var punchOutTime: String
) {

    companion object {
        const val HEADER_TYPE = 0
        const val Date_TYPE = 1
    }

}