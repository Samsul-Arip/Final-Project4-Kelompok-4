package com.samsul.finalproject4_kelompok4.ui.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;
import com.samsul.finalproject4_kelompok4.data.repository.DataRepository;
import com.samsul.finalproject4_kelompok4.data.room.entity.Users;

public class ProfileViewModel extends ViewModel {

    private final DataRepository dataRepository;

    public ProfileViewModel(DataRepository dataRepository) {
        this.dataRepository = dataRepository;
    }

    public LiveData<Users> getUser() {
        return dataRepository.getUser();
    }
}
