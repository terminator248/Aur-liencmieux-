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
        Button BntAccueil = findViewById(R.id.button);
        BntAccueil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startConnexionActivity = new Intent(admin_quizz.this, accueil.class);
                startActivity(startConnexionActivity);
            }
        });
    }
}