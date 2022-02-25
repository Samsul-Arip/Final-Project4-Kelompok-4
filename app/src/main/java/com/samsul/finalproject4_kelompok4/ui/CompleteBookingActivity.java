package com.samsul.finalproject4_kelompok4.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import com.google.firebase.auth.FirebaseAuth;
import com.samsul.finalproject4_kelompok4.data.room.entity.Bus;
import com.samsul.finalproject4_kelompok4.databinding.ActivityCompleteBookingBinding;
import com.samsul.finalproject4_kelompok4.ui.viewmodel.BusViewModel;
import com.samsul.finalproject4_kelompok4.ui.viewmodel.ProfileViewModel;
import com.samsul.finalproject4_kelompok4.utils.Constant;
import com.samsul.finalproject4_kelompok4.utils.ViewModelFactory;

import java.util.Objects;
import java.util.Random;
import java.util.UUID;

public class CompleteBookingActivity extends AppCompatActivity {

    ActivityCompleteBookingBinding binding;
    private FirebaseAuth auth;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCompleteBookingBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ViewModelFactory factory = ViewModelFactory.getInstance(this);
        ProfileViewModel viewModel = new ViewModelProvider(this, (ViewModelProvider.Factory) factory).get(ProfileViewModel.class);
        BusViewModel busViewModel = new ViewModelProvider(this, (ViewModelProvider.Factory) factory).get(BusViewModel.class);

        Intent i = getIntent();
        String busName = i.getStringExtra(Constant.BUS_NAME);
        String startLocation = i.getStringExtra(Constant.START_LOCATION);
        String endLocation = i.getStringExtra(Constant.END_LOCATION);
        String startTime = i.getStringExtra(Constant.START_TIME);
        String endTime = i.getStringExtra(Constant.END_TIME);
        String totalTime = i.getStringExtra(Constant.TOTAL_TIME);
        String totalPrice = i.getStringExtra(Constant.TOTAL_PRICE);
        String totalClass = i.getStringExtra(Constant.CLASS_ECONOMY);
        String date = i.getStringExtra(Constant.DATE);
        String image = i.getStringExtra(Constant.IMAGE);
        int totalSeat = i.getIntExtra(Constant.TOTAL_SEAT, 0);

        auth = FirebaseAuth.getInstance();


        String name = Objects.requireNonNull(auth.getCurrentUser()).getDisplayName();

        Random ran = new Random();
        int idBus = ran.nextInt(6) + 5;

        viewModel.getUser().observe(this, users -> {
            if(users != null) {
                binding.tvPhoneNumber.setText(String.valueOf(users.getNo()));
            }
        });
        binding.tvBusName.setText(busName);
        binding.tvStartTime.setText(startTime);
        binding.tvEndTime.setText(endTime);
        binding.tvNameTerminal.setText(startLocation);
        binding.tvTerminalLocation.setText(startLocation);
        binding.tvNameTerminalEnd.setText(endLocation);
        binding.tvTerminalLocationEnd.setText(endLocation);
        binding.tvPlat.setText("Total time : " + totalTime);
        binding.tvPrice.setText(totalPrice);
        binding.tvPerSeat.setText(String.valueOf(totalSeat));
        binding.tvName.setText(name);



        binding.button.setOnClickListener(view -> {
            Bus bus = new Bus();
            bus.setId("No Bus. " + idBus + "JL I 0" + idBus);
            bus.setBusName(busName);
            bus.setStartTime(startTime);
            bus.setEndTime(endTime);
            bus.setEndLocation(endLocation);
            bus.setStartLocation(startLocation);
            bus.setEndLocation(endLocation);
            bus.setEconomyClass(totalClass);
            bus.setTotalTime(totalTime);
            bus.setTotal_price(String.valueOf(totalPrice));
            bus.setTotal_seat(String.valueOf(totalSeat));
            bus.setDate(date);
            bus.setImage(image);
            busViewModel.insertBus(bus);
            startActivity(new Intent(this, HomeActivity.class));
        });
    }
}