package ru.floppastar.ontpractice

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class SpecializationAdapter (var specList: List<Specialization>,
                             val onItemClick: (Specialization, Int) -> Unit) :
    RecyclerView.Adapter<SpecializationAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val tvCodeName: TextView = itemView.findViewById(R.id.tvCodeName)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.specialization_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val specialization = specList[position]
        holder.tvCodeName.text = "${specialization.code} ${specialization.name}"
        holder.itemView.setOnClickListener{
            onItemClick(specialization, position)
        }
    }

    override fun getItemCount(): Int {
        return specList.size
    }
}