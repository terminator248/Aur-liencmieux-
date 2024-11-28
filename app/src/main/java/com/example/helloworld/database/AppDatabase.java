package com.example.helloworld.database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.helloworld.database_dao.UserDao;
import com.example.helloworld.model.User;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Database(entities = {User.class}, version = 1, exportSchema = false)
public abstract class AppDatabase extends RoomDatabase {
    public abstract UserDao userDao();

    private static AppDatabase INSTANCE;
    private static final int NUMBER_OF_THREADS = 4;
    static final    ExecutorService databaseWriteExecutor = Executors.newFixedThreadPool(NUMBER_OF_THREADS);

    static AppDatabase getDatabase(final Context context){
        if(INSTANCE == null){
            synchronized (AppDatabase.class){
                if (INSTANCE==null){
                    INSTANCE= Room.databaseBuilder(context.getApplicationContext()
                                    ,AppDatabase.class, "MyDataBase")
                                    .build();
                }
            }
        }
        return INSTANCE;
    }
}
