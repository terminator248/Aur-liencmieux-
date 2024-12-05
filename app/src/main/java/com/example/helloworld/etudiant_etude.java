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


public class etudiant_etude extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_etudiant_etude);

        // Récupérer les données de la base de données
        HashMap<String, User> DataBase = (HashMap<String, User>) getIntent().getSerializableExtra("ID:Data");

        Button BntProfil = findViewById(R.id.bouton_profil);
        BntProfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startConnexionActivity = new Intent(etudiant_etude.this, profil.class);
                String rNom = getIntent().getStringExtra("ID:Connexion->Profil");
                startConnexionActivity.putExtra("ID:Connexion->Profil", rNom);
                startConnexionActivity.putExtra("ID:Data", DataBase);
                startActivity(startConnexionActivity);
            }
        });
    }
}