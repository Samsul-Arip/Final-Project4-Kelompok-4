package com.samsul.finalproject4_kelompok4.utils;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.google.android.material.slider.Slider;
import com.samsul.finalproject4_kelompok4.databinding.BottomSheetBinding;

public class BottomSheet extends BottomSheetDialogFragment{

    private BottomSheetBinding binding;
    static FragmentListener fragmentListener;

    public static BottomSheet getInstance(FragmentListener listener) {
        fragmentListener = listener;
        return new BottomSheet();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = BottomSheetBinding.inflate(inflater, container, false);

        return binding.getRoot();
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        return new BottomSheetDialog(requireContext(), getTheme());
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.sliderCount.addOnChangeListener((slider, value, fromUser) -> {
            binding.tvCount.setText(String.valueOf((int) value));
        });
        binding.btnSelect.setOnClickListener(v ->{
            fragmentListener.getValue(binding.tvCount.getText().toString());
            dismiss();
        });

        binding.btnCancel.setOnClickListener(v -> {
            fragmentListener.getValue("Select");
            dismiss();

        });



    }

    public interface FragmentListener {
        void getValue(String text);
    }


}
