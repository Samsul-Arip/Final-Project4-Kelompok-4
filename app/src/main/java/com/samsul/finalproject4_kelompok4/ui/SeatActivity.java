package com.samsul.finalproject4_kelompok4.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.samsul.finalproject4_kelompok4.R;
import com.samsul.finalproject4_kelompok4.databinding.ActivitySeatBinding;
import com.samsul.finalproject4_kelompok4.utils.Constant;

public class SeatActivity extends AppCompatActivity {

    ActivitySeatBinding binding;
    int totalClick = 0;
    int totalClick2 = 0;
    int totalClick3 = 0;
    int totalClick4 = 0;
    int totalClick5 = 0;
    int totalClick6 = 0;
    int totalClick7 = 0;
    int totalClick8 = 0;
    int totalClick9 = 0;
    int totalClick10 = 0;
    int totalClick11 = 0;
    int totalClick12= 0;
    int totalClick13 = 0;
    int totalClick14 = 0;
    int totalClick15 = 0;
    int totalClick16 = 0;
    int totalClick17 = 0;
    int totalClick19 = 0;
    int totalClick20 = 0;
    int totalClick21 = 0;
    int totalClick22 = 0;
    int totalClick23 = 0;
    int totalClick24 = 0;
    int totalClick25 = 0;
    int totalClick26 = 0;
    int totalClick27 = 0;
    int totalClick28 = 0;
    int totalClick29 = 0;
    int totalClick30 = 0;
    int totalClick31 = 0;
    int totalClick18 = 0;

