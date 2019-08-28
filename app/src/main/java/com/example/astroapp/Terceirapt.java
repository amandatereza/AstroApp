package com.example.astroapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Terceirapt extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terceirapt);


        Button ok = (Button) findViewById(R.id.botao);
        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder alerta = new AlertDialog.Builder(Terceirapt.this);
                alerta.setTitle("Plutão é um planeta?");
                alerta
                        .setIcon(R.mipmap.ic_launcher)
                        .setMessage(" ")
                        .setCancelable(false)
                        .setNegativeButton("Sim", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(getApplicationContext(), "Escolha confirmada", Toast.LENGTH_SHORT).show();
                            }
                        })
                        .setPositiveButton("Não", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(getApplicationContext(), "Escolha confirmada", Toast.LENGTH_SHORT).show();

                            }
                        });
                AlertDialog alertDialog = alerta.create();
                alertDialog.show();
            }


        });
    }
}
