package com.github.thibseisel.poc.navdialog

import android.app.Dialog
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.DialogFragment
import androidx.navigation.fragment.findNavController

class FirstDialogFragment : DialogFragment() {

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return AlertDialog.Builder(requireContext())
            .setTitle("First dialog")
            .setMessage("When opening the 2nd dialog, it will either flash or not be shown at all. Then when trying to re-open this one, the app will crash.")
            .setCancelable(true)
            .setNegativeButton("Cancel", null)
            .setPositiveButton("Go to 2nd Dialog") { _, _ ->
                val toSecondDialog = FirstDialogFragmentDirections.openSecondDialog()
                findNavController().navigate(toSecondDialog)
            }
            .create()
    }
}