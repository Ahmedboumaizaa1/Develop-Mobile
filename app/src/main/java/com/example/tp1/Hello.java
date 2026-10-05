package com.example.tp1;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class Hello extends AppCompatActivity {

    TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout2);

        t = findViewById(R.id.texte);
        t.setTextColor(ContextCompat.getColor(this, R.color.opaque_red));

        ImageView img = findViewById(R.id.image);
        img.setImageResource(R.drawable.mon_image);
    }
}