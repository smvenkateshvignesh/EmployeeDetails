package com.sample.employeedetails.ui.employeeslistactivity

import java.io.Serializable

class EmployeesListModel(
    val profile: Int,
    val name: String,
    val designation: DesignationCategory,
    val id: String,
    val address: String,
    val contactPhone: String,
    val salary: Float,
    val dateOfBirth: String,
    val joiningDate: String,
    val status: Int,
val branch:OfficeBranches,
    val dateOfReliving: String? = null
) : Serializable
