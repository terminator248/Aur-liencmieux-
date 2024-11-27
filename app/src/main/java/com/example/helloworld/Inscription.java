package com.example.helloworld;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;


public class Inscription extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_inscription);

        EditText editmail = findViewById(R.id.editmail);
        EditText editMDP = findViewById(R.id.editmdp);
        EditText editMDPconfirm = findViewById(R.id.editmdpconfirm);
        EditText editprenom = findViewById(R.id.editprenom);
        EditText editnom = findViewById(R.id.editnom);

        EditText[] editTexts = {editmail, editMDP, editMDPconfirm, editprenom, editnom};
        Button BntConfirmer = findViewById(R.id.bntconfirmer);
        BntConfirmer.setEnabled(false);
        TextWatcher textWatcher = new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) { }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                // Vérifier si les deux champs sont remplis
                boolean allFilled = true;
                for (EditText editText : editTexts) {
                    if (editText.getText().toString().trim().isEmpty()) {
                        allFilled = false;
                        break;



                    }
                }
                BntConfirmer.setEnabled(allFilled);
            }
            @Override
            public void afterTextChanged(Editable s) { }
        };
        for (EditText editText : editTexts) {
            editText.addTextChangedListener(textWatcher);
        }

        BntConfirmer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startInscriptionActivity = new Intent(Inscription.this, Connexion.class);
                startActivity(startInscriptionActivity);
            }
        });
    }
}