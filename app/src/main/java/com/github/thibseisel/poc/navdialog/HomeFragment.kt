package com.github.thibseisel.poc.navdialog

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class HomeFragment : Fragment(R.layout.fragment_home) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.open_dialog_button).setOnClickListener {
            val toFirstDialog = HomeFragmentDirections.openFirstDialog()
            findNavController().navigate(toFirstDialog)
        }
    }
}