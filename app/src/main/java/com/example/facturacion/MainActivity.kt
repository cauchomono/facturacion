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
            var percentDesc = valDesc.text.toString().toDouble() / 100
            //Calcular el valor de la compra sin iva
            var subTot = Math.round (((valProducto.text.toString().toInt() * valCant.text.toString().toInt()) / 1.19) * 100) / 100
            tvSub.setText("$" + subTot + " COP")

            //Calcular el valor del iva
            var Iva = (valProducto.text.toString().toInt() * valCant.text.toString().toInt()) - subTot
            tvIVA.setText("$" + Iva + " COP")

            //Calcular el valor del descuento
            var Desc = Math.round (subTot * percentDesc)
            tvDesc.setText("$" + Desc + " COP")

            //Calcular el total de la factura
            var Total = Math.round ((subTot - Desc.toDouble()) + Iva)
            tvTotal.setText("$" + Total + " COP")
        })
    }
}