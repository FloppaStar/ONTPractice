package ru.floppastar.ontpractice

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class TeacherInfoFragment(val teacher: Teacher) : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_teacher_info, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val tvFIO = view.findViewById<TextView>(R.id.tvFIO)
        val tvDescription = view.findViewById<TextView>(R.id.tvDescription)
        val tvEducation = view.findViewById<TextView>(R.id.tvEducation)
        val tvTeaches = view.findViewById<TextView>(R.id.tvTeaches)
        tvFIO.text = "ФИО: ${teacher.secondName} ${teacher.firstName} ${teacher.middleName}"
        tvDescription.text = "${teacher.description}"
        tvEducation.text = "Образование: ${teacher.education}"
        tvTeaches.text = "Преподаваемые дисциплины: ${teacher.teaches}"
    }
}