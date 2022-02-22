package com.samsul.finalproject4_kelompok4.data.room.database;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import com.google.firebase.firestore.auth.User;
import com.samsul.finalproject4_kelompok4.data.room.entity.Users;

import java.util.List;

@Dao
public interface DatabaseDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertUser(Users users);

    @Update
    void updateUser(Users users);

    @Delete
    void deleteUser(Users users);

    @Query("SELECT * FROM users ORDER BY id ASC")
    LiveData<Users> getUsers();
}
