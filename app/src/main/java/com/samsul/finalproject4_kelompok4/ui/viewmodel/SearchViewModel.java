package com.samsul.finalproject4_kelompok4.ui.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;
import com.samsul.finalproject4_kelompok4.data.remote.model.ResponseLocation;
import com.samsul.finalproject4_kelompok4.data.repository.DataRepository;

import java.util.List;

public class SearchViewModel extends ViewModel {

    private final DataRepository dataRepository;

    public SearchViewModel(DataRepository dataRepository) {
        this.dataRepository = dataRepository;
    }

    public LiveData<List<ResponseLocation>> getTerminal() {
        return dataRepository.getTerminal();
    }
}
