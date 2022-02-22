package com.samsul.finalproject4_kelompok4.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.annotation.SuppressLint;
import android.os.Bundle;

import com.samsul.finalproject4_kelompok4.R;
import com.samsul.finalproject4_kelompok4.databinding.ActivityHomeBinding;
import com.samsul.finalproject4_kelompok4.ui.fragment.history.HistoryFragment;
import com.samsul.finalproject4_kelompok4.ui.fragment.NotificationFragment;
import com.samsul.finalproject4_kelompok4.ui.fragment.ProfileFragment;
import com.samsul.finalproject4_kelompok4.ui.fragment.SearchFragment;

public class HomeActivity extends AppCompatActivity {

    private ActivityHomeBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityHomeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setNavigation();
        loadFragment(new SearchFragment());
    }

    @SuppressLint("NonConstantResourceId")
    private void setNavigation() {
        binding.bNavigation.setOnItemSelectedListener(item -> {
            Fragment fragment = null;
            switch (item.getItemId()) {
                case R.id.menu_search:
                    fragment = new SearchFragment();
                    break;
                case R.id.menu_history:
                    fragment = new HistoryFragment();
                    break;
                case R.id.menu_notification:
                    fragment = new NotificationFragment();
                    break;
                case R.id.menu_profile:
                    fragment = new ProfileFragment();
                    break;
            }

            loadFragment(fragment);
            return true;
        });
    }

    private void loadFragment(Fragment fragment) {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.f_container, fragment)
                .commit();
    }
}