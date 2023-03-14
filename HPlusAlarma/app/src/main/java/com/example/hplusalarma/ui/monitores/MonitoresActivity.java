package com.example.hplusalarma.ui.monitores;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

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

    public void mostrarPopUp(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("¿Seguro que desea eliminar este monitor?");
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