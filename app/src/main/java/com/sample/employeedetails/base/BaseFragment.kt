package com.sample.employeedetails.base

import androidx.fragment.app.Fragment

abstract class BaseFragment :Fragment() {
    abstract fun setLayout(): Int
}