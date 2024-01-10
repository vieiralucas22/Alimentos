package com.example.alimento3.repository;

import com.example.alimento3.entity.FoodEntity;

import java.util.ArrayList;
import java.util.List;

public class FoodRepository {

    private List<FoodEntity> mList;

    public FoodRepository() {
        mList = new ArrayList<>();

        //Add items
        mList.add(new FoodEntity(0, "Alface", 8,60,"g","é uma hortense anual ou bienal, utilizada na alimentação humana desde cerca de 500 a.C"));
        mList.add(new FoodEntity(1, "Azeite", 90,10,"g","É bom pra temperar"));
        mList.add(new FoodEntity(2, "Batata doce", 115,100,"g", "Para bodybuilders"));
        mList.add(new FoodEntity(3, "Vodka", 231,100,"ml","Não congela se estiver no congelador"));
        mList.add(new FoodEntity(4, "Whiskey", 58,50,"ml","Muito apreciado pelos jovens com gelo de coco e energético"));
        mList.add(new FoodEntity(5, "Filé de frango", 240,20,"kg","Proteina barata pra quem faz acedemia"));
        mList.add(new FoodEntity(6, "Feijão", 77,10,"kg","Muitos gostam do carioca, mas na feijoada é melhor!"));
    }

    public List<FoodEntity> getList() {
        return mList;
    }

    public FoodEntity getItem(int id) {
        return mList.get(id);
    }
}
