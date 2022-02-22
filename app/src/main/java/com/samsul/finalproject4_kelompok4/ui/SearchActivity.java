package com.samsul.finalproject4_kelompok4.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;

import com.samsul.finalproject4_kelompok4.adapter.LocationAdapter;
import com.samsul.finalproject4_kelompok4.databinding.ActivitySearchBinding;
import com.samsul.finalproject4_kelompok4.ui.viewmodel.SearchViewModel;
import com.samsul.finalproject4_kelompok4.utils.Constant;
import com.samsul.finalproject4_kelompok4.utils.Preferences;
import com.samsul.finalproject4_kelompok4.utils.ViewModelFactory;

public class SearchActivity extends AppCompatActivity {

    private ActivitySearchBinding binding;
    private Preferences preferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySearchBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        SearchViewModel viewModel = obtainViewModel(this);
        LocationAdapter adapter = new LocationAdapter();
        preferences = new Preferences(this);

        viewModel.getTerminal().observe(this, terminal -> {
            if(terminal != null) {
                adapter.setTerminal(terminal);
            }
        });

        binding.edtSearch.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                adapter.getFilter().filter(editable.toString());
            }
        });


        binding.rvDeparture.setLayoutManager(new LinearLayoutManager(this));
        binding.rvDeparture.setHasFixedSize(true);
        binding.rvDeparture.setAdapter(adapter);

        adapter.setOnItemClickListener(terminal -> {
            Intent intent = getIntent();
            String code = intent.getStringExtra(Constant.REQUEST_CODE);
            if(code.equals("1")) {
                preferences.getEditor().putString(Constant.NAME_DEPARTURE, terminal.getName());
                preferences.getEditor().putString(Constant.NAME_TERMINAL_DEPARTURE, terminal.getTerminal());
                preferences.getEditor().apply();
            } else if(code.equals("2")){
                preferences.getEditor().putString(Constant.NAME_ARRIVAL, terminal.getName());
                preferences.getEditor().putString(Constant.NAME_TERMINAL_ARRIVAL, terminal.getTerminal());
                preferences.getEditor().apply();
            }
            startActivity(new Intent(this, HomeActivity.class));
            finish();
        });

    }

    private static SearchViewModel obtainViewModel(AppCompatActivity application) {
        ViewModelFactory factory = ViewModelFactory.getInstance(application.getApplication());

        return new ViewModelProvider(application, (ViewModelProvider.Factory) factory).get(SearchViewModel.class);
    }
}