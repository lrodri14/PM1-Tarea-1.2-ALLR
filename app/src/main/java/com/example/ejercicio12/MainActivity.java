package com.example.ejercicio12;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText nombre,apellido,edad,correo;
    Button btnEnviar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombre = findViewById(R.id.lbl_Nombre);
        apellido = findViewById(R.id.lbl_Apellido);
        edad = findViewById(R.id.lbl_Edad);
        correo = findViewById(R.id.lbl_Correo);
        btnEnviar = findViewById(R.id.btn_Enviar);

        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle envioDatos = new Bundle();
                envioDatos.putString("KeyDatos", nombre.getText().toString());
                envioDatos.putString("KeyDatos2", apellido.getText().toString());
                envioDatos.putString("KeyDatos3", edad.getText().toString());
                envioDatos.putString("KeyDatos4", correo.getText().toString());

                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtras(envioDatos);
                startActivity(intent);
            }
        });



    }
}