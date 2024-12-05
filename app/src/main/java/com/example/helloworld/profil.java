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

import com.example.helloworld.Model.User;

import java.util.HashMap;


public class profil extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_profil);

        // Récupérer les données de la base de données
        HashMap<String, User> DataBase = (HashMap<String, User>) getIntent().getSerializableExtra("ID:Data");

        Button BntAccueil = findViewById(R.id.bouton_profil);
        BntAccueil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startConnexionActivity = new Intent(profil.this, profil.class);
                startActivity(startConnexionActivity);
            }
        });

        TextView TxtNom = findViewById(R.id.nom);
        TextView TxtPrenom = findViewById(R.id.prenom);
        TextView TxtMail = findViewById(R.id.mail);

        String mail = getIntent().getStringExtra("ID:Connexion->Profil");
        String nom = DataBase.get(mail).getLastName();
        String prenom = DataBase.get(mail).getFirstName();

        if (mail != null) {
            TxtNom.setText(nom);
            TxtPrenom.setText(prenom);
            TxtMail.setText(mail);
        } else {
            TxtNom.setText("Aucune donnée reçue");
            TxtPrenom.setText("Aucune donnée reçue");
            TxtMail.setText("Aucune donnée reçue");

        }
    }
}