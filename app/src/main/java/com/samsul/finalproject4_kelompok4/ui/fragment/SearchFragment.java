package com.samsul.finalproject4_kelompok4.ui.fragment;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.samsul.finalproject4_kelompok4.R;
import com.samsul.finalproject4_kelompok4.ui.SearchActivity;
import com.samsul.finalproject4_kelompok4.ui.ListRenewActivity;
import com.samsul.finalproject4_kelompok4.databinding.FragmentSearchBinding;
import com.samsul.finalproject4_kelompok4.utils.BottomSheet;
import com.samsul.finalproject4_kelompok4.utils.Constant;
import com.samsul.finalproject4_kelompok4.utils.DatePicker;
import com.samsul.finalproject4_kelompok4.utils.Preferences;

public class SearchFragment extends Fragment implements BottomSheet.FragmentListener {

    private FragmentSearchBinding binding;
    private Preferences preferences;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentSearchBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        preferences = new Preferences(requireContext());
        BottomSheet bottomSheet = BottomSheet.getInstance(this);


        binding.tvDepature.setOnClickListener(onClick -> {
            Intent intent = new Intent(requireContext(), SearchActivity.class);
            intent.putExtra(Constant.REQUEST_CODE, "1");
            startActivity(intent);
        });
        binding.tvArrival.setOnClickListener(onClick -> {
            Intent intent = new Intent(requireContext(), SearchActivity.class);
            intent.putExtra(Constant.REQUEST_CODE, "2");
            startActivity(intent);
        });
        binding.tvPasssangers.setOnClickListener(onclick -> {
            if(getActivity() != null) {
                bottomSheet.show(getActivity().getSupportFragmentManager(), bottomSheet.getTag());
            }
        });
        binding.tvDate.setOnClickListener(onClick -> {
            startActivity(new Intent(requireActivity(), DatePicker.class));
        });

        binding.btnSearchBus.setOnClickListener(onClick -> {
            String departure = binding.tvDepature.getText().toString().trim();
            String arrival = binding.tvArrival.getText().toString().trim();
            String passangers = binding.tvPasssangers.getText().toString().trim();
            String date = binding.tvDate.getText().toString().trim();
            if(departure.equals("Select Departure,") || arrival.equals("Select Arrival,") || passangers.equals("Select") || date.equals("Select Date")) {
                Toast.makeText(requireContext(), "Semua harus diisi", Toast.LENGTH_SHORT).show();
            } else {
                Intent intent = new Intent(requireContext(), ListRenewActivity.class);
                intent.putExtra(Constant.NAME_DEPARTURE, preferences.getSharedPreferences().getString(Constant.NAME_DEPARTURE,""));
                intent.putExtra(Constant.NAME_ARRIVAL, preferences.getSharedPreferences().getString(Constant.NAME_ARRIVAL,""));
                intent.putExtra(Constant.DATE, preferences.getSharedPreferences().getString(Constant.DATE, ""));
                intent.putExtra(Constant.PASSANGERS, binding.tvPasssangers.getText().toString().trim());
                intent.putExtra(Constant.SEAT, binding.tvPasssangers.getText().toString().trim());
                startActivity(intent);
                preferences.getEditor().clear().apply();
            }
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onStart() {
        super.onStart();
        if(getActivity() != null) {
            String departure = preferences.getSharedPreferences().getString(Constant.NAME_DEPARTURE, "Select Departure");
            String terminal = preferences.getSharedPreferences().getString(Constant.NAME_TERMINAL_DEPARTURE, "");
            String arrival = preferences.getSharedPreferences().getString(Constant.NAME_ARRIVAL, "Select Arrival");
            String terminalArrival = preferences.getSharedPreferences().getString(Constant.NAME_TERMINAL_ARRIVAL, "");

            String date = preferences.getSharedPreferences().getString(Constant.DATE, "Select Date");

            if(!departure.equalsIgnoreCase("select departure")) {
                binding.imgArrival.setImageResource(R.drawable.ic_marker);
                binding.imgMarker.setVisibility(View.INVISIBLE);
            } else {
                binding.imgMarker.setVisibility(View.VISIBLE);
                binding.imgArrival.setImageResource(R.drawable.ic_location);
            }

            binding.tvDepature.setText(departure + ", " + terminal);
            binding.tvArrival.setText(arrival + ", " + terminalArrival);
            binding.tvDate.setText(date);
        }
    }

    @Override
    public void getValue(String text) {
        binding.tvPasssangers.setText(text);
    }
}