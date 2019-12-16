package com.sample.employeedetails.ui.employeeslistactivity

import java.io.Serializable

class EmployeesListModel(
    val profile: Int,
    val name: String,
    val designation: String,
    val id: String,
    val address: String,
    val contactPhone: String,
    val salary: Float,
    val dateOfBirth: String,
    val joiningDate: String,
    val status: Int,

    val dateOfReliving: String? = null
) : Serializable