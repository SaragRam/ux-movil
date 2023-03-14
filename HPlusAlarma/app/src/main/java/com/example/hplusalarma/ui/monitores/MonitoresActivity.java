package com.example.hplusalarma.ui.monitores;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.hplusalarma.R;
import com.example.hplusalarma.ui.home.HomeActivity;

public class MonitoresActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monitores);
    }

    public void añadirMonitor(View view) {
        Intent intent = new Intent(this, MonitoresDisponiblesActivity.class);
        startActivity(intent);
    }
}