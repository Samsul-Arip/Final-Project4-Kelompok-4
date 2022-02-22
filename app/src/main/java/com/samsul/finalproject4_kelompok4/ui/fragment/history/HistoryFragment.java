package com.samsul.finalproject4_kelompok4.ui.fragment.history;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.samsul.finalproject4_kelompok4.adapter.OrderAdapter;
import com.samsul.finalproject4_kelompok4.data.ResponseOrder;
import com.samsul.finalproject4_kelompok4.databinding.FragmentHistoryBinding;

import java.util.ArrayList;

public class HistoryFragment extends Fragment {

    private FragmentHistoryBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentHistoryBinding.inflate(inflater, container, false);

        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        OrderAdapter adapter = new OrderAdapter();



        ArrayList<ResponseOrder> responseOrders = new ArrayList<>();

        responseOrders.add(new ResponseOrder("20-10-1999","091091","Terminal Amplas","Medan","20:00"));
        responseOrders.add(new ResponseOrder("20-10-1999","091091","Terminal Amplas","Medan","20:00"));
        responseOrders.add(new ResponseOrder("20-10-1999","091091","Terminal Amplas","Medan","20:00"));
        responseOrders.add(new ResponseOrder("20-10-1999","091091","Terminal Amplas","Medan","20:00"));
        responseOrders.add(new ResponseOrder("20-10-1999","091091","Terminal Amplas","Medan","20:00"));
        responseOrders.add(new ResponseOrder("20-10-1999","091091","Terminal Amplas","Medan","20:00"));
        responseOrders.add(new ResponseOrder("20-10-1999","091091","Terminal Amplas","Medan","20:00"));
        responseOrders.add(new ResponseOrder("20-10-1999","091091","Terminal Amplas","Medan","20:00"));

        binding.rvOrder.setHasFixedSize(true);
        binding.rvOrder.setLayoutManager(new LinearLayoutManager(requireActivity()));
        adapter.setListOrder(responseOrders);
        binding.rvOrder.setAdapter(adapter);

    }
}