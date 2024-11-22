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
            Administration("Оксана", "Кузниченко", "Анатольевна",
                "Заместитель директора по УР, преподаватель",
                "Высшее, Оренбургский государственный университет, 1999г.",
                "Учитель физики, математики, информатики и вычислительной техники по спец. «Физика»",
                "Информатика"),
            Administration("Ольга", "Косынцева", "Владимировна",
                "Заместитель директора по УВР, преподаватель",
                "Высшее, ОГПИ им. Т.Г. Шевченко, 1997г.",
                "Учитель русского языка и литературы по специальности «Филология»",
                "История"),
            Administration("Елена", "Массанова", "Анатольевна",
                "Заместитель директора по УПР, преподаватель",
                "Высшее, АНОУ ВПО «МФЮА», 2003 г.Высшее, ФГАОУ ВО «Национальный исследовательский технологический университет «МИСиС» г. Москва, 2016 г.",
                "Экономист по специальности «Финансы и кредит»\nБакалавр по направлению подготовки 13.03.04 Теплоэнергетика и теплотехника",
                "Специальные дисциплины, УП и ПП по 13.02.02 Теплоснабжение и теплотехническое оборудование"),
            Administration("Игорь", "Финк", "Валерьевич",
                "Заместитель директора по УИТ, преподаватель",
                "Инженер по спец. «Программное обеспечение вычислительной техники и автоматизированных систем»",
                "Высшее, ГОУ ВПО «ОГУ», 2004г.",
                "Специальные дисциплины, УП и ПП по 09.02.07 Информационные системы и программирование"),
            Administration("Дарья", "Крот", "Николаевна",
                "Заведующий отделением",
                "Высшее, АНОУ ВПО «МФЮА», 2014 г.",
                "Экономист по специальности \"Финансы и кредит\"",
                "Специальные дисциплины, УП и ПП по 38.02.07 и 38.02.01"),
            Administration("Алексей", "Саладай", "Владимирович",
                "Руководитель ЦЦО «IТ-куб» г. Орска, преподаватель",
                "Высшее, АОЧУ ВО \"Московский финансово-юридический университет МФЮА\", 2011г.\n АОЧУ ВО \"Московский финансово-юридический университет МФЮА\", 2017г.",
                "Информатик-экономист (диплом с отличием) по специальности «Прикладная информатика (в экономике)»;\nБакалавр по направлению подготовки 38.03.02 Менеджмент",
                "Специальные дисциплины, УП и ПП по 09.02.07 Информационные системы и программирование")
        )
    }
}