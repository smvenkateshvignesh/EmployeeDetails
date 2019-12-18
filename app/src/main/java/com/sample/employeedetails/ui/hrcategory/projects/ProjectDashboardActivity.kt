package com.sample.employeedetails.ui.hrcategory.projects

import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.sample.employeedetails.R
import com.sample.employeedetails.base.BaseActivity
import kotlinx.android.synthetic.main.activity_projects_dashboard.*

class ProjectDashboardActivity : BaseActivity() {

    private var data: List<DiscreteScrollViewItem>? = null
    private var discreteScrollViewModel: DiscreteScrollViewModel? = null
    private var discreteScrollViewAdapter: DiscreteScrollViewAdapter? = null

    lateinit var ongoingProjectModel: ArrayList<OngoingProjectModel>
    lateinit var ongoingProjectAdapter: OngoingProjectAdapter

    override fun setLayout(): Int {
        return R.layout.activity_projects_dashboard
    }

    override fun initView(savedInstanceState: Bundle?) {
        discreteScrollViewModel?.get()
        data = discreteScrollViewModel?.getData()

        discreteScrollView.adapter = discreteScrollViewAdapter

        /*-----OnGoingProject RecyclerView-----*/
        ongoingProjectModel = ArrayList()
        ongoingProjectModel.add(OngoingProjectModel(R.drawable.img_dummy_profile_one, "CompIndia App", "Android Tech."))
        ongoingProjectModel.add(OngoingProjectModel(R.drawable.img_dummy_profile_one, "CompIndia App", "Android Tech."))
        ongoingProjectModel.add(OngoingProjectModel(R.drawable.img_dummy_profile_one,"CompIndia App", "Android Tech."))
        ongoingProjectModel.add(OngoingProjectModel(R.drawable.img_dummy_profile_one, "CompIndia App", "Android Tech."))
        ongoingProjectModel.add(OngoingProjectModel(R.drawable.img_dummy_profile_one, "CompIndia App", "Android Tech."))

        onGoingProject_rv.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        ongoingProjectAdapter = OngoingProjectAdapter(ongoingProjectModel)
        onGoingProject_rv.adapter = ongoingProjectAdapter

        /*----CompletedProject RecyclerView-----*/
        ongoingProjectModel = ArrayList()
        ongoingProjectModel.add(OngoingProjectModel(R.drawable.img_dummy_profile_one, "CompIndia App", "IOS Tech."))
        ongoingProjectModel.add(OngoingProjectModel(R.drawable.img_dummy_profile_one, "CompIndia App", "IOS Tech."))
        ongoingProjectModel.add(OngoingProjectModel(R.drawable.img_dummy_profile_one, "CompIndia App", "IOS Tech."))
        ongoingProjectModel.add(OngoingProjectModel(R.drawable.img_dummy_profile_one, "CompIndia App", "IOS Tech."))
        ongoingProjectModel.add(OngoingProjectModel(R.drawable.img_dummy_profile_one, "CompIndia App", "IOS Tech."))

        completedProjects_rv.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        ongoingProjectAdapter = OngoingProjectAdapter(ongoingProjectModel)
        completedProjects_rv.adapter = ongoingProjectAdapter

        projectBack.setOnClickListener {
            onBackPressed()
        }
    }
}