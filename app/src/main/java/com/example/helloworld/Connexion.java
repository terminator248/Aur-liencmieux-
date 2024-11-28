package com.example.helloworld;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;


public class Connexion extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_connexion);

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
                String inputTextID = editID.getText().toString();
                Intent startInscriptionActivity = new Intent(Connexion.this, Etudiant.class);
                startInscriptionActivity.putExtra("ID:Connexion->Profil", inputTextID);
                startActivity(startInscriptionActivity);
            }
        });
    }
}
