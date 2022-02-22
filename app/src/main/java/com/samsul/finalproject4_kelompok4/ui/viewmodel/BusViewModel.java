package com.samsul.finalproject4_kelompok4.ui.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.samsul.finalproject4_kelompok4.data.remote.model.ResponseBus;
import com.samsul.finalproject4_kelompok4.data.repository.DataRepository;

import java.util.List;

public class BusViewModel extends ViewModel {

    private DataRepository dataRepository;

    public BusViewModel(DataRepository dataRepository) {
        this.dataRepository = dataRepository;
    }

    public LiveData<List<ResponseBus>> getBus(String startLocation, String endLocation) {
        return dataRepository.getBus(startLocation, endLocation);
    }
}
