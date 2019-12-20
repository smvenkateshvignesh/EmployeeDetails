package com.sample.employeedetails.ui.hrcategory.projects

import com.sample.employeedetails.R

class DiscreteScrollViewModel {
    fun get(): DiscreteScrollViewModel {
        return DiscreteScrollViewModel()
    }

    fun getData(): List<DiscreteScrollViewItem> {
        return listOf(
            DiscreteScrollViewItem((R.drawable.dummy_pic),"Dental CheckUp"),
            DiscreteScrollViewItem((R.drawable.dummy_pic),"Dental CheckUp"),
            DiscreteScrollViewItem((R.drawable.dummy_pic),"Dental CheckUp"),
            DiscreteScrollViewItem((R.drawable.dummy_pic),"Dental CheckUp")
            )
    }
}