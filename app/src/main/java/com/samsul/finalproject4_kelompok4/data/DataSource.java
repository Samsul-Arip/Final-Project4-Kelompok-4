package com.samsul.finalproject4_kelompok4.data;

import androidx.lifecycle.LiveData;

import com.samsul.finalproject4_kelompok4.data.remote.model.ResponseBus;
import com.samsul.finalproject4_kelompok4.data.remote.model.ResponseLocation;
import com.samsul.finalproject4_kelompok4.data.room.entity.Users;

import java.util.List;

public interface DataSource {

    LiveData<Users> getUser();
    void insertUser(final Users user);
    void deleteUser(final Users user);
    void updateUser(final Users user);


    LiveData<List<ResponseLocation>> getTerminal();
    LiveData<List<ResponseBus>> getBus(String startLocation, String endLocation);

}
