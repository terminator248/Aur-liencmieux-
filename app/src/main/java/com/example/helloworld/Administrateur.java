package com.example.helloworld;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class Administrateur extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_administrateur);

        Button BntActu = findViewById(R.id.actualites);
        BntActu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startConnexionActivity = new Intent(Administrateur.this, etudiant_actualite.class);
                startActivity(startConnexionActivity);
            }
        });

        Button BntQuizz = findViewById(R.id.quizz);
        BntQuizz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startConnexionActivity = new Intent(Administrateur.this, admin_quizz.class);
                startActivity(startConnexionActivity);
            }
        });

        Button BntEtudePostee = findViewById(R.id.etudes_postées);
        BntEtudePostee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startConnexionActivity = new Intent(Administrateur.this, etude_en_cours_etudiant.class);
                startActivity(startConnexionActivity);
            }
        });
    }
}