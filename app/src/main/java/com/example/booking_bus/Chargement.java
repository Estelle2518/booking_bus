package com.example.booking_bus;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class Chargement extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chargement);

        // Ajouter un délai de 3 secondes (3000 millisecondes)
        int delayMillis = 3000;

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Créer une intention (Intent) pour démarrer l'activité Bienvenue
                Intent intent = new Intent(Chargement.this, Bienvenue.class);
                startActivity(intent);

                // Terminer l'activité "Chargement" pour ne pas y revenir lorsque l'utilisateur appuie sur le bouton de retour
                finish();
            }
        }, delayMillis);
    }
}
