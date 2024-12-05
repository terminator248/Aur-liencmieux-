package com.example.helloworld;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.helloworld.Model.User;

import java.util.HashMap;


public class Etudiant extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_etudiant);

        // Récupérer les données de la base de données
        HashMap<String, User> DataBase = (HashMap<String, User>) getIntent().getSerializableExtra("ID:Data");

        Button BntProfil = findViewById(R.id.bouton_profil);
        BntProfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startConnexionActivity = new Intent(Etudiant.this, profil.class);
                String rNom = getIntent().getStringExtra("ID:Connexion->Profil");
                startConnexionActivity.putExtra("ID:Connexion->Profil", rNom);
                startConnexionActivity.putExtra("ID:Data", DataBase);
                startActivity(startConnexionActivity);
            }
        });

        Button BntEtude = findViewById(R.id.etudes);;
        BntEtude.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startConnexionActivity = new Intent(Etudiant.this, etudiant_etude.class);
                String rNom = getIntent().getStringExtra("ID:Connexion->Profil");
                startConnexionActivity.putExtra("ID:Connexion->Profil", rNom);
                startConnexionActivity.putExtra("ID:Data", DataBase);
                startActivity(startConnexionActivity);
            }
        });

        Button BntVosEtude = findViewById(R.id.vos_etudes);;
        BntVosEtude.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startConnexionActivity = new Intent(Etudiant.this, etude_en_cours_etudiant.class);
                String rNom = getIntent().getStringExtra("ID:Connexion->Profil");
                startConnexionActivity.putExtra("ID:Connexion->Profil", rNom);
                startConnexionActivity.putExtra("ID:Data", DataBase);
                startActivity(startConnexionActivity);
            }
        });

        Button BntActualite = findViewById(R.id.actualites);;
        BntActualite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startConnexionActivity = new Intent(Etudiant.this, etudiant_actualite.class);
                String rNom = getIntent().getStringExtra("ID:Connexion->Profil");
                startConnexionActivity.putExtra("ID:Connexion->Profil", rNom);
                startConnexionActivity.putExtra("ID:Data", DataBase);
                startActivity(startConnexionActivity);
            }
        });
    }
}