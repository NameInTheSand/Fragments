package com.example.fragments

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.fragments.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initListeners()
    }

    private fun initListeners() {
        binding.apply {
            openFragment2.setOnClickListener {
                supportFragmentManager.beginTransaction().apply {
                    replace(
                        binding.fragmentView.id,
                        FragmentSecond.newInstance(),
                        FragmentSecond.tag
                    )
                    addToBackStack(FragmentSecond.tag)
                    commit()
                }
            }

            openFragment1.setOnClickListener {
                supportFragmentManager.beginTransaction().apply {
                    replace(binding.fragmentView.id, FragmentFirst.newInstance(), FragmentFirst.tag)
                    addToBackStack(FragmentFirst.tag)
                    commit()
                }
            }
        }
    }

}