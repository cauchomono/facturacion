package com.example.facturacion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var valProducto = findViewById<View>(R.id.txtPrice) as EditText
        var valCant = findViewById<View>(R.id.txtCant) as EditText
        var valDesc = findViewById<View>(R.id.txtIva) as EditText
        var btnFacture = findViewById<View>(R.id.btnFactura) as Button
        var tvSub = findViewById<View>(R.id.tvSubtotValue) as TextView
        var tvIVA = findViewById<View>(R.id.tvIVAValue) as TextView
        var tvDesc = findViewById<View>(R.id.tvTotIvaValue) as TextView
        var tvTotal = findViewById<View>(R.id.tvNetoValue) as TextView



        btnFacture.setOnClickListener(View.OnClickListener {

        })
    }
}