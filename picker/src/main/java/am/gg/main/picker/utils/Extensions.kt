package am.gg.main.picker.utils

import android.content.Context
import android.view.View
import android.view.inputmethod.InputMethodManager
import androidx.fragment.app.Fragment

/**
 * Created by Rafik Gasparyan on 08.05.24
 * ggTeam
 */

fun Context.getDisplayHeightByPercent(percent: Int): Int {
    val height: Int = resources.displayMetrics.heightPixels
    return height * percent / 100
}

fun View.hideKeyboard() {
    val imm = context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
    imm.hideSoftInputFromWindow(windowToken, 0)
}