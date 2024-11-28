package com.example.helloworld.database;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;

import com.example.helloworld.database_dao.UserDao;
import com.example.helloworld.model.User;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class UserRoomDatabase {
//    @Database(entities = {User.class}, version = 1, exportSchema = false)
//    abstract class UserRoomDatabase extends RoomDatabase {
//
//        abstract UserDao wordDao();
//
//        // marking the instance as volatile to ensure atomic access to the variable
//        private static volatile UserRoomDatabase INSTANCE;
//        private static final int NUMBER_OF_THREADS = 4;
//        static final ExecutorService databaseWriteExecutor =
//                Executors.newFixedThreadPool(NUMBER_OF_THREADS);
//
//        static UserRoomDatabase getDatabase(final Context context) {
//            if (INSTANCE == null) {
//                synchronized (UserRoomDatabase.class) {
//                    if (INSTANCE == null) {
//                        INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
//                                        UserRoomDatabase.class, "user_database")
//                                .addCallback(sRoomDatabaseCallback)
//                                .build();
//                    }
//                }
//            }
//            return INSTANCE;
//        }
//
//        /**
//         * Override the onCreate method to populate the database.
//         * For this sample, we clear the database every time it is created.
//         */
//        private static RoomDatabase.Callback sRoomDatabaseCallback = new RoomDatabase.Callback() {
//            @Override
//            public void onCreate(@NonNull SupportSQLiteDatabase db) {
//                super.onCreate(db);
//
//            databaseWriteExecutor.execute(() -> {
//                // Populate the database in the background.
//                // If you want to start with more words, just add them.
//                UserDao dao = INSTANCE.wordDao();
//                dao.deleteAll();
//
//                    User user = new User("Admin", "Admin", true);
//                    dao.insert(user);
//                    user = new User("User1", "User1",false);
//                    dao.insert(user);
//                });
//            }
//        };
//    }
}
