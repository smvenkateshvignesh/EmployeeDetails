package com.sample.employeedetails.ui.employeeslistactivity

import android.content.Context
import android.content.Intent
import android.graphics.Rect
import android.os.Bundle
import android.view.View
import androidx.annotation.DimenRes
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ItemDecoration
import com.nex3z.togglebuttongroup.SingleSelectToggleGroup
import com.sample.employeedetails.R
import com.sample.employeedetails.base.BaseActivity
import com.sample.employeedetails.ui.employeedetails.EmployeeDetailsActivity
import kotlinx.android.synthetic.main.activity_main.*


class EmployeesListActivity : BaseActivity(), android.widget.SearchView.OnQueryTextListener {
    lateinit var employeesListModel: ArrayList<EmployeesListModel>
    lateinit var mySearchView: android.widget.SearchView
    lateinit var myEmpAdapter: EmployeesListAdapter

    companion object {
        const val BUNDEL_EMPLOYEE_DETAILS = "Employee details"
    }

    override fun setLayout(): Int {
        return R.layout.activity_main
    }

    //passing the items to the RecyclerView
    override fun initView(savedInstanceState: Bundle?) {
        imageView.setOnClickListener {
            onBackPressed()
        }
        mySearchView = findViewById(R.id.empSearchView)
        employeesListModel = ArrayList()
        employeesListModel.add(EmployeesListModel(R.drawable.img_dummy_profile_two, "Tharunkumar Reddy", "Android Developer", "101", "Akshya Nagar 1st Block 1st Cross, Rammurthy nagar, Bangalore-560016 ", "9483578321", 33.3F, "28 Nov 1997", "01 Aug 2019", 1, "Tirupathi"))
        employeesListModel.add(EmployeesListModel(R.drawable.img_dummy_profile_one, "Dheeraj Deevi", "IOS Developer", "109", "Akshya Nagar 1st Block 1st Cross, Rammurthy nagar, Bangalore-560016 ", "9483578321", 33.3F, "28 Nov 1997", "01 Aug 2019", 1,"Tirupathi"))

        employeesListModel.add(
            EmployeesListModel(
                R.drawable.img_dummy_profile_two,
                "Tharunkumar Chittimi",
                "Android Developer",
                "102",
                "Akshya Nagar 1st Block 1st Cross, Rammurthy nagar, Bangalore-560016 ",
                "9483578321",
                33.3F,
                "28 Nov 1997",
                "01 Aug 2019",
                1,"Tirupathi"
            )
        )
        employeesListModel.add(
            EmployeesListModel(
                R.drawable.dummy_female_profile_pic,
                "Sindhura",
                "IOS Developer",
                "113",
                "Akshya Nagar 1st Block 1st Cross, Rammurthy nagar, Bangalore-560016 ",
                "9483578321",
                33.3F,
                "28 Nov 1997",
                "01 Aug 2019",
                1,"Tirupathi"
            )
        )
        employeesListModel.add(
            EmployeesListModel(
                R.drawable.img_dummy_profile_two,
                "Yugandhar Vadlamudi",
                "Android Developer",
                "102",
                "Akshya Nagar 1st Block 1st Cross, Rammurthy nagar, Bangalore-560016 ",
                "9483578321",
                33.3F,
                "28 Nov 1997",
                "01 Aug 2019",
                0,"Tirupathi"
            )
        )

        employeesListModel.add(
            EmployeesListModel(
                R.drawable.img_dummy_profile_one,
                "Vignesh Venkatesh",
                "Android Developer",
                "103",
                "Akshya Nagar 1st Block 1st Cross, Rammurthy nagar, Bangalore-560016 ",
                "9483578321",
                33.3F,
                "28 Nov 1997",
                "01 Aug 2019",
                1,"Tirupathi"
            )
        )
        employeesListModel.add(
            EmployeesListModel(
                R.drawable.img_dummy_profile_one,
                "Naveen Kumar",
                "Android Developer",
                "102",
                "Akshya Nagar 1st Block 1st Cross, Rammurthy nagar, Bangalore-560016 ",
                "9483578321",
                33.3F,
                "28 Nov 1997",
                "01 Aug 2014",
                0,"Tirupathi"
            )
        )

        employeesListModel.add(
            EmployeesListModel(
                R.drawable.dummy_female_profile_pic,
                "Lahari",
                "IOS Developer",
                "110",
                "Akshya Nagar 1st Block 1st Cross, Rammurthy nagar, Bangalore-560016 ",
                "9483578321",
                33.3F,
                "28 Nov 1997",
                "01 Aug 2019",
                1,"Tirupathi"
            )
        )

        employeesListModel.add(
            EmployeesListModel(
                R.drawable.dummy_female_profile_pic,
                "Ramya Emuri",
                "Android Developer",
                "104",
                "Tirupathi",
                "9483578321",
                33.3F,
                "28 Nov 1997",
                "01 Aug 2019",
                1,"Tirupathi"
            )
        )
        employeesListModel.add(
            EmployeesListModel(
                R.drawable.img_dummy_profile_one,
                "Sudheer",
                "IOS Developer",
                "112",
                "Tirupathi",
                "9483578321",
                33.3F,
                "28 Nov 1997",
                "01 Aug 2019",
                1,"Tirupathi"
            )
        )


        employeesListModel.add(
            EmployeesListModel(
                R.drawable.img_dummy_profile_one,
                " Banu Harshavardhan",
                "IOS Developer",
                "114",
                "Tirupathi",
                "9483578321",
                33.3F,
                "28 Nov 1997",
                "01 Aug 2019",
                1,"Tirupathi"
            )
        )
        employeesListModel.add(
            EmployeesListModel(
                R.drawable.img_dummy_profile_two,
                "Satish Kongondhi",
                "Android Developer",
                "105",
                "Tirupathi",
                "9483578321",
                33.3F,
                "28 Nov 1997",
                "01 Aug 2019",
                2,"Tirupathi"
            )
        )
        employeesListModel.add(
            EmployeesListModel(
                R.drawable.img_dummy_profile_two,
                "Ghouse Moula",
                "Android Developer",
                "106",
                "Tirupathi",
                "9483578321",
                33.3F,
                "28 Nov 1997",
                "01 Aug 2019",
                1,"Tirupathi"
            )
        )
        employeesListModel.add(
            EmployeesListModel(
                R.drawable.dummy_female_profile_pic,
                "Sailekia",
                "IOS Developer",
                "115",
                "Tirupathi",
                "9483578321",
                33.3F,
                "28 Nov 1997",
                "01 Aug 2019",
                1,"Tirupathi"
            )
        )

        employeesListModel.add(
            EmployeesListModel(
                R.drawable.img_dummy_profile_two,
                "Kishore Anandha Reddy",
                "Android Developer",
                "107",
                "Tirupathi",
                "9483578321",
                33.3F,
                "28 Nov 1997",
                "01 Aug 2019",
                1,"Tirupathi"
            )
        )
        employeesListModel.add(
            EmployeesListModel(
                R.drawable.dummy_female_profile_pic,
                "Usha Rani",
                "Android Developer",
                "108",
                "Tirupathi",
                "9483578321",
                33.3F,
                "28 Nov 1997",
                "01 Aug 2019",
                1,"Tirupathi"
            )
        )
        employeesListModel.add(
            EmployeesListModel(
                R.drawable.img_dummy_profile_two,
                "Suneel",
                "IOS Developer",
                "111",
                "Tirupathi",
                "9483578321",
                33.3F,
                "28 Nov 1997",
                "01 Aug 2019",
                1,"Tirupathi"
            )
        )
        employeeProfileRecycler.layoutManager = GridLayoutManager(this,3)
        val itemOffsetDecoration1 =
            ItemOffsetDecoration(this, R.dimen._10dp)
        employeeProfileRecycler.addItemDecoration(itemOffsetDecoration1)
        myEmpAdapter = EmployeesListAdapter(employeesListModel)
        mySearchView.setOnQueryTextListener(this)
        myEmpAdapter.setOnClickListener(object : EmployeesListAdapter.EmployeeDetailsClickListener {
            override fun onClick(employeesListModel: EmployeesListModel) {
                val myIntent =
                    Intent(this@EmployeesListActivity, EmployeeDetailsActivity::class.java)
                myIntent.putExtra(BUNDEL_EMPLOYEE_DETAILS, employeesListModel)
                startActivity(myIntent)
            }

            override fun showNoDataMessage(show: Boolean) {
                empDataNotFound.visibility = if (show) View.VISIBLE else View.GONE
            }

        })
        employeeProfileRecycler.adapter = myEmpAdapter


        departmentChoise.setOnCheckedChangeListener { group, checkedId ->


        }

    }

    override fun onQueryTextSubmit(query: String?): Boolean {
        return false
    }

    override fun onQueryTextChange(newText: String?): Boolean {
        //Setting the adapter when the text is changed in the SearchView
        myEmpAdapter.getFilter().filter(newText)
        return false
    }
    class ItemOffsetDecoration(private val mItemOffset: Int) : ItemDecoration() {

        constructor(context: Context, @DimenRes itemOffsetId: Int) : this(
            context.resources.getDimensionPixelSize(
                itemOffsetId
            )
        )

        override fun getItemOffsets(
            outRect: Rect, view: View, parent: RecyclerView,
            state: RecyclerView.State
        ) {
            super.getItemOffsets(outRect, view, parent, state)
            outRect[mItemOffset, mItemOffset, mItemOffset] = mItemOffset
        }

    }


}
