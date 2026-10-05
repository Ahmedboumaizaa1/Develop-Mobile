package com.example.tp1;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class Couleur extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_couleur);
    }

    public void bg_rouge(View v) {
        v.getRootView().setBackgroundColor(ContextCompat.getColor(this, R.color.mon_rouge));
    }

    public void bg_bleu(View v) {
        v.getRootView().setBackgroundColor(ContextCompat.getColor(this, R.color.mon_bleu));
    }

    public void bg_jaune(View v) {
        v.getRootView().setBackgroundColor(ContextCompat.getColor(this, R.color.mon_jaune));
    }
}