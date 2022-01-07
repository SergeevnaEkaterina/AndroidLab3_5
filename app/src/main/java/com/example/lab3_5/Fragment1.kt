package com.example.lab3_5

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.lab3_5.databinding.Fragment1Binding


class Fragment1 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = Fragment1Binding.inflate(layoutInflater)
        val navController = findNavController()
        binding.btnToSecond.setOnClickListener {
            navController.navigate(R.id.action_fragment1_to_fragment2)
        }

        return binding.root
    }


}