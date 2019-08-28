package com.example.astroapp;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Notification;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void mostrarToast(View view) {
        Toast.makeText(getApplicationContext(),"Dados Enviados",Toast.LENGTH_SHORT).show();
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    public void confirmou(View view) {
        Intent intent = new Intent(this, Segundapt.class);
        Bundle bundle = new Bundle();
        TextView textView = (TextView) findViewById(R.id.editText);
        TextView textView1 = (TextView) findViewById(R.id.editText2);
        TextView textView2 = (TextView) findViewById(R.id.editText3);
        bundle.putString("nome",textView.getText().toString());
        bundle.putString("email",textView2.getText().toString());
        Notification.MessagingStyle.Message textView3 = null;
        bundle.putString("planetas",textView3.getText().toString());
        intent.putExtras(bundle);
        startActivity(intent);
    }
}