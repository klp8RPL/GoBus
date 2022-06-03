package com.example.gobus.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.gobus.ViewPagerAdapter
import com.example.gobus.databinding.FragmentRiwayat2Binding
import com.google.android.material.tabs.TabLayoutMediator

class Riwayat2Fragment : Fragment() {

    private var _binding: FragmentRiwayat2Binding? = null
    private val binding get()= _binding!!
    private lateinit var viewPagerAdapter: ViewPagerAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentRiwayat2Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewPagerAdapter = ViewPagerAdapter(this)

        
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}