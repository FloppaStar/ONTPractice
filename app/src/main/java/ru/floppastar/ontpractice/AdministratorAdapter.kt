package ru.floppastar.ontpractice

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AdministratorAdapter(var adminList: List<Administration>,
                           val onItemClick: (Administration, Int) -> Unit) :
    RecyclerView.Adapter<AdministratorAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvFIO: TextView = itemView.findViewById(R.id.tvAdministratorFIO)
        val tvWorkingPosition: TextView = itemView.findViewById(R.id.tvAdministratorWorkingPosition)
        val tvDescription: TextView = itemView.findViewById(R.id.tvDescription)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.administrator_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val admin = adminList[position]
        holder.tvFIO.text = "${admin.secondName} ${admin.firstName} ${admin.middleName}"
        holder.tvWorkingPosition.text = admin.workingPosition
        holder.tvDescription.text = admin.description
        holder.itemView.setOnClickListener {
            onItemClick(admin, position)
        }
    }

    override fun getItemCount(): Int {
        return adminList.size
    }
}