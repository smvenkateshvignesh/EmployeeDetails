package com.sample.employeedetails.ui.employeedetails

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.transition.*
import android.view.animation.AnticipateInterpolator
import android.view.animation.AnticipateOvershootInterpolator
import androidx.constraintlayout.widget.ConstraintSet
import androidx.transition.ChangeScroll
import com.sample.employeedetails.R
import com.sample.employeedetails.base.BaseActivity
import kotlinx.android.synthetic.main.activity_employee_details.*

class EmployeeDetailsActivity : BaseActivity() {
    private var isShowingInfo = false

    override fun setLayout(): Int {
       return R.layout.activity_employee_details_first
    }

    override fun initView(savedInstanceState: Bundle?) {
        Handler().postDelayed({
            swap(R.layout.activity_employee_details)

        },50)
        employeeProfilePic.setOnClickListener {
            if (isShowingInfo) {
                swap(R.layout.activity_employee_details_first)
            } else {
                swap(R.layout.activity_employee_details)
            }
        }
    }
    private fun swap(layoutId: Int) {
        val constraintSet = ConstraintSet()
        constraintSet.clone(this, layoutId)
        val transation = AutoTransition()
//        transation.interpolator = AnticipateOvershootInterpolator(1.5f)
        transation.duration = 800
        TransitionManager.beginDelayedTransition(constraintEmployeeDetails,transation)
        constraintSet.applyTo(constraintEmployeeDetails)
        isShowingInfo = !isShowingInfo

    }

}
