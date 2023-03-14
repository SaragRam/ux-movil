package com.example.hplusalarma.ui.alarmas;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.hplusalarma.R;
import com.example.hplusalarma.ui.home.HomeActivity;

public class AñadirAlarmasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anadir_alarmas);
    }

    public void crear(View view) {
        Intent intent = new Intent(this, AlarmasActivity.class);
        startActivity(intent);
    }

    public void cancelar(View view) {
        Intent intent = new Intent(this, AlarmasActivity.class);
        startActivity(intent);
    }
}