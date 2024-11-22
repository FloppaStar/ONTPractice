package ru.floppastar.ontpractice

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TeacherAdapter(var teacherList: List<Teacher>,
    val onItemClick: (Teacher, Int) -> Unit) :
    RecyclerView.Adapter<TeacherAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val tvFIO: TextView = itemView.findViewById(R.id.tvTeacherFIO)
        val tvSpecialization: TextView = itemView.findViewById(R.id.tvSpecialization)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.teacher_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val teacher = teacherList[position]
        holder.tvFIO.text = "${teacher.secondName} ${teacher.firstName} ${teacher.middleName}"
        holder.tvSpecialization.text = teacher.description
        holder.itemView.setOnClickListener{
            onItemClick(teacher, position)
        }
    }

    override fun getItemCount(): Int {
        return teacherList.size
    }
}