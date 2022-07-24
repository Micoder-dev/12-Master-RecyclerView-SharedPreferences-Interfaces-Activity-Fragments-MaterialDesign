package com.example.simplerecyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CategoryRecyclerViewAdapter extends RecyclerView.Adapter<CategoryRecyclerViewHolder> {

    String[] categories = {"vetri", "indhu", "vel", "biruntha", "saravanan", "aravind", "hari", "karthiga", "gopi", "kavya", "deva", "gowtham", "micoder"};

    @NonNull
    @Override
    public CategoryRecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.recycler_view_items, parent, false);

        return new CategoryRecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryRecyclerViewHolder holder, int position) {

        holder.getTxtNumber().setText(Integer.toString(position + 1));
        holder.getTxtName().setText(categories[position]);

    }

    @Override
    public int getItemCount() {
        return categories.length;
    }
}
