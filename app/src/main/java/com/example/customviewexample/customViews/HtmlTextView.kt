package com.example.customviewexample.customViews

import android.content.Context
import android.text.SpannableString
import android.text.method.LinkMovementMethod
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.customviewexample.R

open class HtmlTextView : ConstraintLayout {
    private var htmlTextview: TextView? = null

    constructor(context: Context) : this(context, null)
    constructor(context: Context, attrs: AttributeSet?) : this(context, attrs, 0)
    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(
        context, attrs,
        defStyleAttr
    ) {
        inflate(context)
    }

    protected open fun inflate(context: Context) {
        val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        inflater.inflate(R.layout.html_textview, this, true)
        htmlTextview= findViewById(R.id.htmlTextview)

    }

    fun setHtmlString(htmlString: SpannableString) {
        htmlTextview?.setText(htmlString, TextView.BufferType.SPANNABLE)
        htmlTextview?.movementMethod = LinkMovementMethod.getInstance()
    }

}