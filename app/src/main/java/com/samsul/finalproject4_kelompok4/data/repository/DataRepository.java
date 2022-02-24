package com.samsul.finalproject4_kelompok4.data.repository;

import androidx.lifecycle.LiveData;

import com.samsul.finalproject4_kelompok4.data.DataSource;
import com.samsul.finalproject4_kelompok4.data.remote.RemoteDataSource;
import com.samsul.finalproject4_kelompok4.data.remote.model.ResponseBus;
import com.samsul.finalproject4_kelompok4.data.remote.model.ResponseLocation;
import com.samsul.finalproject4_kelompok4.data.room.LocalDataSource;
import com.samsul.finalproject4_kelompok4.data.room.entity.Bus;
import com.samsul.finalproject4_kelompok4.data.room.entity.Users;

import java.util.List;
import java.util.concurrent.ExecutorService;

public class DataRepository implements DataSource {

    private final ExecutorService executorService;
    private final LocalDataSource localDataSource;
    private final RemoteDataSource remoteDataSource;

    private static volatile DataRepository INSTANCE;

    public DataRepository(ExecutorService executorService, LocalDataSource localDataSource, RemoteDataSource remoteDataSource) {
        this.executorService = executorService;
        this.localDataSource = localDataSource;
        this.remoteDataSource = remoteDataSource;
    }

    public static DataRepository getInstance(
            ExecutorService executorService,
            LocalDataSource localDataSource,
            RemoteDataSource remoteDataSource
    )
    {
        if(INSTANCE == null) {
            INSTANCE = new DataRepository(executorService,localDataSource,remoteDataSource);
        }
        return INSTANCE;
    }

    @Override
    public LiveData<Users> getUser() {
        return localDataSource.getUser();
    }

    @Override
    public LiveData<List<Bus>> getBus() {
        return localDataSource.getBus();
    }

//    @Override
//    public LiveData<Bus> getDetailBus(String id) {
//        return localDataSource.getDetailOrder(id);
//    }

    @Override
    public void insertUser(Users user) {
        executorService.execute(() -> localDataSource.insertUser(user));
    }

    @Override
    public void insertBus(Bus bus) {
        executorService.execute(() -> localDataSource.insertBus(bus));
    }


    @Override
    public void deleteUser(Users user) {
        executorService.execute(() -> localDataSource.deleteUser(user));
    }

    @Override
    public void updateUser(Users user) {
        executorService.execute(() -> localDataSource.updateUser(user));
    }

    @Override
    public LiveData<List<ResponseLocation>> getTerminal() {
        return remoteDataSource.getDeparture();
    }

    @Override
    public LiveData<List<ResponseBus>> getBus(String startLocation, String endLocation) {
        return remoteDataSource.getBus(startLocation, endLocation);
    }

}
