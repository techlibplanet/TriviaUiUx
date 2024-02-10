package com.example.triviauiux.home.playMenu

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.triviauiux.databinding.PlayMenuItemBinding
import com.example.triviauiux.models.PlayMenuItemModel

class PlayMenuAdapter :
    RecyclerView.Adapter<PlayMenuViewHolder>() {

    var items: MutableList<PlayMenuItemModel> = mutableListOf()
    private lateinit var context: Context
    private lateinit var dataBinding: PlayMenuItemBinding

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): PlayMenuViewHolder {
        context = parent.context
        val inflater = LayoutInflater.from(context)
        dataBinding = PlayMenuItemBinding.inflate(inflater, parent, false)
        return PlayMenuViewHolder(dataBinding)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: PlayMenuViewHolder, position: Int) {
        holder.bind(items[position])
    }
}