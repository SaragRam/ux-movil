package com.example.hplusalarma.ui.miperfil;

import static androidx.navigation.Navigation.findNavController;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.ui.NavigationUI;

import com.example.hplusalarma.GlobalVars;
import com.example.hplusalarma.R;
import com.example.hplusalarma.ui.home.HomeActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MiPerfilActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mi_perfil);

        TextView textViewUsuario = findViewById(R.id.textView8);
        textViewUsuario.setText(GlobalVars.getInstance().getUsuario());
        EditText editTextNombre = findViewById(R.id.editText2);
        editTextNombre.setText(GlobalVars.getInstance().getNombreCompleto());
        EditText editTextCorreo = findViewById(R.id.editText3);
        editTextCorreo.setText(GlobalVars.getInstance().getCorreo());
        EditText editTextContraseña = findViewById(R.id.editText4);
        editTextContraseña.setText(GlobalVars.getInstance().getContraseña());
        EditText editTextConfirmarContraseña = findViewById(R.id.editText5);
        editTextConfirmarContraseña.setText(GlobalVars.getInstance().getContraseña());

        NavController navController = findNavController(this, R.id.nav_host_fragment);
        // Find reference to bottom navigation view
        BottomNavigationView bottomNavigationView = findViewById(R.id.navFragmentMiPerfil);
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

    public void guardar(View view) {
        EditText editTextNombre = findViewById(R.id.editText2);
        GlobalVars.getInstance().setNombreCompleto(editTextNombre.getText().toString());
        EditText editTextCorreo = findViewById(R.id.editText3);
        GlobalVars.getInstance().setCorreo(editTextCorreo.getText().toString());
        EditText editTextContraseña = findViewById(R.id.editText4);
        GlobalVars.getInstance().setContraseña(editTextContraseña.getText().toString());
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
    }

    public void cancelar(View view) {
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
    }
}