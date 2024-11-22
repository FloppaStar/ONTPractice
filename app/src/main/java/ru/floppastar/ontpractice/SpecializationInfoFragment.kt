package ru.floppastar.ontpractice

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class SpecializationInfoFragment(val specialization: Specialization) : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_specialization_info, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val tvCodeAndName = view.findViewById<TextView>(R.id.tvCodeAndName)
        val tvDuration = view.findViewById<TextView>(R.id.tvDuration)
        val tvQualification = view.findViewById<TextView>(R.id.tvQualification)
        val tvSeatsCount = view.findViewById<TextView>(R.id.tvSeatsCount)
        tvCodeAndName.text = "Код и наименование: ${specialization.code} ${specialization.name}"
        tvDuration.text = "Срок обучения: ${specialization.duration}"
        tvQualification.text = "Квалификация: ${specialization.qualification}"
        tvSeatsCount.text = "Количество мест: ${specialization.seatsCount}"
    }
}