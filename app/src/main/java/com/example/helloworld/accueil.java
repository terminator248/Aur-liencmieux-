package com.example.helloworld;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;

public class accueil extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_accueil);

        Button BntConnexion = findViewById(R.id.bntconnexion);
        Button BntInscription = findViewById(R.id.bntinscription);
        BntConnexion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startConnexionActivity = new Intent(accueil.this, Connexion.class);
                startActivity(startConnexionActivity);
            }
        });

        BntInscription.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startInscriptionActivity = new Intent(accueil.this, Inscription.class);
                startActivity(startInscriptionActivity);
            }
        });
    }
}

