package com.example.helloworld;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;


public class Connexion extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_connexion);

        Button BntConfirmer = findViewById(R.id.Confirmer);
        EditText editID = findViewById(R.id.identifiant);;
        BntConfirmer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String inputText = editID.getText().toString();
                Intent startInscriptionActivity = new Intent(Connexion.this, Etudiant.class);
                startInscriptionActivity.putExtra("ID:Connexion->Profil", inputText);
                startActivity(startInscriptionActivity);
            }
        });
    }
}
