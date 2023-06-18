package com.example.myapplication_calculadora;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    Button suma = findViewById(R.id.Suma);
    Button resta = findViewById(R.id.Resta);
    Button multiplicacion= findViewById(R.id.Multiplicacion);
    Button division = findViewById(R.id.Division);

    EditText editTextNum1=findViewById(R.id.editTextNum1);
    EditText editTextNum2 = findViewById(R.id.editTextNum2);

        suma.setOnClickListener(new View.OnClickListener() {

@Override
public void onClick(View v) {
    if (editTextNum1.getText().toString().trim().isEmpty() || editTextNum2.getText().toString().trim().isEmpty()) {
        Toast.makeText(getBaseContext(), "faltan numeros a ingresar", Toast.LENGTH_SHORT).show();
        return;
    }
        Integer Num1 = Integer.parseInt(editTextNum1.getText().toString());
        Integer Num2 = Integer.parseInt(editTextNum2.getText().toString());
        Integer suma = Num1 + Num2;
        Toast.makeText(getBaseContext(), "resultado" + suma.toString(), Toast.LENGTH_SHORT).show();
    }
   });

        resta.setOnClickListener(new View.OnClickListener(){

@Override
public void onClick (View v) {
        if (editTextNum1.getText().toString().trim().isEmpty() || editTextNum2.getText().toString().trim().isEmpty()) {
            Toast.makeText(getBaseContext(), "faltan numeros a ingresar", Toast.LENGTH_SHORT).show();
            return;
        }
        Integer Num1 = Integer.parseInt(editTextNum1.getText().toString());
        Integer Num2 = Integer.parseInt(editTextNum2.getText().toString());
        Integer resta =  Num1 - Num2;
        Toast.makeText(getBaseContext(), "resultado"+ resta.toString(),Toast.LENGTH_SHORT).show();
        }
       });
        multiplicacion.setOnClickListener (new View.OnClickListener() {
@Override
public void onClick(View v) {
        if (editTextNum1.getText().toString().trim().isEmpty() || editTextNum2.getText().toString().trim().isEmpty()) {
        Toast.makeText(getBaseContext(), "faltan numeros a ingresar", Toast.LENGTH_SHORT).show();
        return;
        }
        Integer Num1 = Integer.parseInt(editTextNum1.getText().toString());
        Integer Num2 = Integer.parseInt(editTextNum2.getText().toString());
        Integer multiplicacion =  Num1 * Num2;
        Toast.makeText(getBaseContext(), "resultado"+ multiplicacion.toString(),Toast.LENGTH_SHORT).show();
        }
        });

        division.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editTextNum1.getText().toString().trim().isEmpty() || editTextNum2.getText().toString().trim().isEmpty()) {
                    Toast.makeText(getBaseContext(), "faltan numeros a ingresar", Toast.LENGTH_SHORT).show();
                    if (Integer.parseInt(editTextNum1.getText().toString()) == 0) {
                        return;
                    }
                    Integer Num1 = Integer.parseInt(editTextNum1.getText().toString());
                    Integer Num2 = Integer.parseInt(editTextNum2.getText().toString());
                    Integer division = Num1 / Num2;
                    Toast.makeText(getBaseContext(), "resultado" + division.toString(), Toast.LENGTH_SHORT).show();
                }
            }

        }
    );}}