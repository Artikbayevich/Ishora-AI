package com.example.ishoraai.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import com.example.ishoraai.R
import com.example.ishoraai.databinding.FragmentProfileBinding

class ProfileFragment : Fragment(R.layout.fragment_profile) {

    private var _binding: FragmentProfileBinding? = null

    private val binding: FragmentProfileBinding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentProfileBinding.bind(view)
    }

}