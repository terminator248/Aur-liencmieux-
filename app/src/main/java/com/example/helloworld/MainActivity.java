package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
//
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button BntLancement = findViewById(R.id.bntlancement);
        BntLancement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startConnexionActivity = new Intent(MainActivity.this, accueil.class);
                startActivity(startConnexionActivity);
            }
        });
    }  // Ici on ferme la méthode onCreate()
}  // Ici on ferme la classe MainActivity
