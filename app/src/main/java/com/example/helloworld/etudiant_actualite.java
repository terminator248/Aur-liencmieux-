package com.example.helloworld;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class etudiant_actualite extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_etudiant_actualite);
        Button BntAccueil = findViewById(R.id.confirmer3);
        BntAccueil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startConnexionActivity = new Intent(etudiant_actualite.this, accueil.class);
                startActivity(startConnexionActivity);
            }
        });
    }
}