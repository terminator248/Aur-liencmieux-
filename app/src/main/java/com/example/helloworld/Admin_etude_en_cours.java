package com.example.helloworld;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class Admin_etude_en_cours extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_admin_etude_en_cours);
        Button BntAccueil = findViewById(R.id.confirmer3);
        BntAccueil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startConnexionActivity = new Intent(Admin_etude_en_cours.this, accueil.class);
                startActivity(startConnexionActivity);
            }
        });
        Button Bntetude1 = findViewById(R.id.confirmer);
        BntAccueil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startConnexionActivity = new Intent(Admin_etude_en_cours.this, Page_etude_X.class);
                startActivity(startConnexionActivity);
            }
        });
        Button Bntetude2 = findViewById(R.id.confirmer2);
        BntAccueil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startConnexionActivity = new Intent(Admin_etude_en_cours.this, Page_etude_X.class);
                startActivity(startConnexionActivity);
            }
        });
        Button Bntetude3 = findViewById(R.id.Confirmer);
        BntAccueil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startConnexionActivity = new Intent(Admin_etude_en_cours.this, Page_etude_X.class);
                startActivity(startConnexionActivity);
            }
        });
    }
}