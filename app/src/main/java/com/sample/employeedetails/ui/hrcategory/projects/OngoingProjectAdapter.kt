package com.sample.employeedetails.ui.hrcategory.projects

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.sample.employeedetails.R
import com.sample.employeedetails.application.MyApplication

class OngoingProjectAdapter(private val ongoingProjectModel: ArrayList<OngoingProjectModel>) :
    RecyclerView.Adapter<OngoingProjectAdapter.OngoingProjectViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OngoingProjectViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.ongoing_projects_rv, parent, false)
        return OngoingProjectViewHolder(view)
    }

    override fun getItemCount(): Int {
        return ongoingProjectModel.size
    }

    override fun onBindViewHolder(holder: OngoingProjectViewHolder, position: Int) {
        holder.bind(ongoingProjectModel[position])
    }

    inner class OngoingProjectViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(ongoingProjectModel: OngoingProjectModel) {
            Glide.with(MyApplication.getApplicationContext())
                .load(ongoingProjectModel.appImage)
                .into(imageApp)
            appTitle.text = ongoingProjectModel.appTitle
            appSubtitle.text=ongoingProjectModel.appSubTitle

            if (position==0) {
                val params = LinearLayout.LayoutParams(
                    ViewGroup.LayoutParams.MATCH_PARENT,
                    ViewGroup.LayoutParams.WRAP_CONTENT
                )
                params.setMargins(70, 0, 0, 0)
                cardView.layoutParams = params
            }
        }

        private var imageApp: ImageView = itemView.findViewById(R.id.ImageOnGoingProject)
        private var appTitle: TextView = itemView.findViewById(R.id.txtAppName)
        private var appSubtitle: TextView = itemView.findViewById(R.id.txtAppSubName)
        private var cardView: CardView = itemView.findViewById(R.id.cardOnGoingProject)
    }
}