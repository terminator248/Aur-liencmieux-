package com.example.helloworld;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class profil extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_profil);

        Button BntAccueil = findViewById(R.id.bouton_profil);
        BntAccueil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startConnexionActivity = new Intent(profil.this, profil.class);
                startActivity(startConnexionActivity);
            }
        });

        TextView TxtNom = findViewById(R.id.nom);
        String rNom = getIntent().getStringExtra("ID:Connexion->Profil");
        if (rNom != null) {
            TxtNom.setText(rNom);
        } else {
            TxtNom.setText("Aucune donnée reçue");
        }

        TextView TxtPrenom = findViewById(R.id.prenom);

        TextView TxtMail = findViewById(R.id.mail);
    }
}