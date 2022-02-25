package com.samsul.finalproject4_kelompok4.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.samsul.finalproject4_kelompok4.data.remote.model.ResponseBus;
import com.samsul.finalproject4_kelompok4.databinding.ItemBusBinding;

import java.util.ArrayList;
import java.util.List;

public class ListRenewAdapter extends RecyclerView.Adapter<ListRenewAdapter.RenewViewHolder> {

    private final ArrayList<ResponseBus> listOrder = new ArrayList<>();
    private final Context context;
    private ItemClickListener clickListener;

    public ListRenewAdapter(Context context) {
        this.context = context;
    }

    public void setOnItemClickListener(ItemClickListener listener) {
        clickListener = listener;
    }

    @SuppressLint("NotifyDataSetChanged")
    public void setListOrder(List<ResponseBus> list) {
        listOrder.clear();
        listOrder.addAll(list);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ListRenewAdapter.RenewViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemBusBinding binding = ItemBusBinding.inflate(LayoutInflater.from(context), parent, false);

        return new ListRenewAdapter.RenewViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ListRenewAdapter.RenewViewHolder holder, int position) {
        holder.bind(listOrder.get(position));
    }

    @Override
    public int getItemCount() {
        return listOrder.size();
    }

    public class RenewViewHolder extends RecyclerView.ViewHolder {

        ItemBusBinding binding;

        public RenewViewHolder(ItemBusBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void bind(ResponseBus data) {
            binding.tvNameTerminalEnd.setText(data.getEndTerminal());
            binding.tvNameTerminal.setText(data.getStartTerminal());
            binding.tvBusName.setText(data.getBusName());
            binding.tvReviewers.setText(data.getReview());
            binding.tvPrice.setText(data.getPrince());
            binding.tvStartTime.setText(data.getStartTime());
            binding.tvEndTime.setText(data.getEndTime());
            binding.tvRating.setText(data.getRating());

            binding.btnBookNow.setOnClickListener(view -> {
                clickListener.setClicked(data);
            });


        }
    }

    public interface ItemClickListener {
        void setClicked(ResponseBus bus);
    }
}
