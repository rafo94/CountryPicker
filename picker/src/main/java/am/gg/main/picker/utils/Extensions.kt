package am.gg.main.picker.utils

import android.content.Context

/**
 * Created by Rafik Gasparyan on 08.05.24
 * ggTeam
 */

fun Context.getDisplayHeightByPercent(percent: Int): Int {
    val height: Int = resources.displayMetrics.heightPixels
    return height * percent / 100
}