package com.example.alimento3.entity;

public class FoodEntity {

    private int mId;
    private String name;
    private int calories;
    private int quantity;
    private String unit;
    private String description;

    public FoodEntity(int id,String name, int calories, int quantity, String unit, String description) {
        mId = id;
        this.name = name;
        this.calories = calories;
        this.quantity = quantity;
        this.unit = unit;
        this.description = description;
    }

    public FoodEntity() {}


    public int getId() {
        return mId;
    }

    public void setId(int mId) {
        this.mId = mId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
