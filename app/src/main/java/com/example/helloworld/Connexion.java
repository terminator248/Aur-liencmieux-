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


public class Connexion extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_connexion);

        // Récupérer les données de la base de données
        HashMap<String, User> DataBase = (HashMap<String, User>) getIntent().getSerializableExtra("ID:Data");
        User user = DataBase.get("admin");

        EditText editID = findViewById(R.id.identifiant);
        String inputTextID = editID.getText().toString();

        EditText editMDP = findViewById(R.id.password);
        String inputTextMDP = editID.getText().toString();

        Button BntConfirmer = findViewById(R.id.Confirmer);
        BntConfirmer.setEnabled(!inputTextID.isEmpty() && !inputTextMDP.isEmpty());

        TextWatcher textWatcher = new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) { }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                // Vérifier si les deux champs sont remplis
                String input1 = editID.getText().toString().trim();
                String input2 = editMDP.getText().toString().trim();

                // Activer le bouton si les deux champs contiennent du texte
                BntConfirmer.setEnabled(!input1.isEmpty() && !input2.isEmpty());
            }

            @Override
            public void afterTextChanged(Editable s) { }
        };
        editID.addTextChangedListener(textWatcher);
        editMDP.addTextChangedListener(textWatcher);
        BntConfirmer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(DataBase.get(editID.getText().toString()) == null){
                    editID.setError("L'identifiant n'existe pas");
                }else if(editMDP.getText().toString().equals(DataBase.get(editID.getText().toString()).getPassword())) {
                    Log.d("gdfg",DataBase.get(editID.getText().toString()).getRole().toString());
                    Log.d("gfgdfg",DataBase.get(editID.getText().toString()).toString());
                    if(DataBase.get(editID.getText().toString()).getRole()) {
                        String inputTextID = editID.getText().toString();
                        Intent startInscriptionActivity = new Intent(Connexion.this, Administrateur.class);
                        startInscriptionActivity.putExtra("ID:Data", DataBase);
                        startInscriptionActivity.putExtra("ID:Connexion->Profil", inputTextID);
                        startActivity(startInscriptionActivity);
                    }else{
                        String inputTextID = editID.getText().toString();
                        Intent startInscriptionActivity = new Intent(Connexion.this, Etudiant.class);
                        startInscriptionActivity.putExtra("ID:Data", DataBase);
                        startInscriptionActivity.putExtra("ID:Connexion->Profil", inputTextID);
                        startActivity(startInscriptionActivity);
                    }
                }else{
                    editMDP.setError("Mot de passe incorrect");
                    Log.d("gdfzg",DataBase.get(editID.getText().toString()).getPassword());
                    Log.d("gdfg",editID.getText().toString());
                }
            }
        });
    }
}
