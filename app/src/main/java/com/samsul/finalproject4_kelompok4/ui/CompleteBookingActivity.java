package com.samsul.finalproject4_kelompok4.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.samsul.finalproject4_kelompok4.databinding.ActivityCompleteBookingBinding;

public class CompleteBookingActivity extends AppCompatActivity {

    ActivityCompleteBookingBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCompleteBookingBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}