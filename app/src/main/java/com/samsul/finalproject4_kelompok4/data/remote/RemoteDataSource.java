package com.samsul.finalproject4_kelompok4.data.remote;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.samsul.finalproject4_kelompok4.data.remote.model.ResponseBus;
import com.samsul.finalproject4_kelompok4.data.remote.model.ResponseLocation;
import com.samsul.finalproject4_kelompok4.utils.DataDummy;

import java.util.List;

public class RemoteDataSource {

    private static volatile RemoteDataSource INSTANCE;

    public static RemoteDataSource getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new RemoteDataSource();
        }
        return INSTANCE;
    }


    public LiveData<List<ResponseLocation>> getDeparture() {
        MutableLiveData<List<ResponseLocation>> location = new MutableLiveData<>();
        location.setValue(DataDummy.generateLocation());
        return location;
    }

    public LiveData<List<ResponseBus>> getBus(String startLocation, String endLocation) {
        MutableLiveData<List<ResponseBus>> bus = new MutableLiveData<>();
        bus.setValue(DataDummy.generateBus(startLocation, endLocation));
        return bus;
    }

}
