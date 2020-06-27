package com.example.trabajopractico2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LogInActivity extends AppCompatActivity {

    private Button btn_Ingresar_Login;
    private EditText edtTxt_Nombre_Login, edtTxt_Contrasena_Login;
    private Switch swt_RecUsuario_Login;
    private TextView txt_SinRegistrar_Login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btn_Ingresar_Login = findViewById(R.id.btn_Ingresar_LogIn);
        edtTxt_Nombre_Login = findViewById(R.id.edtTxt_Nombre_LogIn);
        edtTxt_Contrasena_Login = findViewById(R.id.edtTxt_Contrasena_Login);
        swt_RecUsuario_Login = findViewById(R.id.swt_RecUsuario_LogIn);
         txt_SinRegistrar_Login = findViewById(R.id.txt_SinRegistrar_LogIn);

        btn_Ingresar_Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edtTxt_Nombre_Login.getText().toString().equals("ites") && edtTxt_Contrasena_Login.getText().toString().equals("1234"))
                   Toast.makeText(LogInActivity.this, "Acceso Válido", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(LogInActivity.this, "Acceso No Permitido", Toast.LENGTH_SHORT).show();
            }
        });
    }


}
