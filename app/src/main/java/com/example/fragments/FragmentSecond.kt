package com.example.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

private const val TEST_TAG = "TESTTAG2"

class FragmentSecond : Fragment(R.layout.fragment_second) {

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(TEST_TAG, "onCreate")
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d(TEST_TAG, "onCreateView")
        return super.onCreateView(inflater, container, savedInstanceState)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        Log.d(TEST_TAG, "onViewCreated")
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        Log.d(TEST_TAG, "onViewStateRestored")
        super.onViewStateRestored(savedInstanceState)
    }

    override fun onStart() {
        Log.d(TEST_TAG, "onStart")
        super.onStart()
    }

    override fun onResume() {
        Log.d(TEST_TAG, "onResume")
        super.onResume()
    }

    override fun onPause() {
        Log.d(TEST_TAG, "onPause")
        super.onPause()
    }

    override fun onStop() {
        Log.d(TEST_TAG, "onStop")
        super.onStop()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        Log.d(TEST_TAG, "onSaveInstanceState")
        super.onSaveInstanceState(outState)
    }

    override fun onDestroyView() {
        Log.d(TEST_TAG, "onDestroyView")
        super.onDestroyView()
    }

    override fun onDestroy() {
        Log.d(TEST_TAG, "onDestroy")
        super.onDestroy()
    }

    companion object {
        const val tag = "FragmentSecond"
        fun newInstance(): FragmentSecond = FragmentSecond()
    }

}