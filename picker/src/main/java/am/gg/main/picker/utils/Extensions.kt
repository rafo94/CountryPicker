package am.gg.main.picker.utils

import android.app.Activity
import android.content.Context
import android.content.ContextWrapper
import android.view.View
import android.view.inputmethod.InputMethodManager
import androidx.fragment.app.FragmentActivity

/**
 * Created by Rafik Gasparyan on 08.05.24
 * ggTeam
 */

fun Context.getDisplayHeightByPercent(percent: Int): Int {
    val height: Int = resources.displayMetrics.heightPixels
    return height * percent / 100
}

fun View.showKeyboard() {
    val imm: InputMethodManager = context.getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager
    imm.showSoftInput(this, 0)
    requestFocus()
}

fun View.hideKeyboard() {
    val imm = context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
    imm.hideSoftInputFromWindow(windowToken, 0)
}

fun unwrap(context: Context): FragmentActivity? {
    var mContext: Context? = context
    while (context !is Activity && context is ContextWrapper) {
        mContext = context.baseContext
    }

    return mContext as FragmentActivity?
}