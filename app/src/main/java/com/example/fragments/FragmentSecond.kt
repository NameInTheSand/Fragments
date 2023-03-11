package com.example.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.fragments.databinding.FragmentSecondBinding


class FragmentSecond() : Fragment() {

    private var _binding: FragmentSecondBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSecondBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.tvName.setOnClickListener {
            requireActivity().supportFragmentManager.beginTransaction().apply {
                replace(
                    R.id.fragment_view,
                    FragmentThird.newInstance(),
                    FragmentThird.tag
                )
                addToBackStack(FragmentSecond.tag)
                commit()
            }
        }
        binding.tvName.text = requireArguments().getString(NAME, NAME)
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }

    companion object {
        const val tag = "FragmentSecond"
        private const val NAME = "NAME"
        fun newInstance(name: String): FragmentSecond {
           return FragmentSecond().apply {
                arguments = Bundle().also {
                    it.putString(NAME, name)
                }
            }
        }
    }
}