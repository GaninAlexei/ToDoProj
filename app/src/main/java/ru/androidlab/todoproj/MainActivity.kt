package ru.androidlab.todoproj

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.Window
import com.google.android.material.tabs.TabLayout
import ru.androidlab.todoproj.adapters.Adapter
import ru.androidlab.todoproj.databinding.ActivityMainBinding
import ru.androidlab.todoproj.util.MockUtil
import ru.androidlab.todoproj.views.fragments.TasksFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = ActivityMainBinding.inflate(layoutInflater)
        val fragment = supportFragmentManager.findFragmentById(R.id.fragmentContainerView) ?: TasksFragment()

        savedInstanceState ?: supportFragmentManager.beginTransaction().apply {

            setReorderingAllowed(true)
            add(R.id.fragmentContainerView, fragment)
            commit()

        }
        setContentView(R.layout.activity_main)

        binding.tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {

            override fun onTabSelected(tab: TabLayout.Tab) {
                if (tab.position == 0) {
                    //Todo something
                } else if (tab.position == 1) {
                    //Todo something
                }  else {
                    //Todo something
                }
            }

            override fun onTabUnselected(tab: TabLayout.Tab) {
                //do nothing here
            }

            override fun onTabReselected(tab: TabLayout.Tab) {
                //do nothing here
            }

        })
    }
}