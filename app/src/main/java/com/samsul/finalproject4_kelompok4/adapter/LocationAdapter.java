package com.samsul.finalproject4_kelompok4.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.samsul.finalproject4_kelompok4.data.remote.model.ResponseLocation;
import com.samsul.finalproject4_kelompok4.databinding.ItemTerminalBinding;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class LocationAdapter extends RecyclerView.Adapter<LocationAdapter.LocationViewHolder> implements Filterable{

    private final ArrayList<ResponseLocation> list = new ArrayList<>();
    private List<ResponseLocation> list2;

    private static OnItemClickListener onItemClickListener;


    public void setOnItemClickListener(OnItemClickListener clickListener) {
        onItemClickListener = clickListener;
    }

    public void setTerminal(List<ResponseLocation> terminal) {
        this.list2 = terminal;
        final DiffUtilCallBack diffUtilCallBack = new DiffUtilCallBack(this.list, list2);
        final DiffUtil.DiffResult diffResult = DiffUtil.calculateDiff(diffUtilCallBack);
        list.clear();
        list.addAll(list2);
        diffResult.dispatchUpdatesTo(this);
    }

    @NonNull
    @Override
    public LocationViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemTerminalBinding binding = ItemTerminalBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);

        return new LocationViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull LocationViewHolder holder, int position) {
        holder.bind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    @Override
    public Filter getFilter() {
        return new Filter() {
            @Override
            protected FilterResults performFiltering(CharSequence constraint) {
                constraint = constraint.toString().toLowerCase().trim();
                list.clear();
                if(constraint.length() == 0) {
                    list.addAll(list2);
                } else {
                    for(ResponseLocation item: list2) {
                        if(item.getName().toLowerCase(Locale.getDefault()).contains(constraint)) {
                            list.add(item);
                        }
                    }
                }
                FilterResults results = new FilterResults();
                results.values = list;

                return results;
            }

            @Override
            protected void publishResults(CharSequence charSequence, FilterResults filterResults) {
                notifyDataSetChanged();
            }
        };
    }

    public static class LocationViewHolder extends RecyclerView.ViewHolder {
        private ItemTerminalBinding binding;

        public LocationViewHolder(@NonNull ItemTerminalBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void bind(ResponseLocation terminal) {
            binding.tvLocation.setText(terminal.getName());
            binding.tvTerminal.setText(terminal.getTerminal());

            binding.tvLocation.setOnClickListener(v -> {
                onItemClickListener.onClicked(terminal);
            });

        }
    }

    public static class DiffUtilCallBack extends DiffUtil.Callback {

        private final List<ResponseLocation> oldTerminal;
        private final List<ResponseLocation> newTerminal;

        public DiffUtilCallBack(List<ResponseLocation> oldTerminal, List<ResponseLocation> newTerminal) {
            this.oldTerminal = oldTerminal;
            this.newTerminal = newTerminal;
        }

        @Override
        public int getOldListSize() {
            return oldTerminal.size();
        }

        @Override
        public int getNewListSize() {
            return newTerminal.size();
        }

        @Override
        public boolean areItemsTheSame(int oldItemPosition, int newItemPosition) {
            return oldTerminal.get(oldItemPosition).getName().equals(newTerminal.get(newItemPosition).getName()) &&
                    oldTerminal.get(oldItemPosition).getTerminal().equals(newTerminal.get(newItemPosition).getTerminal());
        }

        @Override
        public boolean areContentsTheSame(int oldItemPosition, int newItemPosition) {
            final ResponseLocation oldTerm = oldTerminal.get(oldItemPosition);
            final ResponseLocation newTerm = newTerminal.get(newItemPosition);

            return oldTerm.getName().equals(newTerm.getName()) && oldTerm.getTerminal().equals(newTerm.getTerminal());
        }

        @Nullable
        @Override
        public Object getChangePayload(int oldItemPosition, int newItemPosition) {
            return super.getChangePayload(oldItemPosition, newItemPosition);
        }
    }


    public interface OnItemClickListener {
        void onClicked(ResponseLocation terminal);
    }
}
