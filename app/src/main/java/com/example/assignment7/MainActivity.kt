package com.example.assignment7

import android.app.ActionBar.LayoutParams
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.InputType
import android.text.TextUtils
import android.widget.EditText
import com.example.assignment7.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var inputText: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        var layout = binding.layout
        setContentView(binding.root)

        binding.btn.setOnClickListener {
            inputText = binding.inputText.toString()
            val hintText = EditText(this)
            hintText.hint = if (binding.checkbox.isChecked) {
                "Enter Number"
            } else "Enter Whatever you want"
            hintText.inputType = if (binding.checkbox.isChecked) {
                InputType.TYPE_CLASS_NUMBER
            } else InputType.TYPE_CLASS_TEXT
            val params = LayoutParams(
                LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT
            )
            layout.addView(hintText)
        }

    }
}
