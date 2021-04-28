package com.example.artistlookup.utils

import androidx.recyclerview.widget.RecyclerView


abstract class CustomRecyclerViewAdapter<T, VH : RecyclerView.ViewHolder> :
    RecyclerView.Adapter<VH>() {

    abstract fun updateData(data: List<T>)
}
