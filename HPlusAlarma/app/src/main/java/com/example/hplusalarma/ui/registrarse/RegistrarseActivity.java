package com.example.hplusalarma.ui.registrarse;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.hplusalarma.GlobalVars;
import com.example.hplusalarma.MainActivity;
import com.example.hplusalarma.R;
import com.example.hplusalarma.ui.notificacion.NotificacionActivity;

public class RegistrarseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrarse);
    }

    public void registrarse(View view) {
        EditText editTextUsuario = findViewById(R.id.editText1);
        GlobalVars.getInstance().setUsuario(editTextUsuario.getText().toString());
        EditText editTextNombre = findViewById(R.id.editText2);
        GlobalVars.getInstance().setNombreCompleto(editTextNombre.getText().toString());
        EditText editTextCorreo = findViewById(R.id.editText3);
        GlobalVars.getInstance().setCorreo(editTextCorreo.getText().toString());
        EditText editTextContraseña = findViewById(R.id.editText4);
        GlobalVars.getInstance().setContraseña(editTextContraseña.getText().toString());
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void cancelar(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}