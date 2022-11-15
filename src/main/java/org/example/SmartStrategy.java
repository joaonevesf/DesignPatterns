package org.example;

public class SmartStrategy implements OrderingStrategy{

    boolean started;
    boolean ended;
    StringDrink drink = null;
    StringRecipe recipe = null;
    public SmartStrategy() {
        started = false;
        ended = false;
    }
    @Override
    public void wants(StringDrink drink, StringRecipe recipe, StringBar bar) {
        this.drink = drink;
        this.recipe = recipe;
        if (bar.isHappyHour()) {
            bar.order(this.drink,this.recipe);
        }
    }

    @Override
    public void happyHourStarted(StringBar bar) {
        started = true;
        if (drink != null) {
            bar.order(drink,recipe);
        }
    }

    @Override
    public void happyHourEnded(StringBar bar) {
        ended = true;
    }
}
