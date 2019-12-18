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
        employeesListModel.add(
            EmployeesListModel(
                R.drawable.img_dummy_profile_two,
                "Tharunkumar Reddy",
                DesignationCategory.ANDROID,
                "101",
                "Akshya Nagar 1st Block 1st Cross, Rammurthy nagar, Bangalore-560016 ",
                "9483578321",
                33.3F,
                "28 Nov 1997",
                "01 Aug 2019",
                1,
                OfficeBranches.TIRUPATHI,
                "",
                "Hp laptop",
                "Honor 9N",
                "Lenovo",
                "USB 2.0",
                "Lenovo p30",
                ""
            )
        )
        employeesListModel.add(
            EmployeesListModel(
                R.drawable.img_dummy_profile_one,
                "Dheeraj Deevi",
                DesignationCategory.IOS,
                "109",
                "Akshya Nagar 1st Block 1st Cross, Rammurthy nagar, Bangalore-560016 ",
                "9483578321",
                33.3F,
                "28 Nov 1997",
                "01 Aug 2019",
                1,
                OfficeBranches.TIRUPATHI,
                "",
                "Apple Mac",
                "Apple XR",
                "USB 2.0",
                "Hp p30",
                "Mac 2",
                "Samsung 32GB"
            )
        )

        employeesListModel.add(
            EmployeesListModel(
                R.drawable.img_dummy_profile_two,
                "Tharunkumar Chittimi",
                DesignationCategory.ANDROID,
                "102",
                "Akshya Nagar 1st Block 1st Cross, Rammurthy nagar, Bangalore-560016 ",
                "9483578321",
                33.3F,
                "28 Nov 1997",
                "01 Aug 2019",
                1, OfficeBranches.TIRUPATHI,
            "",
                "Dell",
                "Nokia 6",
                "Lenovo",
                "QHMPL cable",
                "Logitech",
                ""
            )
        )
        employeesListModel.add(
            EmployeesListModel(
                R.drawable.dummy_female_profile_pic,
                "Sindhura",
                DesignationCategory.IOS,
                "113",
                "Akshya Nagar 1st Block 1st Cross, Rammurthy nagar, Bangalore-560016 ",
                "9483578321",
                33.3F,
                "28 Nov 1997",
                "01 Aug 2019",
                1, OfficeBranches.TIRUPATHI,
                "" ,
                "Apple Mac",
                "Apple X",
                "Hp",
                "Apple",
                "Apple 2.2.0",
                ""
            )
        )
        employeesListModel.add(
            EmployeesListModel(
                R.drawable.img_dummy_profile_two,
                "Yugandhar Vadlamudi",
                DesignationCategory.ANDROID,
                "102",
                "Akshya Nagar 1st Block 1st Cross, Rammurthy nagar, Bangalore-560016 ",
                "9483578321",
                33.3F,
                "28 Nov 1997",
                "01 Aug 2019",
                0, OfficeBranches.TIRUPATHI,
                "" ,
                "Dell",
                "Pixle 3a",
                "Hp",
                "Lenovo",
                "Lenovo",
                ""
            )
        )

        employeesListModel.add(
            EmployeesListModel(
                R.drawable.img_dummy_profile_one,
                "Vignesh Venkatesh",
                DesignationCategory.ANDROID,
                "103",
                "Akshya Nagar 1st Block 1st Cross, Rammurthy nagar, Bangalore-560016 ",
                "9483578321",
                33.3F,
                "28 Nov 1997",
                "01 Aug 2019",
                1, OfficeBranches.TIRUPATHI,
                "" ,
                "Hp",
                "Redmi 8",
                "Hp",
                "Nokia",
                "Lenovo",
                ""
            )
        )
        employeesListModel.add(
            EmployeesListModel(
                R.drawable.img_dummy_profile_one,
                "Naveen Kumar",
                DesignationCategory.ANDROID,
                "102",
                "Akshya Nagar 1st Block 1st Cross, Rammurthy nagar, Bangalore-560016 ",
                "9483578321",
                33.3F,
                "28 Nov 1997",
                "01 Aug 2014",
                0, OfficeBranches.TIRUPATHI,
                "" ,
                "Dell",
                "Nokia 6",
                "Hp",
                "Nokia",
                "Lenovo",
                ""
            )
        )

        employeesListModel.add(
            EmployeesListModel(
                R.drawable.dummy_female_profile_pic,
                "Lahari",
                DesignationCategory.IOS,
                "110",
                "Akshya Nagar 1st Block 1st Cross, Rammurthy nagar, Bangalore-560016 ",
                "9483578321",
                33.3F,
                "28 Nov 1997",
                "01 Aug 2019",
                1, OfficeBranches.TIRUPATHI,
                "" ,
                "Apple Mac",
                "Apple 5",
                "Hp",
                "Lenovo",
                "Apple 2.2.0",
                ""
            )
        )

        employeesListModel.add(
            EmployeesListModel(
                R.drawable.dummy_female_profile_pic,
                "Ramya Emuri",
                DesignationCategory.ANDROID,
                "104",
                "Tirupathi",
                "9483578321",
                33.3F,
                "28 Nov 1997",
                "01 Aug 2019",
                1, OfficeBranches.TIRUPATHI,
                "" ,
                "Sony",
                "Lenovo",
                "Hp",
                "Lenovo",
                "Samsung",
                ""
            )
        )
        employeesListModel.add(
            EmployeesListModel(
                R.drawable.img_dummy_profile_one,
                "Sudheer",
                DesignationCategory.IOS,
                "112",
                "Tirupathi",
                "9483578321",
                33.3F,
                "28 Nov 1997",
                "01 Aug 2019",
                1, OfficeBranches.TIRUPATHI,
                "" ,
                "Apple Mac",
                "Apple 8",
                "Hp",
                "Apple 3",
                "Apple 2.2.0",
                ""
            )
        )


        employeesListModel.add(
            EmployeesListModel(
                R.drawable.img_dummy_profile_one,
                " Banu Harshavardhan",
                DesignationCategory.IOS,
                "114",
                "Tirupathi",
                "9483578321",
                33.3F,
                "28 Nov 1997",
                "01 Aug 2019",
                1, OfficeBranches.TIRUPATHI,
                "" ,
                "Apple Mac",
                "Apple 7",
                "Lenovo",
                "Lenovo",
                "Netjik",
                ""
            )
        )
        employeesListModel.add(
            EmployeesListModel(
                R.drawable.img_dummy_profile_two,
                "Satish Kongondhi",
                DesignationCategory.ANDROID,
                "105",
                "Tirupathi",
                "9483578321",
                33.3F,
                "28 Nov 1997",
                "01 Aug 2019",
                2, OfficeBranches.TIRUPATHI,
                "" ,
                "Hp",
                "Samsung A50",
                "Hp",
                "Lenovo",
                "Lenovo",
                ""
            )
        )
        employeesListModel.add(
            EmployeesListModel(
                R.drawable.img_dummy_profile_two,
                "Ghouse Moula",
                DesignationCategory.ANDROID,
                "106",
                "Tirupathi",
                "9483578321",
                33.3F,
                "28 Nov 1997",
                "01 Aug 2019",
                1, OfficeBranches.TIRUPATHI,
                "" ,
                "Hp",
                "Redmi 7",
                "Hp",
                "Nokia",
                "Lenovo",
                ""
            )
        )
        employeesListModel.add(
            EmployeesListModel(
                R.drawable.dummy_female_profile_pic,
                "Sailekia",
                DesignationCategory.IOS,
                "115",
                "Tirupathi",
                "9483578321",
                33.3F,
                "28 Nov 1997",
                "01 Aug 2019",
                1, OfficeBranches.TIRUPATHI,
                "" ,
                "Apple Mac",
                "Ipad",
                "Hp",
                "Lenovo",
                "Lenovo",
                ""
            )
        )

        employeesListModel.add(
            EmployeesListModel(
                R.drawable.img_dummy_profile_two,
                "Kishore Anandha Reddy",
                DesignationCategory.ANDROID,
                "107",
                "Tirupathi",
                "9483578321",
                33.3F,
                "28 Nov 1997",
                "01 Aug 2019",
                1, OfficeBranches.TIRUPATHI,
                "" ,
                "Hp",
                "Nokia 6.1",
                "Hp",
                "Nokia",
                "Lenovo",
                ""
            )
        )
        employeesListModel.add(
            EmployeesListModel(
                R.drawable.dummy_female_profile_pic,
                "Usha Rani",
                DesignationCategory.ANDROID,
                "108",
                "Tirupathi",
                "9483578321",
                33.3F,
                "28 Nov 1997",
                "01 Aug 2019",
                1, OfficeBranches.TIRUPATHI,
                "" ,
                "Hp",
                "Samsung M10",
                "Hp",
                "Samsung",
                "Lenovo",
                "Hp 32GB"
            )
        )
        employeesListModel.add(
            EmployeesListModel(
                R.drawable.img_dummy_profile_two,
                "Suneel",
                DesignationCategory.IOS,
                "111",
                "Tirupathi",
                "9483578321",
                33.3F,
                "28 Nov 1997",
                "01 Aug 2019",
                1, OfficeBranches.TIRUPATHI,
                "" ,
                "Apple Mac",
                "Apple 6",
                "Lenovo",
                "Samsung",
                "Lenovo",
                ""
            )
        )
        employeeProfileRecycler.layoutManager = GridLayoutManager(this, 3)
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
