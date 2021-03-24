package com.example.pelulastab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.pelulastab.primerEjercicio.TabsWithViewPager;
import com.example.pelulastab.segundoejercicio.SegundoEjercicio;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button botonUno = findViewById(R.id.bt_primero);
        Button botonSegundo = findViewById(R.id.bt_segundo);

        botonUno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TabsWithViewPager.class);
                startActivity(intent);
            }
        });

        botonSegundo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SegundoEjercicio.class);
                startActivity(intent);
            }
        });
    }
}