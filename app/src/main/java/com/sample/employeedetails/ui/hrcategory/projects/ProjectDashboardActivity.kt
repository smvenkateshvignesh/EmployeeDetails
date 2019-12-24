package com.sample.employeedetails.ui.hrcategory.projects

import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.sample.employeedetails.R
import com.sample.employeedetails.base.BaseActivity
import com.yarolegovich.discretescrollview.InfiniteScrollAdapter
import kotlinx.android.synthetic.main.activity_projects_dashboard.*

class ProjectDashboardActivity : BaseActivity() {


    lateinit var ongoingProjectModel: ArrayList<OngoingProjectModel>
    lateinit var ongoingProjectAdapter: OngoingProjectAdapter

    override fun setLayout(): Int {
        return R.layout.activity_projects_dashboard
    }

    override fun initView(savedInstanceState: Bundle?) {
        val discreteScrollViewModel=DiscreteScrollViewModel()
        discreteScrollViewModel.get()
        val data:List<DiscreteScrollViewItem> = discreteScrollViewModel.getData()
        val infiniteScrollAdapter=InfiniteScrollAdapter(DiscreteScrollViewAdapter(data))
        discreteScrollView.adapter = infiniteScrollAdapter
        discreteScrollView.setOverScrollEnabled(true)
        discreteScrollView.setOffscreenItems(2)
        discreteScrollView.setItemTransitionTimeMillis(1000)
//        val timerHandler = Handler()
//        val timerRunnable: Runnable
//
//        timerRunnable=object :Runnable {
//            override fun run() {
//
//                discreteScrollView.smoothScrollBy(20, 0)
//                timerHandler.postDelayed(this, 100)
//            }
//        }
//        timerHandler.postDelayed(timerRunnable,4000)

        /*-----OnGoingProject RecyclerView-----*/
        ongoingProjectModel = ArrayList()
        ongoingProjectModel.add(OngoingProjectModel(R.drawable.splash_sceern_logo, "CompIndia App", "Android Tech."))
        ongoingProjectModel.add(OngoingProjectModel(R.drawable.zone_img, "Zone App", "IOS Tech."))
        ongoingProjectModel.add(OngoingProjectModel(R.drawable.dummy_pic,"KingInnovation", "Android Tech."))
        ongoingProjectModel.add(OngoingProjectModel(R.drawable.carmel_img, "TapRight", "IOS Tech."))
        ongoingProjectModel.add(OngoingProjectModel(R.drawable.splash_sceern_logo, "Doctor B", "Android Tech."))
        ongoingProjectModel.add(OngoingProjectModel(R.drawable.zone_img, "Yggy", "IOS Tech."))
        ongoingProjectModel.add(OngoingProjectModel(R.drawable.carmel_img, "Seekers", "Android Tech."))

        onGoingProject_rv.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        ongoingProjectAdapter = OngoingProjectAdapter(ongoingProjectModel)
        onGoingProject_rv.adapter = ongoingProjectAdapter

        /*----CompletedProject RecyclerView-----*/
        ongoingProjectModel = ArrayList()
        ongoingProjectModel.add(OngoingProjectModel(R.drawable.zone_img, "SkyHop App", "IOS Tech."))
        ongoingProjectModel.add(OngoingProjectModel(R.drawable.dummy_pic, "Open Zym App", "Android Tech."))
        ongoingProjectModel.add(OngoingProjectModel(R.drawable.carmel_img, "Carmel App", "IOS Tech."))
        ongoingProjectModel.add(OngoingProjectModel(R.drawable.zone_img, "Duffy App", "Android Tech."))
        ongoingProjectModel.add(OngoingProjectModel(R.drawable.dummy_pic, "App Measure", "IOS Tech."))
        ongoingProjectModel.add(OngoingProjectModel(R.drawable.carmel_img, "Nav Plus", "IOS Tech."))

        completedProjects_rv.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        ongoingProjectAdapter = OngoingProjectAdapter(ongoingProjectModel)
        completedProjects_rv.adapter = ongoingProjectAdapter

        projectBack.setOnClickListener {
            onBackPressed()
        }

    }
}
