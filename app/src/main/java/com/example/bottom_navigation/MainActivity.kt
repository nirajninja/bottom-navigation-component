package com.example.bottom_navigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firstfragment=firstfragment()
        val secondFragment=second_fragment()
        val thirdFragment=third_fragment()

        setcurrentfragment(firstfragment)

        bottomNavigationView.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.miHome->setcurrentfragment(firstfragment)
                R.id.miProfile->setcurrentfragment(secondFragment)
                R.id.mi_message->setcurrentfragment(thirdFragment)
            }
            true
        }
    }

    private fun setcurrentfragment(fragment: Fragment)
    {
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flfragment,fragment)
            commit()
        }
    }
}