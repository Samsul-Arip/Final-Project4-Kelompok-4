package com.samsul.finalproject4_kelompok4.adapter;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.samsul.finalproject4_kelompok4.data.ResponseOrder;
import com.samsul.finalproject4_kelompok4.data.room.entity.Bus;
import com.samsul.finalproject4_kelompok4.databinding.ItemOrderBinding;

import java.util.ArrayList;
import java.util.List;

public class OrderAdapter extends RecyclerView.Adapter<OrderAdapter.OrderViewHolder>{

    private final ArrayList<Bus> listOrder = new ArrayList<>();

    @SuppressLint("NotifyDataSetChanged")
    public void setListOrder(List<Bus> list) {
        listOrder.clear();
        listOrder.addAll(list);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public OrderAdapter.OrderViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemOrderBinding binding = ItemOrderBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);

        return new OrderViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull OrderAdapter.OrderViewHolder holder, int position) {
        holder.bind(listOrder.get(position));
    }

    @Override
    public int getItemCount() {
        return listOrder.size();
    }

    public class OrderViewHolder extends RecyclerView.ViewHolder {

        ItemOrderBinding binding;

        public OrderViewHolder(ItemOrderBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        @SuppressLint("SetTextI18n")
        public void bind(Bus data) {
            binding.tvLocation.setText(data.getStartLocation());
            binding.tvNameTerminal.setText("Total time : " + data.getTotalTime());
            binding.tvTime.setText(data.getStartTime());
            binding.tvTglOrder.setText(data.getDate());
            binding.tvNoTicket.setText(data.getId());
        }
    }
}
