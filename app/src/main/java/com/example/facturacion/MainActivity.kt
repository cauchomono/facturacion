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



        btnFacture.setOnClickListener{
            val ivaDecimal = valDesc.text.toString().toDouble()
            val cantidad = valCant.text.toString().toInt()
            val precioProducto = valProducto.text.toString().toDouble()



            val subTotal = 2
            val valorIva =1
            val totalConIva =1

            val descuento : Double
            if(totalConIva >= 2000000){
                descuento = subTotal*0.1

            }else if(totalConIva > 2000000){
                descuento = subTotal*0.05
            }else{
                descuento = 0.0
            }
                tvSub.text = "Subtotal: ${subTotal.toString()}"
                tvIVA.text = "Valor iva: ${valorIva.toString()}"
                tvDesc.text = "Total con iva: ${tvDesc.toString()}"
                tvTotal.text = "Total con descuento: ${valorIva.toString()}"

        }
}
}