package com.example.helloworld;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class admin_etude extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_admin_etude);
        Button BntAccueil = findViewById(R.id.confirmer3);
        BntAccueil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startConnexionActivity = new Intent(admin_etude.this, accueil.class);
                startActivity(startConnexionActivity);
            }
        });
        Button BntEtude1 = findViewById(R.id.confirmer2);
        BntAccueil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startConnexionActivity = new Intent(admin_etude.this, Page_etude_X.class);
                startActivity(startConnexionActivity);
            }
        });
        Button BntEtude2 = findViewById(R.id.confirmer);
        BntAccueil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startConnexionActivity = new Intent(admin_etude.this, Page_etude_X.class);
                startActivity(startConnexionActivity);
            }
        });
    }
}