package com.example.helloworld;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class Connexion extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_connexion);

        Button BntConfirmer = findViewById(R.id.Confirmer);
        BntConfirmer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startInscriptionActivity = new Intent(Connexion.this, Etudiant.class);
                startActivity(startInscriptionActivity);
            }
        });
    }
}
