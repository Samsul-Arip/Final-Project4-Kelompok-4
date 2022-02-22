package com.samsul.finalproject4_kelompok4.utils;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import com.samsul.finalproject4_kelompok4.ui.HomeActivity;
import com.samsul.finalproject4_kelompok4.databinding.ActivityDatePickerBinding;

import java.util.Calendar;

public class DatePicker extends AppCompatActivity{

    private ActivityDatePickerBinding binding;
    private Preferences preferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDatePickerBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        preferences = new Preferences(this);
        binding.calendarView.setOnDateChangeListener((calendarView, year, month, dayOfMonth) -> {
            Calendar calendar = Calendar.getInstance();
            calendar.set(year, month, dayOfMonth);
            int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
            int monthOfWeek = calendar.get(Calendar.MONTH);
            String weekDay = "";
            String monthWeek = "";
            //setting week
            switch (dayOfWeek) {
                case Calendar.MONDAY:
                    weekDay = "Mon";
                    break;
                case Calendar.TUESDAY:
                    weekDay = "Tue";
                    break;
                case Calendar.WEDNESDAY:
                    weekDay = "Wed";
                    break;
                case Calendar.THURSDAY:
                    weekDay = "Thu";
                    break;
                case Calendar.FRIDAY:
                    weekDay = "Fri";
                    break;
                case Calendar.SATURDAY:
                    weekDay = "Sat";
                    break;
                case Calendar.SUNDAY:
                    weekDay = "Sun";
                    break;
            }

            //setting month
            switch (monthOfWeek) {
                case Calendar.JANUARY:
                    monthWeek = "January";
                    break;
                case Calendar.FEBRUARY:
                    monthWeek = "February";
                    break;
                case Calendar.MARCH:
                    monthWeek = "March";
                    break;
                case Calendar.APRIL:
                    monthWeek = "April";
                    break;
                case Calendar.MAY:
                    monthWeek = "May";
                    break;
                case Calendar.JUNE:
                    monthWeek = "June";
                    break;
                case Calendar.JULY:
                    monthWeek = "July";
                    break;
                case Calendar.AUGUST:
                    monthWeek = "August";
                    break;
                case Calendar.SEPTEMBER:
                    monthWeek = "September";
                    break;
                case Calendar.OCTOBER:
                    monthWeek = "October";
                    break;
                case Calendar.NOVEMBER:
                    monthWeek = "November";
                    break;
                case Calendar.DECEMBER:
                    monthWeek = "December";
                    break;
            }
            String resultDate = weekDay + ", " + dayOfMonth + " " + monthWeek;
            binding.tvDateDeparture.setText(resultDate);
        });
        binding.btnSelect.setOnClickListener(view -> {
            Intent intent = new Intent(DatePicker.this, HomeActivity.class);
            preferences.getEditor().putString(Constant.DATE, binding.tvDateDeparture.getText().toString()).apply();
            startActivity(intent);
            finish();
        });
        binding.imgBack.setOnClickListener(v -> {
            startActivity(new Intent(this, HomeActivity.class).addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION));
        });
    }
}