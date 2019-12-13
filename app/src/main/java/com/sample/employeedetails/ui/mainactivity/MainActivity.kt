package com.sample.employeedetails.ui.mainactivity

import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.sample.employeedetails.R
import com.sample.employeedetails.base.BaseActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {
    lateinit var mainModel:ArrayList<MainModel>
    override fun setLayout(): Int {
        return R.layout.activity_main
    }

    override fun initView(savedInstanceState: Bundle?) {
        mainModel= ArrayList()
        mainModel.add(MainModel(R.drawable.advisor,"Tharunkumar Reddy","Android Developer","101","Akshya Nagar 1st Block 1st Cross, Rammurthy nagar, Bangalore-560016 ","9483578321",33.3F,"28 Nov 1997","01 Aug 2019",1))
        mainModel.add(MainModel(R.drawable.advisor,"Dheeraj Deevi","IOS Developer","109","Akshya Nagar 1st Block 1st Cross, Rammurthy nagar, Bangalore-560016 ","9483578321",33.3F,"","01 Aug 2019",1))

        mainModel.add(MainModel(R.drawable.advisor,"Tharunkumar Chittimi","Android Developer","102","Akshya Nagar 1st Block 1st Cross, Rammurthy nagar, Bangalore-560016 ","9483578321",33.3F,"28 Nov 1997","01 Aug 2019",1))
        mainModel.add(MainModel(R.drawable.advisor,"Sindhura","IOS Developer","113","Akshya Nagar 1st Block 1st Cross, Rammurthy nagar, Bangalore-560016 ","9483578321",33.3F,"28 Nov 1997","01 Aug 2019",1))
        mainModel.add(MainModel(R.drawable.advisor,"Yugandhar Vadlamudi","Android Developer","102","Akshya Nagar 1st Block 1st Cross, Rammurthy nagar, Bangalore-560016 ","9483578321",33.3F,"28 Nov 1997","01 Aug 2019",0))

        mainModel.add(MainModel(R.drawable.advisor,"Vignesh Venkatesh","Android Developer","103","Akshya Nagar 1st Block 1st Cross, Rammurthy nagar, Bangalore-560016 ","9483578321",33.3F,"28 Nov 1997","01 Aug 2019",1))
        mainModel.add(MainModel(R.drawable.advisor,"Lahari","IOS Developer","110","Akshya Nagar 1st Block 1st Cross, Rammurthy nagar, Bangalore-560016 ","9483578321",33.3F,"28 Nov 1997","01 Aug 2019",1))
        mainModel.add(MainModel(R.drawable.advisor,"Naveen Kumar","Android Developer","102","Akshya Nagar 1st Block 1st Cross, Rammurthy nagar, Bangalore-560016 ","9483578321",33.3F,"28 Nov 1997","01 Aug 2019",0))

        mainModel.add(MainModel(R.drawable.advisor,"Ramya Emuri","Android Developer","104","Tirupathi","9483578321",33.3F,"28 Nov 1997","01 Aug 2019",1))
        mainModel.add(MainModel(R.drawable.advisor,"Sudheer","IOS Developer","112","Tirupathi","9483578321",33.3F,"28 Nov 1997","01 Aug 2019",1))

        mainModel.add(MainModel(R.drawable.advisor,"Satish Kongondhi","Android Developer","105","Tirupathi","9483578321",33.3F,"28 Nov 1997","01 Aug 2019",2))
        mainModel.add(MainModel(R.drawable.advisor," Banu Harshavardhan","IOS Developer","114","Tirupathi","9483578321",33.3F,"28 Nov 1997","01 Aug 2019",1))

        mainModel.add(MainModel(R.drawable.advisor,"Ghouse Moula","Android Developer","106","Tirupathi","9483578321",33.3F,"28 Nov 1997","01 Aug 2019",1))
        mainModel.add(MainModel(R.drawable.advisor,"Sailekia","IOS Developer","115","Tirupathi","9483578321",33.3F,"28 Nov 1997","01 Aug 2019",1))

        mainModel.add(MainModel(R.drawable.advisor,"Kishore Anandha Reddy","Android Developer","107","Tirupathi","9483578321",33.3F,"28 Nov 1997","01 Aug 2019",1))
        mainModel.add(MainModel(R.drawable.advisor,"Usha Rani","Android Developer","108","Tirupathi","9483578321",33.3F,"28 Nov 1997","01 Aug 2019",1))
        mainModel.add(MainModel(R.drawable.advisor,"Suneel","IOS Developer","111","Tirupathi","9483578321",33.3F,"28 Nov 1997","01 Aug 2019",1))
        employeeProfileRecycler.layoutManager = LinearLayoutManager(this)
        employeeProfileRecycler.adapter = MainAdater(mainModel)

    }


}
