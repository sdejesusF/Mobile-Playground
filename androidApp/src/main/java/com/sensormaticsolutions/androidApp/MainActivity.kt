package com.sensormaticsolutions.androidApp

import android.os.Bundle
import com.sensormaticsolutions.shared.Greeting
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Text

fun greet(): String {
    return Greeting().greeting()
}

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Text(text = greet())
        }
    }
}