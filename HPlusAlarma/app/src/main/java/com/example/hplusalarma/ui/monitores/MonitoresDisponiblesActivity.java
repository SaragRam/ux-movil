package com.example.hplusalarma.ui.monitores;

import static androidx.navigation.Navigation.findNavController;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.ui.NavigationUI;

import com.example.hplusalarma.R;
import com.example.hplusalarma.ui.home.HomeActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MonitoresDisponiblesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monitores_disponibles);

        NavController navController = findNavController(this, R.id.nav_host_fragment);
        // Find reference to bottom navigation view
        BottomNavigationView bottomNavigationView = findViewById(R.id.navFragmentMonitoresDisponibles);
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

    public void agregarMonitor(View view) {
        Intent intent = new Intent(this, AgregarMonitorActivity.class);
        startActivity(intent);
    }
}