package com.tungphan.designpatternsample.builder;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by TungPhan on 1/3/18.
 */

public class Meal {

    private final String TAG = Meal.class.getSimpleName();
    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public float getCost() {
        float cost = 0.0f;
        for (Item item : items) {
            cost += item.price();
        }
        return cost;
    }

    public void showItem() {
        for (Item item : items) {
            Log.e(TAG, "Item " + item.name());
            Log.e(TAG, "Packing " + item.packing());
            Log.e(TAG, "Price " + item.price());
        }
    }
}
