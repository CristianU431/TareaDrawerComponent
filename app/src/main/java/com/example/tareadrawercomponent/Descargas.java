package com.example.tareadrawercomponent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Descargas extends AppCompatActivity {

    Button descarga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_descargas);

        descarga = findViewById(R.id.btnDescarga);

        descarga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent facebook = getPackageManager().getLaunchIntentForPackage("com.android.providers.downloads.ui");
                startActivity(facebook);
            }
        });

    }
}