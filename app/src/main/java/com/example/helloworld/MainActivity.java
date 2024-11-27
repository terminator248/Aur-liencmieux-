package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.helloworld.database.AppDatabase;
import com.example.helloworld.database_dao.UserDao;
import com.example.helloworld.model.User;

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

//        Button BntBDD = findViewById(R.id.creationbdd);
//        BntBDD.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                AppDatabase db = Room.databaseBuilder(getApplicationContext(),
//                        AppDatabase.class, "MyDatabase.db").build();
//                Log.w("UserDaoTes", "starting insertUser");
//                UserDao userDao = db.userDao();
//                User user = new User();
//                user.aId = 1;
//                user.aId = "admin";
//                user.aPassword = "admin";
//                user.aPermission = true;
//                userDao.insert(user);
//                String ID = userDao.getaId("admin").toString();
//
//                TextView Testsf = findViewById(R.id.Testsf);
//                Testsf.setText(ID);
//            }
//        });
    }  // Ici on ferme la méthode onCreate()
}  // Ici on ferme la classe MainActivity
