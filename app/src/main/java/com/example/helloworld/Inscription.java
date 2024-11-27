package com.example.helloworld;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class Inscription extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_inscription);

        Button BntConfirmer = findViewById(R.id.bntconfirmer);
        BntConfirmer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startInscriptionActivity = new Intent(Inscription.this, Connexion.class);
                startActivity(startInscriptionActivity);
            }
        });
    }
}