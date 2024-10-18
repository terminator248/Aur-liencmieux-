package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Référence du TextView
        TextView textView = findViewById(R.id.textView);

        // Référence du bouton
        Button button = findViewById(R.id.button);

        // Définir un OnClickListener sur le bouton
        button.setOnClickListener(v -> textView.setText("Bouton cliqué !"));
    }  // Ici on ferme la méthode onCreate()

}  // Ici on ferme la classe MainActivity
