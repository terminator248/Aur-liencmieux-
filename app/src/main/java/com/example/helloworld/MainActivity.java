package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import com.example.helloworld.Model.User;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    private HashMap<String, User> DataBase = new HashMap<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Création de la BDD
        User admin = new User("admin", "admin", "admin","admin", true);
        DataBase.put(admin.getEmail(), admin);

        // Bouton lancement
        Button BntLancement = findViewById(R.id.bntlancement);
        BntLancement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startConnexionActivity = new Intent(MainActivity.this, accueil.class);

                // Envoi les données de la base de données
                startConnexionActivity.putExtra("ID:Data", DataBase);

                startActivity(startConnexionActivity);
            }
        });
    }
}  // Ici on ferme la classe MainActivity
