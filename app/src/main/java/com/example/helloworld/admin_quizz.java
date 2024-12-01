package com.example.helloworld;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class admin_quizz extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_admin_quizz);

        Button BntProfil = findViewById(R.id.bouton_profil1);
        BntProfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startConnexionActivity = new Intent(admin_quizz.this, profil.class);
                String rNom = getIntent().getStringExtra("ID:Connexion->Profil");
                startConnexionActivity.putExtra("ID:Connexion->Profil", rNom);
                startActivity(startConnexionActivity);
            }
        });
    }
}