package com.asadbyte.taskone

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment

class SimpleFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_simple, container, false)

        val textView = view.findViewById<TextView>(R.id.fragmentText)
        val button = view.findViewById<Button>(R.id.fragmentButton)

        button.setOnClickListener {
            textView.text = "Button clicked inside fragment!"
        }

        return view
    }
}
