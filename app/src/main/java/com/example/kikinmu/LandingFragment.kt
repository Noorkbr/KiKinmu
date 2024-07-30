package com.example.kikinmu



import androidx.navigation.fragment.findNavController
import com.example.kikimmu.R
import com.example.kikimmu.databinding.FragmentLandingBinding
import com.example.kikinmu.base.BaseFragment



class LandingFragment : BaseFragment<FragmentLandingBinding>(FragmentLandingBinding::inflate) {
    override fun setListener() {
     binding.startedBtn.setOnClickListener {
         findNavController().navigate(R.id.action_landingFragment_to_loginFragment)


     }}
    override fun allObserver() {

    }

}