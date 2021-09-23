package com.trueddns.homenano.kotlincaseapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.*

class CaseAdapter(val cases: ArrayList<CaseModel>): Adapter<CaseAdapter.MyViewHolder>() {

    class MyViewHolder(itemView: View): ViewHolder(itemView) {
        val caseImageView: ImageView = itemView.findViewById(R.id.caseImageView)
        val nameTextView: TextView = itemView.findViewById(R.id.nameTextView)
        val detailTextView: TextView = itemView.findViewById(R.id.detailTextView)
        val priceTextView: TextView = itemView.findViewById(R.id.priceTextView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val viewHolder = LayoutInflater.from(parent.context).inflate(R.layout.case_layout,parent,false)
        return MyViewHolder(viewHolder)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.caseImageView.setImageResource(cases[position].image)
        holder.nameTextView.text = cases[position].name
        holder.detailTextView.text = cases[position].detail
        holder.priceTextView.text =  cases[position].price.toString()
    }

    override fun getItemCount(): Int {
        return cases.size
    }

}