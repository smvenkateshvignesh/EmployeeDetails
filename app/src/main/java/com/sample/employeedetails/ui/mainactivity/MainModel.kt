package com.sample.employeedetails.ui.mainactivity

import java.io.Serializable

class MainModel(
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
