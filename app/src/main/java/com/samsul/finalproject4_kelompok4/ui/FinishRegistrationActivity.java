package com.samsul.finalproject4_kelompok4.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.samsul.finalproject4_kelompok4.databinding.ActivityFinishRegistrationBinding;

public class FinishRegistrationActivity extends AppCompatActivity {

    private ActivityFinishRegistrationBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityFinishRegistrationBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnTakeMeBux.setOnClickListener(view -> {
            startActivity(new Intent(this, HomeActivity.class));
        });
    }
}