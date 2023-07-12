package com.example.myapplication_calculadora

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val suma = findViewById<Button>(R.id.Suma)
        val resta = findViewById<Button>(R.id.Resta)
        val multiplicacion = findViewById<Button>(R.id.Multiplicacion)
        val division = findViewById<Button>(R.id.Division)
        val editTextNum1 = findViewById<EditText>(R.id.editTextNum1)
        val editTextNum2 = findViewById<EditText>(R.id.editTextNum2)
        suma.setOnClickListener(View.OnClickListener {
            if (editTextNum1.text.toString().trim { it <= ' ' }
                    .isEmpty() || editTextNum2.text.toString().trim { it <= ' ' }.isEmpty()) {
                Toast.makeText(baseContext, "faltan numeros a ingresar", Toast.LENGTH_SHORT).show()
                return@OnClickListener
            }
            val Num1 = editTextNum1.text.toString().toInt()
            val Num2 = editTextNum2.text.toString().toInt()
            val suma = Num1 + Num2
            Toast.makeText(baseContext, "resultado$suma", Toast.LENGTH_SHORT).show()
        })
        resta.setOnClickListener(View.OnClickListener {
            if (editTextNum1.text.toString().trim { it <= ' ' }
                    .isEmpty() || editTextNum2.text.toString().trim { it <= ' ' }
                    .isEmpty()) {
                Toast.makeText(baseContext, "faltan numeros a ingresar", Toast.LENGTH_SHORT).show()
                return@OnClickListener
            }
            val Num1 = editTextNum1.text.toString().toInt()
            val Num2 = editTextNum2.text.toString().toInt()
            val resta = Num1 - Num2
            Toast.makeText(baseContext, "resultado$resta", Toast.LENGTH_SHORT).show()
        })
        multiplicacion.setOnClickListener(View.OnClickListener {
            if (editTextNum1.text.toString().trim { it <= ' ' }
                    .isEmpty() || editTextNum2.text.toString().trim { it <= ' ' }
                    .isEmpty()) {
                Toast.makeText(baseContext, "faltan numeros a ingresar", Toast.LENGTH_SHORT).show()
                return@OnClickListener
            }
            val Num1 = editTextNum1.text.toString().toInt()
            val Num2 = editTextNum2.text.toString().toInt()
            val multiplicacion = Num1 * Num2
            Toast.makeText(baseContext, "resultado$multiplicacion", Toast.LENGTH_SHORT).show()
        })
        division.setOnClickListener(View.OnClickListener {
            if (editTextNum1.text.toString().trim { it <= ' ' }
                    .isEmpty() || editTextNum2.text.toString().trim { it <= ' ' }
                    .isEmpty()) {
                Toast.makeText(baseContext, "faltan numeros a ingresar", Toast.LENGTH_SHORT).show()
                if (editTextNum2.text.toString().toInt() == 0) {
                    return@OnClickListener
                }
            }
            val Num1: Double =editTextNum1.text.toString().toDouble()
            val Num2 = editTextNum2.text.toString().toDouble()
            val division = Num1 / Num2
            Toast.makeText(baseContext, "resultado$division", Toast.LENGTH_SHORT).show()
        }
        )
    }
}