package com.example.simplerecyclerview;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CategoryRecyclerViewHolder extends RecyclerView.ViewHolder {

    private TextView txtNumber, txtName;

    public CategoryRecyclerViewHolder(@NonNull View itemView) {
        super(itemView);

        txtNumber = itemView.findViewById(R.id.txt_number);
        txtName = itemView.findViewById(R.id.txt_name);

    }

    public TextView getTxtNumber() {
        return txtNumber;
    }

    public TextView getTxtName() {
        return txtName;
    }

}
