package me.mariana.orgs.ui.view

import android.app.Activity
import android.os.Bundle
import android.widget.TextView
import me.mariana.orgs.R

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val nome = findViewById<TextView>(R.id.tv_nome)
        nome.text = "Cesta de frutas"
    }
}