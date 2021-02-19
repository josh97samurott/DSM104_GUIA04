package com.example.dsm104_guia04;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {
    private EditText etNombre;
    private EditText etHoras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNombre = (EditText)findViewById(R.id.txtName);
        etHoras = (EditText)findViewById(R.id.txtHoras);
    }

    public void segundaActividad(View v){
            Intent i = new Intent(this, SecondActivity.class);
        int horas = Integer.parseInt(etHoras.getText().toString());
        double total = horas*8.50;
        double isss = total*0.02;
        double afp = total*0.03;
        double renta = total*0.04;
        total = total - (isss+afp+renta);

        i.putExtra("txtNombre", etNombre.getText().toString());
        i.putExtra("txtSalarioNeto", String.format("%.2f", total));
        i.putExtra("txtISSS", String.format("%.2f", isss));
        i.putExtra("txtAFP", String.format("%.2f", afp));
        i.putExtra("txtRenta", String.format("%.2f", renta));

        startActivity(i);
    }
}