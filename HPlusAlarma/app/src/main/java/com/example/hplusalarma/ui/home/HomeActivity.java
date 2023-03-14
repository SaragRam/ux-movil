package com.example.hplusalarma.ui.home;

import static androidx.navigation.Navigation.findNavController;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.ui.NavigationUI;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.hplusalarma.R;
import com.example.hplusalarma.ui.alarmas.AlarmasActivity;
import com.example.hplusalarma.ui.miperfil.MiPerfilActivity;
import com.example.hplusalarma.ui.monitores.MonitoresActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        NavController navController = findNavController(this, R.id.nav_host_fragment);
        // Find reference to bottom navigation view
        BottomNavigationView bottomNavigationView = findViewById(R.id.navFragmentHome);
        // Hook your navigation controller to bottom navigation view
        NavigationUI.setupWithNavController(bottomNavigationView, navController);

        bottomNavigationView.setOnItemSelectedListener(item -> {
            switch (item.getItemId()) {
                case R.id.navigation_dashboard:
                    // acción para ir a la página anterior
                    onBackPressed();
                    return true;
                case R.id.navigation_home:
                    // acción para ir a la página home
                    Intent intent = new Intent(this, HomeActivity.class);
                    startActivity(intent);
                    finish();
                    return true;
                case R.id.navigation_notifications:
                    // acción para salir de la aplicación
                    finishAffinity();
                    return true;
            }
            return false;
        });
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