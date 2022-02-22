package com.samsul.finalproject4_kelompok4.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.google.firebase.auth.FirebaseAuth;
import com.samsul.finalproject4_kelompok4.databinding.ActivitySplashScreenBinding;

public class SplashScreenActivity extends AppCompatActivity {

    private ActivitySplashScreenBinding binding;
    private Handler handler;
    private final static Long TIME_LIMITS_SECOND = 2000L;
    private FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySplashScreenBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        handler = new Handler();

        auth = FirebaseAuth.getInstance();
        handler.postDelayed(() -> {
            if(auth.getCurrentUser() != null) {
                startActivity(new Intent(SplashScreenActivity.this, HomeActivity.class));
            } else {
                startActivity(new Intent(SplashScreenActivity.this, LoginActivity.class));
            }
            finish();

        }, TIME_LIMITS_SECOND);

    }
}