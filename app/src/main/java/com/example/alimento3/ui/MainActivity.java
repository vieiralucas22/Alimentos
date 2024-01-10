package com.example.alimento3.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.example.alimento3.FoodConstants;
import com.example.alimento3.listener.OnListClick;
import com.example.alimento3.adapter.FoodAdapter;
import com.example.alimento3.business.FoodBusiness;
import com.example.alimento3.entity.FoodEntity;
import com.example.alimento3.R;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    ViewHolder mViewHolder = new ViewHolder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<FoodEntity> foodEntityList = new FoodBusiness().getList();
        //Obter a recyclerView
        mViewHolder.mRecyclerView = findViewById(R.id.recycler_food);

        OnListClick clickListener = id -> {

            Bundle bundle = new Bundle();
            bundle.putInt(FoodConstants.FOOD_ID, id);

            Intent intent = new Intent(getApplicationContext(), DetailsActivity.class);
            intent.putExtras(bundle);
            startActivity(intent);
        };


        //2 definir um adapter
        FoodAdapter foodAdapter = new FoodAdapter(foodEntityList,clickListener);
        mViewHolder.mRecyclerView.setAdapter(foodAdapter);

        //3 definir um layout
        mViewHolder.mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        //criar um layout da linha
    }

    private static class ViewHolder {
        RecyclerView mRecyclerView;
    }
}