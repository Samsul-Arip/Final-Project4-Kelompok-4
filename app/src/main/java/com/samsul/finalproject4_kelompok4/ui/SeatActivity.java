package com.samsul.finalproject4_kelompok4.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.samsul.finalproject4_kelompok4.R;
import com.samsul.finalproject4_kelompok4.databinding.ActivitySeatBinding;
import com.samsul.finalproject4_kelompok4.utils.Constant;

import java.util.Random;

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

        Intent i = getIntent();
        String busName = i.getStringExtra(Constant.BUS_NAME);
        String startLocation = i.getStringExtra(Constant.START_LOCATION);
        String endLocation = i.getStringExtra(Constant.END_LOCATION);
        String startTime = i.getStringExtra(Constant.START_TIME);
        String endTime = i.getStringExtra(Constant.END_TIME);
        String totalTime = i.getStringExtra(Constant.TOTAL_TIME);
        String totalPrice = i.getStringExtra(Constant.TOTAL_PRICE);
        String totalClass = i.getStringExtra(Constant.CLASS_ECONOMY);
        String image = i.getStringExtra(Constant.IMAGE);
        String date = i.getStringExtra(Constant.DATE);
        String seat = i.getStringExtra(Constant.SEAT);
        


        binding.view1.setOnClickListener(view -> {
            totalClick += 1;
            for(int data = 0; data <= totalClick; data++) {
                if(data % 2 == 0) {
                    binding.view1.setBackgroundResource(R.drawable.bg_seat_off);
                    seat1 = 0;
                } else {
                    binding.view1.setBackgroundResource(R.drawable.bg_seat_on);
                    seat1 = 1;
                }
            }
        });
        binding.view2.setOnClickListener(view -> {
            totalClick2 += 1;
            for(int data = 0; data <= totalClick2; data++) {
                if(data % 2 == 0) {
                    binding.view2.setBackgroundResource(R.drawable.bg_seat_off);
                    seat2 = 0;
                } else {
                    binding.view2.setBackgroundResource(R.drawable.bg_seat_on);
                    seat2 = 1;
                }
            }
        });
        binding.view3.setOnClickListener(view -> {
            totalClick3 += 1;
            for(int data = 0; data <= totalClick3; data++) {
                if(data % 2 == 0) {
                    binding.view3.setBackgroundResource(R.drawable.bg_seat_off);
                    seat3 = 0;
                } else {
                    binding.view3.setBackgroundResource(R.drawable.bg_seat_on);
                    seat3 = 1;
                }
            }
        });
        binding.view4.setOnClickListener(view -> {
            totalClick4 += 1;
            for(int data = 0; data <= totalClick4; data++) {
                if(data % 2 == 0) {
                    binding.view4.setBackgroundResource(R.drawable.bg_seat_off);
                    seat4 = 0;
                } else {
                    binding.view4.setBackgroundResource(R.drawable.bg_seat_on);
                    seat4 = 1;
                }
            }
        });
        binding.view5.setOnClickListener(view -> {
            totalClick5 += 1;
            for(int data = 0; data <= totalClick5; data++) {
                if(data % 2 == 0) {
                    binding.view5.setBackgroundResource(R.drawable.bg_seat_off);
                    seat5 = 0;
                } else {
                    binding.view5.setBackgroundResource(R.drawable.bg_seat_on);
                    seat5 = 1;
                }
            }
        });
        binding.view6.setOnClickListener(view -> {
            totalClick6 += 1;
            for(int data = 0; data <= totalClick6; data++) {
                if(data % 2 == 0) {
                    binding.view6.setBackgroundResource(R.drawable.bg_seat_off);
                    seat6 = 0;
                } else {
                    binding.view6.setBackgroundResource(R.drawable.bg_seat_on);
                    seat6 = 1;
                }
            }
        });
        binding.view7.setOnClickListener(view -> {
            totalClick7 += 1;
            for(int data = 0; data <= totalClick7; data++) {
                if(data % 2 == 0) {
                    binding.view7.setBackgroundResource(R.drawable.bg_seat_off);
                    seat7 = 0;
                } else {
                    binding.view7.setBackgroundResource(R.drawable.bg_seat_on);
                    seat7 = 1;
                }
            }
        });
        binding.view8.setOnClickListener(view -> {
            totalClick8 += 1;
            for(int data = 0; data <= totalClick8; data++) {
                if(data % 2 == 0) {
                    binding.view8.setBackgroundResource(R.drawable.bg_seat_off);
                    seat3 = 0;
                } else {
                    binding.view8.setBackgroundResource(R.drawable.bg_seat_on);
                    seat3 = 1;
                }
            }
        });
        binding.view9.setOnClickListener(view -> {
            totalClick9 += 1;
            for(int data = 0; data <= totalClick9; data++) {
                if(data % 2 == 0) {
                    binding.view9.setBackgroundResource(R.drawable.bg_seat_off);
                    seat9 = 0;
                } else {
                    binding.view9.setBackgroundResource(R.drawable.bg_seat_on);
                    seat9 = 1;
                }
            }
        });
        binding.view10.setOnClickListener(view -> {
            totalClick10 += 1;
            for(int data = 0; data <= totalClick10; data++) {
                if(data % 2 == 0) {
                    binding.view10.setBackgroundResource(R.drawable.bg_seat_off);
                    seat10 = 0;
                } else {
                    binding.view10.setBackgroundResource(R.drawable.bg_seat_on);
                    seat10 = 1;
                }
            }
        });
        binding.view11.setOnClickListener(view -> {
            totalClick11 += 1;
            for(int data = 0; data <= totalClick11; data++) {
                if(data % 2 == 0) {
                    binding.view11.setBackgroundResource(R.drawable.bg_seat_off);
                    seat11 = 0;
                } else {
                    binding.view11.setBackgroundResource(R.drawable.bg_seat_on);
                    seat11 = 1;
                }
            }
        });
        binding.view12.setOnClickListener(view -> {
            totalClick12 += 1;
            for(int data = 0; data <= totalClick12; data++) {
                if(data % 2 == 0) {
                    binding.view12.setBackgroundResource(R.drawable.bg_seat_off);
                    seat12 = 0;
                } else {
                    binding.view12.setBackgroundResource(R.drawable.bg_seat_on);
                    seat12 = 1;
                }
            }
        });
        binding.view13.setOnClickListener(view -> {
            totalClick13 += 1;
            for(int data = 0; data <= totalClick13; data++) {
                if(data % 2 == 0) {
                    binding.view13.setBackgroundResource(R.drawable.bg_seat_off);
                    seat13 = 0;
                } else {
                    binding.view13.setBackgroundResource(R.drawable.bg_seat_on);
                    seat13 = 1;
                }
            }
        });
        binding.view14.setOnClickListener(view -> {
            totalClick14 += 1;
            for(int data = 0; data <= totalClick14; data++) {
                if(data % 2 == 0) {
                    binding.view14.setBackgroundResource(R.drawable.bg_seat_off);
                    seat14 = 0;
                } else {
                    binding.view14.setBackgroundResource(R.drawable.bg_seat_on);
                    seat14 = 1;
                }
            }
        });
        binding.view15.setOnClickListener(view -> {
            totalClick15 += 1;
            for(int data = 0; data <= totalClick15; data++) {
                if(data % 2 == 0) {
                    binding.view5.setBackgroundResource(R.drawable.bg_seat_off);
                    seat15 = 0;
                } else {
                    binding.view5.setBackgroundResource(R.drawable.bg_seat_on);
                    seat15 = 1;
                }
            }
        });
        binding.view16.setOnClickListener(view -> {
            totalClick16 += 1;
            for(int data = 0; data <= totalClick16; data++) {
                if(data % 2 == 0) {
                    binding.view16.setBackgroundResource(R.drawable.bg_seat_off);
                    seat16 = 0;
                } else {
                    binding.view16.setBackgroundResource(R.drawable.bg_seat_on);
                    seat16 = 1;
                }
            }
        });
        binding.view17.setOnClickListener(view -> {
            totalClick17 += 1;
            for(int data = 0; data <= totalClick17; data++) {
                if(data % 2 == 0) {
                    binding.view17.setBackgroundResource(R.drawable.bg_seat_off);
                    seat17 = 0;
                } else {
                    binding.view17.setBackgroundResource(R.drawable.bg_seat_on);
                    seat17 = 1;
                }
            }
        });
        binding.view18.setOnClickListener(view -> {
            totalClick18 += 1;
            for(int data = 0; data <= totalClick18; data++) {
                if(data % 2 == 0) {
                    binding.view18.setBackgroundResource(R.drawable.bg_seat_off);
                    seat18 = 0;
                } else {
                    binding.view18.setBackgroundResource(R.drawable.bg_seat_on);
                    seat18 = 1;
                }
            }
        });
        binding.view19.setOnClickListener(view -> {
            totalClick19 += 1;
            for(int data = 0; data <= totalClick19; data++) {
                if(data % 2 == 0) {
                    binding.view19.setBackgroundResource(R.drawable.bg_seat_off);
                    seat19 = 0;
                } else {
                    binding.view19.setBackgroundResource(R.drawable.bg_seat_on);
                    seat19 = 1;
                }
            }
        });
        binding.view20.setOnClickListener(view -> {
            totalClick20 += 1;
            for(int data = 0; data <= totalClick22; data++) {
                if(data % 2 == 0) {
                    binding.view20.setBackgroundResource(R.drawable.bg_seat_off);
                    seat20 = 0;
                } else {
                    binding.view20.setBackgroundResource(R.drawable.bg_seat_on);
                    seat20 = 1;
                }
            }
        });
        binding.view21.setOnClickListener(view -> {
            totalClick21 += 1;
            for(int data = 0; data <= totalClick21; data++) {
                if(data % 2 == 0) {
                    binding.view21.setBackgroundResource(R.drawable.bg_seat_off);
                    seat21 = 0;
                } else {
                    binding.view21.setBackgroundResource(R.drawable.bg_seat_on);
                    seat21 = 1;
                }
            }
        });
        binding.view22.setOnClickListener(view -> {
            totalClick22 += 1;
            for(int data = 0; data <= totalClick22; data++) {
                if(data % 2 == 0) {
                    binding.view22.setBackgroundResource(R.drawable.bg_seat_off);
                    seat22 = 0;
                } else {
                    binding.view22.setBackgroundResource(R.drawable.bg_seat_on);
                    seat22 = 1;
                }
            }
        });
        binding.view23.setOnClickListener(view -> {
            totalClick23 += 1;
            for(int data = 0; data <= totalClick23; data++) {
                if(data % 2 == 0) {
                    binding.view23.setBackgroundResource(R.drawable.bg_seat_off);
                    seat23 = 0;
                } else {
                    binding.view23.setBackgroundResource(R.drawable.bg_seat_on);
                    seat23 = 1;
                }
            }
        });
        binding.view24.setOnClickListener(view -> {
            totalClick24 += 1;
            for(int data = 0; data <= totalClick24; data++) {
                if(data % 2 == 0) {
                    binding.view24.setBackgroundResource(R.drawable.bg_seat_off);
                    seat24 = 0;
                } else {
                    binding.view24.setBackgroundResource(R.drawable.bg_seat_on);
                    seat24 = 1;
                }
            }
        });
        binding.view25.setOnClickListener(view -> {
            totalClick25 += 1;
            for(int data = 0; data <= totalClick25; data++) {
                if(data % 2 == 0) {
                    binding.view25.setBackgroundResource(R.drawable.bg_seat_off);
                    seat25 = 0;
                } else {
                    binding.view25.setBackgroundResource(R.drawable.bg_seat_on);
                    seat25 = 1;
                }
            }
        });
        binding.view26.setOnClickListener(view -> {
            totalClick26 += 1;
            for(int data = 0; data <= totalClick26; data++) {
                if(data % 2 == 0) {
                    binding.view26.setBackgroundResource(R.drawable.bg_seat_off);
                    seat26 = 0;
                } else {
                    binding.view26.setBackgroundResource(R.drawable.bg_seat_on);
                    seat26 = 1;
                }
            }
        });
        binding.view27.setOnClickListener(view -> {
            totalClick27 += 1;
            for(int data = 0; data <= totalClick27; data++) {
                if(data % 2 == 0) {
                    binding.view27.setBackgroundResource(R.drawable.bg_seat_off);
                    seat27 = 0;
                } else {
                    binding.view27.setBackgroundResource(R.drawable.bg_seat_on);
                    seat27 = 1;
                }
            }
        });
        binding.view28.setOnClickListener(view -> {
            totalClick28 += 1;
            for(int data = 0; data <= totalClick28; data++) {
                if(data % 2 == 0) {
                    binding.view28.setBackgroundResource(R.drawable.bg_seat_off);
                    seat28 = 0;

                } else {
                    binding.view28.setBackgroundResource(R.drawable.bg_seat_on);
                    seat28 = 1;
                }
            }
        });
        binding.view29.setOnClickListener(view -> {
            totalClick29 += 1;
            for(int data = 0; data <= totalClick29; data++) {
                if(data % 2 == 0) {
                    binding.view29.setBackgroundResource(R.drawable.bg_seat_off);
                    seat29 = 0;
                } else {
                    binding.view29.setBackgroundResource(R.drawable.bg_seat_on);
                    seat29 = 1;
                }
            }
        });
        binding.view30.setOnClickListener(view -> {
            totalClick30 += 1;
            for(int data = 0; data <= totalClick30; data++) {
                if(data % 2 == 0) {
                    binding.view30.setBackgroundResource(R.drawable.bg_seat_off);
                    seat30 = 0;
                } else {
                    binding.view30.setBackgroundResource(R.drawable.bg_seat_on);
                    seat30 = 1;
                }
            }
        });
        binding.view31.setOnClickListener(view -> {
            totalClick31 += 1;
            for(int data = 0; data <= totalClick31; data++) {
                if(data % 2 == 0) {
                    binding.view31.setBackgroundResource(R.drawable.bg_seat_off);
                    seat31 = 0;
                } else {
                    binding.view31.setBackgroundResource(R.drawable.bg_seat_on);
                    seat31 = 1;
                }
            }
        });



        binding.btnBookNow.setOnClickListener(view -> {
            Intent intent = new Intent(this, CompleteBookingActivity.class);
            intent.putExtra(Constant.BUS_NAME, busName);
            intent.putExtra(Constant.START_LOCATION, startLocation);
            intent.putExtra(Constant.END_LOCATION, endLocation);
            intent.putExtra(Constant.DATE, date);
            intent.putExtra(Constant.START_TIME, startTime);
            intent.putExtra(Constant.END_TIME, endTime);
            intent.putExtra(Constant.TOTAL_PRICE, totalPrice);
            Constant.logCat("getTotalPrice : ", totalPrice);
            intent.putExtra(Constant.TOTAL_TIME, totalTime);
            intent.putExtra(Constant.CLASS_ECONOMY, totalClass);
            int total = (seat1+seat2+seat3+seat4+seat5+seat6+seat7+seat8+seat9+seat10+seat11+seat12+seat13+seat14+seat15+seat16+seat17+seat18+seat19+seat20+seat21+seat22+seat23+seat24+seat25+seat26+seat27+seat28+seat29+seat30+seat31);
            intent.putExtra(Constant.TOTAL_SEAT, total);
            Constant.logCat("Total seat : ", String.valueOf(total));
            intent.putExtra(Constant.IMAGE, image);
            if(total + 1 > Integer.parseInt(seat)) {
                Toast.makeText(this, "Anda hanya pesan " + seat + " kursi...", Toast.LENGTH_LONG).show();
            } else if(total + 1 < Integer.parseInt(seat)){
                Toast.makeText(this, "Silahkan pilih " + seat + " kursi...", Toast.LENGTH_LONG).show();
            } else {
                startActivity(intent);
            }
        });


    }
}