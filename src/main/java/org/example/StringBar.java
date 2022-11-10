package org.example;


import java.util.ArrayList;

public class StringBar extends Bar{

    public StringBar() {
        this.happyHour = false;
        this.observers = new ArrayList<>();
    }
    @Override
    public boolean isHappyHour() {
        return happyHour;
    }

    @Override
    public void startHappyHour() {
        happyHour = true;
        this.notifyObservers();
    }

    @Override
    public void endHappyHour() {
        happyHour = false;
        this.notifyObservers();
    }

    public void order(StringDrink drink, StringRecipe recipe) {
        recipe.mix(drink);
    }

}
