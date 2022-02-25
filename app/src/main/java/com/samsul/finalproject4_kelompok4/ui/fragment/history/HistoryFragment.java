package com.samsul.finalproject4_kelompok4.ui.fragment.history;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.firebase.auth.FirebaseAuth;
import com.samsul.finalproject4_kelompok4.adapter.OrderAdapter;
import com.samsul.finalproject4_kelompok4.databinding.FragmentHistoryBinding;
import com.samsul.finalproject4_kelompok4.ui.DetailOrderActivity;
import com.samsul.finalproject4_kelompok4.ui.viewmodel.BusViewModel;
import com.samsul.finalproject4_kelompok4.utils.Constant;
import com.samsul.finalproject4_kelompok4.utils.ViewModelFactory;

public class HistoryFragment extends Fragment {

    private FragmentHistoryBinding binding;
    private FirebaseAuth auth;

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

        ViewModelFactory factory = ViewModelFactory.getInstance(requireContext());
        BusViewModel busViewModel = new ViewModelProvider(this, (ViewModelProvider.Factory) factory).get(BusViewModel.class);
//        auth = FirebaseAuth.getInstance();
//        String id = Objects.requireNonNull(auth.getCurrentUser()).getUid();
        OrderAdapter adapter = new OrderAdapter(requireContext());
        binding.rvOrder.setHasFixedSize(true);
        binding.rvOrder.setLayoutManager(new LinearLayoutManager(requireActivity()));
        binding.rvOrder.setAdapter(adapter);

        busViewModel.getBuses().observe(getViewLifecycleOwner(), bus -> {
            if(bus != null) {
                adapter.setListOrder(bus);
            }
        });

        adapter.setItemClickListener(bus -> {
            Intent intent = new Intent(requireContext(), DetailOrderActivity.class);
            intent.putExtra(Constant.ID, bus.getId());
            startActivity(intent);
        });



    }
}