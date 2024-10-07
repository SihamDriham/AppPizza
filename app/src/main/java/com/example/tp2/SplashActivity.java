package com.example.tp2;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;

public class SplashActivity extends AppCompatActivity {

    private TextView spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_splash);

        // Récupérer l'image du spinner
        spinner = findViewById(R.id.spinner);

        // Créer l'animation de rotation
        RotateAnimation rotate = new RotateAnimation(0, 360,
                Animation.RELATIVE_TO_SELF, 0.5f,
                Animation.RELATIVE_TO_SELF, 0.5f);
        rotate.setDuration(1000); // 1 seconde pour une rotation complète
        rotate.setRepeatCount(Animation.INFINITE); // Répéter l'animation indéfiniment
        rotate.setInterpolator(new LinearInterpolator()); // Assurer une rotation fluide
        spinner.startAnimation(rotate); // Démarrer l'animation sur l'image du spinner

        // Délai avant de lancer l'activité principale
        Thread t1 = new Thread() {
            @Override
            public void run() {
                try {
                    sleep(4000); // Attendre 4 secondes
                    Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                    startActivity(intent);
                    SplashActivity.this.finish(); // Fermer l'activité de démarrage
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        t1.start();
    }
}
