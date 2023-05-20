package com.example.android5lesson3dz.presentation.ui.fragments.Information

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.core.view.isVisible
import androidx.navigation.fragment.navArgs
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.android5lesson3dz.R
import com.example.android5lesson3dz.databinding.FragmentUserInformationBinding

class UserInformationFragment : Fragment(R.layout.fragment_user_information) {
    private val binding by viewBinding(FragmentUserInformationBinding::bind)
    private val args by navArgs<UserInformationFragmentArgs>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        getData()
        setupListener()
        initialize()
    }

    private fun initialize() = with(binding){
        txtName.isVisible = false
        txtSurname.isVisible = false
        txtAge.isVisible = false
        tvName.isVisible = false
        tvSurname.isVisible = false
        tvAge.isVisible = false
        hideData.isVisible = false
    }

    private fun setupListener() = with(binding){
        binding.showData.setOnClickListener {
            txtName.isVisible = true
            txtSurname.isVisible = true
            txtAge.isVisible = true
            tvName.isVisible = true
            tvSurname.isVisible = true
            tvAge.isVisible = true
            hideData.isVisible = true
            showData.isVisible = false
        }

        binding.hideData.setOnClickListener {
            txtName.isVisible = false
            txtSurname.isVisible = false
            txtAge.isVisible = false
            tvName.isVisible = false
            tvSurname.isVisible = false
            tvAge.isVisible = false
            showData.isVisible = true
            hideData.isVisible = false
        }
    }

    private fun getData() {
        binding.tvName.text = args.name
        binding.tvSurname.text = args.surname
        binding.tvAge.text = args.age
    }
}