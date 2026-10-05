package com.example.tp1;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private void afficher(String nomMethode) {
        Toast helloToast = Toast.makeText(MainActivity.this, nomMethode, Toast.LENGTH_SHORT);
        helloToast.setGravity(Gravity.CENTER, 0, 0);
        helloToast.show();
        Log.i("Debug", nomMethode);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        afficher("onCreate");

        Toast.makeText(this, "message à afficher", Toast.LENGTH_LONG).show();

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Voulez vous continuer")
                .setTitle("BienVenue")
                .setIcon(android.R.drawable.ic_dialog_info)
                .setPositiveButton("OUI", null)
                .setNegativeButton("NON", null);
        AlertDialog alert = builder.create();
        alert.show();

        Log.i("Debug", "Mon permier commentaire");

        // setContentView(R.layout.activity_main);
        // TextView tv = new TextView(this);
        // tv.setText("Hello, Android");
        // setContentView(tv);
    }

    @Override protected void onStart()   { super.onStart();   afficher("onStart"); }
    @Override protected void onResume()  { super.onResume();  afficher("onResume"); }
    @Override protected void onPause()   { super.onPause();   afficher("onPause"); }
    @Override protected void onStop()    { super.onStop();    afficher("onStop"); }
    @Override protected void onRestart() { super.onRestart(); afficher("onRestart"); }
    @Override protected void onDestroy() { super.onDestroy(); afficher("onDestroy"); }

    public void ouvrirCouleur(View v) {
        startActivity(new Intent(this, Couleur.class));
    }

    public void ouvrirHello(View v) {
        startActivity(new Intent(this, Hello.class));
    }
}