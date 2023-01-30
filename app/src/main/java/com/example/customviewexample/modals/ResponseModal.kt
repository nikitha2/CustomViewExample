package com.example.customviewexample.modals

import java.io.Serializable

data class Response (
    val htmlString: String
): Serializable

val response:Response = Response("<p>\n  This is the html string from endpoint. Click \n  <a\n    href=\"https://www.google.com/\"\n    target=\"_blank\"\n    >link</a\n  >. to open google\n</p>")
