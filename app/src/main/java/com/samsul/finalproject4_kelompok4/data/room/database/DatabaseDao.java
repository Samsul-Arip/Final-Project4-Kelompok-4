package com.samsul.finalproject4_kelompok4.data.room.database;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;
import com.samsul.finalproject4_kelompok4.data.room.entity.Bus;
import com.samsul.finalproject4_kelompok4.data.room.entity.Users;

import java.util.List;

@Dao
public interface DatabaseDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertUser(Users users);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertBus(Bus bus);

    @Query("SELECT * FROM bus_table ORDER BY id ASC")
    LiveData<List<Bus>> getBus();

//    @Query("SELECT * FROM bus_table WHERE id = id")
//    LiveData<Bus> getDetailOrder(String id);

    @Update
    void updateUser(Users users);

    @Delete
    void deleteUser(Users users);

    @Query("SELECT * FROM users ORDER BY id ASC")
    LiveData<Users> getUsers();


}
