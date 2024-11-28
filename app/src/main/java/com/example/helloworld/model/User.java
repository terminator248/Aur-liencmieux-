package com.example.helloworld.model;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "user_table")
public class User {
    @PrimaryKey
    @NonNull

    @ColumnInfo(name = "Nom")
    public String aId;

    @ColumnInfo(name = "Password")
    public String aPassword;

    @ColumnInfo(name = "Permission")
    public Boolean aPermission;

    @NonNull
    public String getaId() {
        return aId;
    }

    public String getaPassword() {
        return aPassword;
    }

    public Boolean getaPermission() {
        return aPermission;
    }
}
