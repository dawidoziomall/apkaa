package com.example.apkaa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import com.example.apkaa.R.drawable.zdjecie3
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    var x = 5
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if(x==5){

            findViewById<Button>(R.id.nextbutt).setOnClickListener{

                findViewById<ImageView>(R.id.imageView).setImageResource(zdjecie3)

            }

            x += 1

        }

        if(x==6){

            findViewById<Button>(R.id.previousbutt).setOnClickListener {

                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.zdjecie1)

            }

            x -= 1

        }

        if(x==5){

            findViewById<Button>(R.id.previousbutt).setOnClickListener{

                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.zdjecie2)

            }

            x-=1

        }

        findViewById<Button>(R.id.obliczbutt).setOnClickListener {

            val v1 = findViewById<EditText>(R.id.silnia) as EditText
            val tot = findViewById<EditText>(R.id.wynik) as TextView

            val v2 = v1.text.toString().toInt()
            tot.text = (v1.toString())

        }

    }
}