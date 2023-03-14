package com.example.hplusalarma.ui.monitores;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.hplusalarma.R;

public class AgregarMonitorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agregar_monitor);
    }

    public void agregarm(View view) {
        Intent intent = new Intent(this, MonitoresActivity.class);
        startActivity(intent);
    }

    public void cancelarm(View view) {
        Intent intent = new Intent(this, MonitoresDisponiblesActivity.class);
        startActivity(intent);
    }
}