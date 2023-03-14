package com.example.hplusalarma.ui.alarmas;

import static androidx.navigation.Navigation.findNavController;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.ui.NavigationUI;

import com.example.hplusalarma.R;
import com.example.hplusalarma.ui.home.HomeActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.chip.Chip;

public class AlarmasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarmas);

        NavController navController = findNavController(this, R.id.nav_host_fragment);
        // Find reference to bottom navigation view
        BottomNavigationView bottomNavigationView = findViewById(R.id.navFragmentAlarmas);
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

    public void añadirAlarma(View view) {
        Intent intent = new Intent(this, AñadirAlarmasActivity.class);
        startActivity(intent);
    }

    public void editarAlarma(View view) {
        Intent intent = new Intent(this, EditarAlarmasActivity.class);
        startActivity(intent);
    }

    public void mostrarPopUp(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("¿Seguro que desea eliminar esta alarma?");
        builder.setCancelable(true);

        builder.setPositiveButton(
                "ELIMINAR",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });
        builder.setNegativeButton(
                "CANCELAR",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });

        AlertDialog alerta = builder.create();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
            alerta.getWindow().getDecorView().setLayoutDirection(View.LAYOUT_DIRECTION_LTR);
        }
        alerta.getWindow().setBackgroundDrawable(new ColorDrawable(Color.WHITE));
        alerta.show();
        TextView messageView = alerta.findViewById(android.R.id.message);
        if (messageView != null) {
            messageView.setTextColor(Color.BLACK);
            messageView.setTextSize(24);
        }

        Button positiveButton = alerta.getButton(DialogInterface.BUTTON_POSITIVE);
        Button negativeButton = alerta.getButton(DialogInterface.BUTTON_NEGATIVE);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) positiveButton.getLayoutParams();
        layoutParams.gravity = Gravity.CENTER;
        layoutParams.weight = 10;
        positiveButton.setLayoutParams(layoutParams);
        negativeButton.setLayoutParams(layoutParams);
    }
}