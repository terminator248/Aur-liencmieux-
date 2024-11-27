package com.example.helloworld;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class Etudiant extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_etudiant);

        Button BntProfil = findViewById(R.id.bouton_profil);
        BntProfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startConnexionActivity = new Intent(Etudiant.this, profil.class);
                startActivity(startConnexionActivity);
            }
        });

        Button BntEtude = findViewById(R.id.etudes);;
        BntEtude.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startConnexionActivity = new Intent(Etudiant.this, etudiant_etude.class);
                startActivity(startConnexionActivity);
            }
        });

        Button BntVosEtude = findViewById(R.id.vos_etudes);;
        BntVosEtude.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startConnexionActivity = new Intent(Etudiant.this, etude_en_cours_etudiant.class);
                startActivity(startConnexionActivity);
            }
        });

        Button BntActualite = findViewById(R.id.actualites);;
        BntActualite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startConnexionActivity = new Intent(Etudiant.this, etudiant_actualite.class);
                startActivity(startConnexionActivity);
            }
        });
    }
}