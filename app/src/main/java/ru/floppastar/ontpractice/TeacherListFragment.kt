package ru.floppastar.ontpractice

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class TeacherListFragment : Fragment() {

    private lateinit var teacher: List<Teacher>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_teacher_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val recyclerView = view.requireViewById<RecyclerView>(R.id.teachersRecyclerView)
        initializeList()
        var adapter : TeacherAdapter = TeacherAdapter(teacher){ teacher, i ->
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerViewMain, TeacherInfoFragment(teacher))
                .addToBackStack("Main")
                .commit()
        }
        recyclerView.adapter = adapter

    }
    private fun initializeList(){
        teacher = listOf(Teacher("Семён", "Пиличев", "Александрович",
            "Специалист по информационным системам по специальности 09.02.07 Информационные системы и программирование",
            "Высшее, Среднее профессиональное, ГАПОУ «Орский индустриальный колледж», 2021 г.",
            "Специальные дисциплины, УП  по 09.02.07"),
            Teacher("Наталья", "Леднева", "Геннадьевна",
                "Преподаватель физической культуры",
                "Высшее, ФГБОУ ВПО «ОГПУ», 2013г.",
                "Физическая культура"),
            Teacher("Алексей", "Горнеев", "Михайлович",
                "Бакалавр по специальности 09.03.03 Прикладная информатика",
                "Высшее, АНО ВО «Институт деловой карьеры» г. Москва, 2022",
                "УП  по 09.02.07"),
            Teacher("Туленды", "Именжанов", "Салимович",
                "Менеджер по специальности «Государственное и муниципальное управление»;\n"
                        + "Учитель начальных классов по специальности  «Преподавание в начальных классах»",
                "Высшее, ГОУ ВПО «ЧГУ», 2011г.\n"
                        + "Орский педагогический колледж, 1996",
                "Физическая культура"),
            Teacher("Ксения", "Писарева", "Сергеевна",
                "Инженер по специальности «Программное обеспечение вычислительной техники и автоматизированных систем»",
                "Высшее, ФГБОУ ВПО «ОГУ», 2013 г.",
                "Специальные дисциплины, УП  по 09.02.07"),
            Teacher("Игорь", "Финк", "Валерьевич",
                "Инженер по спец. «Программное обеспечение вычислительной техники и автоматизированных систем»",
                "Высшее, ГОУ ВПО «ОГУ», 2004г.",
                "Специальные дисциплины, УП и ПП по 09.02.07 Информационные системы и программирование"),
            Teacher("Наталья", "Петриченко", "Сергеевна",
                "Лингвист, Переводчик по специальности «Перевод и переводоведение»",
                "Высшее, ГОУ ВПО Магнитогорский государственный университет, 2008 г.",
                "Иностранный язык Иностранный язык в профессиональной деятельности"),
            Teacher("Наталья", "Август", "Святославовна",
                "Учитель английского языка, методист по воспитательной работе по специальности «Филология»",
                "Высшее, ОГПИ им. Т.Г. Шевченко, 1997 г",
                "Иностранный язык\n" +
                        "Иностранный язык в профессиональной деятельности")
        )
    }
}