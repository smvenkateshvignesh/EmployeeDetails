package com.sample.employeedetails.ui.employeeslistactivity.salaryprogress

import android.os.Bundle
import android.view.View
import com.github.mikephil.charting.charts.BarChart
import com.github.mikephil.charting.components.XAxis
import com.github.mikephil.charting.data.BarData
import com.github.mikephil.charting.data.BarDataSet
import com.github.mikephil.charting.data.BarEntry
import com.github.mikephil.charting.utils.ColorTemplate
import com.sample.employeedetails.R
import com.sample.employeedetails.base.BaseActivity
import kotlinx.android.synthetic.main.activity_salary_progress.*
import kotlin.collections.ArrayList


class SalaryProgressActivity : BaseActivity() {
    private lateinit var chart: BarChart
    private lateinit var noOfEmp: ArrayList<BarEntry>
    private lateinit var percentage: ArrayList<BarEntry>
    private lateinit var year: ArrayList<String>
    private lateinit var xAxis: XAxis
    private lateinit var data: BarData
    private lateinit var barDataSet: BarDataSet
    override fun setLayout(): Int {
        return R.layout.activity_salary_progress
    }

    override fun initView(savedInstanceState: Bundle?) {
        chart = findViewById(R.id.salaryBarChart)

        noOfEmp = ArrayList()

        noOfEmp.add(BarEntry(2f, 0))
        noOfEmp.add(BarEntry(3.6f, 1))
        noOfEmp.add(BarEntry(4.5f, 2))
        noOfEmp.add(BarEntry(5.0f, 3))
        noOfEmp.add(BarEntry(5.64f, 4))
        noOfEmp.add(BarEntry(6.64f, 5))
        noOfEmp.add(BarEntry(7.64f, 6))
        noOfEmp.add(BarEntry(8.64f, 7))
        noOfEmp.add(BarEntry(9.64f, 8))
        noOfEmp.add(BarEntry(10.6f, 9))

        percentage = ArrayList()
        percentage.add(BarEntry(20f, 0))
        percentage.add(BarEntry(30f, 1))
        percentage.add(BarEntry(20f, 2))
        percentage.add(BarEntry(25f, 3))
        percentage.add(BarEntry(30f, 4))
        percentage.add(BarEntry(34f, 5))
        percentage.add(BarEntry(40f, 6))
        percentage.add(BarEntry(10f, 7))
        percentage.add(BarEntry(15f, 8))
        percentage.add(BarEntry(60f, 9))

        year = ArrayList()

        year.add("2008")
        year.add("2009")
        year.add("2010")
        year.add("2011")
        year.add("2012")
        year.add("2013")
        year.add("2014")
        year.add("2015")
        year.add("2016")
        year.add("2017")

        barDataSet = BarDataSet(noOfEmp, "Salary Progress")
        chart.animateY(1500)
        xAxis = chart.xAxis
        xAxis.position = XAxis.XAxisPosition.BOTTOM
        xAxis.setDrawGridLines(false)
        chart.setBackgroundResource(R.color.white)
        chart.legend.isEnabled = true
        data = BarData(year, barDataSet)
        barDataSet.setColors(ColorTemplate.VORDIPLOM_COLORS)
        chart.data = data
        icBarChartBack.setOnClickListener {
            onBackPressed()
        }

        icBarChartOptions.setOnClickListener {
            salaryProgressLinearLayout.visibility=View.VISIBLE
        }
        txtAmountMenu.setOnClickListener {
            salaryProgressLinearLayout.visibility=View.GONE
            barDataSet = BarDataSet(noOfEmp, "Salary Progress")
            chart.animateY(1500)
            xAxis = chart.xAxis
            xAxis.position = XAxis.XAxisPosition.BOTTOM
            xAxis.setDrawGridLines(false)
            chart.setBackgroundResource(R.color.white)
            chart.legend.isEnabled = true
            data = BarData(year, barDataSet)
            barDataSet.setColors(ColorTemplate.VORDIPLOM_COLORS)
            chart.data = data
        }

        txtPercentageMenu.setOnClickListener {
            salaryProgressLinearLayout.visibility=View.GONE
            barDataSet = BarDataSet(percentage, "Salary Progress")
            chart.animateY(1500)
            xAxis = chart.xAxis
            xAxis.position = XAxis.XAxisPosition.BOTTOM
            xAxis.setDrawGridLines(false)
            chart.setBackgroundResource(R.color.white)
            chart.legend.isEnabled = true
            data = BarData(year, barDataSet)
            barDataSet.setColors(ColorTemplate.VORDIPLOM_COLORS)
            chart.data = data
        }

        salaryBarChart.setOnClickListener{
            salaryProgressLinearLayout.visibility=View.GONE
        }


    }


}

