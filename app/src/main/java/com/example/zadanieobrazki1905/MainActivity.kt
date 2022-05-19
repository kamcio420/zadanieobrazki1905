package com.example.zadanieobrazki1905

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.TextView
import androidx.core.view.isNotEmpty
import androidx.core.view.isVisible
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val prevButton = findViewById<Button>(R.id.prevButton)
        val nextButton = findViewById<Button>(R.id.nextButton)
        val dogImage = findViewById<ImageView>(R.id.dogImage)
        val describe = findViewById<TextView>(R.id.describe)
        val visibilityCheck = findViewById<CheckBox>(R.id.visibility)
        var index = 1

        prevButton.setOnClickListener {
            index -= 1
            if(index in 1..5) {
                when (index) {
                    1 -> { dogImage.setImageResource(R.drawable.gf_r5l2_jmua_ue7d_dog_niemiecki_lagodny_olbrzym_1920x1080_nocrop)
                           describe.text = "Pies1"}
                    2 -> { dogImage.setImageResource(R.drawable.images)
                           describe.text = "Pies2"}
                    3 -> { dogImage.setImageResource(R.drawable.images_2)
                           describe.text = "Pies3"}
                    4 -> { dogImage.setImageResource(R.drawable.images_3)
                           describe.text = "Pies4"}
                    5 -> { dogImage.setImageResource(R.drawable.great_dane_2793816_1280_740x493)
                           describe.text = "Pies5"}
                }
            }
        }

        nextButton.setOnClickListener {
            index += 1
            if(index in 1..5) {
                when (index) {
                    1 -> { dogImage.setImageResource(R.drawable.gf_r5l2_jmua_ue7d_dog_niemiecki_lagodny_olbrzym_1920x1080_nocrop)
                        describe.text = "Pies1"}
                    2 -> { dogImage.setImageResource(R.drawable.images)
                        describe.text = "Pies2"}
                    3 -> { dogImage.setImageResource(R.drawable.images_2)
                        describe.text = "Pies3"}
                    4 -> { dogImage.setImageResource(R.drawable.images_3)
                        describe.text = "Pies4"}
                    5 -> { dogImage.setImageResource(R.drawable.great_dane_2793816_1280_740x493)
                        describe.text = "Pies5"}
                }
            }
        }

        visibilityCheck.setOnClickListener()
        {
            dogImage.isVisible = !dogImage.isVisible
        }

        var alphaInput = findViewById<TextInputEditText>(R.id.textInputEditText)
        val alphaConfirm = findViewById<CheckBox>(R.id.alphaConf)

        alphaConfirm.setOnClickListener()
        {
            if(alphaConfirm.isChecked) {
                val astr = alphaInput.text.toString()
                if (astr.isNotEmpty()) {
                    val a = astr.toFloat()

                    if (a in 0.0..255.0) {
                        dogImage.alpha = a
                    } else {
                        dogImage.alpha = 1f
                    }
                }
            }
            else {
                dogImage.alpha = 1f
            }
        }
    }
}