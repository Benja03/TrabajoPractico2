package com.example.trabajopractico2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SegundaActivity extends AppCompatActivity {
    private EditText edText_Entrada, edText_Resultado;
    public RadioButton rdBtn_USA, rdBtn_EURO, rdBtn_Brasil;
    public Button btn_Convertir, btn_Reiniciar_Convertir;
    private  float valorUS = (float) 70.21,
                    valorEU = (float) 78.82,
                    valorReal = (float) 12.85;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        edText_Entrada = findViewById(R.id.edTxt_Entrada);
        edText_Resultado = findViewById(R.id.edTxt_Resultado);
        rdBtn_USA = findViewById(R.id.rdBtn_USA);
        rdBtn_EURO = findViewById(R.id.rdBtn_EURO);
        rdBtn_Brasil = findViewById(R.id.rdBtn_Brasil);
        //rdBtn_Group = findViewById(R.id.rdBtn_Grupo);
        btn_Convertir = findViewById(R.id.btn_Convertir);
        btn_Reiniciar_Convertir = findViewById(R.id.btn_Reiniciar_Conv);

        btn_Convertir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String txt = edText_Entrada.getText().toString();

                if(!entradaVacia())   edText_Resultado.setText(convertir(Float.parseFloat(txt)));
                else Toast.makeText(SegundaActivity.this, "Ingrese un valor.", Toast.LENGTH_SHORT).show();
            }
        });

        btn_Reiniciar_Convertir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                limpiarControles();
            }
        });
    }

    private boolean entradaVacia(){
        return edText_Entrada.getText().toString().trim().isEmpty();

    }

    private String convertir(Float monto){
        float cuenta = (float) 0.0;
        String res;
        if(rdBtn_USA.isChecked()) cuenta = monto*valorUS;
        if(rdBtn_EURO.isChecked()) cuenta = monto*valorEU;
        if(rdBtn_Brasil.isChecked()) cuenta = monto * valorReal;

        res = String.valueOf(cuenta);
        return res;
    }

    private void limpiarControles(){
        edText_Entrada.getText().clear();
        edText_Resultado.getText().clear();
        rdBtn_USA.setChecked(true);
    }
}
