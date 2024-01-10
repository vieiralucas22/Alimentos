package com.example.alimento3.viewholder;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.alimento3.listener.OnListClick;
import com.example.alimento3.R;
import com.example.alimento3.entity.FoodEntity;

public class FoodViewHolder extends RecyclerView.ViewHolder {
    private TextView mTextName = itemView.findViewById(R.id.text_name);
    private TextView mTextCalories = itemView.findViewById(R.id.text_calories);

    public FoodViewHolder(@NonNull View itemView) {
        super(itemView);
        mTextName = itemView.findViewById(R.id.text_name);
        mTextCalories = itemView.findViewById(R.id.text_calories);
    }

    public void bind(FoodEntity food, OnListClick click) {
        mTextName.setText(food.getName());
        mTextCalories.setText(String.valueOf(food.getCalories()));
        mTextName.setOnClickListener(v -> {
                click.onClick(food.getId());
        });
    }
}
