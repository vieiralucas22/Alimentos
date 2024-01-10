package com.example.alimento3.ui;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.alimento3.FoodConstants;
import com.example.alimento3.R;
import com.example.alimento3.business.FoodBusiness;
import com.example.alimento3.entity.FoodEntity;

import java.util.Objects;

public class DetailsActivity extends AppCompatActivity {

    private static final String TAG = DetailsActivity.class.getSimpleName();

    private ViewHolder mViewHolder = new ViewHolder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        if (getSupportActionBar() == null) return;

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        mViewHolder.mTextName = findViewById(R.id.text_name);
        mViewHolder.mTextCalories = findViewById(R.id.text_calories);

        getData();

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if (item.getItemId() == android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }

    private void getData() {
        Bundle bundle = getIntent().getExtras();

        if (bundle == null) return;

        int id = bundle.getInt(FoodConstants.FOOD_ID);

        FoodEntity foodEntity = new FoodBusiness().getItem(id);
        mViewHolder.mTextName.setText(foodEntity.getName());
        mViewHolder.mTextCalories.setText(String.valueOf(foodEntity.getCalories()));
    }

    private static class ViewHolder {
        TextView mTextName;
        TextView mTextCalories;
    }
}