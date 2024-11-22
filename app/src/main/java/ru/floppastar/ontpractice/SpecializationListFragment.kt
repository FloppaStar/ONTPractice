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
            Specialization("09.02.07", "Информационные системы и программирование", "3 года 10 мес",
                "Техник-программист", 25),
            Specialization("09.02.07", "Информационные системы и программирование", "3 года 10 мес",
                "Техник-программист", 25),
            Specialization("09.02.07", "Информационные системы и программирование", "3 года 10 мес",
                "Техник-программист", 25),
            Specialization("09.02.07", "Информационные системы и программирование", "3 года 10 мес",
                "Техник-программист", 25),
            Specialization("09.02.07", "Информационные системы и программирование", "3 года 10 мес",
                "Техник-программист", 25)
        )
    }
}