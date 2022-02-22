package com.samsul.finalproject4_kelompok4.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;
import com.samsul.finalproject4_kelompok4.data.room.entity.Users;
import com.samsul.finalproject4_kelompok4.databinding.ActivitySetupPhoneBinding;
import com.samsul.finalproject4_kelompok4.ui.viewmodel.RegisterViewModel;
import com.samsul.finalproject4_kelompok4.utils.ViewModelFactory;

import java.util.HashMap;
import java.util.Objects;

public class SetupPhoneActivity extends AppCompatActivity {

    private ActivitySetupPhoneBinding binding;
//    private FirebaseFirestore db;
    private FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySetupPhoneBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        RegisterViewModel viewModel = obtainViewModel(this);
        Users users = new Users();

//        db = FirebaseFirestore.getInstance();
        auth = FirebaseAuth.getInstance();

        binding.btnSaveNumber.setOnClickListener(view -> {
            String id = Objects.requireNonNull(auth.getCurrentUser()).getUid();
            String no = binding.edtPhoneNumber.getText().toString();
            String email = Objects.requireNonNull(auth.getCurrentUser()).getEmail();
            String name = auth.getCurrentUser().getDisplayName();


//            assert name != null;
//            saveToFireStore(id , name, email, no);
            users.setId(id);
            users.setName(name);
            users.setEmail(email);
            users.setNo(Integer.parseInt(no));

            viewModel.registerUser(users);
            startActivity(new Intent(SetupPhoneActivity.this, FinishRegistrationActivity.class));


        });

    }

//    private void saveToFireStore(String id , String name, String email , String no){
//
//        if (!name.isEmpty() && !email.isEmpty() && !no.isEmpty()){
//            HashMap<String , Object> map = new HashMap<>();
//            map.put("id" , id);
//            map.put("name" , name);
//            map.put("email" , email);
//            map.put("no", no);
//
//            db.collection("Documents").document(id).set(map)
//                    .addOnCompleteListener(task -> {
//                        if (task.isSuccessful()){
//                            Toast.makeText(SetupPhoneActivity.this, "Data Saved !!", Toast.LENGTH_SHORT).show();
//                            startActivity(new Intent(SetupPhoneActivity.this, FinishRegistrationActivity.class));
//                        }
//                    }).addOnFailureListener(e -> Toast.makeText(SetupPhoneActivity.this, "Failed !!", Toast.LENGTH_SHORT).show());
//
//        } else Toast.makeText(this, "Empty Fields not Allowed", Toast.LENGTH_SHORT).show();
//    }

    private void setLoading(Boolean loading) {
        if (loading) {
            binding.btnSaveNumber.setVisibility(View.INVISIBLE);
            binding.loadingBar.setVisibility(View.VISIBLE);
        } else {
            binding.btnSaveNumber.setVisibility(View.VISIBLE);
            binding.loadingBar.setVisibility(View.GONE);
        }
    }

    private static RegisterViewModel obtainViewModel(AppCompatActivity activity) {
        ViewModelFactory factory = ViewModelFactory.getInstance(activity.getApplication());

        return new ViewModelProvider(activity, (ViewModelProvider.Factory) factory).get(RegisterViewModel.class);
    }

}