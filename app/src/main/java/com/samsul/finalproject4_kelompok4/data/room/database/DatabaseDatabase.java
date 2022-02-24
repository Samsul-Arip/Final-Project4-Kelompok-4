package com.samsul.finalproject4_kelompok4.data.room.database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.samsul.finalproject4_kelompok4.data.room.entity.Bus;
import com.samsul.finalproject4_kelompok4.data.room.entity.Users;

@Database(
        entities = {
                Users.class,
                Bus.class},
        version = 1,
        exportSchema = false
)
public abstract class DatabaseDatabase extends RoomDatabase {

    public abstract DatabaseDao databaseDao();

    private static volatile DatabaseDatabase INSTANCE;

    public static DatabaseDatabase getDatabase(final Context context) {
        if(INSTANCE == null) {
            synchronized (DatabaseDatabase.class) {
                INSTANCE = Room.databaseBuilder(
                        context.getApplicationContext(),
                        DatabaseDatabase.class,
                        "room_database")
                        .build();
            }
        }
        return INSTANCE;
    }

}
