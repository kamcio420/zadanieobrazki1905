package com.example.zadanieobrazki1905

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.TextView

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

        if(visibilityCheck.isChecked) {
            var x = View.VISIBLE
            dogImage.visibility = x
        }
        else {
            var x = View.INVISIBLE
            dogImage.visibility = x
        }
    }
}