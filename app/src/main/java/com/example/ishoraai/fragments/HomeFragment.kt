package com.example.ishoraai.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.ishoraai.MainActivity
import com.example.ishoraai.R
import com.example.ishoraai.databinding.FragmentHomeBinding

class HomeFragment : Fragment(R.layout.fragment_home) {

    private var _binding: FragmentHomeBinding? = null

    private val binding: FragmentHomeBinding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentHomeBinding.bind(view)

        with(binding) {
            sign1Cv.setOnClickListener {
                navigateTo(TextToSignFragment())
                (requireActivity() as MainActivity).hideBottomNavigation()
            }
            sign2Cv.setOnClickListener {
                Toast.makeText(requireContext(), "Ushbu bo'lim ustida ish olib borilmoqda",Toast.LENGTH_SHORT).show()
            }
            sign3Cv.setOnClickListener {
                Toast.makeText(requireContext(), "Ushbu bo'lim ustida ish olib borilmoqda", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun navigateTo(fragment: Fragment) {
        parentFragmentManager.beginTransaction().replace(R.id.frame_container, fragment)
            .addToBackStack(null).commit()
    }

}