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

class DiscreteScrollViewAdapter(private val data: List<DiscreteScrollViewItem>) :
    RecyclerView.Adapter<DiscreteScrollViewAdapter.DiscreteScrollViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DiscreteScrollViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.discrete_scrollview_rv, parent, false)
        return DiscreteScrollViewHolder(view)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: DiscreteScrollViewHolder, position: Int) {
        holder.bind(data[position])
    }

    inner class DiscreteScrollViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(data: DiscreteScrollViewItem) {
            Glide.with(MyApplication.getApplicationContext())
                .load(data.getImage())
                .into(imageUpcomingProject)
            titleUpcomingProject.text = data.getText()

            if (position==0) {
                val params = LinearLayout.LayoutParams(
                    ViewGroup.LayoutParams.MATCH_PARENT,
                    ViewGroup.LayoutParams.WRAP_CONTENT
                )
                params.setMargins(70, 0, 0, 0)
                cardUpcoming.layoutParams = params
            }
        }

        private val imageUpcomingProject: ImageView =
            itemView.findViewById(R.id.imageDiscreteScrollView)
        private val titleUpcomingProject: TextView =
            itemView.findViewById(R.id.titleUpcomingProject)
        private val cardUpcoming: CardView =
            itemView.findViewById(R.id.cardUpcoming)

    }
}