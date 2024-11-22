package ru.floppastar.ontpractice

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class SpecializationListFragment : Fragment() {
    private lateinit var specialization: List<Specialization>
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_specialization_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val recyclerView = view.requireViewById<RecyclerView>(R.id.specializationRecyclerView)
        initializeList()
        var adapter : SpecializationAdapter = SpecializationAdapter(specialization){ specialization, i ->
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerViewMain, SpecializationInfoFragment(specialization))
                .addToBackStack("Main")
                .commit()
        }
        recyclerView.adapter = adapter
    }
    private fun initializeList(){
        specialization = listOf(Specialization("09.02.07", "Информационные системы и программирование", "3 года 10 мес",
            "Техник-программист", 25),
            Specialization("13.02.02", "Теплоснабжение и теплотехническое оборудование ", "3 года 10 мес",
                "Техник-теплотехник", 10),
            Specialization("15.02.14", "Оснащение средствами автоматизации технологических процессов и производств (по отраслям)", "3 года 10 мес",
                "Техник", 25),
            Specialization("15.02.17", "Монтаж, техническое обслуживание, эксплуатация и ремонт промышленного оборудования (по отраслям)", "3 года 10 мес",
                "Техник-механик", 10),
            Specialization("18.02.12", "Технология аналитического контроля химических соединений", "3 года 10 мес",
                "Техник", 10),
            Specialization("18.02.09", "Переработка нефти и газа", "3 года 10 мес",
                "Техник-технолог", 25),
            Specialization("20.02.01", "Экологическая безопасность природных комплексов", "2 года 10 мес",
                "Техник-эколог", 10),
            Specialization("20.02.04", "Пожарная безопасность", "3 года 10 мес",
                "Специалист по пожарной безопасности", 25),
            Specialization("20.02.05", "Организация оперативного (экстренного) реагирования в чрезвычайных ситуациях", "2 года 10 мес",
                "Специалист по приему и обработке экстренных вызовов", 25),
            Specialization("38.02.01", "Экономика и бухгалтерский учет (по отраслям)", "2 года 10 мес",
                "Бухгалтер", 25),
            Specialization("38.02.07", "Банковское дело", "2 года 10 мес",
                "Специалист банковского дела", 25),
        )
    }
}