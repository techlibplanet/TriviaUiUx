package com.example.triviauiux.home.walletMenu

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.triviauiux.databinding.WalletMenuItemBinding
import com.example.triviauiux.models.WalletMenuModel

class WalletMenuAdapter :
    RecyclerView.Adapter<WalletMenuViewHolder>() {

    var items: MutableList<WalletMenuModel> = mutableListOf()
    private lateinit var context: Context
    private lateinit var dataBinding: WalletMenuItemBinding

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): WalletMenuViewHolder {
        context = parent.context
        val inflater = LayoutInflater.from(context)
        dataBinding = WalletMenuItemBinding.inflate(inflater, parent, false)
        return WalletMenuViewHolder(dataBinding)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: WalletMenuViewHolder, position: Int) {
        holder.bind(items[position])
    }
}