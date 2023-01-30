package com.example.customviewexample.bindingAdapters

import android.os.Build
import android.text.Html
import android.text.SpannableString
import androidx.annotation.RequiresApi
import androidx.databinding.BindingAdapter
import com.example.customviewexample.customViews.HtmlTextView

/**
 * This is how you deal with html in a TextView.  You have to render the html to a spannable string, which textview will handle.
 * https://stackoverflow.com/questions/37904739/html-fromhtml-deprecated-in-android-n
 * */
@RequiresApi(Build.VERSION_CODES.N)
@BindingAdapter("customHtmlTextview.htmlText")
fun setHtmlText(htmlTextView: HtmlTextView, htmlText: String?) {
    htmlText?.let {
        htmlTextView.setHtmlString(
            SpannableString(
                Html.fromHtml(
                    htmlText,
                    Html.FROM_HTML_MODE_LEGACY
                )
            )
        )
    } ?: run {
        htmlTextView.setHtmlString(
            SpannableString(
                Html.fromHtml(
                    "No html text received!",
                    Html.FROM_HTML_MODE_LEGACY
                )
            )
        )
    }
}