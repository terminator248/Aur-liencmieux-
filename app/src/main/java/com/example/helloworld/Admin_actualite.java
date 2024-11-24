package com.example.helloworld;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class Admin_actualite extends AppCompatActivity {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_admin_actualite);


        Button BntAccueil = findViewById(R.id.confirmer3);
        BntAccueil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startConnexionActivity = new Intent(Admin_actualite.this, accueil.class);
                startActivity(startConnexionActivity);
            }
        });
        Button BntActu1 = findViewById(R.id.confirmer2);
        BntAccueil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startConnexionActivity = new Intent(Admin_actualite.this, actualite_x.class);
                startActivity(startConnexionActivity);
            }
        });
        Button BntActu2 = findViewById(R.id.Confirmer);
        BntAccueil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startConnexionActivity = new Intent(Admin_actualite.this, actualite_x.class);
                startActivity(startConnexionActivity);
            }
        });
        Button BntActu3 = findViewById(R.id.confirmer);
        BntAccueil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startConnexionActivity = new Intent(Admin_actualite.this, actualite_x.class);
                startActivity(startConnexionActivity);
            }
        });
        Button BntPublication = findViewById(R.id.publier);
        BntAccueil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startConnexionActivity = new Intent(Admin_actualite.this, accueil.class);
                startActivity(startConnexionActivity);
            }
        });
    }
}


