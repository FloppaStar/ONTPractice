package ru.floppastar.ontpractice

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class AdministrationInfoFragment(val administrator: Administration) : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_administration_info, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val tvFIO = view.findViewById<TextView>(R.id.tvFIO)
        val tvWorkingPosition = view.findViewById<TextView>(R.id.tvWorkingPosition)
        val tvDescription = view.findViewById<TextView>(R.id.tvDescription)
        val tvEducation = view.findViewById<TextView>(R.id.tvEducation)
        val tvTeaches = view.findViewById<TextView>(R.id.tvTeaches)
        tvFIO.text = "ФИО: ${administrator.secondName} ${administrator.firstName} ${administrator.middleName}"
        tvWorkingPosition.text = "Должность: ${administrator.workingPosition}"
        tvDescription.text = "${administrator.description}"
        tvEducation.text = "Образование: ${administrator.education}"
        tvTeaches.text = "Преподаваемые дисциплины: ${administrator.teaches}"
    }
}