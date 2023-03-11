package com.example.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.fragments.databinding.FragmentFirstBinding


class FragmentFirst : Fragment() {

    private var _binding: FragmentFirstBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentFirstBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.tvName.setOnClickListener {
            requireActivity().supportFragmentManager.beginTransaction().apply {
                replace(
                    R.id.fragment_view,
                    FragmentSecond.newInstance("Sam"),
                    FragmentSecond.tag
                )
                addToBackStack(FragmentFirst.tag)
                commit()
            }
        }

        super.onViewCreated(view, savedInstanceState)
    }

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }


    companion object {
        const val tag = "FragmentFirst"
    }

}