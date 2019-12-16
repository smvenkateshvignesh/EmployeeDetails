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

class MyCategory : LinearLayout {
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
            context.obtainStyledAttributes(attrs, R.styleable.MyCategory, defStyleAttr, 0)
        val image = typedArray.getDrawable(R.styleable.MyCategory_setImagePic)
        val text = typedArray.getText(R.styleable.MyCategory_setTextHeading)
        val backgroundColor = typedArray.getColor(
            R.styleable.MyCategory_setBackgroundCard,
            ContextCompat.getColor(context, R.color.white)
        )
        val corners = typedArray.getInteger(R.styleable.MyCategory_setCornersCard, -1)
        inflateView()
        cardMain?.setContentPadding(corners, corners, corners, corners)
        cardMain?.setCardBackgroundColor(backgroundColor)
        setIcon(image)
        setHeader(text.toString())
        typedArray.recycle()
    }

    private fun inflateView() {
        val myView = LayoutInflater.from(context).inflate(R.layout.my_category, this, true)
        cardMain = myView.findViewById(R.id.cardMain)
        imgCardIcon = myView.findViewById(R.id.imgCardIcon)
        txtCardHeading = myView.findViewById(R.id.txtCardHeading)
    }

    private fun setIcon(img: Drawable?) {
        imgCardIcon?.let {
            Glide.with(context).load(img).into(it)
        }
    }

    private fun setHeader(header: String) {
        txtCardHeading?.let {
            it.text = header
        }
    }
}