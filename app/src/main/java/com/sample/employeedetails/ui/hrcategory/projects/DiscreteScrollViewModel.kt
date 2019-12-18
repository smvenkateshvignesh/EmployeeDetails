package com.sample.employeedetails.ui.hrcategory.projects

import com.sample.employeedetails.R

class DiscreteScrollViewModel {
    fun get(): DiscreteScrollViewModel {
        return DiscreteScrollViewModel()
    }

    fun getData(): List<DiscreteScrollViewItem> {
        return listOf(
            DiscreteScrollViewItem((R.drawable.img_dummy_profile_one),"Dental For CheckUp"),
            DiscreteScrollViewItem((R.drawable.img_dummy_profile_one),"Dental For CheckUp"),
            DiscreteScrollViewItem((R.drawable.img_dummy_profile_one),"Dental For CheckUp"),
            DiscreteScrollViewItem((R.drawable.img_dummy_profile_one),"Dental For CheckUp")
            )
    }
}