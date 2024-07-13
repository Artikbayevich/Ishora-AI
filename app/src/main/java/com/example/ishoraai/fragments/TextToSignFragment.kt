package com.example.ishoraai.fragments

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.activity.OnBackPressedCallback
import com.example.ishoraai.MainActivity
import com.example.ishoraai.R
import com.example.ishoraai.databinding.FragmentTextToSignBinding

class TextToSignFragment : Fragment(R.layout.fragment_text_to_sign) {

    private var _binding : FragmentTextToSignBinding? = null

    private val binding : FragmentTextToSignBinding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentTextToSignBinding.bind(view)

    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        val onBackPressedCallback = object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                (requireActivity() as MainActivity).showBottomNavigation()
                parentFragmentManager.popBackStack()
            }
        }
        requireActivity().onBackPressedDispatcher.addCallback(this, onBackPressedCallback)
    }

}