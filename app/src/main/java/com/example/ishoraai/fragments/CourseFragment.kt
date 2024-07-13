package com.example.ishoraai.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.ishoraai.R
import com.example.ishoraai.databinding.FragmentCourseBinding

class CourseFragment : Fragment(R.layout.fragment_course) {

    private var _binding: FragmentCourseBinding? = null

    private val binding: FragmentCourseBinding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentCourseBinding.bind(view)
    }

}