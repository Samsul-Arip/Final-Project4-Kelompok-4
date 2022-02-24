package com.samsul.finalproject4_kelompok4.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.samsul.finalproject4_kelompok4.adapter.ListRenewAdapter;
import com.samsul.finalproject4_kelompok4.adapter.OrderAdapter;
import com.samsul.finalproject4_kelompok4.data.ResponseOrder;
import com.samsul.finalproject4_kelompok4.data.remote.model.ResponseBus;
import com.samsul.finalproject4_kelompok4.databinding.ActivityListRenewBinding;
import com.samsul.finalproject4_kelompok4.ui.viewmodel.BusViewModel;
import com.samsul.finalproject4_kelompok4.utils.Constant;
import com.samsul.finalproject4_kelompok4.utils.ViewModelFactory;

import java.util.ArrayList;

public class ListRenewActivity extends AppCompatActivity {

    ActivityListRenewBinding binding;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityListRenewBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        BusViewModel viewModel = obtainViewModel(this);
        ListRenewAdapter adapter = new ListRenewAdapter(this);

        Intent intent = getIntent();
        String startLocation = intent.getStringExtra(Constant.NAME_DEPARTURE);
        String endLocation = intent.getStringExtra(Constant.NAME_ARRIVAL);
        String date = intent.getStringExtra(Constant.DATE);
        String seat = intent.getStringExtra(Constant.SEAT);
        binding.tvDepartureLocation.setText(startLocation);
        binding.tvArrivalLocation.setText(endLocation);
        binding.tvDate.setText(date);
        binding.tvSeat.setText(seat + " Seat");

        viewModel.getBus(startLocation, endLocation).observe(this, responseBuses -> {
            if(responseBuses != null) {
                adapter.setListOrder(responseBuses);
            }
        });

        binding.rvSearchBus.setHasFixedSize(true);
        binding.rvSearchBus.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        binding.rvSearchBus.setAdapter(adapter);

        adapter.setOnItemClickListener(new ListRenewAdapter.ItemClickListener() {
            @Override
            public void setClicked(ResponseBus bus) {
                Intent intent = new Intent(ListRenewActivity.this, DetailBusActivity.class);
                intent.putExtra(Constant.ID, bus.getIdBus());
                intent.putExtra(Constant.NAME_DEPARTURE, bus.getStartLocation());
                intent.putExtra(Constant.DATE, date);
                startActivity(intent);
            }
        });

    }

    private static BusViewModel obtainViewModel(AppCompatActivity application) {
        ViewModelFactory factory = ViewModelFactory.getInstance(application.getApplication());

        return new ViewModelProvider(application, (ViewModelProvider.Factory) factory).get(BusViewModel.class);
    }
}