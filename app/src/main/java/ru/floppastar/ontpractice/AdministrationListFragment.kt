package ru.floppastar.ontpractice

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class AdministrationListFragment : Fragment() {
    private lateinit var administrator: List<Administration>
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_administration_list, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val recyclerView = view.requireViewById<RecyclerView>(R.id.administratorRecyclerView)
        initializeList()
        var adapter : AdministratorAdapter = AdministratorAdapter(administrator){ administrator, i ->
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerViewMain, AdministrationInfoFragment(administrator))
                .addToBackStack("Main")
                .commit()
        }
        recyclerView.adapter = adapter
    }
    private fun initializeList(){
        administrator = listOf(Administration("Татьяна", "Кочеткова", "Борисовна",
            "Директор",
            "Высшее, ОГПИ им. Т.Г. Шевченко, 1998г.",
            "Учитель предпринимательства, учитель технологии обработки конструкционных материалов и технического творчества по специальности «Технология и предпринимательство»",
            "Отсутствуют"),
            Administration("Татьяна", "Кочеткова", "Борисовна",
                "Директор",
                "Высшее, ОГПИ им. Т.Г. Шевченко, 1998г.",
                "Учитель предпринимательства, учитель технологии обработки конструкционных материалов и технического творчества по специальности «Технология и предпринимательство»",
                "Отсутствуют"),
            Administration("Татьяна", "Кочеткова", "Борисовна",
                "Директор",
                "Высшее, ОГПИ им. Т.Г. Шевченко, 1998г.",
                "Учитель предпринимательства, учитель технологии обработки конструкционных материалов и технического творчества по специальности «Технология и предпринимательство»",
                "Отсутствуют"),
            Administration("Татьяна", "Кочеткова", "Борисовна",
                "Директор",
                "Высшее, ОГПИ им. Т.Г. Шевченко, 1998г.",
                "Учитель предпринимательства, учитель технологии обработки конструкционных материалов и технического творчества по специальности «Технология и предпринимательство»",
                "Отсутствуют"),
            Administration("Татьяна", "Кочеткова", "Борисовна",
                "Директор",
                "Высшее, ОГПИ им. Т.Г. Шевченко, 1998г.",
                "Учитель предпринимательства, учитель технологии обработки конструкционных материалов и технического творчества по специальности «Технология и предпринимательство»",
                "Отсутствуют"),
            Administration("Татьяна", "Кочеткова", "Борисовна",
                "Директор",
                "Высшее, ОГПИ им. Т.Г. Шевченко, 1998г.",
                "Учитель предпринимательства, учитель технологии обработки конструкционных материалов и технического творчества по специальности «Технология и предпринимательство»",
                "Отсутствуют")
        )
    }
}