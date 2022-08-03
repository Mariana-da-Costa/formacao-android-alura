package me.mariana.orgs

import android.app.Activity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Toast.makeText(this, "Bem vindo!", Toast.LENGTH_LONG).show()

        val view = TextView(this)
        view.text = "Criando layout manualmente"
        setContentView(R.layout.activity_main)
    }
}