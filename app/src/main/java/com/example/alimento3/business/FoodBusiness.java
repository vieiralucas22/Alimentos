package com.example.alimento3.business;

import com.example.alimento3.entity.FoodEntity;
import com.example.alimento3.repository.FoodRepository;

import java.util.List;

public class FoodBusiness {

    public List<FoodEntity> getList() {
        return new FoodRepository().getList();
    }

    public FoodEntity getItem(int id) {
        return new FoodRepository().getItem(id);
    }
}
