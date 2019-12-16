package com.sample.employeedetails.widgets

import android.content.Context
import android.graphics.drawable.Drawable
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat
import com.bumptech.glide.Glide
import com.sample.employeedetails.R

class MyCardView : LinearLayout {
    private var cardMain: CardView? = null
    private var imgCardIcon: ImageView? = null
    private var txtCardHeading: MyTextView? = null


    constructor(context: Context) : super(context) {}

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {
        if (!isInEditMode)
            initWithAttrs(context, attrs, 0)
    }

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    ) {
        if (!isInEditMode)
            initWithAttrs(context, attrs, defStyleAttr)
    }

    private fun initWithAttrs(context: Context, attrs: AttributeSet?, defStyleAttr: Int) {
        val typedArray =
            context.obtainStyledAttributes(attrs, R.styleable.MyCardView, defStyleAttr, 0)
        val image = typedArray.getDrawable(R.styleable.MyCardView_setImage)
        val text:String? = typedArray.getString(R.styleable.MyCardView_setText)
        val backgroundColor = typedArray.getColor(
            R.styleable.MyCardView_setBackground,
            ContextCompat.getColor(context, R.color.lightGrey)
        )
        val corners = typedArray.getInteger(R.styleable.MyCardView_setCorners, -1)
        inflateView()
        cardMain?.setContentPadding(corners, corners, corners, corners)
        cardMain?.setCardBackgroundColor(backgroundColor)
        setIcon(image)
        setHeader(text)
        typedArray.recycle()

    }

    private fun inflateView() {
        val myView = LayoutInflater.from(context).inflate(R.layout.cardview_item, this, true)
        cardMain = myView.findViewById(R.id.cardMain)
        imgCardIcon = myView.findViewById(R.id.imgCardIcon)
        txtCardHeading = myView.findViewById(R.id.txtCardHeading)
    }

    fun setIcon(img: Drawable?) {
        imgCardIcon?.let {
            Glide.with(context).load(img).into(it)
        }
    }

    fun setHeader(header: String?) {
        txtCardHeading?.let {
            it.text = header?:""
        }
    }

}