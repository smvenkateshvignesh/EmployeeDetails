package com.sample.employeedetails.widgets

import android.content.Context
import android.graphics.drawable.Drawable
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import com.bumptech.glide.Glide
import com.sample.employeedetails.R

class MyProgressView : LinearLayout {
    private var progressImage: ImageView? = null
    private var progressText: TextView? = null
    private var progressViewLayout: LinearLayout? = null

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
        inflateView()
        val typedArray =
            context.obtainStyledAttributes(attrs, R.styleable.MyProgressView, defStyleAttr, 0)
        val progressImageType = typedArray.getDrawable(R.styleable.MyProgressView_setProgressImage)

        val progressTextType = typedArray.getString(R.styleable.MyProgressView_setProgressText)
        val textVisible = typedArray.getInt(R.styleable.MyProgressView_textVisibility, 0)
        val imageVisible = typedArray.getInt(R.styleable.MyProgressView_imageVisibility, 0)
        val setVisible = typedArray.getInt(R.styleable.MyProgressView_setVisibility, 0)

        setImage(progressImageType)
        setText(progressTextType)

        setTextVisibility(textVisible)
        setImageVisibility(imageVisible)
        setViewVisibility(setVisible)

        typedArray.recycle()
    }

    private fun inflateView() {
        val myView = LayoutInflater.from(context).inflate(R.layout.my_progress_view, this, true)
        progressImage = myView.findViewById(R.id.progressImage)
        progressText = myView.findViewById(R.id.progressText)
        progressViewLayout=myView.findViewById(R.id.progressViewLayout)
    }

    private fun setImage(img: Drawable?) {
        progressImage?.let {
            Glide.with(context).load(img).into(it)
        }
    }

    private fun setText(header: String?) {
        progressText?.let {
            it.text = header
        }
    }

    private fun setTextVisibility(visible: Int) {
        progressText?.let {
            it.visibility=getMyVisibility(visible)
        }
    }

    private fun setImageVisibility(visible: Int) {
        progressImage?.let {
            it.visibility=getMyVisibility(visible)
        }
    }

     private fun getMyVisibility(myValue:Int): Int {
        return when(myValue)
        {
            0 -> View.VISIBLE
            1 -> View.INVISIBLE
            else ->{
                View.GONE
            }
        }
    }

    private fun setViewVisibility(visible: Int) {
        progressViewLayout?.let {
            it.visibility=getMyVisibility(visible)
        }
    }
}