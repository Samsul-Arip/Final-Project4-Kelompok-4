package com.samsul.finalproject4_kelompok4.utils;

import android.app.Application;
import android.content.Context;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import com.samsul.finalproject4_kelompok4.data.repository.DataRepository;
import com.samsul.finalproject4_kelompok4.di.Injection;
import com.samsul.finalproject4_kelompok4.ui.viewmodel.BusViewModel;
import com.samsul.finalproject4_kelompok4.ui.viewmodel.ProfileViewModel;
import com.samsul.finalproject4_kelompok4.ui.viewmodel.RegisterViewModel;
import com.samsul.finalproject4_kelompok4.ui.viewmodel.SearchViewModel;

public class ViewModelFactory extends ViewModelProvider.NewInstanceFactory {

    private static volatile ViewModelFactory INSTANCE;


    private final DataRepository dataRepository;

    public ViewModelFactory(DataRepository dataRepository) {
        this.dataRepository = dataRepository;
    }



    public static ViewModelFactory getInstance(Context context) {
        if(INSTANCE == null) {
            synchronized (ViewModelFactory.class) {
                INSTANCE = new ViewModelFactory(Injection.provideDataRepository(context));
            }
        }
        return INSTANCE;
    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        if(modelClass.isAssignableFrom(RegisterViewModel.class)) {
            return (T) new RegisterViewModel(dataRepository);
        } else if(modelClass.isAssignableFrom(ProfileViewModel.class)) {
            return (T) new ProfileViewModel(dataRepository);
        } else if(modelClass.isAssignableFrom(SearchViewModel.class)) {
            return (T) new SearchViewModel(dataRepository);
        } else if(modelClass.isAssignableFrom(BusViewModel.class)) {
            return (T) new BusViewModel(dataRepository);
        }
        throw new IllegalArgumentException("Unknown ViewModel class: " + modelClass.getName());
    }
}
