package com.example.triviauiux

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.triviauiux.databinding.ActivityMainBinding
import com.example.triviauiux.home.playMenu.PlayMenuAdapter
import com.example.triviauiux.home.walletMenu.WalletMenuAdapter
import com.example.triviauiux.models.PlayMenuItemModel
import com.example.triviauiux.models.WalletMenuModel

class MainActivity : ComponentActivity() {

    private val playMenuAdapter: PlayMenuAdapter by lazy {
        PlayMenuAdapter()
    }

    private val walletMenuAdapter: WalletMenuAdapter by lazy {
        WalletMenuAdapter()
    }

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.playMenuItemsRecyclerView.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        binding.playMenuItemsRecyclerView.setHasFixedSize(true)
        binding.playMenuItemsRecyclerView.adapter = playMenuAdapter

        binding.walletMenuItemsRecyclerView.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        binding.walletMenuItemsRecyclerView.setHasFixedSize(true)
        binding.walletMenuItemsRecyclerView.adapter = walletMenuAdapter

        setPlayMenuItems()
        setWalletMenuItems()

    }

    private fun setWalletMenuItems() {
        val walletMenu = mutableListOf(
            WalletMenuModel(
                "Add Coins",
                "Add coins to your Triviaholic wallet here.!",
                R.drawable.triangle_mask_bg,
                "Add"
            ),
            WalletMenuModel(
                "Transfer Coins",
                "Transfer coins to your friends here.!",
                R.drawable.circular_mask_bg,
                "Transfer"
            ),
            WalletMenuModel(
                "Withdrawal Coins",
                "Encash coins to your bank account here!",
                R.drawable.rectangular_mask_bg,
                "Withdrawal"
            ),
            WalletMenuModel(
                "Transactions",
                "Check your Triviaholic transactions here!",
                R.drawable.triangle_mask_bg,
                "Transactions"
            ),
        )

        walletMenuAdapter.items = walletMenu
        walletMenuAdapter.notifyDataSetChanged()
    }

    private fun setPlayMenuItems() {
        val playMenu = mutableListOf(
            PlayMenuItemModel(
                "Quick Match",
                "Start competing with any random player here!",
                R.drawable.circular_mask_bg
            ),
            PlayMenuItemModel(
                "Multiplayer",
                "Start competing with your friends here!",
                R.drawable.rectangular_mask_bg
            ),
            PlayMenuItemModel(
                "Single Player",
                "Build your knowledge treasure on different topics here!",
                R.drawable.triangle_mask_bg
            ),
            PlayMenuItemModel(
                "Invitations",
                "Check your multiplayer game invites here!",
                R.drawable.circular_mask_bg
            ),
        )

        playMenuAdapter.items = playMenu
        playMenuAdapter.notifyDataSetChanged()
    }
}