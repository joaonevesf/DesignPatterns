package org.example;

public class SmartStrategy implements OrderingStrategy{

    boolean started;
    boolean ended;
    StringDrink drink;
    StringRecipe recipe;
    public SmartStrategy() {
        started = false;
        ended = false;
    }
    @Override
    public void wants(StringDrink drink, StringRecipe recipe, StringBar bar) {
        this.drink = drink;
        this.recipe = recipe;
        if (bar.isHappyHour()) {
            order(bar);
        }
    }

    public void order(StringBar bar) {
        bar.order(drink,recipe);
    }

    @Override
    public void happyHourStarted(StringBar bar) {
        started = true;
        if (!drink.getText().equals("")) {
            order(bar);
        }
    }

    @Override
    public void happyHourEnded(StringBar bar) {
        ended = true;
    }
}
