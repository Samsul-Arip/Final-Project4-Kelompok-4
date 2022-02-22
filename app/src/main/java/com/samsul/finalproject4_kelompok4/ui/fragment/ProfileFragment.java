package com.samsul.finalproject4_kelompok4.ui.fragment;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.firebase.auth.FirebaseAuth;
import com.samsul.finalproject4_kelompok4.R;
import com.samsul.finalproject4_kelompok4.data.room.entity.Users;
import com.samsul.finalproject4_kelompok4.databinding.FragmentProfileBinding;
import com.samsul.finalproject4_kelompok4.ui.viewmodel.ProfileViewModel;
import com.samsul.finalproject4_kelompok4.utils.ViewModelFactory;
import com.squareup.picasso.Picasso;

import java.util.Objects;

public class ProfileFragment extends Fragment {

    private FragmentProfileBinding binding;
    private FirebaseAuth auth;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentProfileBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        auth = FirebaseAuth.getInstance();
        ViewModelFactory factory = ViewModelFactory.getInstance(requireActivity().getApplication());

        ProfileViewModel viewModel = new ViewModelProvider(requireActivity(), (ViewModelProvider.Factory) factory).get(ProfileViewModel.class);
        String id = Objects.requireNonNull(auth.getCurrentUser()).getUid();


        Users user = new Users();
        user.setId(id);
        viewModel.getUser().observe(getViewLifecycleOwner(), users -> {
            if(users != null) {
                binding.tvName.setText(users.getName());
                binding.tvEmail.setText(users.getEmail());
                binding.tvNo.setText(String.valueOf(users.getNo()));
                Picasso.get().load(auth.getCurrentUser().getPhotoUrl()).into(binding.imgProfile);
            }
        });
    }
}