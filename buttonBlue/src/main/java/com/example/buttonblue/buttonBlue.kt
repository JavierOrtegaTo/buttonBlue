package com.example.buttonblue

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.ImageButton
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout

class buttonBlue @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyle: Int = 0,
    defStyleRes: Int = 0,
) : ConstraintLayout(context, attrs, defStyle, defStyleRes){

    init {
        LayoutInflater.from(context).inflate(R.layout.component_button_blue, this, true)
        val btn = findViewById<ImageButton>(R.id.btn_blue)
        btn.setOnClickListener {
            Toast.makeText(context, "wenas gente", Toast.LENGTH_SHORT).show()
        }
    }

}