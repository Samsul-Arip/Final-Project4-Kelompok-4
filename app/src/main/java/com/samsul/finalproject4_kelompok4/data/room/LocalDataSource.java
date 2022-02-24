package com.samsul.finalproject4_kelompok4.data.room;

import androidx.lifecycle.LiveData;

import com.samsul.finalproject4_kelompok4.data.room.database.DatabaseDao;
import com.samsul.finalproject4_kelompok4.data.room.entity.Bus;
import com.samsul.finalproject4_kelompok4.data.room.entity.Users;

import java.util.List;

public class LocalDataSource {

    private final DatabaseDao databaseDao;

    public LocalDataSource(DatabaseDao databaseDao) {
        this.databaseDao = databaseDao;
    }

    private static volatile LocalDataSource INSTANCE;

    public static LocalDataSource getInstance(DatabaseDao databaseDao) {
        if(INSTANCE == null) {
            INSTANCE = new LocalDataSource(databaseDao);
        }
        return INSTANCE;
    }

    public LiveData<Users> getUser() {
        return databaseDao.getUsers();
    }

    public void insertUser(final Users users) {
        //executorService.execute(() ->
        databaseDao.insertUser(users);
    }

    public void deleteUser(final Users users) {
        //executorService.execute(() ->
        databaseDao.deleteUser(users);
    }

    public void updateUser(final Users users) {
        //executorService.execute(() ->
        databaseDao.updateUser(users);
    }

    public void insertBus(final Bus bus) {
        databaseDao.insertBus(bus);
    }

    public LiveData<List<Bus>> getBus() {
        return databaseDao.getBus();
    }

//    public LiveData<Bus> getDetailOrder(String id) {
//        return databaseDao.getDetailOrder(id);
//    }
}
