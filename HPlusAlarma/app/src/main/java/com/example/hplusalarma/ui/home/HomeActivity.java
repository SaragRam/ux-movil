package com.example.hplusalarma.ui.home;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.hplusalarma.R;
import com.example.hplusalarma.ui.alarmas.AlarmasActivity;
import com.example.hplusalarma.ui.miperfil.MiPerfilActivity;
import com.example.hplusalarma.ui.monitores.MonitoresActivity;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void alarmas(View view) {
        Intent intent = new Intent(this, AlarmasActivity.class);
        startActivity(intent);
    }

    public void monitores(View view) {
        Intent intent = new Intent(this, MonitoresActivity.class);
        startActivity(intent);
    }

    public void miPerfil(View view) {
        Intent intent = new Intent(this, MiPerfilActivity.class);
        startActivity(intent);
    }
}