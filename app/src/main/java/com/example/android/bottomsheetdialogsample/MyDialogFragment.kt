package com.example.android.bottomsheetdialogsample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.android.bottomsheetdialogsample.databinding.FragmentMyDialogBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class MyDialogFragment : BottomSheetDialogFragment() {

    private var _binding: FragmentMyDialogBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentMyDialogBinding.inflate(inflater, container, false)
        return binding.root

    }

}