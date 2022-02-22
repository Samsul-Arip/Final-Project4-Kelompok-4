package com.samsul.finalproject4_kelompok4.di;

import android.content.Context;


import com.samsul.finalproject4_kelompok4.data.remote.RemoteDataSource;
import com.samsul.finalproject4_kelompok4.data.repository.DataRepository;
import com.samsul.finalproject4_kelompok4.data.room.LocalDataSource;
import com.samsul.finalproject4_kelompok4.data.room.database.DatabaseDatabase;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Injection {

    public static DataRepository provideDataRepository(Context context) {
        LocalDataSource localDataSource = LocalDataSource.getInstance(DatabaseDatabase.getDatabase(context).databaseDao());
        RemoteDataSource remoteDataSource = RemoteDataSource.getInstance();
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        return DataRepository.getInstance(executorService, localDataSource, remoteDataSource);
    }
}
