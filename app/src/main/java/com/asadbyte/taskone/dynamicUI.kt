package com.asadbyte.taskone

import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.fragment.app.Fragment

class DynamicUiFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Create a LinearLayout programmatically
        val linearLayout = LinearLayout(requireContext()).apply {
            orientation = LinearLayout.VERTICAL
            gravity = Gravity.CENTER
            setBackgroundColor(0xFFE8F5E9.toInt()) // Light green
        }

        // Add a TextView dynamically
        val textView = TextView(requireContext()).apply {
            text = "Dynamically Created UI!"
            textSize = 16f
            gravity = Gravity.CENTER
        }
        linearLayout.addView(textView)

        // Add a Button dynamically
        val button = Button(requireContext()).apply {
            text = "Press Me"
            setOnClickListener {
                textView.text = "Button Pressed!"
            }
        }
        linearLayout.addView(button)

        return linearLayout
    }
}