    int seat1, seat2, seat3, seat4, seat5, seat6, seat7, seat8, seat9, seat10, seat11, seat12, seat13, seat14, seat15, seat16, seat17,
    seat18, seat19, seat20, seat21, seat22, seat23, seat24, seat25, seat26, seat27, seat28, seat29, seat30, seat31;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySeatBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());



        binding.view1.setOnClickListener(view -> {
            totalClick += 1;
            for(int data = 0; data <= totalClick; data++) {
                if(data % 2 == 0) {
                    binding.view1.setBackgroundResource(R.drawable.bg_seat_off);
                    seat1 = 1;
                } else {
                    binding.view1.setBackgroundResource(R.drawable.bg_seat_on);
                }
            }
        });
        binding.view2.setOnClickListener(view -> {
            totalClick2 += 1;
            for(int data = 0; data <= totalClick2; data++) {
                if(data % 2 == 0) {
                    binding.view2.setBackgroundResource(R.drawable.bg_seat_off);
                    seat2 = 1;
                } else {
                    binding.view2.setBackgroundResource(R.drawable.bg_seat_on);
                }
            }
        });
        binding.view3.setOnClickListener(view -> {
            totalClick3 += 1;
            for(int data = 0; data <= totalClick3; data++) {
                if(data % 2 == 0) {
                    binding.view3.setBackgroundResource(R.drawable.bg_seat_off);
                    seat3 = 1;
                } else {
                    binding.view3.setBackgroundResource(R.drawable.bg_seat_on);
                }
            }
        });
        binding.view4.setOnClickListener(view -> {
            totalClick4 += 1;
            for(int data = 0; data <= totalClick4; data++) {
                if(data % 2 == 0) {
                    binding.view1.setBackgroundResource(R.drawable.bg_seat_off);
                    seat4 = 1;
                } else {
                    binding.view1.setBackgroundResource(R.drawable.bg_seat_on);
                }
            }
        });
        binding.view5.setOnClickListener(view -> {
            totalClick5 += 1;
            for(int data = 0; data <= totalClick5; data++) {
                if(data % 2 == 0) {
                    binding.view1.setBackgroundResource(R.drawable.bg_seat_off);
                    seat5 = 1;
                } else {
                    binding.view1.setBackgroundResource(R.drawable.bg_seat_on);
                }
            }
        });
        binding.view6.setOnClickListener(view -> {
            totalClick6 += 1;
            for(int data = 0; data <= totalClick6; data++) {
                if(data % 2 == 0) {
                    binding.view1.setBackgroundResource(R.drawable.bg_seat_off);
                    seat6 = 1;
                } else {
                    binding.view1.setBackgroundResource(R.drawable.bg_seat_on);
                }
            }
        });
        binding.view7.setOnClickListener(view -> {
            totalClick7 += 1;
            for(int data = 0; data <= totalClick7; data++) {
                if(data % 2 == 0) {
                    binding.view1.setBackgroundResource(R.drawable.bg_seat_off);
                    seat7 = 1;
                } else {
                    binding.view1.setBackgroundResource(R.drawable.bg_seat_on);
                }
            }
        });
        binding.view8.setOnClickListener(view -> {
            totalClick8 += 1;
            for(int data = 0; data <= totalClick8; data++) {
                if(data % 2 == 0) {
                    binding.view1.setBackgroundResource(R.drawable.bg_seat_off);
                    seat3 = 8;
                } else {
                    binding.view1.setBackgroundResource(R.drawable.bg_seat_on);
                }
            }
        });
        binding.view9.setOnClickListener(view -> {
            totalClick9 += 1;
            for(int data = 0; data <= totalClick9; data++) {
                if(data % 2 == 0) {
                    binding.view1.setBackgroundResource(R.drawable.bg_seat_off);
                    seat9 = 1;
                } else {
                    binding.view1.setBackgroundResource(R.drawable.bg_seat_on);
                }
            }
        });
        binding.view10.setOnClickListener(view -> {
            totalClick10 += 1;
            for(int data = 0; data <= totalClick10; data++) {
                if(data % 2 == 0) {
                    binding.view1.setBackgroundResource(R.drawable.bg_seat_off);
                    seat10 = 1;
                } else {
                    binding.view1.setBackgroundResource(R.drawable.bg_seat_on);
                }
            }
        });
        binding.view11.setOnClickListener(view -> {
            totalClick11 += 1;
            for(int data = 0; data <= totalClick11; data++) {
                if(data % 2 == 0) {
                    binding.view1.setBackgroundResource(R.drawable.bg_seat_off);
                    seat11 = 1;
                } else {
                    binding.view1.setBackgroundResource(R.drawable.bg_seat_on);
                }
            }
        });
        binding.view12.setOnClickListener(view -> {
            totalClick12 += 1;
            for(int data = 0; data <= totalClick12; data++) {
                if(data % 2 == 0) {
                    binding.view1.setBackgroundResource(R.drawable.bg_seat_off);
                    seat12 = 1;
                } else {
                    binding.view1.setBackgroundResource(R.drawable.bg_seat_on);
                }
            }
        });
        binding.view13.setOnClickListener(view -> {
            totalClick13 += 1;
            for(int data = 0; data <= totalClick13; data++) {
                if(data % 2 == 0) {
                    binding.view1.setBackgroundResource(R.drawable.bg_seat_off);
                    seat13 = 1;
                } else {
                    binding.view1.setBackgroundResource(R.drawable.bg_seat_on);
                }
            }
        });
        binding.view14.setOnClickListener(view -> {
            totalClick14 += 1;
            for(int data = 0; data <= totalClick14; data++) {
                if(data % 2 == 0) {
                    binding.view1.setBackgroundResource(R.drawable.bg_seat_off);
                    seat14 = 1;
                } else {
                    binding.view1.setBackgroundResource(R.drawable.bg_seat_on);
                }
            }
        });
        binding.view15.setOnClickListener(view -> {
            totalClick15 += 1;
            for(int data = 0; data <= totalClick15; data++) {
                if(data % 2 == 0) {
                    binding.view1.setBackgroundResource(R.drawable.bg_seat_off);
                    seat15 = 1;
                } else {
                    binding.view1.setBackgroundResource(R.drawable.bg_seat_on);
                }
            }
        });
        binding.view16.setOnClickListener(view -> {
            totalClick16 += 1;
            for(int data = 0; data <= totalClick16; data++) {
                if(data % 2 == 0) {
                    binding.view1.setBackgroundResource(R.drawable.bg_seat_off);
                    seat16 = 1;
                } else {
                    binding.view1.setBackgroundResource(R.drawable.bg_seat_on);
                }
            }
        });
        binding.view17.setOnClickListener(view -> {
            totalClick17 += 1;
            for(int data = 0; data <= totalClick17; data++) {
                if(data % 2 == 0) {
                    binding.view1.setBackgroundResource(R.drawable.bg_seat_off);
                    seat17 = 1;
                } else {
                    binding.view1.setBackgroundResource(R.drawable.bg_seat_on);
                }
            }
        });
        binding.view18.setOnClickListener(view -> {
            totalClick18 += 1;
            for(int data = 0; data <= totalClick18; data++) {
                if(data % 2 == 0) {
                    binding.view1.setBackgroundResource(R.drawable.bg_seat_off);
                    seat18 = 1;
                } else {
                    binding.view1.setBackgroundResource(R.drawable.bg_seat_on);
                }
            }
        });
        binding.view19.setOnClickListener(view -> {
            totalClick19 += 1;
            for(int data = 0; data <= totalClick19; data++) {
                if(data % 2 == 0) {
                    binding.view1.setBackgroundResource(R.drawable.bg_seat_off);
                    seat19 = 1;
                } else {
                    binding.view1.setBackgroundResource(R.drawable.bg_seat_on);
                }
            }
        });
        binding.view20.setOnClickListener(view -> {
            totalClick20 += 1;
            for(int data = 0; data <= totalClick22; data++) {
                if(data % 2 == 0) {
                    binding.view1.setBackgroundResource(R.drawable.bg_seat_off);
                    seat20 = 1;
                } else {
                    binding.view1.setBackgroundResource(R.drawable.bg_seat_on);
                }
            }
        });
        binding.view21.setOnClickListener(view -> {
            totalClick21 += 1;
            for(int data = 0; data <= totalClick21; data++) {
                if(data % 2 == 0) {
                    binding.view1.setBackgroundResource(R.drawable.bg_seat_off);
                    seat21 = 1;
                } else {
                    binding.view1.setBackgroundResource(R.drawable.bg_seat_on);
                }
            }
        });
        binding.view22.setOnClickListener(view -> {
            totalClick22 += 1;
            for(int data = 0; data <= totalClick22; data++) {
                if(data % 2 == 0) {
                    binding.view1.setBackgroundResource(R.drawable.bg_seat_off);
                    seat22 = 1;
                } else {
                    binding.view1.setBackgroundResource(R.drawable.bg_seat_on);
                }
            }
        });
        binding.view23.setOnClickListener(view -> {
            totalClick23 += 1;
            for(int data = 0; data <= totalClick23; data++) {
                if(data % 2 == 0) {
                    binding.view1.setBackgroundResource(R.drawable.bg_seat_off);
                    seat23 = 1;
                } else {
                    binding.view1.setBackgroundResource(R.drawable.bg_seat_on);
                }
            }
        });
        binding.view24.setOnClickListener(view -> {
            totalClick24 += 1;
            for(int data = 0; data <= totalClick24; data++) {
                if(data % 2 == 0) {
                    binding.view1.setBackgroundResource(R.drawable.bg_seat_off);
                    seat24 = 1;
                } else {
                    binding.view1.setBackgroundResource(R.drawable.bg_seat_on);
                }
            }
        });
        binding.view25.setOnClickListener(view -> {
            totalClick25 += 1;
            for(int data = 0; data <= totalClick25; data++) {
                if(data % 2 == 0) {
                    binding.view1.setBackgroundResource(R.drawable.bg_seat_off);
                    seat25 = 1;
                } else {
                    binding.view1.setBackgroundResource(R.drawable.bg_seat_on);
                }
            }
        });
        binding.view26.setOnClickListener(view -> {
            totalClick26 += 1;
            for(int data = 0; data <= totalClick26; data++) {
                if(data % 2 == 0) {
                    binding.view1.setBackgroundResource(R.drawable.bg_seat_off);
                    seat26 = 1;
                } else {
                    binding.view1.setBackgroundResource(R.drawable.bg_seat_on);
                }
            }
        });
        binding.view27.setOnClickListener(view -> {
            totalClick27 += 1;
            for(int data = 0; data <= totalClick27; data++) {
                if(data % 2 == 0) {
                    binding.view1.setBackgroundResource(R.drawable.bg_seat_off);
                    seat27 = 1;
                } else {
                    binding.view1.setBackgroundResource(R.drawable.bg_seat_on);
                }
            }
        });
        binding.view28.setOnClickListener(view -> {
            totalClick28 += 1;
            for(int data = 0; data <= totalClick28; data++) {
                if(data % 2 == 0) {
                    binding.view1.setBackgroundResource(R.drawable.bg_seat_off);
                    seat28 = 1;
                } else {
                    binding.view1.setBackgroundResource(R.drawable.bg_seat_on);
                }
            }
        });
        binding.view29.setOnClickListener(view -> {
            totalClick29 += 1;
            for(int data = 0; data <= totalClick29; data++) {
                if(data % 2 == 0) {
                    binding.view1.setBackgroundResource(R.drawable.bg_seat_off);
                    seat29 = 1;
                } else {
                    binding.view1.setBackgroundResource(R.drawable.bg_seat_on);
                }
            }
        });
        binding.view30.setOnClickListener(view -> {
            totalClick30 += 1;
            for(int data = 0; data <= totalClick30; data++) {
                if(data % 2 == 0) {
                    binding.view1.setBackgroundResource(R.drawable.bg_seat_off);
                    seat30 = 1;
                } else {
                    binding.view1.setBackgroundResource(R.drawable.bg_seat_on);
                }
            }
        });
        binding.view31.setOnClickListener(view -> {
            totalClick31 += 1;
            for(int data = 0; data <= totalClick31; data++) {
                if(data % 2 == 0) {
                    binding.view1.setBackgroundResource(R.drawable.bg_seat_off);
                    seat31 = 1;
                } else {
                    binding.view1.setBackgroundResource(R.drawable.bg_seat_on);
                }
            }
        });

        Intent i = getIntent();
        String busName = i.getStringExtra(Constant.BUS_NAME);
        String startLocation = i.getStringExtra(Constant.START_LOCATION);
        String endLocation = i.getStringExtra(Constant.END_LOCATION);
        String startTime = i.getStringExtra(Constant.START_TIME);
        String endTime = i.getStringExtra(Constant.END_TIME);
        String totalTime = i.getStringExtra(Constant.TOTAL_TIME);
        String totalPrice = i.getStringExtra(Constant.TOTAL_PRICE);
        String totalClass = i.getStringExtra(Constant.CLASS_ECONOMY);

        binding.btnBookNow.setOnClickListener(view -> {
            Intent intent = new Intent(this, CompleteBookingActivity.class);
            intent.putExtra(Constant.BUS_NAME, busName);
            intent.putExtra(Constant.START_LOCATION, startLocation);
            intent.putExtra(Constant.END_LOCATION, endLocation);
            intent.putExtra(Constant.START_TIME, startTime);
            intent.putExtra(Constant.END_TIME, endTime);
            intent.putExtra(Constant.TOTAL_PRICE, totalPrice);
            intent.putExtra(Constant.TOTAL_TIME, totalTime);
            intent.putExtra(Constant.CLASS_ECONOMY, totalClass);
            int total = (seat1+seat2+seat3+seat4+seat5+seat6+seat7+seat8+seat9+seat10+seat11+seat12+seat13+seat14+seat15+seat16+seat17+seat18+seat19+seat20+seat21+seat22+seat23+seat24+seat25+seat26+seat27+seat28+seat29+seat30+seat31);
            intent.putExtra(Constant.TOTAL_SEAT, total);
            startActivity(intent);
        });


    }
}