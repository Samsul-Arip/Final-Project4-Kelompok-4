package com.samsul.finalproject4_kelompok4.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import com.samsul.finalproject4_kelompok4.data.remote.model.ResponseBus;
import com.samsul.finalproject4_kelompok4.databinding.ActivityDetailBusBinding;
import com.samsul.finalproject4_kelompok4.ui.viewmodel.BusViewModel;
import com.samsul.finalproject4_kelompok4.utils.Constant;
import com.samsul.finalproject4_kelompok4.utils.Preferences;
import com.samsul.finalproject4_kelompok4.utils.ViewModelFactory;

public class DetailBusActivity extends AppCompatActivity {

    ActivityDetailBusBinding binding;
    Preferences preferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailBusBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        preferences = new Preferences(this);
        BusViewModel viewModel = obtainViewModel(this);
        Intent intent = getIntent();
        String startLocation = intent.getStringExtra(Constant.NAME_DEPARTURE);
        String date = intent.getStringExtra(Constant.DATE);
        double seat = intent.getDoubleExtra(Constant.SEAT,1);
        String startTerminal = intent.getStringExtra(Constant.NAME_TERMINAL_DEPARTURE);
        String endTerminal = intent.getStringExtra(Constant.NAME_TERMINAL_ARRIVAL);

        int id = intent.getIntExtra(Constant.ID, 0);

        viewModel.getBus(startLocation, startLocation).observe(this, bus -> {
            if(bus != null) {
                for(ResponseBus item: bus) {
                    if(item.getIdBus() == id) {
                        setData(item.getBusName(),
                                item.getRating(),
                                date,
                                item.getStartLocation(),
                                item.getEndLocation(),
                                item.getStartTime(),
                                item.getEndTime(),
                                item.getTotalTime(),
                                item.getBusClass(),
                                seat,
                                item.getPrince()
                                );
                    }
                }
            }
        });

        binding.btnBookNow.setOnClickListener(view -> {
            Intent i = new Intent(this, SeatActivity.class);
            i.putExtra(Constant.BUS_NAME, binding.tvNameBus.getText().toString());
            i.putExtra(Constant.START_LOCATION, binding.tvStartLocation.getText().toString());
            i.putExtra(Constant.DATE, date);
            i.putExtra(Constant.END_LOCATION, binding.tvEndLocation.getText().toString());
            i.putExtra(Constant.START_TIME, binding.tvStartTime.getText().toString());
            i.putExtra(Constant.END_TIME, binding.tvEndTime.getText().toString());
            i.putExtra(Constant.TOTAL_TIME, binding.tvLongTime.getText().toString());
            i.putExtra(Constant.TOTAL_PRICE, binding.tvResultPrice.getText().toString());
            i.putExtra(Constant.CLASS_ECONOMY, binding.tvClass.getText().toString());
            startActivity(i);
        });

    }

    @SuppressLint("SetTextI18n")
    private void setData(String nameBus,
                         String rating,
                         String date,
                         String startLocation,
                         String endLocation,
                         String startTime,
                         String endTime,
                         String totalTime,
                         String economyClass,
                         double seat,
                         String price
                         ) {
        binding.tvNameBus.setText(nameBus);
        binding.tvRating.setText(rating);
        binding.tvStartDate.setText(date);
        binding.tvStartLocation.setText(startLocation);
        binding.tvEndLocation.setText(endLocation);
        binding.tvStartTime.setText(startTime);
        binding.tvEndTime.setText(endTime);
        binding.tvLongTime.setText(totalTime);
        binding.tvClass.setText(economyClass);
        binding.tvCountBuy.setText(seat + "x" + price);
        double totalPrice = seat * Double.parseDouble(price);
        binding.tvResultPrice.setText("Rp. " + totalPrice + "K");
    }

    private static BusViewModel obtainViewModel(AppCompatActivity application) {
        ViewModelFactory factory = ViewModelFactory.getInstance(application.getApplication());

        return new ViewModelProvider(application, (ViewModelProvider.Factory) factory).get(BusViewModel.class);
    }
}