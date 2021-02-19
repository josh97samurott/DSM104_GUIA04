package com.example.dsm104_guia04;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView tvNombre;
    private TextView tvSalarioNeto;
    private TextView tvISSS;
    private TextView tvAFP;
    private TextView tvRenta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tvNombre = (TextView)findViewById(R.id.txtNombre);
        tvSalarioNeto = (TextView)findViewById(R.id.txtSalarioNeto);
        tvISSS = (TextView)findViewById(R.id.txtISSS);
        tvAFP = (TextView)findViewById(R.id.txtAFP);
        tvRenta = (TextView)findViewById(R.id.txtRenta);

        Bundle bundle = getIntent().getExtras();
        tvNombre.setText(bundle.getString("txtNombre"));
        tvSalarioNeto.setText(bundle.getString("txtSalarioNeto"));
        tvISSS.setText(bundle.getString("txtISSS"));
        tvAFP.setText(bundle.getString("txtAFP"));
        tvRenta.setText(bundle.getString("txtRenta"));
    }

    public void primeraActividad(View v){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}