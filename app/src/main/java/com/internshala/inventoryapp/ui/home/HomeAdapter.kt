package com.internshala.inventoryapp.ui.home

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.internshala.inventoryapp.R
import com.internshala.inventoryapp.model.Inventory

class HomeAdapter(val context: Context, private val itemList: ArrayList<Inventory>) :
    RecyclerView.Adapter<HomeAdapter.HomeViewHolder>() {

    class HomeViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val txtInventoryName: TextView = view.findViewById(R.id.txtInventoryName)
        val txtInventoryAvailable: TextView = view.findViewById(R.id.txtInventoryAvailable)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.home_single_row_item, parent, false)
        return HomeViewHolder(view)

    }
    override fun onBindViewHolder(holder: HomeViewHolder, position: Int) {
        val inventory = itemList[position]
        holder.txtInventoryName.text = inventory.inventoryName
        holder.txtInventoryAvailable.text = "Available : " + inventory.inventoryAvailableQuantity
    }

    override fun getItemCount(): Int {
        return itemList.size
    }


}


