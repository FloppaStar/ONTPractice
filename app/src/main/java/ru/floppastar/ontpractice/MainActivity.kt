package ru.floppastar.ontpractice

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val bnv = findViewById<BottomNavigationView>(R.id.bottomMenu)
        bnv.setOnItemSelectedListener {
            when (it.itemId){
                R.id.menuTeachers -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainerViewMain, TeacherListFragment())
                        .commit()
                    true
                }
                R.id.menuAdministrations -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainerViewMain, AdministrationListFragment())
                        .commit()
                    true
                }
                R.id.menuSpecializations -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainerViewMain, SpecializationListFragment())
                        .commit()
                    true
                }
                R.id.menuAboutONT -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainerViewMain, CollegeFragment())
                        .commit()
                    true
                }
                R.id.menuAboutDelevoper -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainerViewMain, DeveloperInfoFragment())
                        .commit()
                    true
                }
                else -> false
            }
        }
    }
}