package com.example.trabajopractico2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btn_Sumar, btn_Restar, btn_ZoomMas, btn_ZoomMenos, btn_Ocultar, btn_Reset_Calc;
    private TextView txt_Num;
    private Integer cont = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_Sumar = findViewById(R.id.btn_Sumar);
        btn_Restar = findViewById(R.id.btn_Restar);
        btn_ZoomMas = findViewById(R.id.btn_ZoomMas);
        btn_ZoomMenos = findViewById(R.id.btn_ZoomMenos);
        btn_Ocultar = findViewById(R.id.btn_Ocultar);
        btn_Reset_Calc = findViewById(R.id.btn_Reset_Calc);
        txt_Num = findViewById(R.id.txt_Num);

        // Boton SUMAR
        btn_Sumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cont++;
                txt_Num.setText(cont.toString());
            }
        });

        // Boton RESTAR
        btn_Restar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cont == 0) return;
                cont--;
                txt_Num.setText(cont.toString());
            }
        });

        // Boton REINICIAR
        btn_Reset_Calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cont = 0;
                txt_Num.setText(cont.toString());
            }
        });
    }
}
