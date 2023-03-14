package com.example.hplusalarma.ui.miperfil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.hplusalarma.GlobalVars;
import com.example.hplusalarma.R;
import com.example.hplusalarma.ui.home.HomeActivity;

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