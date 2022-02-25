package com.samsul.finalproject4_kelompok4.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import com.samsul.finalproject4_kelompok4.data.room.entity.Bus;
import com.samsul.finalproject4_kelompok4.databinding.ActivityDetailOrderBinding;
import com.samsul.finalproject4_kelompok4.ui.viewmodel.BusViewModel;
import com.samsul.finalproject4_kelompok4.utils.Constant;
import com.samsul.finalproject4_kelompok4.utils.ViewModelFactory;

public class DetailOrderActivity extends AppCompatActivity {

    ActivityDetailOrderBinding binding;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailOrderBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ViewModelFactory factory = ViewModelFactory.getInstance(this);
        BusViewModel viewModel = new ViewModelProvider(this, (ViewModelProvider.Factory) factory).get(BusViewModel.class);
        Intent intent = getIntent();
        String id = intent.getStringExtra(Constant.ID);
        viewModel.getBuses().observe(this, detail -> {
            if(detail != null) {
                for(Bus item: detail) {
                    if(item.getId().equals(id)) {
                        item.setId(id);

                        binding.tvBusName.setText(item.getBusName());
                        binding.tvStartTime.setText(item.getStartTime());
                        binding.tvEndTime.setText(item.getEndTime());
                        binding.tvNameTerminal.setText(item.getDate());
                        binding.tvTerminalLocation.setText(item.getEndLocation());
                        binding.tvNameTerminalEnd.setText(item.getDate());
                        binding.tvTerminalLocationEnd.setText(item.getEndLocation());
                        binding.tvPlat.setText("Total time : " + item.getTotalTime());
                        binding.tvPrice.setText(item.getTotal_price());
                        binding.tvPerSeat.setText(String.valueOf(item.getTotal_seat()));
                        binding.tvPhoneNumber.setText(item.getNo());
                        binding.tvName.setText(item.getName());
                    }
                }
            }
        });
    }
}