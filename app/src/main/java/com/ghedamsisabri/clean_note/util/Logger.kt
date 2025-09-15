package com.ghedamsisabri.clean_note.util

import android.util.Log
import com.ghedamsisabri.clean_note.util.Constants.DEBUG
import com.ghedamsisabri.clean_note.util.Constants.TAG


var isUnitTest = false

fun printLogD(className: String?, message: String ) {
    if (DEBUG && !isUnitTest) {
        Log.d(TAG, "$className: $message")
    }
    else if(DEBUG && isUnitTest){
        println("$className: $message")
    }
}
