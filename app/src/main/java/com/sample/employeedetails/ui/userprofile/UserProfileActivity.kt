package com.sample.employeedetails.ui.userprofile

import android.os.Bundle
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.sample.employeedetails.R
import com.sample.employeedetails.base.BaseActivity
import kotlinx.android.synthetic.main.activity_user_profile.*

class UserProfileActivity : BaseActivity() {
    override fun setLayout(): Int {
        return R.layout.activity_user_profile
    }

    override fun initView(savedInstanceState: Bundle?) {
        imgProfilePic

        Glide.with(this).load(R.drawable.czech2).apply(RequestOptions.circleCropTransform()).into(imgProfilePic)
    }
}