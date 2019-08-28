package com.example.astroapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Segundapt extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundapt);

        ListView lista = (ListView) findViewById(R.id.list);
        final ArrayList<String> planetas = preencherDados();
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, planetas);
        lista.setAdapter(arrayAdapter);
    }

    private ArrayList<String> preencherDados() {
        ArrayList<String> dados = new ArrayList<String>();
        dados.add("  Mercúrio");
        dados.add("  Vênus");
        dados.add("  Terra");
        dados.add("  Júpiter");
        dados.add("  Saturno");
        dados.add("  Urano");
        dados.add("  Netuno");
        dados.add("  Plutão");
        return dados;

    }

    public void continuou(View view) {
        Intent intent = new Intent(this, Terceirapt.class);
        startActivity(intent);
    }
}