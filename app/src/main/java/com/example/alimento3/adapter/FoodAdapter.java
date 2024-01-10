package com.example.alimento3.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.alimento3.listener.OnListClick;
import com.example.alimento3.R;
import com.example.alimento3.entity.FoodEntity;
import com.example.alimento3.viewholder.FoodViewHolder;

import java.util.List;

public class FoodAdapter extends RecyclerView.Adapter<FoodViewHolder> {

    private List<FoodEntity> mFoodEntityList;
    private OnListClick mClickListener;

    public FoodAdapter(List<FoodEntity> foodEntityList, OnListClick clickListener) {
        mFoodEntityList = foodEntityList;
        mClickListener = clickListener;
    }

    @NonNull
    @Override
    public FoodViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());

        View view = inflater.inflate(R.layout.item_food, parent, false);
        return new FoodViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FoodViewHolder holder, int position) {
        FoodEntity foodEntity = mFoodEntityList.get(position);
        holder.bind(foodEntity, mClickListener);
    }

    @Override
    public int getItemCount() {
        return mFoodEntityList.size();
    }
}
