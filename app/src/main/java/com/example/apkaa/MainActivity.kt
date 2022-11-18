package com.example.apkaa

import android.annotation.SuppressLint

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.example.apkaa.R.drawable.zdjecie3

class MainActivity : AppCompatActivity() {

    @SuppressLint("ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var x = 1

        findViewById<Button>(R.id.nextbutt).setOnClickListener {
            if (x == 1) {

                findViewById<ImageView>(R.id.imageView).setImageResource(zdjecie3)
                x = 2

            } else if (x == 0) {

                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.zdjecie1)
                x = 1
            } else if (x == 2) {

                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.zdjecie2)
                x = 0

            }
        }
        findViewById<Button>(R.id.previousbutt).setOnClickListener {

            if (x == 1) {

                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.zdjecie2)
                x = 0
            } else if (x == 2) {

                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.zdjecie1)
                x = 1
            } else if (x == 0) {

                findViewById<ImageView>(R.id.imageView).setImageResource(zdjecie3)
                x = 2

            }

        }

        fun multiplyNumbers(num: Int): Int {
            if (num >= 1)
                return num * multiplyNumbers(num - 1)
            else
                return 1
        }

        findViewById<Button>(R.id.obliczbutt).setOnClickListener {

            findViewById<TextView>(R.id.wynik).text = (multiplyNumbers(R.id.silnia).toString())

        }

    }
}