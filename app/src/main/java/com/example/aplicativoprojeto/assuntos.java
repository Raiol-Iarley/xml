package com.example.aplicativoprojeto;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class assuntos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_assuntos);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void circulovoltar(View v) {
        Intent in = new Intent(assuntos.this, MainActivity.class);
        startActivity(in);
    }

    public void trianguloassunto(View v) {
        Intent in = new Intent(assuntos.this, triangulo.class);
        startActivity(in);
    }

    public void quadradoassuntos(View v) {
        Intent in = new Intent(assuntos.this, quadrado.class);
        startActivity(in);
    }

    public void retanguloassuntos(View v) {
        Intent in = new Intent(assuntos.this, retangulo.class);
        startActivity(in);
    }

    public void circuloass(View v) {
        Intent in = new Intent(assuntos.this, circulo.class);
        startActivity(in);
    }

}

