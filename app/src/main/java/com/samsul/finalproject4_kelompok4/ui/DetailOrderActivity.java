package com.samsul.finalproject4_kelompok4.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.samsul.finalproject4_kelompok4.databinding.ActivityDetailOrderBinding;

public class DetailOrderActivity extends AppCompatActivity {

    ActivityDetailOrderBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());
    }
}