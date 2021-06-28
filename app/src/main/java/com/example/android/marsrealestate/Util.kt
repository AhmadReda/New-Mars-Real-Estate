package com.example.android.marsrealestate

import android.app.Application
import android.graphics.Rect
import android.view.View
import android.view.WindowManager
import androidx.recyclerview.widget.RecyclerView

class VerticalSpaceItemDecoration(val verticalSpaceHeight: Int) : RecyclerView.ItemDecoration() {
    override fun getItemOffsets(outRect: Rect, view: View, parent: RecyclerView, state: RecyclerView.State) {
        outRect.bottom = verticalSpaceHeight
        outRect.right = verticalSpaceHeight
    }
}

fun String.formatType(){

}