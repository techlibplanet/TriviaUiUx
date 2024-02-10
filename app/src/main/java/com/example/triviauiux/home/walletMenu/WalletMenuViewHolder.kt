package com.example.triviauiux.home.walletMenu

import androidx.recyclerview.widget.RecyclerView
import com.example.triviauiux.databinding.WalletMenuItemBinding
import com.example.triviauiux.models.WalletMenuModel

class WalletMenuViewHolder(private val dataBinding: WalletMenuItemBinding) :
    RecyclerView.ViewHolder(dataBinding.root) {
    fun bind(
        walletMenu: WalletMenuModel
    ) {
        dataBinding.walletMenuItem = walletMenu
        dataBinding.playItem.setBackgroundResource(walletMenu.background)
    }
}