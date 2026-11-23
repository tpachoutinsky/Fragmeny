package com.example.fragmeny

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentContainerView
import com.example.fragmeny.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.btnFragment1.setOnClickListener {
            remplacerFragment(binding.fragmentContainerView, Fragment_1())
        }

        binding.btnFragment2.setOnClickListener {
            remplacerFragment(binding.fragmentContainerView, Fragment2())
        }

    }
    fun remplacerFragment(fragmentContainerView: FragmentContainerView, fragment : Fragment ) {
        supportFragmentManager.beginTransaction().replace(fragmentContainerView.id, fragment).commit()
    }
}