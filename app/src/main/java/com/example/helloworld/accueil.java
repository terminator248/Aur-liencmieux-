package com.example.helloworld;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;

import com.example.helloworld.Model.User;

import java.util.HashMap;

public class accueil extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_accueil);

        // Récupérer les données de la base de données
        HashMap<String, User> DataBase = (HashMap<String, User>) getIntent().getSerializableExtra("ID:Data");
        User user = DataBase.get("admin");

        Button BntConnexion = findViewById(R.id.bntconnexion);

        BntConnexion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startConnexionActivity = new Intent(accueil.this, Connexion.class);

                // Envoi les données de la base de données
                startConnexionActivity.putExtra("ID:Data", DataBase);

                startActivity(startConnexionActivity);
            }
        });
        Button BntInscription = findViewById(R.id.bntinscription);
        BntInscription.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startInscriptionActivity = new Intent(accueil.this, Inscription.class);

                // Envoi les données de la base de données
                startInscriptionActivity.putExtra("ID:Data", DataBase);

                startActivity(startInscriptionActivity);
            }
        });
    }
}

