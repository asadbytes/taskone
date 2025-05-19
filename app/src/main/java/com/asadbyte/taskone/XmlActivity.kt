package com.asadbyte.taskone

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.asadbyte.taskone.databinding.LayoutBinding


class XmlActivity : AppCompatActivity() {
    private lateinit var binding: LayoutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = LayoutBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        setContentView(R.layout.layout)
//        val button = findViewById<Button>(R.id.clickButton)
//        button.setOnClickListener {
//            binding.titleText.text = "Button clicked!"
//        }

        binding.clickButton.setOnClickListener {
            binding.titleText.text = "Button clicked!"
        }
    }
}