package com.samsul.finalproject4_kelompok4.ui.viewmodel;

import androidx.lifecycle.ViewModel;

import com.samsul.finalproject4_kelompok4.data.repository.DataRepository;
import com.samsul.finalproject4_kelompok4.data.room.entity.Users;

public class RegisterViewModel extends ViewModel {

    private final DataRepository dataRepository;

    public RegisterViewModel(DataRepository dataRepository) {
        this.dataRepository = dataRepository;
    }


    public void registerUser(Users users) {
        dataRepository.insertUser(users);
    }
}
