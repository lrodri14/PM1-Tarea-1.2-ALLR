package com.example.ejercicio12;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView datos1;
    TextView datos2;
    TextView datos3;
    TextView datos4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

       datos1 = findViewById(R.id.MostrarDatos1);
       datos2 = findViewById(R.id.MostrarDatos2);
       datos3 = findViewById(R.id.MostrarDatos3);
       datos4 = findViewById(R.id.MostrarDatos4);

        Bundle recibeDatos = getIntent().getExtras();
        String info = recibeDatos.getString("KeyDatos");
        datos1.setText(info);

        Bundle recibeDatos2 = getIntent().getExtras();
        String info2 = recibeDatos.getString("KeyDatos2");
        datos2.setText(info2);

        Bundle recibeDatos3 = getIntent().getExtras();
        String info3 = recibeDatos.getString("KeyDatos3");
        datos3.setText(info3);

        Bundle recibeDatos4 = getIntent().getExtras();
        String info4 = recibeDatos.getString("KeyDatos4");
        datos4.setText(info4);




    }
}