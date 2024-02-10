package com.example.triviauiux.home.playMenu

import androidx.recyclerview.widget.RecyclerView
import com.example.triviauiux.databinding.PlayMenuItemBinding
import com.example.triviauiux.models.PlayMenuItemModel

class PlayMenuViewHolder(private val dataBinding: PlayMenuItemBinding) :
    RecyclerView.ViewHolder(dataBinding.root) {
    fun bind(
        playMenuItem: PlayMenuItemModel
    ) {
        dataBinding.playMenuItem = playMenuItem
        dataBinding.playItem.setBackgroundResource(playMenuItem.background)
    }
}