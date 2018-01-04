package com.tungphan.designpatternsample.builder;

/**
 * Created by TungPhan on 1/3/18.
 */

public class MealBuilder {

    public Meal prepareVegMeal(){
        Meal meal = new Meal();
        meal.addItem(new VegBuger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new ChickenBuger());
        meal.addItem(new Pepsi());
        return meal;
    }

}
