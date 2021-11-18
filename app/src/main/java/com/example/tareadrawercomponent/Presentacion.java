package com.example.tareadrawercomponent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class Presentacion extends AppCompatActivity {

    public static final long SPLASH_SCREEN_DELAY = 5000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_presentacion);

        //implementar tiempo
        TimerTask time = new TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent().setClass(Presentacion.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        };

        // se ejecuta una vez cerrado
        Timer timer = new Timer();
        timer.schedule(time, SPLASH_SCREEN_DELAY);
    }
}