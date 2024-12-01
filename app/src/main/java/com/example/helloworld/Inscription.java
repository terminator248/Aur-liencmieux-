package com.example.helloworld;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.helloworld.Model.User;

import java.util.HashMap;


public class Inscription extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_inscription);

        // Récupérer les données de la base de données
        HashMap<String, User> DataBase = (HashMap<String, User>) getIntent().getSerializableExtra("ID:Data");
        User user = DataBase.get("admin");

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
                if (editMDP.getText().toString().equals(editMDPconfirm.getText().toString())) {
                    Intent startInscriptionActivity = new Intent(Inscription.this, Connexion.class);

                    User inscrit = new User(editprenom.getText().toString(), editnom.getText().toString(), editmail.getText().toString(), editMDP.getText().toString(),false);
                    DataBase.put(inscrit.getEmail(), inscrit);

                    // Envoi les données de la base de données
                    startInscriptionActivity.putExtra("ID:Data", DataBase);
                    Log.d("gfeg",DataBase.get(editmail.getText().toString()).toString());
                    startActivity(startInscriptionActivity);
                }else{
                    editMDP.setError("Les mots de passe ne correspondent pas");
                    editMDPconfirm.setError("Les mots de passe ne correspondent pas");
                }
            }
        });
    }
}