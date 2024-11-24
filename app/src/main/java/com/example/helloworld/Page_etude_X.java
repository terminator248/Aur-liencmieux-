package com.example.helloworld;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class Page_etude_X extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_page_etude__x);
        Button BntAccueil = findViewById(R.id.bouton_profil);
        BntAccueil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startConnexionActivity = new Intent(Page_etude_X.this, accueil.class);
                startActivity(startConnexionActivity);
            }
        });
    }
}