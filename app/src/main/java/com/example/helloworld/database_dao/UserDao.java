package com.example.helloworld.database_dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.example.helloworld.model.User;

@Dao
public interface UserDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insert(User user);

    @Query("SELECT * FROM user_table WHERE Nom LIKE :id")
    LiveData<User> getaId(String id);

    @Query("DELETE FROM user_table")
    void deleteAll();
}
