package com.example.domekwgorach

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val polub: Button = findViewById(R.id.Polub_btn)
        val usun: Button = findViewById(R.id.Usun_btn)
        val iloscPolubien:TextView = findViewById(R.id.iloscPolubien)
        var x = 0
        polub.setOnClickListener{
            x +=1
            iloscPolubien.text = "${x} polubień"
        }
        usun.setOnClickListener{
            if (x!=0){
                x-=1
                iloscPolubien.text = "${x} polubień"
            }
        }
    }
}