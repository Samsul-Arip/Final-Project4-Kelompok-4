package com.samsul.finalproject4_kelompok4.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.samsul.finalproject4_kelompok4.databinding.ActivitySeatBinding;

public class SeatActivity extends AppCompatActivity {

    ActivitySeatBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySeatBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}