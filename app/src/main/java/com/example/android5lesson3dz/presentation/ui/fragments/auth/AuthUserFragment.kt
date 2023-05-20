package com.example.android5lesson3dz.presentation.ui.fragments.auth

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import android.widget.Toast
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.android5lesson3dz.R
import com.example.android5lesson3dz.databinding.FragmentAuthUserBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class AuthUserFragment : Fragment(R.layout.fragment_auth_user) {
    private val binding by viewBinding(FragmentAuthUserBinding::bind)
    private val viewModel by viewModels<AuthUserViewModel>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupRequest()
    }

    private fun setupRequest() = with(binding) {


        binding.btnSignUp.setOnClickListener {
            val name = etName.text.toString().trim()
            val surname = etSurname.text.toString().trim()
            val age = etAge.text.toString().trim()
            viewModel.authUser(name,surname,age.toInt())

            when {
                name.isNotEmpty() && surname.isNotEmpty() && age.isNotEmpty() -> {
                    findNavController().navigate(
                        AuthUserFragmentDirections.actionAuthUserFragmentToUserInformationFragment(
                            name,
                            surname,
                            age
                        )
                    )
                }
                else -> {
                    Toast.makeText(requireContext(), "Заполните все поля", Toast.LENGTH_SHORT)
                        .show()
                }
            }
        }
    }
}