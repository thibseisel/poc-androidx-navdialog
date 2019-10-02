package com.github.thibseisel.poc.navdialog

import android.app.Dialog
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.DialogFragment

class SecondDialogFragment : DialogFragment() {

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return AlertDialog.Builder(requireContext())
            .setTitle("2nd Dialog")
            .setMessage("If you can read this, then you are lucky (or you can read very fast).")
            .setNegativeButton("OK", null)
            .create()
    }
}