package com.example.hellodellfina

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
//Исправлено Дурыкиной upstream уже в merge ной
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
