package com.example.ej4;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    int contadorGeneral;
    int contador1;
    int contador2;
    int contador3;
    int contador4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


        Button buttContadorGeneral = findViewById(R.id.button);
        TextView textContadorGaneral = findViewById(R.id.textView);

        Button buttContador1 = findViewById(R.id.button2);
        Button buttReset1 = findViewById(R.id.button3);
        TextView textContador1 = findViewById(R.id.textView2);

        Button buttContador2 = findViewById(R.id.button4);
        Button buttReset2 = findViewById(R.id.button5);
        TextView textContador2 = findViewById(R.id.textView4);

        Button buttContador3 = findViewById(R.id.button6);
        Button buttReset3 = findViewById(R.id.button7);
        TextView textContador3 = findViewById(R.id.textView5);

        Button buttContador4 = findViewById(R.id.button8);
        Button buttReset4 = findViewById(R.id.button9);
        TextView textContador4 = findViewById(R.id.textView6);


        buttContadorGeneral.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textContadorGaneral.setText("0");
                textContador1.setText("0");
                textContador2.setText("0");
                textContador3.setText("0");
                textContador4.setText("0");
                contadorGeneral = 0;
                contador1 = 0;
                contador2 = 0;
                contador3 = 0;
                contador4 = 0;
            }
        });


        //Linea 1
        buttContador1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contadorGeneral++;
                contador1++;
                textContadorGaneral.setText("" + contadorGeneral);
                textContador1.setText("" + contador1);
            }
        });
        buttReset1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textContador1.setText("0");
                contador1 = 0;
            }
        });
        //Linea 2
        buttContador2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contadorGeneral++;
                contador2++;
                textContadorGaneral.setText("" + contadorGeneral);
                textContador2.setText("" + contador2);
            }
        });
        buttReset2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textContador2.setText("0");
                contador2 = 0;
            }
        });
        //Linea 3
        buttContador3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contadorGeneral++;
                contador3++;
                textContadorGaneral.setText("" + contadorGeneral);
                textContador3.setText("" + contador3);
            }
        });
        buttReset3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textContador3.setText("0");
                contador3 = 0;
            }
        });
        //Linea 4
        buttContador4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contadorGeneral++;
                contador4++;
                textContadorGaneral.setText("" + contadorGeneral);
                textContador4.setText("" + contador4);
            }
        });
        buttReset4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textContador4.setText("0");
                contador4 = 0;
            }
        });


    }
}